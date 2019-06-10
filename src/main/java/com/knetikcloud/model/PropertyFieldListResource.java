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
import com.knetikcloud.model.PropertyFieldResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PropertyFieldListResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-10T11:34:11.759-04:00")
public class PropertyFieldListResource {
  @JsonProperty("property_definition_fields")
  private List<PropertyFieldResource> propertyDefinitionFields = null;

  @JsonProperty("property_fields")
  private List<PropertyFieldResource> propertyFields = null;

  @JsonProperty("property_type")
  private String propertyType = null;

  public PropertyFieldListResource propertyDefinitionFields(List<PropertyFieldResource> propertyDefinitionFields) {
    this.propertyDefinitionFields = propertyDefinitionFields;
    return this;
  }

  public PropertyFieldListResource addPropertyDefinitionFieldsItem(PropertyFieldResource propertyDefinitionFieldsItem) {
    if (this.propertyDefinitionFields == null) {
      this.propertyDefinitionFields = new ArrayList<PropertyFieldResource>();
    }
    this.propertyDefinitionFields.add(propertyDefinitionFieldsItem);
    return this;
  }

   /**
   * A list of fields for the property definition.
   * @return propertyDefinitionFields
  **/
  @ApiModelProperty(value = "A list of fields for the property definition.")
  public List<PropertyFieldResource> getPropertyDefinitionFields() {
    return propertyDefinitionFields;
  }

  public void setPropertyDefinitionFields(List<PropertyFieldResource> propertyDefinitionFields) {
    this.propertyDefinitionFields = propertyDefinitionFields;
  }

  public PropertyFieldListResource propertyFields(List<PropertyFieldResource> propertyFields) {
    this.propertyFields = propertyFields;
    return this;
  }

  public PropertyFieldListResource addPropertyFieldsItem(PropertyFieldResource propertyFieldsItem) {
    if (this.propertyFields == null) {
      this.propertyFields = new ArrayList<PropertyFieldResource>();
    }
    this.propertyFields.add(propertyFieldsItem);
    return this;
  }

   /**
   * A list of fields for the property.
   * @return propertyFields
  **/
  @ApiModelProperty(value = "A list of fields for the property.")
  public List<PropertyFieldResource> getPropertyFields() {
    return propertyFields;
  }

  public void setPropertyFields(List<PropertyFieldResource> propertyFields) {
    this.propertyFields = propertyFields;
  }

  public PropertyFieldListResource propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
  }

   /**
   * The type for the property this describes.
   * @return propertyType
  **/
  @ApiModelProperty(value = "The type for the property this describes.")
  public String getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyFieldListResource propertyFieldListResource = (PropertyFieldListResource) o;
    return Objects.equals(this.propertyDefinitionFields, propertyFieldListResource.propertyDefinitionFields) &&
        Objects.equals(this.propertyFields, propertyFieldListResource.propertyFields) &&
        Objects.equals(this.propertyType, propertyFieldListResource.propertyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyDefinitionFields, propertyFields, propertyType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyFieldListResource {\n");
    
    sb.append("    propertyDefinitionFields: ").append(toIndentedString(propertyDefinitionFields)).append("\n");
    sb.append("    propertyFields: ").append(toIndentedString(propertyFields)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
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

