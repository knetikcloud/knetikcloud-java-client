/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
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
 * PropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-09T17:33:57.806-05:00")
public class PropertyDefinitionResource {
  @SerializedName("name")
  private String name = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("type")
  private String type = null;

  public PropertyDefinitionResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the property
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the property")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PropertyDefinitionResource required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether the property is required
   * @return required
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the property is required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public PropertyDefinitionResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.")
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
    PropertyDefinitionResource propertyDefinitionResource = (PropertyDefinitionResource) o;
    return Objects.equals(this.name, propertyDefinitionResource.name) &&
        Objects.equals(this.required, propertyDefinitionResource.required) &&
        Objects.equals(this.type, propertyDefinitionResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, required, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyDefinitionResource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

