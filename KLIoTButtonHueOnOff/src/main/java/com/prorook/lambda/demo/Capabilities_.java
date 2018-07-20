
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
    "certified",
    "control",
    "streaming"
})
public class Capabilities_ implements Serializable
{

    @JsonProperty("certified")
    private Boolean certified;
    @JsonProperty("control")
    private Control_ control;
    @JsonProperty("streaming")
    private Streaming_ streaming;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3342904888859935896L;

    @JsonProperty("certified")
    public Boolean getCertified() {
        return certified;
    }

    @JsonProperty("certified")
    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    @JsonProperty("control")
    public Control_ getControl() {
        return control;
    }

    @JsonProperty("control")
    public void setControl(Control_ control) {
        this.control = control;
    }

    @JsonProperty("streaming")
    public Streaming_ getStreaming() {
        return streaming;
    }

    @JsonProperty("streaming")
    public void setStreaming(Streaming_ streaming) {
        this.streaming = streaming;
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
