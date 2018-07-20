
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
    "checkforupdate",
    "lastchange",
    "bridge",
    "state",
    "autoinstall"
})
public class Swupdate2 implements Serializable
{

    @JsonProperty("checkforupdate")
    private Boolean checkforupdate;
    @JsonProperty("lastchange")
    private String lastchange;
    @JsonProperty("bridge")
    private Bridge bridge;
    @JsonProperty("state")
    private String state;
    @JsonProperty("autoinstall")
    private Autoinstall autoinstall;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7220120746174422365L;

    @JsonProperty("checkforupdate")
    public Boolean getCheckforupdate() {
        return checkforupdate;
    }

    @JsonProperty("checkforupdate")
    public void setCheckforupdate(Boolean checkforupdate) {
        this.checkforupdate = checkforupdate;
    }

    @JsonProperty("lastchange")
    public String getLastchange() {
        return lastchange;
    }

    @JsonProperty("lastchange")
    public void setLastchange(String lastchange) {
        this.lastchange = lastchange;
    }

    @JsonProperty("bridge")
    public Bridge getBridge() {
        return bridge;
    }

    @JsonProperty("bridge")
    public void setBridge(Bridge bridge) {
        this.bridge = bridge;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("autoinstall")
    public Autoinstall getAutoinstall() {
        return autoinstall;
    }

    @JsonProperty("autoinstall")
    public void setAutoinstall(Autoinstall autoinstall) {
        this.autoinstall = autoinstall;
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
