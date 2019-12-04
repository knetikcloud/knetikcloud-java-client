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
import com.knetikcloud.model.ExpressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Expressions are instructions for the rule engine to resolve certain values. For example instead of &#x60;user 1&#x60; it&#39;d state &#x60;user provided by the event&#x60;. Full list and definitions available at GET /bre/expressions.
 */
@ApiModel(description = "Expressions are instructions for the rule engine to resolve certain values. For example instead of `user 1` it'd state `user provided by the event`. Full list and definitions available at GET /bre/expressions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-04T08:56:21.771-05:00")
public class GlobalCheckAndIncrementResource {
  @JsonProperty("check_value_resource")
  private ExpressionResource checkValueResource = null;

  @JsonProperty("definition")
  private String definition = null;

  @JsonProperty("global_resource")
  private ExpressionResource globalResource = null;

  @JsonProperty("type")
  private String type = null;

  public GlobalCheckAndIncrementResource checkValueResource(ExpressionResource checkValueResource) {
    this.checkValueResource = checkValueResource;
    return this;
  }

   /**
   * Get checkValueResource
   * @return checkValueResource
  **/
  @ApiModelProperty(value = "")
  public ExpressionResource getCheckValueResource() {
    return checkValueResource;
  }

  public void setCheckValueResource(ExpressionResource checkValueResource) {
    this.checkValueResource = checkValueResource;
  }

  public GlobalCheckAndIncrementResource definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public GlobalCheckAndIncrementResource globalResource(ExpressionResource globalResource) {
    this.globalResource = globalResource;
    return this;
  }

   /**
   * Get globalResource
   * @return globalResource
  **/
  @ApiModelProperty(value = "")
  public ExpressionResource getGlobalResource() {
    return globalResource;
  }

  public void setGlobalResource(ExpressionResource globalResource) {
    this.globalResource = globalResource;
  }

  public GlobalCheckAndIncrementResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
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
    GlobalCheckAndIncrementResource globalCheckAndIncrementResource = (GlobalCheckAndIncrementResource) o;
    return Objects.equals(this.checkValueResource, globalCheckAndIncrementResource.checkValueResource) &&
        Objects.equals(this.definition, globalCheckAndIncrementResource.definition) &&
        Objects.equals(this.globalResource, globalCheckAndIncrementResource.globalResource) &&
        Objects.equals(this.type, globalCheckAndIncrementResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkValueResource, definition, globalResource, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalCheckAndIncrementResource {\n");
    
    sb.append("    checkValueResource: ").append(toIndentedString(checkValueResource)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    globalResource: ").append(toIndentedString(globalResource)).append("\n");
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

