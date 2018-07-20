
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
    "updatestate",
    "checkforupdate",
    "devicetypes",
    "url",
    "text",
    "notify"
})
public class Swupdate_____ implements Serializable
{

    @JsonProperty("updatestate")
    private Integer updatestate;
    @JsonProperty("checkforupdate")
    private Boolean checkforupdate;
    @JsonProperty("devicetypes")
    private Devicetypes devicetypes;
    @JsonProperty("url")
    private String url;
    @JsonProperty("text")
    private String text;
    @JsonProperty("notify")
    private Boolean notify;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5883117889274188838L;

    @JsonProperty("updatestate")
    public Integer getUpdatestate() {
        return updatestate;
    }

    @JsonProperty("updatestate")
    public void setUpdatestate(Integer updatestate) {
        this.updatestate = updatestate;
    }

    @JsonProperty("checkforupdate")
    public Boolean getCheckforupdate() {
        return checkforupdate;
    }

    @JsonProperty("checkforupdate")
    public void setCheckforupdate(Boolean checkforupdate) {
        this.checkforupdate = checkforupdate;
    }

    @JsonProperty("devicetypes")
    public Devicetypes getDevicetypes() {
        return devicetypes;
    }

    @JsonProperty("devicetypes")
    public void setDevicetypes(Devicetypes devicetypes) {
        this.devicetypes = devicetypes;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("notify")
    public Boolean getNotify() {
        return notify;
    }

    @JsonProperty("notify")
    public void setNotify(Boolean notify) {
        this.notify = notify;
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
