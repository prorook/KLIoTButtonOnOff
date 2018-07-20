
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
    "7773",
    "13053",
    "61877",
    "60687"
})
public class Resourcelinks implements Serializable
{

    @JsonProperty("7773")
    private com.prorook.lambda.demo._7773 _7773;
    @JsonProperty("13053")
    private com.prorook.lambda.demo._13053 _13053;
    @JsonProperty("61877")
    private com.prorook.lambda.demo._61877 _61877;
    @JsonProperty("60687")
    private com.prorook.lambda.demo._60687 _60687;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4762354697977176019L;

    @JsonProperty("7773")
    public com.prorook.lambda.demo._7773 get7773() {
        return _7773;
    }

    @JsonProperty("7773")
    public void set7773(com.prorook.lambda.demo._7773 _7773) {
        this._7773 = _7773;
    }

    @JsonProperty("13053")
    public com.prorook.lambda.demo._13053 get13053() {
        return _13053;
    }

    @JsonProperty("13053")
    public void set13053(com.prorook.lambda.demo._13053 _13053) {
        this._13053 = _13053;
    }

    @JsonProperty("61877")
    public com.prorook.lambda.demo._61877 get61877() {
        return _61877;
    }

    @JsonProperty("61877")
    public void set61877(com.prorook.lambda.demo._61877 _61877) {
        this._61877 = _61877;
    }

    @JsonProperty("60687")
    public com.prorook.lambda.demo._60687 get60687() {
        return _60687;
    }

    @JsonProperty("60687")
    public void set60687(com.prorook.lambda.demo._60687 _60687) {
        this._60687 = _60687;
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
