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
 * CartItemRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:12:34.695-05:00")
public class CartItemRequest {
  @JsonProperty("affiliate_key")
  private String affiliateKey = null;

  @JsonProperty("catalog_sku")
  private String catalogSku = null;

  @JsonProperty("gift_target")
  private Integer giftTarget = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("price_override")
  private BigDecimal priceOverride = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  public CartItemRequest affiliateKey(String affiliateKey) {
    this.affiliateKey = affiliateKey;
    return this;
  }

   /**
   * The affiliate key of the item
   * @return affiliateKey
  **/
  @ApiModelProperty(value = "The affiliate key of the item")
  public String getAffiliateKey() {
    return affiliateKey;
  }

  public void setAffiliateKey(String affiliateKey) {
    this.affiliateKey = affiliateKey;
  }

  public CartItemRequest catalogSku(String catalogSku) {
    this.catalogSku = catalogSku;
    return this;
  }

   /**
   * The catalog SKU of the item
   * @return catalogSku
  **/
  @ApiModelProperty(required = true, value = "The catalog SKU of the item")
  public String getCatalogSku() {
    return catalogSku;
  }

  public void setCatalogSku(String catalogSku) {
    this.catalogSku = catalogSku;
  }

  public CartItemRequest giftTarget(Integer giftTarget) {
    this.giftTarget = giftTarget;
    return this;
  }

   /**
   * The id of a user that this is being gifted to
   * @return giftTarget
  **/
  @ApiModelProperty(value = "The id of a user that this is being gifted to")
  public Integer getGiftTarget() {
    return giftTarget;
  }

  public void setGiftTarget(Integer giftTarget) {
    this.giftTarget = giftTarget;
  }

  public CartItemRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes about this item purchase
   * @return notes
  **/
  @ApiModelProperty(value = "Notes about this item purchase")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CartItemRequest priceOverride(BigDecimal priceOverride) {
    this.priceOverride = priceOverride;
    return this;
  }

   /**
   * Override the price of an item, if the behavior configuration permits it. Do not send if taking standard pricing. Minimum 0
   * @return priceOverride
  **/
  @ApiModelProperty(value = "Override the price of an item, if the behavior configuration permits it. Do not send if taking standard pricing. Minimum 0")
  public BigDecimal getPriceOverride() {
    return priceOverride;
  }

  public void setPriceOverride(BigDecimal priceOverride) {
    this.priceOverride = priceOverride;
  }

  public CartItemRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the item
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of the item")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemRequest cartItemRequest = (CartItemRequest) o;
    return Objects.equals(this.affiliateKey, cartItemRequest.affiliateKey) &&
        Objects.equals(this.catalogSku, cartItemRequest.catalogSku) &&
        Objects.equals(this.giftTarget, cartItemRequest.giftTarget) &&
        Objects.equals(this.notes, cartItemRequest.notes) &&
        Objects.equals(this.priceOverride, cartItemRequest.priceOverride) &&
        Objects.equals(this.quantity, cartItemRequest.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateKey, catalogSku, giftTarget, notes, priceOverride, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemRequest {\n");
    
    sb.append("    affiliateKey: ").append(toIndentedString(affiliateKey)).append("\n");
    sb.append("    catalogSku: ").append(toIndentedString(catalogSku)).append("\n");
    sb.append("    giftTarget: ").append(toIndentedString(giftTarget)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    priceOverride: ").append(toIndentedString(priceOverride)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

