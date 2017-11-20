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
 * ReactivateSubscriptionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-20T10:56:48.833-05:00")
public class ReactivateSubscriptionRequest {
  @JsonProperty("inventory_id")
  private Integer inventoryId = null;

  @JsonProperty("reactivation_fee")
  private Boolean reactivationFee = null;

  public ReactivateSubscriptionRequest inventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
    return this;
  }

   /**
   * The inventory to reactivate. Only required if using the deprecated subscriptions service
   * @return inventoryId
  **/
  @ApiModelProperty(value = "The inventory to reactivate. Only required if using the deprecated subscriptions service")
  public Integer getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
  }

  public ReactivateSubscriptionRequest reactivationFee(Boolean reactivationFee) {
    this.reactivationFee = reactivationFee;
    return this;
  }

   /**
   * Whether to add the additional reactivation fee in addition to the recurring fee
   * @return reactivationFee
  **/
  @ApiModelProperty(example = "false", value = "Whether to add the additional reactivation fee in addition to the recurring fee")
  public Boolean isReactivationFee() {
    return reactivationFee;
  }

  public void setReactivationFee(Boolean reactivationFee) {
    this.reactivationFee = reactivationFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReactivateSubscriptionRequest reactivateSubscriptionRequest = (ReactivateSubscriptionRequest) o;
    return Objects.equals(this.inventoryId, reactivateSubscriptionRequest.inventoryId) &&
        Objects.equals(this.reactivationFee, reactivateSubscriptionRequest.reactivationFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryId, reactivationFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReactivateSubscriptionRequest {\n");
    
    sb.append("    inventoryId: ").append(toIndentedString(inventoryId)).append("\n");
    sb.append("    reactivationFee: ").append(toIndentedString(reactivationFee)).append("\n");
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

