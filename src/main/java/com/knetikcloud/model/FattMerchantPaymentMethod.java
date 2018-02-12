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
 * FattMerchantPaymentMethod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class FattMerchantPaymentMethod {
  @JsonProperty("address1")
  private String address1 = null;

  @JsonProperty("address2")
  private String address2 = null;

  @JsonProperty("address_city")
  private String addressCity = null;

  @JsonProperty("address_country")
  private String addressCountry = null;

  @JsonProperty("address_state")
  private String addressState = null;

  @JsonProperty("address_zip")
  private String addressZip = null;

  @JsonProperty("card_last_four")
  private String cardLastFour = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("customer_id")
  private String customerId = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  public FattMerchantPaymentMethod address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(value = "")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public FattMerchantPaymentMethod address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @ApiModelProperty(value = "")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public FattMerchantPaymentMethod addressCity(String addressCity) {
    this.addressCity = addressCity;
    return this;
  }

   /**
   * Get addressCity
   * @return addressCity
  **/
  @ApiModelProperty(value = "")
  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public FattMerchantPaymentMethod addressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * Get addressCountry
   * @return addressCountry
  **/
  @ApiModelProperty(value = "")
  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public FattMerchantPaymentMethod addressState(String addressState) {
    this.addressState = addressState;
    return this;
  }

   /**
   * Get addressState
   * @return addressState
  **/
  @ApiModelProperty(value = "")
  public String getAddressState() {
    return addressState;
  }

  public void setAddressState(String addressState) {
    this.addressState = addressState;
  }

  public FattMerchantPaymentMethod addressZip(String addressZip) {
    this.addressZip = addressZip;
    return this;
  }

   /**
   * Get addressZip
   * @return addressZip
  **/
  @ApiModelProperty(value = "")
  public String getAddressZip() {
    return addressZip;
  }

  public void setAddressZip(String addressZip) {
    this.addressZip = addressZip;
  }

  public FattMerchantPaymentMethod cardLastFour(String cardLastFour) {
    this.cardLastFour = cardLastFour;
    return this;
  }

   /**
   * Last four digits of the credit card
   * @return cardLastFour
  **/
  @ApiModelProperty(required = true, value = "Last four digits of the credit card")
  public String getCardLastFour() {
    return cardLastFour;
  }

  public void setCardLastFour(String cardLastFour) {
    this.cardLastFour = cardLastFour;
  }

  public FattMerchantPaymentMethod createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public FattMerchantPaymentMethod customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique FattMerchant customer ID
   * @return customerId
  **/
  @ApiModelProperty(required = true, value = "Unique FattMerchant customer ID")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public FattMerchantPaymentMethod deletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @ApiModelProperty(value = "")
  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }

  public FattMerchantPaymentMethod id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FattMerchantPaymentMethod nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Nickname given to the FattMerchant payment method
   * @return nickname
  **/
  @ApiModelProperty(required = true, value = "Nickname given to the FattMerchant payment method")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public FattMerchantPaymentMethod updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FattMerchantPaymentMethod fattMerchantPaymentMethod = (FattMerchantPaymentMethod) o;
    return Objects.equals(this.address1, fattMerchantPaymentMethod.address1) &&
        Objects.equals(this.address2, fattMerchantPaymentMethod.address2) &&
        Objects.equals(this.addressCity, fattMerchantPaymentMethod.addressCity) &&
        Objects.equals(this.addressCountry, fattMerchantPaymentMethod.addressCountry) &&
        Objects.equals(this.addressState, fattMerchantPaymentMethod.addressState) &&
        Objects.equals(this.addressZip, fattMerchantPaymentMethod.addressZip) &&
        Objects.equals(this.cardLastFour, fattMerchantPaymentMethod.cardLastFour) &&
        Objects.equals(this.createdAt, fattMerchantPaymentMethod.createdAt) &&
        Objects.equals(this.customerId, fattMerchantPaymentMethod.customerId) &&
        Objects.equals(this.deletedAt, fattMerchantPaymentMethod.deletedAt) &&
        Objects.equals(this.id, fattMerchantPaymentMethod.id) &&
        Objects.equals(this.nickname, fattMerchantPaymentMethod.nickname) &&
        Objects.equals(this.updatedAt, fattMerchantPaymentMethod.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, addressCity, addressCountry, addressState, addressZip, cardLastFour, createdAt, customerId, deletedAt, id, nickname, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FattMerchantPaymentMethod {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
    sb.append("    addressZip: ").append(toIndentedString(addressZip)).append("\n");
    sb.append("    cardLastFour: ").append(toIndentedString(cardLastFour)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
