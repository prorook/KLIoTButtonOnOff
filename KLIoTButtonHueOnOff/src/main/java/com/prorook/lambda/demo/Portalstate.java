
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
    "signedon",
    "incoming",
    "outgoing",
    "communication"
})
public class Portalstate implements Serializable
{

    @JsonProperty("signedon")
    private Boolean signedon;
    @JsonProperty("incoming")
    private Boolean incoming;
    @JsonProperty("outgoing")
    private Boolean outgoing;
    @JsonProperty("communication")
    private String communication;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6513792623614011316L;

    @JsonProperty("signedon")
    public Boolean getSignedon() {
        return signedon;
    }

    @JsonProperty("signedon")
    public void setSignedon(Boolean signedon) {
        this.signedon = signedon;
    }

    @JsonProperty("incoming")
    public Boolean getIncoming() {
        return incoming;
    }

    @JsonProperty("incoming")
    public void setIncoming(Boolean incoming) {
        this.incoming = incoming;
    }

    @JsonProperty("outgoing")
    public Boolean getOutgoing() {
        return outgoing;
    }

    @JsonProperty("outgoing")
    public void setOutgoing(Boolean outgoing) {
        this.outgoing = outgoing;
    }

    @JsonProperty("communication")
    public String getCommunication() {
        return communication;
    }

    @JsonProperty("communication")
    public void setCommunication(String communication) {
        this.communication = communication;
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
