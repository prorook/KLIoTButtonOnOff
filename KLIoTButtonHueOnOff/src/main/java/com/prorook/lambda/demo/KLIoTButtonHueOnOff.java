package com.prorook.lambda.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * A simple class to test the Amazon IOT Button with a Lambda backend.  See the README for usage
 * details.
 */
@SuppressWarnings("unused") // make the IDE happy even though we know this class is used.
public class KLIoTButtonHueOnOff implements RequestHandler<Object, String> {
	LambdaLogger 					lambdaLogger;
	String 							apiBaseURL;
	HueAPIPOJO 						hueDC;
	ObjectMapper 					mapper;
	String 							hueHubURL;
	String 							hueHubUser;
	LinkedHashMap<String, String>	inputHashMap;
	
    public String handleRequest(Object input, Context context) {
        String ret = "No update";
    	
    	this.init(input, context);
    	
    	if(this.validate())
    	{
    		ret = this.performHueUpdate();
    	}
    	
        return ret;
    }
    
    @SuppressWarnings("unchecked")
	private void init(Object input,Context context)
    {
    	hueHubURL = System.getenv("HueHubURL");
        hueHubUser = System.getenv("HueHubUser");
        apiBaseURL = hueHubURL + "/api/" + hueHubUser;
        lambdaLogger = context.getLogger();
        mapper = new ObjectMapper();
        inputHashMap = (LinkedHashMap<String, String>)input; //contains map of from json values passed from iot device
    }
    private boolean validate()
    {
    	boolean ret = true;
    	if( hueHubURL == null )
            lambdaLogger.log("HueHubURL needs to be set as a Lambda environment variable");

        if( hueHubUser == null )
        	lambdaLogger.log("HueHubUser needs to be set as a Lambda environment variable");
        
        return ret;
    }
    private String performHueUpdate()
    {
    	String ret = "No update";
        String clickType = inputHashMap.get("clickType");
        
        try {
        	hueDC = mapper.readValue(new URL(apiBaseURL), HueAPIPOJO.class);
			
			switch(clickType)
	        {
	        	case("SINGLE"):
	        		this.updateBrightness();
	        		ret = "Brightness updated";
	        		break;
	        	case("LONG"):
	        		flipColorLoop();
	        		ret = "Color loop enabled/disabled";
	        		break;
	        	case("DOUBLE"):
	        		turnLightOnOrOff();
	        		ret = "Lights turned on/off";
	        		break;
	        }
		} catch (JsonParseException e) {
			this.logStackStrace(e);
		} catch (JsonMappingException e) {
			this.logStackStrace(e);
		} catch (MalformedURLException e) {
			this.logStackStrace(e);
		} catch (IOException e) {
			this.logStackStrace(e);
		}	
        return ret;
    }
    private int getCurrentBrightness()
    {
    	//idk just get the first one I guess
    	return hueDC.getLights().get1().getState().getBri();
    }
    private void flipColorLoop()
    {
    	boolean colorLooping = getColorLooping();
    	String json;

    	if(colorLooping)
    	{
    		hueDC.getLights().get5().getState().setEffect("none");
    	}
    	else	
    	{
    		hueDC.getLights().get5().getState().setEffect("colorloop");
    	}
    	hueDC.getLights().get5().getState().setOn(true);
		try {
			json = mapper.writeValueAsString(hueDC.getLights().get5().getState());
			this.executePut("/lights/5/state", json);
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}

		//need to set a scene to break out of color loop i guess
		if(colorLooping)
		{
			ObjectNode objectNode = mapper.createObjectNode();
	    	objectNode.put("scene", "e8jPSES3ENbiVg5");//BRIGHT
	    	try {
				json = mapper.writeValueAsString(objectNode);
				this.executePut("/groups/1/action", json);
			} catch (JsonProcessingException e) {
				this.logStackStrace(e);
			}
		}

    }
    private boolean getColorLooping()
    {
    	boolean colorLooping;
    	
    	if(hueDC.getLights().get5().getState().getEffect().equals("colorloop"))
    	{
    		colorLooping = true;
    	}
    	else
    	{
    		colorLooping = false;
    	}
    	
    	return colorLooping;
    }
    private boolean getLightOnStatus()
    {
    	boolean lightsOn = false;
    	Groups groups = hueDC.getGroups();
   	 	if(groups.get1().getState().getAnyOn().booleanValue() == true)
   	 	{
   	 		lightsOn = true;
   	 	}
   	 	if(groups.get2().getState().getAnyOn().booleanValue() == true)
	 	{
	 		lightsOn = true;
	 	}
   	 	if(groups.get3().getState().getAnyOn().booleanValue() == true)
	 	{
	 		lightsOn = true;
	 	}
   	 	if(groups.get4().getState().getAnyOn().booleanValue() == true)
	 	{
	 		lightsOn = true;
	 	}
   	 	
   	 	return lightsOn;
    }
    private void turnLightOnOrOff() {
    	boolean lightsOn = getLightOnStatus();
    	ObjectNode objectNode = mapper.createObjectNode();
    	objectNode.put("on", !lightsOn);
    	String json;
		try {
			json = mapper.writeValueAsString(objectNode);
			this.executePut("/groups/state/action", json);
		} catch (JsonProcessingException e) {
			this.logStackStrace(e);
		}
	}
    private void updateBrightness() {
    	int newBrightness = getCurrentBrightness()+70;
    	
    	if(newBrightness > 255)
    	{
    		newBrightness = newBrightness % 255;
    	}
    	
    	ObjectNode objectNode = mapper.createObjectNode();
    	objectNode.put("bri", newBrightness);
    	
    	String json;
		try {
			json = mapper.writeValueAsString(objectNode);
			this.executePut("/groups/state/action", json);
		} catch (JsonProcessingException e) {
			this.logStackStrace(e);
		}
    }
    
    public void executePut(String URIAppend, String payload)
	{
    	URI uri;
    	HttpPut put;
    	HttpClient client = HttpClients.custom().build();
    	
    	Header headers[] = {
    	        new BasicHeader("Content-type", "application/json"),
    	        new BasicHeader("Accept", "application/json")
    	};
		try {		
	    	uri = new URI(apiBaseURL + URIAppend);
	    	put = new HttpPut(uri);
	    	put.setHeaders(headers);

		    put.setEntity(new StringEntity(payload));
		    
	    	client.execute(put);
	    	} catch (JsonProcessingException e) {
	    		this.logStackStrace(e);
			}
	    	catch (UnsupportedEncodingException e) {
	    		this.logStackStrace(e);
			} catch (ClientProtocolException e) {
				this.logStackStrace(e);
			} catch (IOException e) {
				this.logStackStrace(e);
			} catch (URISyntaxException e) {
				this.logStackStrace(e);
			}
	}
    
    private void logStackStrace(Exception e)
    {
    	StringWriter sw = new StringWriter();
    	PrintWriter pw = new PrintWriter(sw);
    	e.printStackTrace(pw);
    	String sStackTrace = sw.toString();
    	lambdaLogger.log(sStackTrace);
    }
}

