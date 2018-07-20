
package com.prorook.lambda.demo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "internet",
    "remoteaccess",
    "time",
    "swupdate"
})
public class Internetservices implements Serializable
{

    @JsonProperty("internet")
    private String internet;
    @JsonProperty("remoteaccess")
    private String remoteaccess;
    @JsonProperty("time")
    private String time;
    @JsonProperty("swupdate")
    private String swupdate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -39672281831840936L;

    @JsonProperty("internet")
    public String getInternet() {
        return internet;
    }

    @JsonProperty("internet")
    public void setInternet(String internet) {
        this.internet = internet;
    }

    @JsonProperty("remoteaccess")
    public String getRemoteaccess() {
        return remoteaccess;
    }

    @JsonProperty("remoteaccess")
    public void setRemoteaccess(String remoteaccess) {
        this.remoteaccess = remoteaccess;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("swupdate")
    public String getSwupdate() {
        return swupdate;
    }

    @JsonProperty("swupdate")
    public void setSwupdate(String swupdate) {
        this.swupdate = swupdate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
