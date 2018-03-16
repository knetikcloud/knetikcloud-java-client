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
import java.math.BigDecimal;

/**
 * RevenueProductReportResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T15:25:18.305-04:00")
public class RevenueProductReportResource {
  @JsonProperty("item_id")
  private Integer itemId = null;

  @JsonProperty("item_name")
  private String itemName = null;

  @JsonProperty("revenue")
  private BigDecimal revenue = null;

  @JsonProperty("volume")
  private Long volume = null;

  public RevenueProductReportResource itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public RevenueProductReportResource itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * Get itemName
   * @return itemName
  **/
  @ApiModelProperty(value = "")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public RevenueProductReportResource revenue(BigDecimal revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRevenue() {
    return revenue;
  }

  public void setRevenue(BigDecimal revenue) {
    this.revenue = revenue;
  }

  public RevenueProductReportResource volume(Long volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @ApiModelProperty(value = "")
  public Long getVolume() {
    return volume;
  }

  public void setVolume(Long volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueProductReportResource revenueProductReportResource = (RevenueProductReportResource) o;
    return Objects.equals(this.itemId, revenueProductReportResource.itemId) &&
        Objects.equals(this.itemName, revenueProductReportResource.itemName) &&
        Objects.equals(this.revenue, revenueProductReportResource.revenue) &&
        Objects.equals(this.volume, revenueProductReportResource.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, itemName, revenue, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueProductReportResource {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

