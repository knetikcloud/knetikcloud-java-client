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
 * BreActionLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-09T10:26:02.967-04:00")
public class BreActionLog {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("runtime")
  private Long runtime = null;

  @JsonProperty("status")
  private String status = null;

   /**
   * The name of the action
   * @return name
  **/
  @ApiModelProperty(value = "The name of the action")
  public String getName() {
    return name;
  }

   /**
   * The runtime of the action in milliseconds
   * @return runtime
  **/
  @ApiModelProperty(value = "The runtime of the action in milliseconds")
  public Long getRuntime() {
    return runtime;
  }

   /**
   * The status of the action (ran, failed)
   * @return status
  **/
  @ApiModelProperty(value = "The status of the action (ran, failed)")
  public String getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreActionLog breActionLog = (BreActionLog) o;
    return Objects.equals(this.name, breActionLog.name) &&
        Objects.equals(this.runtime, breActionLog.runtime) &&
        Objects.equals(this.status, breActionLog.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, runtime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreActionLog {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

