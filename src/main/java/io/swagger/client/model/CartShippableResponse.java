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
 * CartShippableResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T00:01:56.626-05:00")
public class CartShippableResponse {
  @SerializedName("cart_id")
  private Integer cartId = null;

  @SerializedName("shippable")
  private Boolean shippable = null;

  public CartShippableResponse cartId(Integer cartId) {
    this.cartId = cartId;
    return this;
  }

   /**
   * The id of the cart
   * @return cartId
  **/
  @ApiModelProperty(example = "null", value = "The id of the cart")
  public Integer getCartId() {
    return cartId;
  }

  public void setCartId(Integer cartId) {
    this.cartId = cartId;
  }

  public CartShippableResponse shippable(Boolean shippable) {
    this.shippable = shippable;
    return this;
  }

   /**
   * Whether the item is shippable
   * @return shippable
  **/
  @ApiModelProperty(example = "false", value = "Whether the item is shippable")
  public Boolean getShippable() {
    return shippable;
  }

  public void setShippable(Boolean shippable) {
    this.shippable = shippable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartShippableResponse cartShippableResponse = (CartShippableResponse) o;
    return Objects.equals(this.cartId, cartShippableResponse.cartId) &&
        Objects.equals(this.shippable, cartShippableResponse.shippable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartId, shippable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartShippableResponse {\n");
    
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    shippable: ").append(toIndentedString(shippable)).append("\n");
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

