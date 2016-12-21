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
 * InvoiceItemResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:41:19.694-05:00")
public class InvoiceItemResource {
  @SerializedName("affiliate_id")
  private Integer affiliateId = null;

  @SerializedName("bundle_sku")
  private String bundleSku = null;

  @SerializedName("current_fulfillment_status")
  private String currentFulfillmentStatus = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("item_id")
  private Integer itemId = null;

  @SerializedName("item_name")
  private String itemName = null;

  @SerializedName("original_total_price")
  private Double originalTotalPrice = null;

  @SerializedName("original_unit_price")
  private Double originalUnitPrice = null;

  @SerializedName("qty")
  private Integer qty = null;

  @SerializedName("sale_name")
  private String saleName = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("sku_description")
  private String skuDescription = null;

  @SerializedName("system_price")
  private Double systemPrice = null;

  @SerializedName("total_price")
  private Double totalPrice = null;

  @SerializedName("type_hint")
  private String typeHint = null;

  @SerializedName("unit_price")
  private Double unitPrice = null;

  public InvoiceItemResource affiliateId(Integer affiliateId) {
    this.affiliateId = affiliateId;
    return this;
  }

   /**
   * Get affiliateId
   * @return affiliateId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAffiliateId() {
    return affiliateId;
  }

  public void setAffiliateId(Integer affiliateId) {
    this.affiliateId = affiliateId;
  }

  public InvoiceItemResource bundleSku(String bundleSku) {
    this.bundleSku = bundleSku;
    return this;
  }

   /**
   * Get bundleSku
   * @return bundleSku
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBundleSku() {
    return bundleSku;
  }

  public void setBundleSku(String bundleSku) {
    this.bundleSku = bundleSku;
  }

  public InvoiceItemResource currentFulfillmentStatus(String currentFulfillmentStatus) {
    this.currentFulfillmentStatus = currentFulfillmentStatus;
    return this;
  }

   /**
   * Get currentFulfillmentStatus
   * @return currentFulfillmentStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrentFulfillmentStatus() {
    return currentFulfillmentStatus;
  }

  public void setCurrentFulfillmentStatus(String currentFulfillmentStatus) {
    this.currentFulfillmentStatus = currentFulfillmentStatus;
  }

  public InvoiceItemResource id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InvoiceItemResource invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public InvoiceItemResource itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public InvoiceItemResource itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * Get itemName
   * @return itemName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public InvoiceItemResource originalTotalPrice(Double originalTotalPrice) {
    this.originalTotalPrice = originalTotalPrice;
    return this;
  }

   /**
   * Get originalTotalPrice
   * @return originalTotalPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getOriginalTotalPrice() {
    return originalTotalPrice;
  }

  public void setOriginalTotalPrice(Double originalTotalPrice) {
    this.originalTotalPrice = originalTotalPrice;
  }

  public InvoiceItemResource originalUnitPrice(Double originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
    return this;
  }

   /**
   * Get originalUnitPrice
   * @return originalUnitPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(Double originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  public InvoiceItemResource qty(Integer qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public InvoiceItemResource saleName(String saleName) {
    this.saleName = saleName;
    return this;
  }

   /**
   * Get saleName
   * @return saleName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSaleName() {
    return saleName;
  }

  public void setSaleName(String saleName) {
    this.saleName = saleName;
  }

  public InvoiceItemResource sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public InvoiceItemResource skuDescription(String skuDescription) {
    this.skuDescription = skuDescription;
    return this;
  }

   /**
   * Get skuDescription
   * @return skuDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSkuDescription() {
    return skuDescription;
  }

  public void setSkuDescription(String skuDescription) {
    this.skuDescription = skuDescription;
  }

  public InvoiceItemResource systemPrice(Double systemPrice) {
    this.systemPrice = systemPrice;
    return this;
  }

   /**
   * Get systemPrice
   * @return systemPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSystemPrice() {
    return systemPrice;
  }

  public void setSystemPrice(Double systemPrice) {
    this.systemPrice = systemPrice;
  }

  public InvoiceItemResource totalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public InvoiceItemResource typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * Get typeHint
   * @return typeHint
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  public InvoiceItemResource unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceItemResource invoiceItemResource = (InvoiceItemResource) o;
    return Objects.equals(this.affiliateId, invoiceItemResource.affiliateId) &&
        Objects.equals(this.bundleSku, invoiceItemResource.bundleSku) &&
        Objects.equals(this.currentFulfillmentStatus, invoiceItemResource.currentFulfillmentStatus) &&
        Objects.equals(this.id, invoiceItemResource.id) &&
        Objects.equals(this.invoiceId, invoiceItemResource.invoiceId) &&
        Objects.equals(this.itemId, invoiceItemResource.itemId) &&
        Objects.equals(this.itemName, invoiceItemResource.itemName) &&
        Objects.equals(this.originalTotalPrice, invoiceItemResource.originalTotalPrice) &&
        Objects.equals(this.originalUnitPrice, invoiceItemResource.originalUnitPrice) &&
        Objects.equals(this.qty, invoiceItemResource.qty) &&
        Objects.equals(this.saleName, invoiceItemResource.saleName) &&
        Objects.equals(this.sku, invoiceItemResource.sku) &&
        Objects.equals(this.skuDescription, invoiceItemResource.skuDescription) &&
        Objects.equals(this.systemPrice, invoiceItemResource.systemPrice) &&
        Objects.equals(this.totalPrice, invoiceItemResource.totalPrice) &&
        Objects.equals(this.typeHint, invoiceItemResource.typeHint) &&
        Objects.equals(this.unitPrice, invoiceItemResource.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateId, bundleSku, currentFulfillmentStatus, id, invoiceId, itemId, itemName, originalTotalPrice, originalUnitPrice, qty, saleName, sku, skuDescription, systemPrice, totalPrice, typeHint, unitPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItemResource {\n");
    
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
    sb.append("    bundleSku: ").append(toIndentedString(bundleSku)).append("\n");
    sb.append("    currentFulfillmentStatus: ").append(toIndentedString(currentFulfillmentStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    originalTotalPrice: ").append(toIndentedString(originalTotalPrice)).append("\n");
    sb.append("    originalUnitPrice: ").append(toIndentedString(originalUnitPrice)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    saleName: ").append(toIndentedString(saleName)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    skuDescription: ").append(toIndentedString(skuDescription)).append("\n");
    sb.append("    systemPrice: ").append(toIndentedString(systemPrice)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

