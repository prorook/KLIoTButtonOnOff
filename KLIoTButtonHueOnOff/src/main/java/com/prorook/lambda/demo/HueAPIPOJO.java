
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
    "lights",
    "groups",
    "config",
    "schedules",
    "scenes",
    "rules",
    "sensors",
    "resourcelinks"
})
public class HueAPIPOJO implements Serializable
{

    @JsonProperty("lights")
    private Lights lights;
    @JsonProperty("groups")
    private Groups groups;
    @JsonProperty("config")
    private Config_____ config;
    @JsonProperty("schedules")
    private Schedules schedules;
    @JsonProperty("scenes")
    private Scenes scenes;
    @JsonProperty("rules")
    private Rules rules;
    @JsonProperty("sensors")
    private Sensors sensors;
    @JsonProperty("resourcelinks")
    private Resourcelinks resourcelinks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -149845952521365886L;

    @JsonProperty("lights")
    public Lights getLights() {
        return lights;
    }

    @JsonProperty("lights")
    public void setLights(Lights lights) {
        this.lights = lights;
    }

    @JsonProperty("groups")
    public Groups getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    @JsonProperty("config")
    public Config_____ getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config_____ config) {
        this.config = config;
    }

    @JsonProperty("schedules")
    public Schedules getSchedules() {
        return schedules;
    }

    @JsonProperty("schedules")
    public void setSchedules(Schedules schedules) {
        this.schedules = schedules;
    }

    @JsonProperty("scenes")
    public Scenes getScenes() {
        return scenes;
    }

    @JsonProperty("scenes")
    public void setScenes(Scenes scenes) {
        this.scenes = scenes;
    }

    @JsonProperty("rules")
    public Rules getRules() {
        return rules;
    }

    @JsonProperty("rules")
    public void setRules(Rules rules) {
        this.rules = rules;
    }

    @JsonProperty("sensors")
    public Sensors getSensors() {
        return sensors;
    }

    @JsonProperty("sensors")
    public void setSensors(Sensors sensors) {
        this.sensors = sensors;
    }

    @JsonProperty("resourcelinks")
    public Resourcelinks getResourcelinks() {
        return resourcelinks;
    }

    @JsonProperty("resourcelinks")
    public void setResourcelinks(Resourcelinks resourcelinks) {
        this.resourcelinks = resourcelinks;
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
