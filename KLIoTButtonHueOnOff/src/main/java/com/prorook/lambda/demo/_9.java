
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
    "name",
    "owner",
    "created",
    "lasttriggered",
    "timestriggered",
    "status",
    "recycle",
    "conditions",
    "actions"
})
public class _9 implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("created")
    private String created;
    @JsonProperty("lasttriggered")
    private String lasttriggered;
    @JsonProperty("timestriggered")
    private Integer timestriggered;
    @JsonProperty("status")
    private String status;
    @JsonProperty("recycle")
    private Boolean recycle;
    @JsonProperty("conditions")
    private List<Condition________> conditions = new ArrayList<Condition________>();
    @JsonProperty("actions")
    private List<Action____________> actions = new ArrayList<Action____________>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4411229538605546161L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("lasttriggered")
    public String getLasttriggered() {
        return lasttriggered;
    }

    @JsonProperty("lasttriggered")
    public void setLasttriggered(String lasttriggered) {
        this.lasttriggered = lasttriggered;
    }

    @JsonProperty("timestriggered")
    public Integer getTimestriggered() {
        return timestriggered;
    }

    @JsonProperty("timestriggered")
    public void setTimestriggered(Integer timestriggered) {
        this.timestriggered = timestriggered;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("recycle")
    public Boolean getRecycle() {
        return recycle;
    }

    @JsonProperty("recycle")
    public void setRecycle(Boolean recycle) {
        this.recycle = recycle;
    }

    @JsonProperty("conditions")
    public List<Condition________> getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(List<Condition________> conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("actions")
    public List<Action____________> getActions() {
        return actions;
    }

    @JsonProperty("actions")
    public void setActions(List<Action____________> actions) {
        this.actions = actions;
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
