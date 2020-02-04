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
 * TopicSubscriber
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:12:34.695-05:00")
public class TopicSubscriber {
  @JsonProperty("disabled")
  private Boolean disabled = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("join_date")
  private Long joinDate = null;

  @JsonProperty("mobile_number")
  private String mobileNumber = null;

  @JsonProperty("topic_id")
  private String topicId = null;

  @JsonProperty("topic_subscriber_map")
  private Object topicSubscriberMap = null;

  @JsonProperty("user_id")
  private Integer userId = null;

  @JsonProperty("username")
  private String username = null;

  public TopicSubscriber disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public TopicSubscriber email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TopicSubscriber joinDate(Long joinDate) {
    this.joinDate = joinDate;
    return this;
  }

   /**
   * Get joinDate
   * @return joinDate
  **/
  @ApiModelProperty(value = "")
  public Long getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(Long joinDate) {
    this.joinDate = joinDate;
  }

  public TopicSubscriber mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public TopicSubscriber topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }

   /**
   * Get topicId
   * @return topicId
  **/
  @ApiModelProperty(value = "")
  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }

  public TopicSubscriber topicSubscriberMap(Object topicSubscriberMap) {
    this.topicSubscriberMap = topicSubscriberMap;
    return this;
  }

   /**
   * Get topicSubscriberMap
   * @return topicSubscriberMap
  **/
  @ApiModelProperty(value = "")
  public Object getTopicSubscriberMap() {
    return topicSubscriberMap;
  }

  public void setTopicSubscriberMap(Object topicSubscriberMap) {
    this.topicSubscriberMap = topicSubscriberMap;
  }

  public TopicSubscriber userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public TopicSubscriber username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicSubscriber topicSubscriber = (TopicSubscriber) o;
    return Objects.equals(this.disabled, topicSubscriber.disabled) &&
        Objects.equals(this.email, topicSubscriber.email) &&
        Objects.equals(this.joinDate, topicSubscriber.joinDate) &&
        Objects.equals(this.mobileNumber, topicSubscriber.mobileNumber) &&
        Objects.equals(this.topicId, topicSubscriber.topicId) &&
        Objects.equals(this.topicSubscriberMap, topicSubscriber.topicSubscriberMap) &&
        Objects.equals(this.userId, topicSubscriber.userId) &&
        Objects.equals(this.username, topicSubscriber.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, email, joinDate, mobileNumber, topicId, topicSubscriberMap, userId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicSubscriber {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    joinDate: ").append(toIndentedString(joinDate)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    topicSubscriberMap: ").append(toIndentedString(topicSubscriberMap)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

