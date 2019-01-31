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
import com.knetikcloud.model.Behavior;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Fulfillable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-31T16:20:21.215-05:00")
public class Fulfillable extends Behavior {
  @JsonProperty("type_name")
  private String typeName = null;

  public Fulfillable typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * The name of the fulfillment type that describes how the item should be fulfilled.  Examples: inventory, wallet, amazon
   * @return typeName
  **/
  @ApiModelProperty(required = true, value = "The name of the fulfillment type that describes how the item should be fulfilled.  Examples: inventory, wallet, amazon")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fulfillable fulfillable = (Fulfillable) o;
    return Objects.equals(this.typeName, fulfillable.typeName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fulfillable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

