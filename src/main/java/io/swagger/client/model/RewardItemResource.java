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
 * RewardItemResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:18:14.481-05:00")
public class RewardItemResource {
  @SerializedName("item_id")
  private Integer itemId = null;

  @SerializedName("item_name")
  private String itemName = null;

  @SerializedName("max_rank")
  private Integer maxRank = null;

  @SerializedName("min_rank")
  private Integer minRank = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public RewardItemResource itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The id of the item to reward
   * @return itemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the item to reward")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public RewardItemResource itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * The name of the item to reward (read only, set by id)
   * @return itemName
  **/
  @ApiModelProperty(example = "null", value = "The name of the item to reward (read only, set by id)")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public RewardItemResource maxRank(Integer maxRank) {
    this.maxRank = maxRank;
    return this;
  }

   /**
   * The highest number (worst) rank to give the reward to. Must be greater than or equal to minRank
   * @return maxRank
  **/
  @ApiModelProperty(example = "null", required = true, value = "The highest number (worst) rank to give the reward to. Must be greater than or equal to minRank")
  public Integer getMaxRank() {
    return maxRank;
  }

  public void setMaxRank(Integer maxRank) {
    this.maxRank = maxRank;
  }

  public RewardItemResource minRank(Integer minRank) {
    this.minRank = minRank;
    return this;
  }

   /**
   * The lowest number (best) rank to give the reward to. Must be greater than zero
   * @return minRank
  **/
  @ApiModelProperty(example = "null", required = true, value = "The lowest number (best) rank to give the reward to. Must be greater than zero")
  public Integer getMinRank() {
    return minRank;
  }

  public void setMinRank(Integer minRank) {
    this.minRank = minRank;
  }

  public RewardItemResource quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * How many copies to give
   * @return quantity
  **/
  @ApiModelProperty(example = "null", required = true, value = "How many copies to give")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardItemResource rewardItemResource = (RewardItemResource) o;
    return Objects.equals(this.itemId, rewardItemResource.itemId) &&
        Objects.equals(this.itemName, rewardItemResource.itemName) &&
        Objects.equals(this.maxRank, rewardItemResource.maxRank) &&
        Objects.equals(this.minRank, rewardItemResource.minRank) &&
        Objects.equals(this.quantity, rewardItemResource.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, itemName, maxRank, minRank, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardItemResource {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    maxRank: ").append(toIndentedString(maxRank)).append("\n");
    sb.append("    minRank: ").append(toIndentedString(minRank)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

