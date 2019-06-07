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
 * ApplyPaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T15:47:37.134-04:00")
public class ApplyPaymentRequest {
  @JsonProperty("invoice_id")
  private Integer invoiceId = null;

  @JsonProperty("receipt")
  private String receipt = null;

  @JsonProperty("transaction_id")
  private String transactionId = null;

  public ApplyPaymentRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The id of the local invoice being paid.
   * @return invoiceId
  **/
  @ApiModelProperty(required = true, value = "The id of the local invoice being paid.")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public ApplyPaymentRequest receipt(String receipt) {
    this.receipt = receipt;
    return this;
  }

   /**
   * The encoded receipt string from Apple&#39;s services.
   * @return receipt
  **/
  @ApiModelProperty(required = true, value = "The encoded receipt string from Apple's services.")
  public String getReceipt() {
    return receipt;
  }

  public void setReceipt(String receipt) {
    this.receipt = receipt;
  }

  public ApplyPaymentRequest transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The id of the specific transaction from Apple&#39;s services.
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "The id of the specific transaction from Apple's services.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyPaymentRequest applyPaymentRequest = (ApplyPaymentRequest) o;
    return Objects.equals(this.invoiceId, applyPaymentRequest.invoiceId) &&
        Objects.equals(this.receipt, applyPaymentRequest.receipt) &&
        Objects.equals(this.transactionId, applyPaymentRequest.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, receipt, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyPaymentRequest {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

