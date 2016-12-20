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
 * FulfillmentType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T11:36:22.734-05:00")
public class FulfillmentType {
  @SerializedName("core")
  private Boolean core = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  public FulfillmentType core(Boolean core) {
    this.core = core;
    return this;
  }

   /**
   * Whether the type is core and cannot be altered/deleted, read-only
   * @return core
  **/
  @ApiModelProperty(example = "false", value = "Whether the type is core and cannot be altered/deleted, read-only")
  public Boolean getCore() {
    return core;
  }

  public void setCore(Boolean core) {
    this.core = core;
  }

  public FulfillmentType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the type
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A description of the type")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FulfillmentType id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of the type, read-only
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique id of the type, read-only")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public FulfillmentType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the type
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the type")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentType fulfillmentType = (FulfillmentType) o;
    return Objects.equals(this.core, fulfillmentType.core) &&
        Objects.equals(this.description, fulfillmentType.description) &&
        Objects.equals(this.id, fulfillmentType.id) &&
        Objects.equals(this.name, fulfillmentType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(core, description, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentType {\n");
    
    sb.append("    core: ").append(toIndentedString(core)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

