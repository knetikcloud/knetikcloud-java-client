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
 * CartShippingOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:07:48.774-04:00")
public class CartShippingOption {
  @JsonProperty("currency_code")
  private String currencyCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("original_price")
  private BigDecimal originalPrice = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  @JsonProperty("shipping_item_id")
  private Integer shippingItemId = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("taxable")
  private Boolean taxable = null;

  @JsonProperty("vendor_id")
  private Integer vendorId = null;

  @JsonProperty("vendor_name")
  private String vendorName = null;

  public CartShippingOption currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CartShippingOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CartShippingOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CartShippingOption originalPrice(BigDecimal originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * Get originalPrice
   * @return originalPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(BigDecimal originalPrice) {
    this.originalPrice = originalPrice;
  }

  public CartShippingOption price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CartShippingOption shippingItemId(Integer shippingItemId) {
    this.shippingItemId = shippingItemId;
    return this;
  }

   /**
   * Get shippingItemId
   * @return shippingItemId
  **/
  @ApiModelProperty(value = "")
  public Integer getShippingItemId() {
    return shippingItemId;
  }

  public void setShippingItemId(Integer shippingItemId) {
    this.shippingItemId = shippingItemId;
  }

  public CartShippingOption sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public CartShippingOption taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Get taxable
   * @return taxable
  **/
  @ApiModelProperty(value = "")
  public Boolean isTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  public CartShippingOption vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(value = "")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  public CartShippingOption vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @ApiModelProperty(value = "")
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartShippingOption cartShippingOption = (CartShippingOption) o;
    return Objects.equals(this.currencyCode, cartShippingOption.currencyCode) &&
        Objects.equals(this.description, cartShippingOption.description) &&
        Objects.equals(this.name, cartShippingOption.name) &&
        Objects.equals(this.originalPrice, cartShippingOption.originalPrice) &&
        Objects.equals(this.price, cartShippingOption.price) &&
        Objects.equals(this.shippingItemId, cartShippingOption.shippingItemId) &&
        Objects.equals(this.sku, cartShippingOption.sku) &&
        Objects.equals(this.taxable, cartShippingOption.taxable) &&
        Objects.equals(this.vendorId, cartShippingOption.vendorId) &&
        Objects.equals(this.vendorName, cartShippingOption.vendorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, description, name, originalPrice, price, shippingItemId, sku, taxable, vendorId, vendorName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartShippingOption {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    shippingItemId: ").append(toIndentedString(shippingItemId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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

