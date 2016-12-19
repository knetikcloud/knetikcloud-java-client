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
 * CreatePayPalPaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:14:41.572-05:00")
public class CreatePayPalPaymentRequest {
  @SerializedName("cancel_url")
  private String cancelUrl = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("return_url")
  private String returnUrl = null;

  public CreatePayPalPaymentRequest cancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * The endpoint URL to which PayPal should forward the user to if they cancel the checkout process
   * @return cancelUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "The endpoint URL to which PayPal should forward the user to if they cancel the checkout process")
  public String getCancelUrl() {
    return cancelUrl;
  }

  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  public CreatePayPalPaymentRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The ID of an invoice to pay
   * @return invoiceId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The ID of an invoice to pay")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public CreatePayPalPaymentRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The endpoint URL to which PayPal should forward the user after they accept. This endpoint will receive information needed for the next step
   * @return returnUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "The endpoint URL to which PayPal should forward the user after they accept. This endpoint will receive information needed for the next step")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePayPalPaymentRequest createPayPalPaymentRequest = (CreatePayPalPaymentRequest) o;
    return Objects.equals(this.cancelUrl, createPayPalPaymentRequest.cancelUrl) &&
        Objects.equals(this.invoiceId, createPayPalPaymentRequest.invoiceId) &&
        Objects.equals(this.returnUrl, createPayPalPaymentRequest.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelUrl, invoiceId, returnUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePayPalPaymentRequest {\n");
    
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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

