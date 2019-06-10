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
 * MonitoringIncidentLevelResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-10T16:28:25.565-04:00")
public class MonitoringIncidentLevelResource {
  @JsonProperty("name")
  private String name = null;

  /**
   * The current status of the level
   */
  public enum StatusEnum {
    OK("OK"),
    
    ALARM("ALARM"),
    
    INSUFFICIENT_DATA("INSUFFICIENT_DATA");

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

  public MonitoringIncidentLevelResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the level
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the level")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MonitoringIncidentLevelResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the level
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The current status of the level")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringIncidentLevelResource monitoringIncidentLevelResource = (MonitoringIncidentLevelResource) o;
    return Objects.equals(this.name, monitoringIncidentLevelResource.name) &&
        Objects.equals(this.status, monitoringIncidentLevelResource.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringIncidentLevelResource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

