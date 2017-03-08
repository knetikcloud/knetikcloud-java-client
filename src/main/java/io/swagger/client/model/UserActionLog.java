/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserActionLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T12:56:08.189-05:00")
public class UserActionLog {
  @SerializedName("action_description")
  private String actionDescription = null;

  @SerializedName("action_name")
  private String actionName = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("details")
  private Map<String, String> details = new HashMap<String, String>();

  @SerializedName("id")
  private String id = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public UserActionLog actionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
    return this;
  }

   /**
   * A description of the action taken
   * @return actionDescription
  **/
  @ApiModelProperty(example = "null", required = true, value = "A description of the action taken")
  public String getActionDescription() {
    return actionDescription;
  }

  public void setActionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
  }

  public UserActionLog actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }

   /**
   * The name of the action taken
   * @return actionName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the action taken")
  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

   /**
   * The date of the action, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date of the action, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public UserActionLog details(Map<String, String> details) {
    this.details = details;
    return this;
  }

  public UserActionLog putDetailsItem(String key, String detailsItem) {
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * A map of additional details such as the target of the action
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "A map of additional details such as the target of the action")
  public Map<String, String> getDetails() {
    return details;
  }

  public void setDetails(Map<String, String> details) {
    this.details = details;
  }

   /**
   * The id of the log entry
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the log entry")
  public String getId() {
    return id;
  }

   /**
   * The id of the api request that spawned the action, if generated internally
   * @return requestId
  **/
  @ApiModelProperty(example = "null", value = "The id of the api request that spawned the action, if generated internally")
  public String getRequestId() {
    return requestId;
  }

  public UserActionLog userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user that took the action, if any. Read-only if not posting with LOGS_ADMIN
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "The id of the user that took the action, if any. Read-only if not posting with LOGS_ADMIN")
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
    UserActionLog userActionLog = (UserActionLog) o;
    return Objects.equals(this.actionDescription, userActionLog.actionDescription) &&
        Objects.equals(this.actionName, userActionLog.actionName) &&
        Objects.equals(this.createdDate, userActionLog.createdDate) &&
        Objects.equals(this.details, userActionLog.details) &&
        Objects.equals(this.id, userActionLog.id) &&
        Objects.equals(this.requestId, userActionLog.requestId) &&
        Objects.equals(this.userId, userActionLog.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDescription, actionName, createdDate, details, id, requestId, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActionLog {\n");
    
    sb.append("    actionDescription: ").append(toIndentedString(actionDescription)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

