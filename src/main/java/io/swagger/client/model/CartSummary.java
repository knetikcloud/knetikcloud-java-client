/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
 * CartSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:14:41.572-05:00")
public class CartSummary {
  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("grand_total")
  private Double grandTotal = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("invoice_id")
  private Double invoiceId = null;

  @SerializedName("items_in_cart")
  private Integer itemsInCart = null;

  /**
   * The status of the cart
   */
  public enum StatusEnum {
    @SerializedName("active")
    ACTIVE("active"),
    
    @SerializedName("processing")
    PROCESSING("processing"),
    
    @SerializedName("closed")
    CLOSED("closed"),
    
    @SerializedName("onhold")
    ONHOLD("onhold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("subtotal")
  private Double subtotal = null;

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The unique id code for the currency used in the cart
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "The unique id code for the currency used in the cart")
  public String getCurrencyCode() {
    return currencyCode;
  }

   /**
   * The grand total for the cart
   * @return grandTotal
  **/
  @ApiModelProperty(example = "null", value = "The grand total for the cart")
  public Double getGrandTotal() {
    return grandTotal;
  }

   /**
   * The unique ID for the cart
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for the cart")
  public String getId() {
    return id;
  }

   /**
   * The ID of the invoice associated with this cart
   * @return invoiceId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the invoice associated with this cart")
  public Double getInvoiceId() {
    return invoiceId;
  }

   /**
   * The number of items in the cart
   * @return itemsInCart
  **/
  @ApiModelProperty(example = "null", value = "The number of items in the cart")
  public Integer getItemsInCart() {
    return itemsInCart;
  }

   /**
   * The status of the cart
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The status of the cart")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * The subtotal of all items in the cart
   * @return subtotal
  **/
  @ApiModelProperty(example = "null", value = "The subtotal of all items in the cart")
  public Double getSubtotal() {
    return subtotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartSummary cartSummary = (CartSummary) o;
    return Objects.equals(this.createdDate, cartSummary.createdDate) &&
        Objects.equals(this.currencyCode, cartSummary.currencyCode) &&
        Objects.equals(this.grandTotal, cartSummary.grandTotal) &&
        Objects.equals(this.id, cartSummary.id) &&
        Objects.equals(this.invoiceId, cartSummary.invoiceId) &&
        Objects.equals(this.itemsInCart, cartSummary.itemsInCart) &&
        Objects.equals(this.status, cartSummary.status) &&
        Objects.equals(this.subtotal, cartSummary.subtotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, currencyCode, grandTotal, id, invoiceId, itemsInCart, status, subtotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartSummary {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    itemsInCart: ").append(toIndentedString(itemsInCart)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
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

