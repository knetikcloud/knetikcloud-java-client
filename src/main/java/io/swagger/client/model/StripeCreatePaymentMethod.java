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
 * StripeCreatePaymentMethod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T00:10:20.144-05:00")
public class StripeCreatePaymentMethod {
  @SerializedName("token")
  private String token = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public StripeCreatePaymentMethod token(String token) {
    this.token = token;
    return this;
  }

   /**
   * A token from Stripe to identify payment info to be tied to the customer
   * @return token
  **/
  @ApiModelProperty(example = "null", required = true, value = "A token from Stripe to identify payment info to be tied to the customer")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public StripeCreatePaymentMethod userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user, if null the logged in user is used. Admin privilege need to specify other users
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "The id of the user, if null the logged in user is used. Admin privilege need to specify other users")
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
    StripeCreatePaymentMethod stripeCreatePaymentMethod = (StripeCreatePaymentMethod) o;
    return Objects.equals(this.token, stripeCreatePaymentMethod.token) &&
        Objects.equals(this.userId, stripeCreatePaymentMethod.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeCreatePaymentMethod {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

