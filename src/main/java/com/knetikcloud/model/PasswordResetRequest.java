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
 * A request to reset a user&#39;s password by using a known user property
 */
@ApiModel(description = "A request to reset a user's password by using a known user property")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")
public class PasswordResetRequest {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("mobile_number")
  private String mobileNumber = null;

  @JsonProperty("username")
  private String username = null;

  public PasswordResetRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The user&#39;s email address
   * @return email
  **/
  @ApiModelProperty(value = "The user's email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PasswordResetRequest mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * The user&#39;s mobile phone number
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "The user's mobile phone number")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public PasswordResetRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The user&#39;s username
   * @return username
  **/
  @ApiModelProperty(value = "The user's username")
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
    PasswordResetRequest passwordResetRequest = (PasswordResetRequest) o;
    return Objects.equals(this.email, passwordResetRequest.email) &&
        Objects.equals(this.mobileNumber, passwordResetRequest.mobileNumber) &&
        Objects.equals(this.username, passwordResetRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, mobileNumber, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordResetRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
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

