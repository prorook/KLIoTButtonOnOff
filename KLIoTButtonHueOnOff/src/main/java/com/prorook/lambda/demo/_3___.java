
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
    "state",
    "config",
    "name",
    "type",
    "modelid",
    "manufacturername",
    "swversion",
    "uniqueid",
    "recycle"
})
public class _3___ implements Serializable
{

    @JsonProperty("state")
    private State___________ state;
    @JsonProperty("config")
    private Config________ config;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("modelid")
    private String modelid;
    @JsonProperty("manufacturername")
    private String manufacturername;
    @JsonProperty("swversion")
    private String swversion;
    @JsonProperty("uniqueid")
    private String uniqueid;
    @JsonProperty("recycle")
    private Boolean recycle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2306492924601422317L;

    @JsonProperty("state")
    public State___________ getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State___________ state) {
        this.state = state;
    }

    @JsonProperty("config")
    public Config________ getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config________ config) {
        this.config = config;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("modelid")
    public String getModelid() {
        return modelid;
    }

    @JsonProperty("modelid")
    public void setModelid(String modelid) {
        this.modelid = modelid;
    }

    @JsonProperty("manufacturername")
    public String getManufacturername() {
        return manufacturername;
    }

    @JsonProperty("manufacturername")
    public void setManufacturername(String manufacturername) {
        this.manufacturername = manufacturername;
    }

    @JsonProperty("swversion")
    public String getSwversion() {
        return swversion;
    }

    @JsonProperty("swversion")
    public void setSwversion(String swversion) {
        this.swversion = swversion;
    }

    @JsonProperty("uniqueid")
    public String getUniqueid() {
        return uniqueid;
    }

    @JsonProperty("uniqueid")
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    @JsonProperty("recycle")
    public Boolean getRecycle() {
        return recycle;
    }

    @JsonProperty("recycle")
    public void setRecycle(Boolean recycle) {
        this.recycle = recycle;
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
