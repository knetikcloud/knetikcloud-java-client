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
import com.knetikcloud.model.ActivityEntitlementResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ActivityOccurrenceJoinResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class ActivityOccurrenceJoinResult {
  @JsonProperty("entitlement")
  private ActivityEntitlementResource entitlement = null;

  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("user_id")
  private Long userId = null;

  public ActivityOccurrenceJoinResult entitlement(ActivityEntitlementResource entitlement) {
    this.entitlement = entitlement;
    return this;
  }

   /**
   * The details on the entitlement object needed to enter the occurrence (if any)
   * @return entitlement
  **/
  @ApiModelProperty(value = "The details on the entitlement object needed to enter the occurrence (if any)")
  public ActivityEntitlementResource getEntitlement() {
    return entitlement;
  }

  public void setEntitlement(ActivityEntitlementResource entitlement) {
    this.entitlement = entitlement;
  }

  public ActivityOccurrenceJoinResult errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Zero if the user was/could be added to the occurrence. Jsapi error code indicating the reason of the failure otherwise
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "Zero if the user was/could be added to the occurrence. Jsapi error code indicating the reason of the failure otherwise")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ActivityOccurrenceJoinResult message(String message) {
    this.message = message;
    return this;
  }

   /**
   * An error message if failure
   * @return message
  **/
  @ApiModelProperty(value = "An error message if failure")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ActivityOccurrenceJoinResult userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user&#39;s id
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The user's id")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
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
    ActivityOccurrenceJoinResult activityOccurrenceJoinResult = (ActivityOccurrenceJoinResult) o;
    return Objects.equals(this.entitlement, activityOccurrenceJoinResult.entitlement) &&
        Objects.equals(this.errorCode, activityOccurrenceJoinResult.errorCode) &&
        Objects.equals(this.message, activityOccurrenceJoinResult.message) &&
        Objects.equals(this.userId, activityOccurrenceJoinResult.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlement, errorCode, message, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOccurrenceJoinResult {\n");
    
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
