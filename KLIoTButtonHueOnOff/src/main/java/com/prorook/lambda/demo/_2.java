
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
    "state",
    "swupdate",
    "type",
    "name",
    "modelid",
    "manufacturername",
    "productname",
    "capabilities",
    "config",
    "uniqueid",
    "swversion",
    "swconfigid",
    "productid"
})
public class _2 implements Serializable
{

    @JsonProperty("state")
    private State_ state;
    @JsonProperty("swupdate")
    private Swupdate_ swupdate;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("modelid")
    private String modelid;
    @JsonProperty("manufacturername")
    private String manufacturername;
    @JsonProperty("productname")
    private String productname;
    @JsonProperty("capabilities")
    private Capabilities_ capabilities;
    @JsonProperty("config")
    private Config_ config;
    @JsonProperty("uniqueid")
    private String uniqueid;
    @JsonProperty("swversion")
    private String swversion;
    @JsonProperty("swconfigid")
    private String swconfigid;
    @JsonProperty("productid")
    private String productid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2559714718859190123L;

    @JsonProperty("state")
    public State_ getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State_ state) {
        this.state = state;
    }

    @JsonProperty("swupdate")
    public Swupdate_ getSwupdate() {
        return swupdate;
    }

    @JsonProperty("swupdate")
    public void setSwupdate(Swupdate_ swupdate) {
        this.swupdate = swupdate;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("modelid")
    public String getModelid() {
        return modelid;
    }

    @JsonProperty("modelid")
    public void setModelid(String modelid) {
        this.modelid = modelid;
    }

    @JsonProperty("manufacturername")
    public String getManufacturername() {
        return manufacturername;
    }

    @JsonProperty("manufacturername")
    public void setManufacturername(String manufacturername) {
        this.manufacturername = manufacturername;
    }

    @JsonProperty("productname")
    public String getProductname() {
        return productname;
    }

    @JsonProperty("productname")
    public void setProductname(String productname) {
        this.productname = productname;
    }

    @JsonProperty("capabilities")
    public Capabilities_ getCapabilities() {
        return capabilities;
    }

    @JsonProperty("capabilities")
    public void setCapabilities(Capabilities_ capabilities) {
        this.capabilities = capabilities;
    }

    @JsonProperty("config")
    public Config_ getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config_ config) {
        this.config = config;
    }

    @JsonProperty("uniqueid")
    public String getUniqueid() {
        return uniqueid;
    }

    @JsonProperty("uniqueid")
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    @JsonProperty("swversion")
    public String getSwversion() {
        return swversion;
    }

    @JsonProperty("swversion")
    public void setSwversion(String swversion) {
        this.swversion = swversion;
    }

    @JsonProperty("swconfigid")
    public String getSwconfigid() {
        return swconfigid;
    }

    @JsonProperty("swconfigid")
    public void setSwconfigid(String swconfigid) {
        this.swconfigid = swconfigid;
    }

    @JsonProperty("productid")
    public String getProductid() {
        return productid;
    }

    @JsonProperty("productid")
    public void setProductid(String productid) {
        this.productid = productid;
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