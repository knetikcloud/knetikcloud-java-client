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
 * XsollaPaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class XsollaPaymentRequest {
  @JsonProperty("invoice_id")
  private Integer invoiceId = null;

  @JsonProperty("return_url")
  private String returnUrl = null;

  public XsollaPaymentRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The id of an invoice to pay
   * @return invoiceId
  **/
  @ApiModelProperty(required = true, value = "The id of an invoice to pay")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public XsollaPaymentRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The endpoint URL xsolla should forward the user to after they pay
   * @return returnUrl
  **/
  @ApiModelProperty(required = true, value = "The endpoint URL xsolla should forward the user to after they pay")
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
    XsollaPaymentRequest xsollaPaymentRequest = (XsollaPaymentRequest) o;
    return Objects.equals(this.invoiceId, xsollaPaymentRequest.invoiceId) &&
        Objects.equals(this.returnUrl, xsollaPaymentRequest.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, returnUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XsollaPaymentRequest {\n");
    
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

