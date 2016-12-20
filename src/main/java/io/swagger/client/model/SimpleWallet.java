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
 * SimpleWallet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T11:36:22.734-05:00")
public class SimpleWallet {
  @SerializedName("balance")
  private Double balance = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("currency_name")
  private String currencyName = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public SimpleWallet balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * The current balance of the wallet
   * @return balance
  **/
  @ApiModelProperty(example = "null", value = "The current balance of the wallet")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public SimpleWallet code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The ISO currency code for the wallet
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "The ISO currency code for the wallet")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SimpleWallet currencyName(String currencyName) {
    this.currencyName = currencyName;
    return this;
  }

   /**
   * The name of the currency stored in the wallet
   * @return currencyName
  **/
  @ApiModelProperty(example = "null", value = "The name of the currency stored in the wallet")
  public String getCurrencyName() {
    return currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public SimpleWallet id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the wallet
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID of the wallet")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SimpleWallet userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user to whom the wallet belongs
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the user to whom the wallet belongs")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleWallet simpleWallet = (SimpleWallet) o;
    return Objects.equals(this.balance, simpleWallet.balance) &&
        Objects.equals(this.code, simpleWallet.code) &&
        Objects.equals(this.currencyName, simpleWallet.currencyName) &&
        Objects.equals(this.id, simpleWallet.id) &&
        Objects.equals(this.userId, simpleWallet.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, code, currencyName, id, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleWallet {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

