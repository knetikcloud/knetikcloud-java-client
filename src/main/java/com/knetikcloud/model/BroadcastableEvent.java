/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BroadcastableEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T15:25:18.305-04:00")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = ServiceDeployedEvent.class, name = "service_deployed"),
  @JsonSubTypes.Type(value = LogLevelEvent.class, name = "log_level"),
  @JsonSubTypes.Type(value = WebsocketRemoveTopicEvent.class, name = "websocket_remove_topic"),
  @JsonSubTypes.Type(value = NewCustomerEvent.class, name = "new_customer"),
  @JsonSubTypes.Type(value = WebsocketSendTopicMessageEvent.class, name = "websocket_topic_message"),
  @JsonSubTypes.Type(value = RemoveCustomerEvent.class, name = "remove_customer"),
  @JsonSubTypes.Type(value = WebsocketUnsubscribeEvent.class, name = "websocket_unsubscribe"),
  @JsonSubTypes.Type(value = WebsocketSendMessageEvent.class, name = "websocket_message"),
  @JsonSubTypes.Type(value = WebsocketSubscribeEvent.class, name = "websocket_subscribe"),
  @JsonSubTypes.Type(value = CacheClearEvent.class, name = "cache_clear"),
})

public class BroadcastableEvent {
  @JsonProperty("client")
  private String client = null;

  @JsonProperty("customer")
  private String customer = null;

  @JsonProperty("do_not_broadcast")
  private Boolean doNotBroadcast = null;

  @JsonProperty("section")
  private String section = null;

  @JsonProperty("source")
  private Object source = null;

  @JsonProperty("specifics")
  private String specifics = null;

  @JsonProperty("synchronous")
  private Boolean synchronous = null;

  @JsonProperty("timestamp")
  private Long timestamp = null;

  @JsonProperty("type")
  private String type = null;

  public BroadcastableEvent client(String client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public BroadcastableEvent customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public BroadcastableEvent doNotBroadcast(Boolean doNotBroadcast) {
    this.doNotBroadcast = doNotBroadcast;
    return this;
  }

   /**
   * Get doNotBroadcast
   * @return doNotBroadcast
  **/
  @ApiModelProperty(value = "")
  public Boolean isDoNotBroadcast() {
    return doNotBroadcast;
  }

  public void setDoNotBroadcast(Boolean doNotBroadcast) {
    this.doNotBroadcast = doNotBroadcast;
  }

  public BroadcastableEvent section(String section) {
    this.section = section;
    return this;
  }

   /**
   * Get section
   * @return section
  **/
  @ApiModelProperty(value = "")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public BroadcastableEvent source(Object source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public Object getSource() {
    return source;
  }

  public void setSource(Object source) {
    this.source = source;
  }

  public BroadcastableEvent specifics(String specifics) {
    this.specifics = specifics;
    return this;
  }

   /**
   * Get specifics
   * @return specifics
  **/
  @ApiModelProperty(value = "")
  public String getSpecifics() {
    return specifics;
  }

  public void setSpecifics(String specifics) {
    this.specifics = specifics;
  }

  public BroadcastableEvent synchronous(Boolean synchronous) {
    this.synchronous = synchronous;
    return this;
  }

   /**
   * Get synchronous
   * @return synchronous
  **/
  @ApiModelProperty(value = "")
  public Boolean isSynchronous() {
    return synchronous;
  }

  public void setSynchronous(Boolean synchronous) {
    this.synchronous = synchronous;
  }

  public BroadcastableEvent timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public BroadcastableEvent type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the event. Used for polymorphic type recognition and thus must match an expected type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the event. Used for polymorphic type recognition and thus must match an expected type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastableEvent broadcastableEvent = (BroadcastableEvent) o;
    return Objects.equals(this.client, broadcastableEvent.client) &&
        Objects.equals(this.customer, broadcastableEvent.customer) &&
        Objects.equals(this.doNotBroadcast, broadcastableEvent.doNotBroadcast) &&
        Objects.equals(this.section, broadcastableEvent.section) &&
        Objects.equals(this.source, broadcastableEvent.source) &&
        Objects.equals(this.specifics, broadcastableEvent.specifics) &&
        Objects.equals(this.synchronous, broadcastableEvent.synchronous) &&
        Objects.equals(this.timestamp, broadcastableEvent.timestamp) &&
        Objects.equals(this.type, broadcastableEvent.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, customer, doNotBroadcast, section, source, specifics, synchronous, timestamp, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastableEvent {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    doNotBroadcast: ").append(toIndentedString(doNotBroadcast)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    specifics: ").append(toIndentedString(specifics)).append("\n");
    sb.append("    synchronous: ").append(toIndentedString(synchronous)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

