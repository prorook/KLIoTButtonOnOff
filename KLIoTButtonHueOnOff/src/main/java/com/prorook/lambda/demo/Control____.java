
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
    "mindimlevel",
    "maxlumen",
    "colorgamuttype",
    "colorgamut",
    "ct"
})
public class Control____ implements Serializable
{

    @JsonProperty("mindimlevel")
    private Integer mindimlevel;
    @JsonProperty("maxlumen")
    private Integer maxlumen;
    @JsonProperty("colorgamuttype")
    private String colorgamuttype;
    @JsonProperty("colorgamut")
    private List<List<Double>> colorgamut = new ArrayList<List<Double>>();
    @JsonProperty("ct")
    private Ct ct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7126332058268539498L;

    @JsonProperty("mindimlevel")
    public Integer getMindimlevel() {
        return mindimlevel;
    }

    @JsonProperty("mindimlevel")
    public void setMindimlevel(Integer mindimlevel) {
        this.mindimlevel = mindimlevel;
    }

    @JsonProperty("maxlumen")
    public Integer getMaxlumen() {
        return maxlumen;
    }

    @JsonProperty("maxlumen")
    public void setMaxlumen(Integer maxlumen) {
        this.maxlumen = maxlumen;
    }

    @JsonProperty("colorgamuttype")
    public String getColorgamuttype() {
        return colorgamuttype;
    }

    @JsonProperty("colorgamuttype")
    public void setColorgamuttype(String colorgamuttype) {
        this.colorgamuttype = colorgamuttype;
    }

    @JsonProperty("colorgamut")
    public List<List<Double>> getColorgamut() {
        return colorgamut;
    }

    @JsonProperty("colorgamut")
    public void setColorgamut(List<List<Double>> colorgamut) {
        this.colorgamut = colorgamut;
    }

    @JsonProperty("ct")
    public Ct getCt() {
        return ct;
    }

    @JsonProperty("ct")
    public void setCt(Ct ct) {
        this.ct = ct;
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
