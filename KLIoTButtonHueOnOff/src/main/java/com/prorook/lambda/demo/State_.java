
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
    "bri",
    "alert",
    "mode",
    "reachable"
})
public class State_ implements Serializable
{

    @JsonProperty("on")
    private Boolean on;
    @JsonProperty("bri")
    private Integer bri;
    @JsonProperty("alert")
    private String alert;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("reachable")
    private Boolean reachable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5568577254442161987L;

    @JsonProperty("on")
    public Boolean getOn() {
        return on;
    }

    @JsonProperty("on")
    public void setOn(Boolean on) {
        this.on = on;
    }

    @JsonProperty("bri")
    public Integer getBri() {
        return bri;
    }

    @JsonProperty("bri")
    public void setBri(Integer bri) {
        this.bri = bri;
    }

    @JsonProperty("alert")
    public String getAlert() {
        return alert;
    }

    @JsonProperty("alert")
    public void setAlert(String alert) {
        this.alert = alert;
    }

    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    @JsonProperty("reachable")
    public Boolean getReachable() {
        return reachable;
    }

    @JsonProperty("reachable")
    public void setReachable(Boolean reachable) {
        this.reachable = reachable;
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
