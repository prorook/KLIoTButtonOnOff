
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
public class Lights implements Serializable
{

    @JsonProperty("1")
    private com.prorook.lambda.demo._1 _1;
    @JsonProperty("2")
    private com.prorook.lambda.demo._2 _2;
    @JsonProperty("3")
    private com.prorook.lambda.demo._3 _3;
    @JsonProperty("4")
    private com.prorook.lambda.demo._4 _4;
    @JsonProperty("5")
    private com.prorook.lambda.demo._5 _5;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4391478462542669416L;

    @JsonProperty("1")
    public com.prorook.lambda.demo._1 get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(com.prorook.lambda.demo._1 _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public com.prorook.lambda.demo._2 get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(com.prorook.lambda.demo._2 _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public com.prorook.lambda.demo._3 get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(com.prorook.lambda.demo._3 _3) {
        this._3 = _3;
    }

    @JsonProperty("4")
    public com.prorook.lambda.demo._4 get4() {
        return _4;
    }

    @JsonProperty("4")
    public void set4(com.prorook.lambda.demo._4 _4) {
        this._4 = _4;
    }

    @JsonProperty("5")
    public com.prorook.lambda.demo._5 get5() {
        return _5;
    }

    @JsonProperty("5")
    public void set5(com.prorook.lambda.demo._5 _5) {
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
