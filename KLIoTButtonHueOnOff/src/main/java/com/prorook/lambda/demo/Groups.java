
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
    "4"
})
public class Groups implements Serializable
{

    @JsonProperty("1")
    private _1_ _1;
    @JsonProperty("2")
    private _2_ _2;
    @JsonProperty("3")
    private _3_ _3;
    @JsonProperty("4")
    private _4_ _4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5168594353315833370L;

    @JsonProperty("1")
    public _1_ get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(_1_ _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public _2_ get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(_2_ _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public _3_ get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(_3_ _3) {
        this._3 = _3;
    }

    @JsonProperty("4")
    public _4_ get4() {
        return _4;
    }

    @JsonProperty("4")
    public void set4(_4_ _4) {
        this._4 = _4;
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
