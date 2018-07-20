
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
    "5",
    "6",
    "7",
    "8",
    "9",
    "10",
    "11",
    "12",
    "13",
    "14"
})
public class Rules implements Serializable
{

    @JsonProperty("1")
    private _1__ _1;
    @JsonProperty("2")
    private _2__ _2;
    @JsonProperty("3")
    private _3__ _3;
    @JsonProperty("4")
    private _4__ _4;
    @JsonProperty("5")
    private _5_ _5;
    @JsonProperty("6")
    private com.prorook.lambda.demo._6 _6;
    @JsonProperty("7")
    private com.prorook.lambda.demo._7 _7;
    @JsonProperty("8")
    private com.prorook.lambda.demo._8 _8;
    @JsonProperty("9")
    private com.prorook.lambda.demo._9 _9;
    @JsonProperty("10")
    private com.prorook.lambda.demo._10 _10;
    @JsonProperty("11")
    private com.prorook.lambda.demo._11 _11;
    @JsonProperty("12")
    private com.prorook.lambda.demo._12 _12;
    @JsonProperty("13")
    private com.prorook.lambda.demo._13 _13;
    @JsonProperty("14")
    private com.prorook.lambda.demo._14 _14;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1547941530351455490L;

    @JsonProperty("1")
    public _1__ get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(_1__ _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public _2__ get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(_2__ _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public _3__ get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(_3__ _3) {
        this._3 = _3;
    }

    @JsonProperty("4")
    public _4__ get4() {
        return _4;
    }

    @JsonProperty("4")
    public void set4(_4__ _4) {
        this._4 = _4;
    }

    @JsonProperty("5")
    public _5_ get5() {
        return _5;
    }

    @JsonProperty("5")
    public void set5(_5_ _5) {
        this._5 = _5;
    }

    @JsonProperty("6")
    public com.prorook.lambda.demo._6 get6() {
        return _6;
    }

    @JsonProperty("6")
    public void set6(com.prorook.lambda.demo._6 _6) {
        this._6 = _6;
    }

    @JsonProperty("7")
    public com.prorook.lambda.demo._7 get7() {
        return _7;
    }

    @JsonProperty("7")
    public void set7(com.prorook.lambda.demo._7 _7) {
        this._7 = _7;
    }

    @JsonProperty("8")
    public com.prorook.lambda.demo._8 get8() {
        return _8;
    }

    @JsonProperty("8")
    public void set8(com.prorook.lambda.demo._8 _8) {
        this._8 = _8;
    }

    @JsonProperty("9")
    public com.prorook.lambda.demo._9 get9() {
        return _9;
    }

    @JsonProperty("9")
    public void set9(com.prorook.lambda.demo._9 _9) {
        this._9 = _9;
    }

    @JsonProperty("10")
    public com.prorook.lambda.demo._10 get10() {
        return _10;
    }

    @JsonProperty("10")
    public void set10(com.prorook.lambda.demo._10 _10) {
        this._10 = _10;
    }

    @JsonProperty("11")
    public com.prorook.lambda.demo._11 get11() {
        return _11;
    }

    @JsonProperty("11")
    public void set11(com.prorook.lambda.demo._11 _11) {
        this._11 = _11;
    }

    @JsonProperty("12")
    public com.prorook.lambda.demo._12 get12() {
        return _12;
    }

    @JsonProperty("12")
    public void set12(com.prorook.lambda.demo._12 _12) {
        this._12 = _12;
    }

    @JsonProperty("13")
    public com.prorook.lambda.demo._13 get13() {
        return _13;
    }

    @JsonProperty("13")
    public void set13(com.prorook.lambda.demo._13 _13) {
        this._13 = _13;
    }

    @JsonProperty("14")
    public com.prorook.lambda.demo._14 get14() {
        return _14;
    }

    @JsonProperty("14")
    public void set14(com.prorook.lambda.demo._14 _14) {
        this._14 = _14;
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
