
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
    "proxymode",
    "proxynode",
    "active",
    "owner"
})
public class Stream implements Serializable
{

    @JsonProperty("proxymode")
    private String proxymode;
    @JsonProperty("proxynode")
    private String proxynode;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("owner")
    private Object owner;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3850315132581761897L;

    @JsonProperty("proxymode")
    public String getProxymode() {
        return proxymode;
    }

    @JsonProperty("proxymode")
    public void setProxymode(String proxymode) {
        this.proxymode = proxymode;
    }

    @JsonProperty("proxynode")
    public String getProxynode() {
        return proxynode;
    }

    @JsonProperty("proxynode")
    public void setProxynode(String proxynode) {
        this.proxynode = proxynode;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("owner")
    public Object getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Object owner) {
        this.owner = owner;
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
