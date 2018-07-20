
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
    "all_on",
    "any_on"
})
public class State_____ implements Serializable
{

    @JsonProperty("all_on")
    private Boolean allOn;
    @JsonProperty("any_on")
    private Boolean anyOn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6198471380264041591L;

    @JsonProperty("all_on")
    public Boolean getAllOn() {
        return allOn;
    }

    @JsonProperty("all_on")
    public void setAllOn(Boolean allOn) {
        this.allOn = allOn;
    }

    @JsonProperty("any_on")
    public Boolean getAnyOn() {
        return anyOn;
    }

    @JsonProperty("any_on")
    public void setAnyOn(Boolean anyOn) {
        this.anyOn = anyOn;
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
