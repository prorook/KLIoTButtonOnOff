
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
    "on",
    "configured",
    "sunriseoffset",
    "sunsetoffset"
})
public class Config______ implements Serializable
{

    @JsonProperty("on")
    private Boolean on;
    @JsonProperty("configured")
    private Boolean configured;
    @JsonProperty("sunriseoffset")
    private Integer sunriseoffset;
    @JsonProperty("sunsetoffset")
    private Integer sunsetoffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6868513360371264790L;

    @JsonProperty("on")
    public Boolean getOn() {
        return on;
    }

    @JsonProperty("on")
    public void setOn(Boolean on) {
        this.on = on;
    }

    @JsonProperty("configured")
    public Boolean getConfigured() {
        return configured;
    }

    @JsonProperty("configured")
    public void setConfigured(Boolean configured) {
        this.configured = configured;
    }

    @JsonProperty("sunriseoffset")
    public Integer getSunriseoffset() {
        return sunriseoffset;
    }

    @JsonProperty("sunriseoffset")
    public void setSunriseoffset(Integer sunriseoffset) {
        this.sunriseoffset = sunriseoffset;
    }

    @JsonProperty("sunsetoffset")
    public Integer getSunsetoffset() {
        return sunsetoffset;
    }

    @JsonProperty("sunsetoffset")
    public void setSunsetoffset(Integer sunsetoffset) {
        this.sunsetoffset = sunsetoffset;
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
