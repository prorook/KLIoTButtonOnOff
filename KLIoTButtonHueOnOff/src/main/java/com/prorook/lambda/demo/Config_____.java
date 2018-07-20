
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
    "name",
    "zigbeechannel",
    "bridgeid",
    "mac",
    "dhcp",
    "ipaddress",
    "netmask",
    "gateway",
    "proxyaddress",
    "proxyport",
    "UTC",
    "localtime",
    "timezone",
    "modelid",
    "datastoreversion",
    "swversion",
    "apiversion",
    "swupdate",
    "swupdate2",
    "linkbutton",
    "portalservices",
    "portalconnection",
    "portalstate",
    "internetservices",
    "factorynew",
    "replacesbridgeid",
    "backup",
    "starterkitid",
    "whitelist"
})
public class Config_____ implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("zigbeechannel")
    private Integer zigbeechannel;
    @JsonProperty("bridgeid")
    private String bridgeid;
    @JsonProperty("mac")
    private String mac;
    @JsonProperty("dhcp")
    private Boolean dhcp;
    @JsonProperty("ipaddress")
    private String ipaddress;
    @JsonProperty("netmask")
    private String netmask;
    @JsonProperty("gateway")
    private String gateway;
    @JsonProperty("proxyaddress")
    private String proxyaddress;
    @JsonProperty("proxyport")
    private Integer proxyport;
    @JsonProperty("UTC")
    private String uTC;
    @JsonProperty("localtime")
    private String localtime;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("modelid")
    private String modelid;
    @JsonProperty("datastoreversion")
    private String datastoreversion;
    @JsonProperty("swversion")
    private String swversion;
    @JsonProperty("apiversion")
    private String apiversion;
    @JsonProperty("swupdate")
    private Swupdate_____ swupdate;
    @JsonProperty("swupdate2")
    private Swupdate2 swupdate2;
    @JsonProperty("linkbutton")
    private Boolean linkbutton;
    @JsonProperty("portalservices")
    private Boolean portalservices;
    @JsonProperty("portalconnection")
    private String portalconnection;
    @JsonProperty("portalstate")
    private Portalstate portalstate;
    @JsonProperty("internetservices")
    private Internetservices internetservices;
    @JsonProperty("factorynew")
    private Boolean factorynew;
    @JsonProperty("replacesbridgeid")
    private Object replacesbridgeid;
    @JsonProperty("backup")
    private Backup backup;
    @JsonProperty("starterkitid")
    private String starterkitid;
    @JsonProperty("whitelist")
    private Whitelist whitelist;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3109146631770274693L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("zigbeechannel")
    public Integer getZigbeechannel() {
        return zigbeechannel;
    }

    @JsonProperty("zigbeechannel")
    public void setZigbeechannel(Integer zigbeechannel) {
        this.zigbeechannel = zigbeechannel;
    }

    @JsonProperty("bridgeid")
    public String getBridgeid() {
        return bridgeid;
    }

    @JsonProperty("bridgeid")
    public void setBridgeid(String bridgeid) {
        this.bridgeid = bridgeid;
    }

    @JsonProperty("mac")
    public String getMac() {
        return mac;
    }

    @JsonProperty("mac")
    public void setMac(String mac) {
        this.mac = mac;
    }

    @JsonProperty("dhcp")
    public Boolean getDhcp() {
        return dhcp;
    }

    @JsonProperty("dhcp")
    public void setDhcp(Boolean dhcp) {
        this.dhcp = dhcp;
    }

    @JsonProperty("ipaddress")
    public String getIpaddress() {
        return ipaddress;
    }

    @JsonProperty("ipaddress")
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @JsonProperty("netmask")
    public String getNetmask() {
        return netmask;
    }

    @JsonProperty("netmask")
    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    @JsonProperty("gateway")
    public String getGateway() {
        return gateway;
    }

    @JsonProperty("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    @JsonProperty("proxyaddress")
    public String getProxyaddress() {
        return proxyaddress;
    }

    @JsonProperty("proxyaddress")
    public void setProxyaddress(String proxyaddress) {
        this.proxyaddress = proxyaddress;
    }

    @JsonProperty("proxyport")
    public Integer getProxyport() {
        return proxyport;
    }

    @JsonProperty("proxyport")
    public void setProxyport(Integer proxyport) {
        this.proxyport = proxyport;
    }

    @JsonProperty("UTC")
    public String getUTC() {
        return uTC;
    }

    @JsonProperty("UTC")
    public void setUTC(String uTC) {
        this.uTC = uTC;
    }

    @JsonProperty("localtime")
    public String getLocaltime() {
        return localtime;
    }

    @JsonProperty("localtime")
    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("modelid")
    public String getModelid() {
        return modelid;
    }

    @JsonProperty("modelid")
    public void setModelid(String modelid) {
        this.modelid = modelid;
    }

    @JsonProperty("datastoreversion")
    public String getDatastoreversion() {
        return datastoreversion;
    }

    @JsonProperty("datastoreversion")
    public void setDatastoreversion(String datastoreversion) {
        this.datastoreversion = datastoreversion;
    }

    @JsonProperty("swversion")
    public String getSwversion() {
        return swversion;
    }

    @JsonProperty("swversion")
    public void setSwversion(String swversion) {
        this.swversion = swversion;
    }

    @JsonProperty("apiversion")
    public String getApiversion() {
        return apiversion;
    }

    @JsonProperty("apiversion")
    public void setApiversion(String apiversion) {
        this.apiversion = apiversion;
    }

    @JsonProperty("swupdate")
    public Swupdate_____ getSwupdate() {
        return swupdate;
    }

    @JsonProperty("swupdate")
    public void setSwupdate(Swupdate_____ swupdate) {
        this.swupdate = swupdate;
    }

    @JsonProperty("swupdate2")
    public Swupdate2 getSwupdate2() {
        return swupdate2;
    }

    @JsonProperty("swupdate2")
    public void setSwupdate2(Swupdate2 swupdate2) {
        this.swupdate2 = swupdate2;
    }

    @JsonProperty("linkbutton")
    public Boolean getLinkbutton() {
        return linkbutton;
    }

    @JsonProperty("linkbutton")
    public void setLinkbutton(Boolean linkbutton) {
        this.linkbutton = linkbutton;
    }

    @JsonProperty("portalservices")
    public Boolean getPortalservices() {
        return portalservices;
    }

    @JsonProperty("portalservices")
    public void setPortalservices(Boolean portalservices) {
        this.portalservices = portalservices;
    }

    @JsonProperty("portalconnection")
    public String getPortalconnection() {
        return portalconnection;
    }

    @JsonProperty("portalconnection")
    public void setPortalconnection(String portalconnection) {
        this.portalconnection = portalconnection;
    }

    @JsonProperty("portalstate")
    public Portalstate getPortalstate() {
        return portalstate;
    }

    @JsonProperty("portalstate")
    public void setPortalstate(Portalstate portalstate) {
        this.portalstate = portalstate;
    }

    @JsonProperty("internetservices")
    public Internetservices getInternetservices() {
        return internetservices;
    }

    @JsonProperty("internetservices")
    public void setInternetservices(Internetservices internetservices) {
        this.internetservices = internetservices;
    }

    @JsonProperty("factorynew")
    public Boolean getFactorynew() {
        return factorynew;
    }

    @JsonProperty("factorynew")
    public void setFactorynew(Boolean factorynew) {
        this.factorynew = factorynew;
    }

    @JsonProperty("replacesbridgeid")
    public Object getReplacesbridgeid() {
        return replacesbridgeid;
    }

    @JsonProperty("replacesbridgeid")
    public void setReplacesbridgeid(Object replacesbridgeid) {
        this.replacesbridgeid = replacesbridgeid;
    }

    @JsonProperty("backup")
    public Backup getBackup() {
        return backup;
    }

    @JsonProperty("backup")
    public void setBackup(Backup backup) {
        this.backup = backup;
    }

    @JsonProperty("starterkitid")
    public String getStarterkitid() {
        return starterkitid;
    }

    @JsonProperty("starterkitid")
    public void setStarterkitid(String starterkitid) {
        this.starterkitid = starterkitid;
    }

    @JsonProperty("whitelist")
    public Whitelist getWhitelist() {
        return whitelist;
    }

    @JsonProperty("whitelist")
    public void setWhitelist(Whitelist whitelist) {
        this.whitelist = whitelist;
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
