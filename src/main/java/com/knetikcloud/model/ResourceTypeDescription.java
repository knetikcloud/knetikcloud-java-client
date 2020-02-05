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
 * ResourceTypeDescription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")
public class ResourceTypeDescription {
  @JsonProperty("id_field")
  private String idField = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("service_path")
  private String servicePath = null;

  public ResourceTypeDescription idField(String idField) {
    this.idField = idField;
    return this;
  }

   /**
   * The field on the resource that the id is in
   * @return idField
  **/
  @ApiModelProperty(required = true, value = "The field on the resource that the id is in")
  public String getIdField() {
    return idField;
  }

  public void setIdField(String idField) {
    this.idField = idField;
  }

  public ResourceTypeDescription name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name for the resource in swagger. This serves as the unique identifier. Cannot be changed after creation
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The unique name for the resource in swagger. This serves as the unique identifier. Cannot be changed after creation")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceTypeDescription servicePath(String servicePath) {
    this.servicePath = servicePath;
    return this;
  }

   /**
   * The base path of the service
   * @return servicePath
  **/
  @ApiModelProperty(required = true, value = "The base path of the service")
  public String getServicePath() {
    return servicePath;
  }

  public void setServicePath(String servicePath) {
    this.servicePath = servicePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceTypeDescription resourceTypeDescription = (ResourceTypeDescription) o;
    return Objects.equals(this.idField, resourceTypeDescription.idField) &&
        Objects.equals(this.name, resourceTypeDescription.name) &&
        Objects.equals(this.servicePath, resourceTypeDescription.servicePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idField, name, servicePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceTypeDescription {\n");
    
    sb.append("    idField: ").append(toIndentedString(idField)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    servicePath: ").append(toIndentedString(servicePath)).append("\n");
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

