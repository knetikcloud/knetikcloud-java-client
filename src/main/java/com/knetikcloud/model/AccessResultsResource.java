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
import java.util.ArrayList;
import java.util.List;

/**
 * AccessResultsResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-04T08:56:21.771-05:00")
public class AccessResultsResource {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("field_blacklist")
  private List<String> fieldBlacklist = null;

  public AccessResultsResource action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public AccessResultsResource fieldBlacklist(List<String> fieldBlacklist) {
    this.fieldBlacklist = fieldBlacklist;
    return this;
  }

  public AccessResultsResource addFieldBlacklistItem(String fieldBlacklistItem) {
    if (this.fieldBlacklist == null) {
      this.fieldBlacklist = new ArrayList<String>();
    }
    this.fieldBlacklist.add(fieldBlacklistItem);
    return this;
  }

   /**
   * Get fieldBlacklist
   * @return fieldBlacklist
  **/
  @ApiModelProperty(value = "")
  public List<String> getFieldBlacklist() {
    return fieldBlacklist;
  }

  public void setFieldBlacklist(List<String> fieldBlacklist) {
    this.fieldBlacklist = fieldBlacklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessResultsResource accessResultsResource = (AccessResultsResource) o;
    return Objects.equals(this.action, accessResultsResource.action) &&
        Objects.equals(this.fieldBlacklist, accessResultsResource.fieldBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, fieldBlacklist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessResultsResource {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    fieldBlacklist: ").append(toIndentedString(fieldBlacklist)).append("\n");
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

