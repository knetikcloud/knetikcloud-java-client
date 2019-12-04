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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChatMessageRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-04T08:56:21.771-05:00")
public class ChatMessageRequest {
  @JsonProperty("content")
  private Object content = null;

  @JsonProperty("message_type")
  private String messageType = null;

  public ChatMessageRequest content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the message
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The content of the message")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public ChatMessageRequest messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * The type of the message set by the client
   * @return messageType
  **/
  @ApiModelProperty(required = true, value = "The type of the message set by the client")
  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMessageRequest chatMessageRequest = (ChatMessageRequest) o;
    return Objects.equals(this.content, chatMessageRequest.content) &&
        Objects.equals(this.messageType, chatMessageRequest.messageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, messageType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessageRequest {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
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

