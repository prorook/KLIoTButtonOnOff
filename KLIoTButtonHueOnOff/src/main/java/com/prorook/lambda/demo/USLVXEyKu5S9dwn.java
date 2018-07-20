
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
    "owner",
    "recycle",
    "locked",
    "appdata",
    "picture",
    "lastupdated",
    "version"
})
public class USLVXEyKu5S9dwn implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("lights")
    private List<String> lights = new ArrayList<String>();
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("recycle")
    private Boolean recycle;
    @JsonProperty("locked")
    private Boolean locked;
    @JsonProperty("appdata")
    private Appdata_________ appdata;
    @JsonProperty("picture")
    private String picture;
    @JsonProperty("lastupdated")
    private String lastupdated;
    @JsonProperty("version")
    private Integer version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2739038931413979857L;

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

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("recycle")
    public Boolean getRecycle() {
        return recycle;
    }

    @JsonProperty("recycle")
    public void setRecycle(Boolean recycle) {
        this.recycle = recycle;
    }

    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    @JsonProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @JsonProperty("appdata")
    public Appdata_________ getAppdata() {
        return appdata;
    }

    @JsonProperty("appdata")
    public void setAppdata(Appdata_________ appdata) {
        this.appdata = appdata;
    }

    @JsonProperty("picture")
    public String getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(String picture) {
        this.picture = picture;
    }

    @JsonProperty("lastupdated")
    public String getLastupdated() {
        return lastupdated;
    }

    @JsonProperty("lastupdated")
    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
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
