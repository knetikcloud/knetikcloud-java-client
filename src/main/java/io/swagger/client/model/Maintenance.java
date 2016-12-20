/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
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

/**
 * Maintenance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T11:36:22.734-05:00")
public class Maintenance {
  @SerializedName("access_locked")
  private Boolean accessLocked = null;

  @SerializedName("details")
  private Object details = null;

  @SerializedName("message")
  private String message = null;

  public Maintenance accessLocked(Boolean accessLocked) {
    this.accessLocked = accessLocked;
    return this;
  }

   /**
   * Whether access to the system has been locked
   * @return accessLocked
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether access to the system has been locked")
  public Boolean getAccessLocked() {
    return accessLocked;
  }

  public void setAccessLocked(Boolean accessLocked) {
    this.accessLocked = accessLocked;
  }

  public Maintenance details(Object details) {
    this.details = details;
    return this;
  }

   /**
   * A simple object of any schema for client side use and processing
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "A simple object of any schema for client side use and processing")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  public Maintenance message(String message) {
    this.message = message;
    return this;
  }

   /**
   * User displayable message about the maintenance
   * @return message
  **/
  @ApiModelProperty(example = "null", required = true, value = "User displayable message about the maintenance")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Maintenance maintenance = (Maintenance) o;
    return Objects.equals(this.accessLocked, maintenance.accessLocked) &&
        Objects.equals(this.details, maintenance.details) &&
        Objects.equals(this.message, maintenance.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLocked, details, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Maintenance {\n");
    
    sb.append("    accessLocked: ").append(toIndentedString(accessLocked)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

