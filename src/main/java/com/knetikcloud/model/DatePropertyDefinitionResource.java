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
import com.knetikcloud.model.PropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DatePropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class DatePropertyDefinitionResource extends PropertyDefinitionResource {
  @JsonProperty("max")
  private Long max = null;

  @JsonProperty("min")
  private Long min = null;

  public DatePropertyDefinitionResource max(Long max) {
    this.max = max;
    return this;
  }

   /**
   * If provided, the maximum value
   * @return max
  **/
  @ApiModelProperty(value = "If provided, the maximum value")
  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  public DatePropertyDefinitionResource min(Long min) {
    this.min = min;
    return this;
  }

   /**
   * If provided, the minimum value
   * @return min
  **/
  @ApiModelProperty(value = "If provided, the minimum value")
  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatePropertyDefinitionResource datePropertyDefinitionResource = (DatePropertyDefinitionResource) o;
    return Objects.equals(this.max, datePropertyDefinitionResource.max) &&
        Objects.equals(this.min, datePropertyDefinitionResource.min) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatePropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
