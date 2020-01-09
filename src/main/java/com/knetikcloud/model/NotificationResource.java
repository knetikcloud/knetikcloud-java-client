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
 * NotificationResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-09T14:18:32.790-05:00")
public class NotificationResource {
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

  @JsonProperty("send_date")
  private Long sendDate = null;

  public NotificationResource data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * The data to send to websockets. Also used to fill in the templates
   * @return data
  **/
  @ApiModelProperty(value = "The data to send to websockets. Also used to fill in the templates")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

   /**
   * The resolved message template, if configured on the notification type
   * @return message
  **/
  @ApiModelProperty(value = "The resolved message template, if configured on the notification type")
  public String getMessage() {
    return message;
  }

  public NotificationResource notificationId(String notificationId) {
    this.notificationId = notificationId;
    return this;
  }

   /**
   * The id of this individual notification. Default: random
   * @return notificationId
  **/
  @ApiModelProperty(value = "The id of this individual notification. Default: random")
  public String getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }

  public NotificationResource notificationTypeId(String notificationTypeId) {
    this.notificationTypeId = notificationTypeId;
    return this;
  }

   /**
   * The id of the notification type which will define message templates
   * @return notificationTypeId
  **/
  @ApiModelProperty(required = true, value = "The id of the notification type which will define message templates")
  public String getNotificationTypeId() {
    return notificationTypeId;
  }

  public void setNotificationTypeId(String notificationTypeId) {
    this.notificationTypeId = notificationTypeId;
  }

  public NotificationResource recipient(String recipient) {
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

  public NotificationResource recipientType(RecipientTypeEnum recipientType) {
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
   * The date this notification was sent
   * @return sendDate
  **/
  @ApiModelProperty(value = "The date this notification was sent")
  public Long getSendDate() {
    return sendDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationResource notificationResource = (NotificationResource) o;
    return Objects.equals(this.data, notificationResource.data) &&
        Objects.equals(this.message, notificationResource.message) &&
        Objects.equals(this.notificationId, notificationResource.notificationId) &&
        Objects.equals(this.notificationTypeId, notificationResource.notificationTypeId) &&
        Objects.equals(this.recipient, notificationResource.recipient) &&
        Objects.equals(this.recipientType, notificationResource.recipientType) &&
        Objects.equals(this.sendDate, notificationResource.sendDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, message, notificationId, notificationTypeId, recipient, recipientType, sendDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationResource {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationTypeId: ").append(toIndentedString(notificationTypeId)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
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

