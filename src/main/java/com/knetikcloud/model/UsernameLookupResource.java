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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:07:48.774-04:00")
public class UsernameLookupResource {
  @JsonProperty("definition")
  private String definition = null;

  @JsonProperty("lookup_key")
  private ExpressionResource lookupKey = null;

  @JsonProperty("required_key_type")
  private String requiredKeyType = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value_type")
  private String valueType = null;

  public UsernameLookupResource definition(String definition) {
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

  public UsernameLookupResource lookupKey(ExpressionResource lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

   /**
   * Get lookupKey
   * @return lookupKey
  **/
  @ApiModelProperty(value = "")
  public ExpressionResource getLookupKey() {
    return lookupKey;
  }

  public void setLookupKey(ExpressionResource lookupKey) {
    this.lookupKey = lookupKey;
  }

  public UsernameLookupResource requiredKeyType(String requiredKeyType) {
    this.requiredKeyType = requiredKeyType;
    return this;
  }

   /**
   * Get requiredKeyType
   * @return requiredKeyType
  **/
  @ApiModelProperty(value = "")
  public String getRequiredKeyType() {
    return requiredKeyType;
  }

  public void setRequiredKeyType(String requiredKeyType) {
    this.requiredKeyType = requiredKeyType;
  }

  public UsernameLookupResource type(String type) {
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

  public UsernameLookupResource valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @ApiModelProperty(value = "")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsernameLookupResource usernameLookupResource = (UsernameLookupResource) o;
    return Objects.equals(this.definition, usernameLookupResource.definition) &&
        Objects.equals(this.lookupKey, usernameLookupResource.lookupKey) &&
        Objects.equals(this.requiredKeyType, usernameLookupResource.requiredKeyType) &&
        Objects.equals(this.type, usernameLookupResource.type) &&
        Objects.equals(this.valueType, usernameLookupResource.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, lookupKey, requiredKeyType, type, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsernameLookupResource {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    lookupKey: ").append(toIndentedString(lookupKey)).append("\n");
    sb.append("    requiredKeyType: ").append(toIndentedString(requiredKeyType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

