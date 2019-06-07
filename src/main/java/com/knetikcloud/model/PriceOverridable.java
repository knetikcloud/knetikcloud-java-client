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
import java.math.BigDecimal;

/**
 * PriceOverridable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T13:18:12.930-04:00")
public class PriceOverridable extends Behavior {
  @JsonProperty("max_price")
  private BigDecimal maxPrice = null;

  @JsonProperty("min_price")
  private BigDecimal minPrice = null;

  public PriceOverridable maxPrice(BigDecimal maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

   /**
   * The maximum price allowed
   * @return maxPrice
  **/
  @ApiModelProperty(value = "The maximum price allowed")
  public BigDecimal getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(BigDecimal maxPrice) {
    this.maxPrice = maxPrice;
  }

  public PriceOverridable minPrice(BigDecimal minPrice) {
    this.minPrice = minPrice;
    return this;
  }

   /**
   * The minimum price allowed
   * @return minPrice
  **/
  @ApiModelProperty(value = "The minimum price allowed")
  public BigDecimal getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(BigDecimal minPrice) {
    this.minPrice = minPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceOverridable priceOverridable = (PriceOverridable) o;
    return Objects.equals(this.maxPrice, priceOverridable.maxPrice) &&
        Objects.equals(this.minPrice, priceOverridable.minPrice) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPrice, minPrice, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceOverridable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
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

