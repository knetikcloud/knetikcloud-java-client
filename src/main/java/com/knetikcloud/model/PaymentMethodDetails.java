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
 * PaymentMethodDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T15:47:37.134-04:00")
public class PaymentMethodDetails {
  @JsonProperty("default")
  private Boolean _default = null;

  @JsonProperty("expiration_date")
  private Long expirationDate = null;

  @JsonProperty("expiration_month")
  private Integer expirationMonth = null;

  @JsonProperty("expiration_year")
  private Integer expirationYear = null;

  @JsonProperty("last4")
  private String last4 = null;

  @JsonProperty("sort")
  private Integer sort = null;

  @JsonProperty("unique_key")
  private String uniqueKey = null;

  @JsonProperty("verified")
  private Boolean verified = null;

  public PaymentMethodDetails _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public PaymentMethodDetails expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date for the payment method, expressed as seconds since epoch. Typically used for credit card payment methods
   * @return expirationDate
  **/
  @ApiModelProperty(value = "The expiration date for the payment method, expressed as seconds since epoch. Typically used for credit card payment methods")
  public Long getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PaymentMethodDetails expirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * The expiration month (1 - 12) for the payment method. Typically used for credit card payment methods
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "The expiration month (1 - 12) for the payment method. Typically used for credit card payment methods")
  public Integer getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public PaymentMethodDetails expirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * The expiration year for the payment method. Typically used for credit card payment methods
   * @return expirationYear
  **/
  @ApiModelProperty(value = "The expiration year for the payment method. Typically used for credit card payment methods")
  public Integer getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }

  public PaymentMethodDetails last4(String last4) {
    this.last4 = last4;
    return this;
  }

   /**
   * The last 4 digits of the account number for the payment method. Typically used for credit card payment methods
   * @return last4
  **/
  @ApiModelProperty(value = "The last 4 digits of the account number for the payment method. Typically used for credit card payment methods")
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }

  public PaymentMethodDetails sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * The sort value for the payment method
   * @return sort
  **/
  @ApiModelProperty(value = "The sort value for the payment method")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public PaymentMethodDetails uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * An optional unique identifier
   * @return uniqueKey
  **/
  @ApiModelProperty(value = "An optional unique identifier")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  public PaymentMethodDetails verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @ApiModelProperty(value = "")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) o;
    return Objects.equals(this._default, paymentMethodDetails._default) &&
        Objects.equals(this.expirationDate, paymentMethodDetails.expirationDate) &&
        Objects.equals(this.expirationMonth, paymentMethodDetails.expirationMonth) &&
        Objects.equals(this.expirationYear, paymentMethodDetails.expirationYear) &&
        Objects.equals(this.last4, paymentMethodDetails.last4) &&
        Objects.equals(this.sort, paymentMethodDetails.sort) &&
        Objects.equals(this.uniqueKey, paymentMethodDetails.uniqueKey) &&
        Objects.equals(this.verified, paymentMethodDetails.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, expirationDate, expirationMonth, expirationYear, last4, sort, uniqueKey, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodDetails {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

