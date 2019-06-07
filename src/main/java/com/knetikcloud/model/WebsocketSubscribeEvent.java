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
import com.fasterxml.jackson.annotation.JsonValue;
import com.knetikcloud.model.BroadcastableEvent;
import com.knetikcloud.model.Topic;
import com.knetikcloud.model.UserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WebsocketSubscribeEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T15:47:37.134-04:00")
public class WebsocketSubscribeEvent extends BroadcastableEvent {
  @JsonProperty("topic")
  private Topic topic = null;

  @JsonProperty("user_resource")
  private UserResource userResource = null;

  public WebsocketSubscribeEvent topic(Topic topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @ApiModelProperty(value = "")
  public Topic getTopic() {
    return topic;
  }

  public void setTopic(Topic topic) {
    this.topic = topic;
  }

  public WebsocketSubscribeEvent userResource(UserResource userResource) {
    this.userResource = userResource;
    return this;
  }

   /**
   * Get userResource
   * @return userResource
  **/
  @ApiModelProperty(value = "")
  public UserResource getUserResource() {
    return userResource;
  }

  public void setUserResource(UserResource userResource) {
    this.userResource = userResource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsocketSubscribeEvent websocketSubscribeEvent = (WebsocketSubscribeEvent) o;
    return Objects.equals(this.topic, websocketSubscribeEvent.topic) &&
        Objects.equals(this.userResource, websocketSubscribeEvent.userResource) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, userResource, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsocketSubscribeEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    userResource: ").append(toIndentedString(userResource)).append("\n");
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

