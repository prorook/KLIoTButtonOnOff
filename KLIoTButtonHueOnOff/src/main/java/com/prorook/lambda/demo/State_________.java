
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
    "daylight",
    "lastupdated"
})
public class State_________ implements Serializable
{

    @JsonProperty("daylight")
    private Boolean daylight;
    @JsonProperty("lastupdated")
    private String lastupdated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2631411601417881885L;

    @JsonProperty("daylight")
    public Boolean getDaylight() {
        return daylight;
    }

    @JsonProperty("daylight")
    public void setDaylight(Boolean daylight) {
        this.daylight = daylight;
    }

    @JsonProperty("lastupdated")
    public String getLastupdated() {
        return lastupdated;
    }

    @JsonProperty("lastupdated")
    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
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
