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
 * PasswordChangeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-05T10:20:50.333-04:00")
public class PasswordChangeRequest {
  @JsonProperty("current_password")
  private String currentPassword = null;

  @JsonProperty("value")
  private String value = null;

  public PasswordChangeRequest currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

   /**
   * The current password in plain text. Required if not admin
   * @return currentPassword
  **/
  @ApiModelProperty(value = "The current password in plain text. Required if not admin")
  public String getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  public PasswordChangeRequest value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The new password in plain text
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The new password in plain text")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordChangeRequest passwordChangeRequest = (PasswordChangeRequest) o;
    return Objects.equals(this.currentPassword, passwordChangeRequest.currentPassword) &&
        Objects.equals(this.value, passwordChangeRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordChangeRequest {\n");
    
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

