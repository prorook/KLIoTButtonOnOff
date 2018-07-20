
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
    "presence",
    "lastupdated"
})
public class State__________ implements Serializable
{

    @JsonProperty("presence")
    private Boolean presence;
    @JsonProperty("lastupdated")
    private String lastupdated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -928963832173556763L;

    @JsonProperty("presence")
    public Boolean getPresence() {
        return presence;
    }

    @JsonProperty("presence")
    public void setPresence(Boolean presence) {
        this.presence = presence;
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
