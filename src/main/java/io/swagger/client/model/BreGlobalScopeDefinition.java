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
 * BreGlobalScopeDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T09:38:48.154-05:00")
public class BreGlobalScopeDefinition {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public BreGlobalScopeDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the scoping parameter. This is used as the unique identifier of this scope
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the scoping parameter. This is used as the unique identifier of this scope")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BreGlobalScopeDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The variable type of this scoping parameter. See Bre Variables endpoint for list
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The variable type of this scoping parameter. See Bre Variables endpoint for list")
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
    BreGlobalScopeDefinition breGlobalScopeDefinition = (BreGlobalScopeDefinition) o;
    return Objects.equals(this.name, breGlobalScopeDefinition.name) &&
        Objects.equals(this.type, breGlobalScopeDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreGlobalScopeDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

