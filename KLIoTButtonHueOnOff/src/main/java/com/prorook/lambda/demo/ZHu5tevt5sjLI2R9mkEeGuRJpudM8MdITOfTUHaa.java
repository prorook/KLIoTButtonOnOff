
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
    "last use date",
    "create date",
    "name"
})
public class ZHu5tevt5sjLI2R9mkEeGuRJpudM8MdITOfTUHaa implements Serializable
{

    @JsonProperty("last use date")
    private String lastUseDate;
    @JsonProperty("create date")
    private String createDate;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6882214590754796379L;

    @JsonProperty("last use date")
    public String getLastUseDate() {
        return lastUseDate;
    }

    @JsonProperty("last use date")
    public void setLastUseDate(String lastUseDate) {
        this.lastUseDate = lastUseDate;
    }

    @JsonProperty("create date")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("create date")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
