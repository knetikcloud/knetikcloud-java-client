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
 * ChatThreadResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")
public class ChatThreadResource {
  @JsonProperty("active_users")
  private Integer activeUsers = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("recipient_id")
  private String recipientId = null;

  /**
   * The recipient type of the thread
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

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

   /**
   * The number of active users in the thread
   * @return activeUsers
  **/
  @ApiModelProperty(value = "The number of active users in the thread")
  public Integer getActiveUsers() {
    return activeUsers;
  }

   /**
   * The number of messages in the thread
   * @return count
  **/
  @ApiModelProperty(value = "The number of messages in the thread")
  public Integer getCount() {
    return count;
  }

   /**
   * The date the thread was created
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the thread was created")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The id for this thread
   * @return id
  **/
  @ApiModelProperty(value = "The id for this thread")
  public String getId() {
    return id;
  }

  public ChatThreadResource recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The id of the recipient
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The id of the recipient")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public ChatThreadResource recipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * The recipient type of the thread
   * @return recipientType
  **/
  @ApiModelProperty(required = true, value = "The recipient type of the thread")
  public RecipientTypeEnum getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
  }

  public ChatThreadResource subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the thread
   * @return subject
  **/
  @ApiModelProperty(value = "The subject of the thread")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

   /**
   * The date the thread was updated
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the thread was updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatThreadResource chatThreadResource = (ChatThreadResource) o;
    return Objects.equals(this.activeUsers, chatThreadResource.activeUsers) &&
        Objects.equals(this.count, chatThreadResource.count) &&
        Objects.equals(this.createdDate, chatThreadResource.createdDate) &&
        Objects.equals(this.id, chatThreadResource.id) &&
        Objects.equals(this.recipientId, chatThreadResource.recipientId) &&
        Objects.equals(this.recipientType, chatThreadResource.recipientType) &&
        Objects.equals(this.subject, chatThreadResource.subject) &&
        Objects.equals(this.updatedDate, chatThreadResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeUsers, count, createdDate, id, recipientId, recipientType, subject, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatThreadResource {\n");
    
    sb.append("    activeUsers: ").append(toIndentedString(activeUsers)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

