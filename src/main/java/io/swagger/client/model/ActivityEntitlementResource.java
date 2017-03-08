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
 * ActivityEntitlementResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T19:56:53.315-05:00")
public class ActivityEntitlementResource {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("item_id")
  private Integer itemId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("sku")
  private String sku = null;

   /**
   * The ISO3 currency code the price is in, if available
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "The ISO3 currency code the price is in, if available")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public ActivityEntitlementResource itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The id of the entitlement item
   * @return itemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the entitlement item")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

   /**
   * The name of the entitlement item
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the entitlement item")
  public String getName() {
    return name;
  }

   /**
   * The price of the sku, if available
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "The price of the sku, if available")
  public Double getPrice() {
    return price;
  }

   /**
   * The sku id, if available. If multiple are available, then first one is returned
   * @return sku
  **/
  @ApiModelProperty(example = "null", value = "The sku id, if available. If multiple are available, then first one is returned")
  public String getSku() {
    return sku;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityEntitlementResource activityEntitlementResource = (ActivityEntitlementResource) o;
    return Objects.equals(this.currencyCode, activityEntitlementResource.currencyCode) &&
        Objects.equals(this.itemId, activityEntitlementResource.itemId) &&
        Objects.equals(this.name, activityEntitlementResource.name) &&
        Objects.equals(this.price, activityEntitlementResource.price) &&
        Objects.equals(this.sku, activityEntitlementResource.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, itemId, name, price, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityEntitlementResource {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

