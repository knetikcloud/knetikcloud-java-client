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
 * NestedCategory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T18:40:53.584-05:00")
public class NestedCategory {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

   /**
   * Whether the category is active
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the category is active")
  public Boolean getActive() {
    return active;
  }

  public NestedCategory id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the category
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the category")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The name of the category
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the category")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedCategory nestedCategory = (NestedCategory) o;
    return Objects.equals(this.active, nestedCategory.active) &&
        Objects.equals(this.id, nestedCategory.id) &&
        Objects.equals(this.name, nestedCategory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedCategory {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

