
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
    "mindimlevel",
    "maxlumen"
})
public class Control__ implements Serializable
{

    @JsonProperty("mindimlevel")
    private Integer mindimlevel;
    @JsonProperty("maxlumen")
    private Integer maxlumen;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4386786231723246563L;

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
