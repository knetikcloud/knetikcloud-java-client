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

/**
 * FinalizePayPalPaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:17:28.027-04:00")
public class FinalizePayPalPaymentRequest {
  @JsonProperty("invoice_id")
  private Integer invoiceId = null;

  @JsonProperty("payer_id")
  private String payerId = null;

  @JsonProperty("token")
  private String token = null;

  public FinalizePayPalPaymentRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The ID of the invoice that is being paid. Must match the invoice sent in originally
   * @return invoiceId
  **/
  @ApiModelProperty(required = true, value = "The ID of the invoice that is being paid. Must match the invoice sent in originally")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public FinalizePayPalPaymentRequest payerId(String payerId) {
    this.payerId = payerId;
    return this;
  }

   /**
   * The ID of the payer that PayPal returned with the user at the return URL
   * @return payerId
  **/
  @ApiModelProperty(required = true, value = "The ID of the payer that PayPal returned with the user at the return URL")
  public String getPayerId() {
    return payerId;
  }

  public void setPayerId(String payerId) {
    this.payerId = payerId;
  }

  public FinalizePayPalPaymentRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The token that PayPal returned with the user in the return URL
   * @return token
  **/
  @ApiModelProperty(required = true, value = "The token that PayPal returned with the user in the return URL")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinalizePayPalPaymentRequest finalizePayPalPaymentRequest = (FinalizePayPalPaymentRequest) o;
    return Objects.equals(this.invoiceId, finalizePayPalPaymentRequest.invoiceId) &&
        Objects.equals(this.payerId, finalizePayPalPaymentRequest.payerId) &&
        Objects.equals(this.token, finalizePayPalPaymentRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, payerId, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalizePayPalPaymentRequest {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

