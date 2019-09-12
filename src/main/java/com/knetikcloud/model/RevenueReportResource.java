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
 * RevenueReportResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T16:33:56.846-04:00")
public class RevenueReportResource {
  @JsonProperty("customer_count")
  private Long customerCount = null;

  @JsonProperty("sale_count")
  private Long saleCount = null;

  @JsonProperty("sales_average")
  private BigDecimal salesAverage = null;

  @JsonProperty("sales_total")
  private BigDecimal salesTotal = null;

  public RevenueReportResource customerCount(Long customerCount) {
    this.customerCount = customerCount;
    return this;
  }

   /**
   * Get customerCount
   * @return customerCount
  **/
  @ApiModelProperty(value = "")
  public Long getCustomerCount() {
    return customerCount;
  }

  public void setCustomerCount(Long customerCount) {
    this.customerCount = customerCount;
  }

  public RevenueReportResource saleCount(Long saleCount) {
    this.saleCount = saleCount;
    return this;
  }

   /**
   * Get saleCount
   * @return saleCount
  **/
  @ApiModelProperty(value = "")
  public Long getSaleCount() {
    return saleCount;
  }

  public void setSaleCount(Long saleCount) {
    this.saleCount = saleCount;
  }

  public RevenueReportResource salesAverage(BigDecimal salesAverage) {
    this.salesAverage = salesAverage;
    return this;
  }

   /**
   * Get salesAverage
   * @return salesAverage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSalesAverage() {
    return salesAverage;
  }

  public void setSalesAverage(BigDecimal salesAverage) {
    this.salesAverage = salesAverage;
  }

  public RevenueReportResource salesTotal(BigDecimal salesTotal) {
    this.salesTotal = salesTotal;
    return this;
  }

   /**
   * Get salesTotal
   * @return salesTotal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSalesTotal() {
    return salesTotal;
  }

  public void setSalesTotal(BigDecimal salesTotal) {
    this.salesTotal = salesTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueReportResource revenueReportResource = (RevenueReportResource) o;
    return Objects.equals(this.customerCount, revenueReportResource.customerCount) &&
        Objects.equals(this.saleCount, revenueReportResource.saleCount) &&
        Objects.equals(this.salesAverage, revenueReportResource.salesAverage) &&
        Objects.equals(this.salesTotal, revenueReportResource.salesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCount, saleCount, salesAverage, salesTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueReportResource {\n");
    
    sb.append("    customerCount: ").append(toIndentedString(customerCount)).append("\n");
    sb.append("    saleCount: ").append(toIndentedString(saleCount)).append("\n");
    sb.append("    salesAverage: ").append(toIndentedString(salesAverage)).append("\n");
    sb.append("    salesTotal: ").append(toIndentedString(salesTotal)).append("\n");
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

