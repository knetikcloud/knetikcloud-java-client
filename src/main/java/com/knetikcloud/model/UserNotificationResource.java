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
 * UserNotificationResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-04T11:36:20.337-04:00")
public class UserNotificationResource {
  @JsonProperty("data")
  private Object data = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("notification_id")
  private String notificationId = null;

  @JsonProperty("notification_type_id")
  private String notificationTypeId = null;

  @JsonProperty("recipient")
  private String recipient = null;

  /**
   * The type of recipient for the notification. Either a user, or all users in a topic
   */
  public enum RecipientTypeEnum {
    USER("user"),
    
    TOPIC("topic");

    private String value;

    RecipientTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RecipientTypeEnum fromValue(String text) {
      for (RecipientTypeEnum b : RecipientTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("recipient_type")
  private RecipientTypeEnum recipientType = null;

  @JsonProperty("retrieve_date")
  private Long retrieveDate = null;

  @JsonProperty("send_date")
  private Long sendDate = null;

  /**
   * The user&#39;s status for this notification
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    READ("read"),
    
    HIDDEN("hidden");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("user_id")
  private Integer userId = null;

  public UserNotificationResource data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * The data to send and fill templates
   * @return data
  **/
  @ApiModelProperty(value = "The data to send and fill templates")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public UserNotificationResource message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The resolved message, if template provided in the notification ype
   * @return message
  **/
  @ApiModelProperty(value = "The resolved message, if template provided in the notification ype")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UserNotificationResource notificationId(String notificationId) {
    this.notificationId = notificationId;
    return this;
  }

   /**
   * The id of the notification
   * @return notificationId
  **/
  @ApiModelProperty(required = true, value = "The id of the notification")
  public String getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }

  public UserNotificationResource notificationTypeId(String notificationTypeId) {
    this.notificationTypeId = notificationTypeId;
    return this;
  }

   /**
   * The id of the notification type
   * @return notificationTypeId
  **/
  @ApiModelProperty(required = true, value = "The id of the notification type")
  public String getNotificationTypeId() {
    return notificationTypeId;
  }

  public void setNotificationTypeId(String notificationTypeId) {
    this.notificationTypeId = notificationTypeId;
  }

  public UserNotificationResource recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * The id of the recipient, dependent on the recipient_type. The user&#39;s id or the topic&#39;s id
   * @return recipient
  **/
  @ApiModelProperty(required = true, value = "The id of the recipient, dependent on the recipient_type. The user's id or the topic's id")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public UserNotificationResource recipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * The type of recipient for the notification. Either a user, or all users in a topic
   * @return recipientType
  **/
  @ApiModelProperty(required = true, value = "The type of recipient for the notification. Either a user, or all users in a topic")
  public RecipientTypeEnum getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
  }

   /**
   * The date this notification was first retrieved
   * @return retrieveDate
  **/
  @ApiModelProperty(value = "The date this notification was first retrieved")
  public Long getRetrieveDate() {
    return retrieveDate;
  }

   /**
   * The date this notification was sent
   * @return sendDate
  **/
  @ApiModelProperty(value = "The date this notification was sent")
  public Long getSendDate() {
    return sendDate;
  }

  public UserNotificationResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The user&#39;s status for this notification
   * @return status
  **/
  @ApiModelProperty(value = "The user's status for this notification")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UserNotificationResource userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The id of the user")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserNotificationResource userNotificationResource = (UserNotificationResource) o;
    return Objects.equals(this.data, userNotificationResource.data) &&
        Objects.equals(this.message, userNotificationResource.message) &&
        Objects.equals(this.notificationId, userNotificationResource.notificationId) &&
        Objects.equals(this.notificationTypeId, userNotificationResource.notificationTypeId) &&
        Objects.equals(this.recipient, userNotificationResource.recipient) &&
        Objects.equals(this.recipientType, userNotificationResource.recipientType) &&
        Objects.equals(this.retrieveDate, userNotificationResource.retrieveDate) &&
        Objects.equals(this.sendDate, userNotificationResource.sendDate) &&
        Objects.equals(this.status, userNotificationResource.status) &&
        Objects.equals(this.userId, userNotificationResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, message, notificationId, notificationTypeId, recipient, recipientType, retrieveDate, sendDate, status, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotificationResource {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationTypeId: ").append(toIndentedString(notificationTypeId)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    retrieveDate: ").append(toIndentedString(retrieveDate)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

