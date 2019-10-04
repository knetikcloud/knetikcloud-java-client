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
 * ActionContextobject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-04T11:36:20.337-04:00")
public class ActionContextobject {
  @JsonProperty("mapping")
  private Object mapping = null;

  @JsonProperty("type")
  private String type = null;

  public ActionContextobject mapping(Object mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * The mapping of the action context
   * @return mapping
  **/
  @ApiModelProperty(required = true, value = "The mapping of the action context")
  public Object getMapping() {
    return mapping;
  }

  public void setMapping(Object mapping) {
    this.mapping = mapping;
  }

  public ActionContextobject type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The name of the action
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The name of the action")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionContextobject actionContextobject = (ActionContextobject) o;
    return Objects.equals(this.mapping, actionContextobject.mapping) &&
        Objects.equals(this.type, actionContextobject.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionContextobject {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

