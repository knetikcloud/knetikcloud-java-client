/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
 * SubscriptionCreditResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:14:41.572-05:00")
public class SubscriptionCreditResource {
  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("inventory_id")
  private Integer inventoryId = null;

  @SerializedName("reason")
  private String reason = null;

  public SubscriptionCreditResource amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the credit, negative for debt
   * @return amount
  **/
  @ApiModelProperty(example = "null", required = true, value = "The amount of the credit, negative for debt")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

   /**
   * The date this credit was added, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date this credit was added, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The id of the credit record
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the credit record")
  public Integer getId() {
    return id;
  }

  public SubscriptionCreditResource inventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
    return this;
  }

   /**
   * The id of the subscription inventory entry
   * @return inventoryId
  **/
  @ApiModelProperty(example = "null", value = "The id of the subscription inventory entry")
  public Integer getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
  }

  public SubscriptionCreditResource reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the subscription credit
   * @return reason
  **/
  @ApiModelProperty(example = "null", required = true, value = "The reason for the subscription credit")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCreditResource subscriptionCreditResource = (SubscriptionCreditResource) o;
    return Objects.equals(this.amount, subscriptionCreditResource.amount) &&
        Objects.equals(this.createdDate, subscriptionCreditResource.createdDate) &&
        Objects.equals(this.id, subscriptionCreditResource.id) &&
        Objects.equals(this.inventoryId, subscriptionCreditResource.inventoryId) &&
        Objects.equals(this.reason, subscriptionCreditResource.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdDate, id, inventoryId, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCreditResource {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inventoryId: ").append(toIndentedString(inventoryId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

