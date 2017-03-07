/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
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
import io.swagger.client.model.PaymentMethodTypeResource;

/**
 * PaymentMethodResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T18:09:10.850-05:00")
public class PaymentMethodResource {
  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("expiration_date")
  private Long expirationDate = null;

  @SerializedName("expiration_month")
  private Integer expirationMonth = null;

  @SerializedName("expiration_year")
  private Integer expirationYear = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("last4")
  private String last4 = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("payment_method_type")
  private PaymentMethodTypeResource paymentMethodType = null;

  /**
   * The generic payment type. Default is card
   */
  public enum PaymentTypeEnum {
    @SerializedName("card")
    CARD("card"),
    
    @SerializedName("bank_account")
    BANK_ACCOUNT("bank_account");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("payment_type")
  private PaymentTypeEnum paymentType = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("sort")
  private Integer sort = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("unique_key")
  private String uniqueKey = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("verified")
  private Boolean verified = null;

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public PaymentMethodResource _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public PaymentMethodResource disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether this payment method is disabled or not
   * @return disabled
  **/
  @ApiModelProperty(example = "false", value = "Whether this payment method is disabled or not")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public PaymentMethodResource expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date for the payment method, expressed as seconds since epoch. Typically used for credit card payment methods
   * @return expirationDate
  **/
  @ApiModelProperty(example = "null", value = "The expiration date for the payment method, expressed as seconds since epoch. Typically used for credit card payment methods")
  public Long getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PaymentMethodResource expirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * The expiration month (1 - 12) for the payment method. Typically used for credit card payment methods
   * @return expirationMonth
  **/
  @ApiModelProperty(example = "null", value = "The expiration month (1 - 12) for the payment method. Typically used for credit card payment methods")
  public Integer getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public PaymentMethodResource expirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * The expiration year for the payment method. Typically used for credit card payment methods
   * @return expirationYear
  **/
  @ApiModelProperty(example = "null", value = "The expiration year for the payment method. Typically used for credit card payment methods")
  public Integer getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public PaymentMethodResource last4(String last4) {
    this.last4 = last4;
    return this;
  }

   /**
   * The last 4 digits of the account number for the payment method. Typically used for credit card payment methods
   * @return last4
  **/
  @ApiModelProperty(example = "null", value = "The last 4 digits of the account number for the payment method. Typically used for credit card payment methods")
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }

  public PaymentMethodResource longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public PaymentMethodResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user friendly name of that resource
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentMethodResource paymentMethodType(PaymentMethodTypeResource paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * The type of payment method. Must be a pre-existing value
   * @return paymentMethodType
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of payment method. Must be a pre-existing value")
  public PaymentMethodTypeResource getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethodTypeResource paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public PaymentMethodResource paymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The generic payment type. Default is card
   * @return paymentType
  **/
  @ApiModelProperty(example = "null", value = "The generic payment type. Default is card")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentMethodResource shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public PaymentMethodResource sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * The sort value for the payment method
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "The sort value for the payment method")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public PaymentMethodResource token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The unique token for the payment method
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "The unique token for the payment method")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public PaymentMethodResource uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * An optional unique identifier
   * @return uniqueKey
  **/
  @ApiModelProperty(example = "null", value = "An optional unique identifier")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public PaymentMethodResource userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user's id. If null, indicates a shared payment method that any user can use (i.e., 'wallet')
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "The user's id. If null, indicates a shared payment method that any user can use (i.e., 'wallet')")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public PaymentMethodResource verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVerified() {
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
    PaymentMethodResource paymentMethodResource = (PaymentMethodResource) o;
    return Objects.equals(this.createdDate, paymentMethodResource.createdDate) &&
        Objects.equals(this._default, paymentMethodResource._default) &&
        Objects.equals(this.disabled, paymentMethodResource.disabled) &&
        Objects.equals(this.expirationDate, paymentMethodResource.expirationDate) &&
        Objects.equals(this.expirationMonth, paymentMethodResource.expirationMonth) &&
        Objects.equals(this.expirationYear, paymentMethodResource.expirationYear) &&
        Objects.equals(this.id, paymentMethodResource.id) &&
        Objects.equals(this.last4, paymentMethodResource.last4) &&
        Objects.equals(this.longDescription, paymentMethodResource.longDescription) &&
        Objects.equals(this.name, paymentMethodResource.name) &&
        Objects.equals(this.paymentMethodType, paymentMethodResource.paymentMethodType) &&
        Objects.equals(this.paymentType, paymentMethodResource.paymentType) &&
        Objects.equals(this.shortDescription, paymentMethodResource.shortDescription) &&
        Objects.equals(this.sort, paymentMethodResource.sort) &&
        Objects.equals(this.token, paymentMethodResource.token) &&
        Objects.equals(this.uniqueKey, paymentMethodResource.uniqueKey) &&
        Objects.equals(this.updatedDate, paymentMethodResource.updatedDate) &&
        Objects.equals(this.userId, paymentMethodResource.userId) &&
        Objects.equals(this.verified, paymentMethodResource.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, _default, disabled, expirationDate, expirationMonth, expirationYear, id, last4, longDescription, name, paymentMethodType, paymentType, shortDescription, sort, token, uniqueKey, updatedDate, userId, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodResource {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

