
package com.prorook.lambda.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bridge",
    "lights",
    "sensors"
})
public class Devicetypes implements Serializable
{

    @JsonProperty("bridge")
    private Boolean bridge;
    @JsonProperty("lights")
    private List<Object> lights = new ArrayList<Object>();
    @JsonProperty("sensors")
    private List<Object> sensors = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4734339287582728870L;

    @JsonProperty("bridge")
    public Boolean getBridge() {
        return bridge;
    }

    @JsonProperty("bridge")
    public void setBridge(Boolean bridge) {
        this.bridge = bridge;
    }

    @JsonProperty("lights")
    public List<Object> getLights() {
        return lights;
    }

    @JsonProperty("lights")
    public void setLights(List<Object> lights) {
        this.lights = lights;
    }

    @JsonProperty("sensors")
    public List<Object> getSensors() {
        return sensors;
    }

    @JsonProperty("sensors")
    public void setSensors(List<Object> sensors) {
        this.sensors = sensors;
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
