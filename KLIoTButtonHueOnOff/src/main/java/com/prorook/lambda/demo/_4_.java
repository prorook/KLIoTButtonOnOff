
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
    "name",
    "lights",
    "type",
    "state",
    "recycle",
    "class",
    "stream",
    "locations",
    "action"
})
public class _4_ implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("lights")
    private List<String> lights = new ArrayList<String>();
    @JsonProperty("type")
    private String type;
    @JsonProperty("state")
    private State________ state;
    @JsonProperty("recycle")
    private Boolean recycle;
    @JsonProperty("class")
    private String _class;
    @JsonProperty("stream")
    private Stream stream;
    @JsonProperty("locations")
    private Locations locations;
    @JsonProperty("action")
    private Action___ action;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1688317913199485218L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("lights")
    public List<String> getLights() {
        return lights;
    }

    @JsonProperty("lights")
    public void setLights(List<String> lights) {
        this.lights = lights;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("state")
    public State________ getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State________ state) {
        this.state = state;
    }

    @JsonProperty("recycle")
    public Boolean getRecycle() {
        return recycle;
    }

    @JsonProperty("recycle")
    public void setRecycle(Boolean recycle) {
        this.recycle = recycle;
    }

    @JsonProperty("class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("stream")
    public Stream getStream() {
        return stream;
    }

    @JsonProperty("stream")
    public void setStream(Stream stream) {
        this.stream = stream;
    }

    @JsonProperty("locations")
    public Locations getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    @JsonProperty("action")
    public Action___ getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(Action___ action) {
        this.action = action;
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
