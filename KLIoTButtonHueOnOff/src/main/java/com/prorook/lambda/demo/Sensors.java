
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
    "1",
    "2",
    "3",
    "4",
    "5"
})
public class Sensors implements Serializable
{

    @JsonProperty("1")
    private _1___ _1;
    @JsonProperty("2")
    private _2___ _2;
    @JsonProperty("3")
    private _3___ _3;
    @JsonProperty("4")
    private _4___ _4;
    @JsonProperty("5")
    private _5__ _5;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2962833406857440873L;

    @JsonProperty("1")
    public _1___ get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(_1___ _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public _2___ get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(_2___ _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public _3___ get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(_3___ _3) {
        this._3 = _3;
    }

    @JsonProperty("4")
    public _4___ get4() {
        return _4;
    }

    @JsonProperty("4")
    public void set4(_4___ _4) {
        this._4 = _4;
    }

    @JsonProperty("5")
    public _5__ get5() {
        return _5;
    }

    @JsonProperty("5")
    public void set5(_5__ _5) {
        this._5 = _5;
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
