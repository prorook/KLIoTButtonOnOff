
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
    "on",
    "bri",
    "hue",
    "sat",
    "effect",
    "xy",
    "ct",
    "alert",
    "colormode"
})
public class Action implements Serializable
{

    @JsonProperty("on")
    private Boolean on;
    @JsonProperty("bri")
    private Integer bri;
    @JsonProperty("hue")
    private Integer hue;
    @JsonProperty("sat")
    private Integer sat;
    @JsonProperty("effect")
    private String effect;
    @JsonProperty("xy")
    private List<Double> xy = new ArrayList<Double>();
    @JsonProperty("ct")
    private Integer ct;
    @JsonProperty("alert")
    private String alert;
    @JsonProperty("colormode")
    private String colormode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5741643084539858520L;

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

    @JsonProperty("hue")
    public Integer getHue() {
        return hue;
    }

    @JsonProperty("hue")
    public void setHue(Integer hue) {
        this.hue = hue;
    }

    @JsonProperty("sat")
    public Integer getSat() {
        return sat;
    }

    @JsonProperty("sat")
    public void setSat(Integer sat) {
        this.sat = sat;
    }

    @JsonProperty("effect")
    public String getEffect() {
        return effect;
    }

    @JsonProperty("effect")
    public void setEffect(String effect) {
        this.effect = effect;
    }

    @JsonProperty("xy")
    public List<Double> getXy() {
        return xy;
    }

    @JsonProperty("xy")
    public void setXy(List<Double> xy) {
        this.xy = xy;
    }

    @JsonProperty("ct")
    public Integer getCt() {
        return ct;
    }

    @JsonProperty("ct")
    public void setCt(Integer ct) {
        this.ct = ct;
    }

    @JsonProperty("alert")
    public String getAlert() {
        return alert;
    }

    @JsonProperty("alert")
    public void setAlert(String alert) {
        this.alert = alert;
    }

    @JsonProperty("colormode")
    public String getColormode() {
        return colormode;
    }

    @JsonProperty("colormode")
    public void setColormode(String colormode) {
        this.colormode = colormode;
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
