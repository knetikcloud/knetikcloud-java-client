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
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Sku
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T16:42:50.105-05:00")
public class Sku {
  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("currency_code")
  private String currencyCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("inventory")
  private Integer inventory = null;

  @JsonProperty("min_inventory_threshold")
  private Integer minInventoryThreshold = null;

  @JsonProperty("not_available")
  private Boolean notAvailable = null;

  @JsonProperty("not_displayable")
  private Boolean notDisplayable = null;

  @JsonProperty("original_price")
  private BigDecimal originalPrice = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  @JsonProperty("published")
  private Boolean published = null;

  @JsonProperty("sale_id")
  private Integer saleId = null;

  @JsonProperty("sale_name")
  private String saleName = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("start_date")
  private Long startDate = null;

  @JsonProperty("stop_date")
  private Long stopDate = null;

  public Sku additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public Sku putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public Sku currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code for the SKU, a three letter string (ISO3)
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency code for the SKU, a three letter string (ISO3)")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Sku description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The friendly name of the SKU as it will appear on invoices and reports. Typically represents the option name like red, large, etc
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The friendly name of the SKU as it will appear on invoices and reports. Typically represents the option name like red, large, etc")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Sku inventory(Integer inventory) {
    this.inventory = inventory;
    return this;
  }

   /**
   * The number of SKUs currently in stock
   * @return inventory
  **/
  @ApiModelProperty(value = "The number of SKUs currently in stock")
  public Integer getInventory() {
    return inventory;
  }

  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }

  public Sku minInventoryThreshold(Integer minInventoryThreshold) {
    this.minInventoryThreshold = minInventoryThreshold;
    return this;
  }

   /**
   * Alerts vendor when SKU inventory drops below this value
   * @return minInventoryThreshold
  **/
  @ApiModelProperty(value = "Alerts vendor when SKU inventory drops below this value")
  public Integer getMinInventoryThreshold() {
    return minInventoryThreshold;
  }

  public void setMinInventoryThreshold(Integer minInventoryThreshold) {
    this.minInventoryThreshold = minInventoryThreshold;
  }

  public Sku notAvailable(Boolean notAvailable) {
    this.notAvailable = notAvailable;
    return this;
  }

   /**
   * Get notAvailable
   * @return notAvailable
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotAvailable() {
    return notAvailable;
  }

  public void setNotAvailable(Boolean notAvailable) {
    this.notAvailable = notAvailable;
  }

  public Sku notDisplayable(Boolean notDisplayable) {
    this.notDisplayable = notDisplayable;
    return this;
  }

   /**
   * Get notDisplayable
   * @return notDisplayable
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotDisplayable() {
    return notDisplayable;
  }

  public void setNotDisplayable(Boolean notDisplayable) {
    this.notDisplayable = notDisplayable;
  }

  public Sku originalPrice(BigDecimal originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * The base price before any sale
   * @return originalPrice
  **/
  @ApiModelProperty(required = true, value = "The base price before any sale")
  public BigDecimal getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(BigDecimal originalPrice) {
    this.originalPrice = originalPrice;
  }

   /**
   * The current price of the SKU with sales, if any. Set original_price for the base
   * @return price
  **/
  @ApiModelProperty(value = "The current price of the SKU with sales, if any. Set original_price for the base")
  public BigDecimal getPrice() {
    return price;
  }

  public Sku published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Whether or not the SKU is currently visible to users. This will not block users from purchase. Use start_date or stop_date to prevent purchase. Default: true
   * @return published
  **/
  @ApiModelProperty(example = "false", value = "Whether or not the SKU is currently visible to users. This will not block users from purchase. Use start_date or stop_date to prevent purchase. Default: true")
  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

   /**
   * The id of a sale affecting the price, if any
   * @return saleId
  **/
  @ApiModelProperty(value = "The id of a sale affecting the price, if any")
  public Integer getSaleId() {
    return saleId;
  }

   /**
   * The name of a sale affecting the price, if any
   * @return saleName
  **/
  @ApiModelProperty(value = "The name of a sale affecting the price, if any")
  public String getSaleName() {
    return saleName;
  }

  public Sku sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The stock keeping unit (SKU), a unique identifier for a given product.  Max 40 characters
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "The stock keeping unit (SKU), a unique identifier for a given product.  Max 40 characters")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Sku startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date the sku becomes visible (if published) and available for purchase, unix timestamp in seconds.  If set to null, sku will become available immediately
   * @return startDate
  **/
  @ApiModelProperty(value = "The date the sku becomes visible (if published) and available for purchase, unix timestamp in seconds.  If set to null, sku will become available immediately")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public Sku stopDate(Long stopDate) {
    this.stopDate = stopDate;
    return this;
  }

   /**
   * The date the sku becomes hidden and unavailable for purchase, unix timestamp in seconds.  If set to null, sku is always available
   * @return stopDate
  **/
  @ApiModelProperty(value = "The date the sku becomes hidden and unavailable for purchase, unix timestamp in seconds.  If set to null, sku is always available")
  public Long getStopDate() {
    return stopDate;
  }

  public void setStopDate(Long stopDate) {
    this.stopDate = stopDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sku sku = (Sku) o;
    return Objects.equals(this.additionalProperties, sku.additionalProperties) &&
        Objects.equals(this.currencyCode, sku.currencyCode) &&
        Objects.equals(this.description, sku.description) &&
        Objects.equals(this.inventory, sku.inventory) &&
        Objects.equals(this.minInventoryThreshold, sku.minInventoryThreshold) &&
        Objects.equals(this.notAvailable, sku.notAvailable) &&
        Objects.equals(this.notDisplayable, sku.notDisplayable) &&
        Objects.equals(this.originalPrice, sku.originalPrice) &&
        Objects.equals(this.price, sku.price) &&
        Objects.equals(this.published, sku.published) &&
        Objects.equals(this.saleId, sku.saleId) &&
        Objects.equals(this.saleName, sku.saleName) &&
        Objects.equals(this.sku, sku.sku) &&
        Objects.equals(this.startDate, sku.startDate) &&
        Objects.equals(this.stopDate, sku.stopDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, currencyCode, description, inventory, minInventoryThreshold, notAvailable, notDisplayable, originalPrice, price, published, saleId, saleName, sku, startDate, stopDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sku {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    minInventoryThreshold: ").append(toIndentedString(minInventoryThreshold)).append("\n");
    sb.append("    notAvailable: ").append(toIndentedString(notAvailable)).append("\n");
    sb.append("    notDisplayable: ").append(toIndentedString(notDisplayable)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    saleId: ").append(toIndentedString(saleId)).append("\n");
    sb.append("    saleName: ").append(toIndentedString(saleName)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    stopDate: ").append(toIndentedString(stopDate)).append("\n");
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

