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

/**
 * OptimalPaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T00:01:56.626-05:00")
public class OptimalPaymentRequest {
  @SerializedName("email")
  private String email = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("on_decline")
  private String onDecline = null;

  @SerializedName("on_error")
  private String onError = null;

  @SerializedName("on_success")
  private String onSuccess = null;

  public OptimalPaymentRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The email address of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OptimalPaymentRequest firstName(String firstName) {
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

  public OptimalPaymentRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The id of the invoice to pay
   * @return invoiceId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the invoice to pay")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public OptimalPaymentRequest lastName(String lastName) {
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

  public OptimalPaymentRequest onDecline(String onDecline) {
    this.onDecline = onDecline;
    return this;
  }

   /**
   * The url to redirect the user to after declining payment
   * @return onDecline
  **/
  @ApiModelProperty(example = "null", required = true, value = "The url to redirect the user to after declining payment")
  public String getOnDecline() {
    return onDecline;
  }

  public void setOnDecline(String onDecline) {
    this.onDecline = onDecline;
  }

  public OptimalPaymentRequest onError(String onError) {
    this.onError = onError;
    return this;
  }

   /**
   * The url to redirect the user to after an error in payment
   * @return onError
  **/
  @ApiModelProperty(example = "null", required = true, value = "The url to redirect the user to after an error in payment")
  public String getOnError() {
    return onError;
  }

  public void setOnError(String onError) {
    this.onError = onError;
  }

  public OptimalPaymentRequest onSuccess(String onSuccess) {
    this.onSuccess = onSuccess;
    return this;
  }

   /**
   * The url to redirect the user to after successful payment
   * @return onSuccess
  **/
  @ApiModelProperty(example = "null", required = true, value = "The url to redirect the user to after successful payment")
  public String getOnSuccess() {
    return onSuccess;
  }

  public void setOnSuccess(String onSuccess) {
    this.onSuccess = onSuccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimalPaymentRequest optimalPaymentRequest = (OptimalPaymentRequest) o;
    return Objects.equals(this.email, optimalPaymentRequest.email) &&
        Objects.equals(this.firstName, optimalPaymentRequest.firstName) &&
        Objects.equals(this.invoiceId, optimalPaymentRequest.invoiceId) &&
        Objects.equals(this.lastName, optimalPaymentRequest.lastName) &&
        Objects.equals(this.onDecline, optimalPaymentRequest.onDecline) &&
        Objects.equals(this.onError, optimalPaymentRequest.onError) &&
        Objects.equals(this.onSuccess, optimalPaymentRequest.onSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, invoiceId, lastName, onDecline, onError, onSuccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimalPaymentRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    onDecline: ").append(toIndentedString(onDecline)).append("\n");
    sb.append("    onError: ").append(toIndentedString(onError)).append("\n");
    sb.append("    onSuccess: ").append(toIndentedString(onSuccess)).append("\n");
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

