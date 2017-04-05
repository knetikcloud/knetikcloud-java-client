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


package com.knetikcloud.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CartShippingAddressRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-05T15:45:46.506-04:00")
public class CartShippingAddressRequest {
  @SerializedName("city")
  private String city = null;

  @SerializedName("country_code_iso3")
  private String countryCodeIso3 = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("name_prefix")
  private String namePrefix = null;

  @SerializedName("order_notes")
  private String orderNotes = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("postal_state_code")
  private String postalStateCode = null;

  @SerializedName("shipping_address_line1")
  private String shippingAddressLine1 = null;

  @SerializedName("shipping_address_line2")
  private String shippingAddressLine2 = null;

  @SerializedName("zip")
  private String zip = null;

  public CartShippingAddressRequest city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the user
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "The city of the user")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CartShippingAddressRequest countryCodeIso3(String countryCodeIso3) {
    this.countryCodeIso3 = countryCodeIso3;
    return this;
  }

   /**
   * The country code of the user
   * @return countryCodeIso3
  **/
  @ApiModelProperty(example = "null", value = "The country code of the user")
  public String getCountryCodeIso3() {
    return countryCodeIso3;
  }

  public void setCountryCodeIso3(String countryCodeIso3) {
    this.countryCodeIso3 = countryCodeIso3;
  }

  public CartShippingAddressRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the user
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The email of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CartShippingAddressRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the user
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "The first name of the user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CartShippingAddressRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the user
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "The last name of the user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CartShippingAddressRequest namePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * Get namePrefix
   * @return namePrefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNamePrefix() {
    return namePrefix;
  }

  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }

  public CartShippingAddressRequest orderNotes(String orderNotes) {
    this.orderNotes = orderNotes;
    return this;
  }

   /**
   * The order notes the user
   * @return orderNotes
  **/
  @ApiModelProperty(example = "null", value = "The order notes the user")
  public String getOrderNotes() {
    return orderNotes;
  }

  public void setOrderNotes(String orderNotes) {
    this.orderNotes = orderNotes;
  }

  public CartShippingAddressRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of the user
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "The phone number of the user")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CartShippingAddressRequest postalStateCode(String postalStateCode) {
    this.postalStateCode = postalStateCode;
    return this;
  }

   /**
   * The postal state code of the user
   * @return postalStateCode
  **/
  @ApiModelProperty(example = "null", value = "The postal state code of the user")
  public String getPostalStateCode() {
    return postalStateCode;
  }

  public void setPostalStateCode(String postalStateCode) {
    this.postalStateCode = postalStateCode;
  }

  public CartShippingAddressRequest shippingAddressLine1(String shippingAddressLine1) {
    this.shippingAddressLine1 = shippingAddressLine1;
    return this;
  }

   /**
   * The shipping address of the user, first line
   * @return shippingAddressLine1
  **/
  @ApiModelProperty(example = "null", value = "The shipping address of the user, first line")
  public String getShippingAddressLine1() {
    return shippingAddressLine1;
  }

  public void setShippingAddressLine1(String shippingAddressLine1) {
    this.shippingAddressLine1 = shippingAddressLine1;
  }

  public CartShippingAddressRequest shippingAddressLine2(String shippingAddressLine2) {
    this.shippingAddressLine2 = shippingAddressLine2;
    return this;
  }

   /**
   * The shipping address of the user, second line
   * @return shippingAddressLine2
  **/
  @ApiModelProperty(example = "null", value = "The shipping address of the user, second line")
  public String getShippingAddressLine2() {
    return shippingAddressLine2;
  }

  public void setShippingAddressLine2(String shippingAddressLine2) {
    this.shippingAddressLine2 = shippingAddressLine2;
  }

  public CartShippingAddressRequest zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * The zipcode of the user
   * @return zip
  **/
  @ApiModelProperty(example = "null", value = "The zipcode of the user")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartShippingAddressRequest cartShippingAddressRequest = (CartShippingAddressRequest) o;
    return Objects.equals(this.city, cartShippingAddressRequest.city) &&
        Objects.equals(this.countryCodeIso3, cartShippingAddressRequest.countryCodeIso3) &&
        Objects.equals(this.email, cartShippingAddressRequest.email) &&
        Objects.equals(this.firstName, cartShippingAddressRequest.firstName) &&
        Objects.equals(this.lastName, cartShippingAddressRequest.lastName) &&
        Objects.equals(this.namePrefix, cartShippingAddressRequest.namePrefix) &&
        Objects.equals(this.orderNotes, cartShippingAddressRequest.orderNotes) &&
        Objects.equals(this.phoneNumber, cartShippingAddressRequest.phoneNumber) &&
        Objects.equals(this.postalStateCode, cartShippingAddressRequest.postalStateCode) &&
        Objects.equals(this.shippingAddressLine1, cartShippingAddressRequest.shippingAddressLine1) &&
        Objects.equals(this.shippingAddressLine2, cartShippingAddressRequest.shippingAddressLine2) &&
        Objects.equals(this.zip, cartShippingAddressRequest.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, countryCodeIso3, email, firstName, lastName, namePrefix, orderNotes, phoneNumber, postalStateCode, shippingAddressLine1, shippingAddressLine2, zip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartShippingAddressRequest {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCodeIso3: ").append(toIndentedString(countryCodeIso3)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    orderNotes: ").append(toIndentedString(orderNotes)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalStateCode: ").append(toIndentedString(postalStateCode)).append("\n");
    sb.append("    shippingAddressLine1: ").append(toIndentedString(shippingAddressLine1)).append("\n");
    sb.append("    shippingAddressLine2: ").append(toIndentedString(shippingAddressLine2)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

