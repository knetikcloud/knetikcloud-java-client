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
import com.knetikcloud.model.RewardCurrencyResource;
import com.knetikcloud.model.RewardItemResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RewardSetResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T15:40:21.552-05:00")
public class RewardSetResource {
  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("currency_rewards")
  private List<RewardCurrencyResource> currencyRewards = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("item_rewards")
  private List<RewardItemResource> itemRewards = null;

  @JsonProperty("long_description")
  private String longDescription = null;

  @JsonProperty("max_placing")
  private Integer maxPlacing = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("short_description")
  private String shortDescription = null;

  @JsonProperty("unique_key")
  private String uniqueKey = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public RewardSetResource currencyRewards(List<RewardCurrencyResource> currencyRewards) {
    this.currencyRewards = currencyRewards;
    return this;
  }

  public RewardSetResource addCurrencyRewardsItem(RewardCurrencyResource currencyRewardsItem) {
    if (this.currencyRewards == null) {
      this.currencyRewards = new ArrayList<RewardCurrencyResource>();
    }
    this.currencyRewards.add(currencyRewardsItem);
    return this;
  }

   /**
   * The currency to give as rewards
   * @return currencyRewards
  **/
  @ApiModelProperty(value = "The currency to give as rewards")
  public List<RewardCurrencyResource> getCurrencyRewards() {
    return currencyRewards;
  }

  public void setCurrencyRewards(List<RewardCurrencyResource> currencyRewards) {
    this.currencyRewards = currencyRewards;
  }

   /**
   * The assigned unique ID for this reward set
   * @return id
  **/
  @ApiModelProperty(value = "The assigned unique ID for this reward set")
  public Integer getId() {
    return id;
  }

  public RewardSetResource itemRewards(List<RewardItemResource> itemRewards) {
    this.itemRewards = itemRewards;
    return this;
  }

  public RewardSetResource addItemRewardsItem(RewardItemResource itemRewardsItem) {
    if (this.itemRewards == null) {
      this.itemRewards = new ArrayList<RewardItemResource>();
    }
    this.itemRewards.add(itemRewardsItem);
    return this;
  }

   /**
   * The items to give as rewards
   * @return itemRewards
  **/
  @ApiModelProperty(value = "The items to give as rewards")
  public List<RewardItemResource> getItemRewards() {
    return itemRewards;
  }

  public void setItemRewards(List<RewardItemResource> itemRewards) {
    this.itemRewards = itemRewards;
  }

  public RewardSetResource longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A longer describe the reward set, usually included in details
   * @return longDescription
  **/
  @ApiModelProperty(value = "A longer describe the reward set, usually included in details")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

   /**
   * The maximum placing that will receive a reward
   * @return maxPlacing
  **/
  @ApiModelProperty(value = "The maximum placing that will receive a reward")
  public Integer getMaxPlacing() {
    return maxPlacing;
  }

  public RewardSetResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user friendly name for this reward set
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The user friendly name for this reward set")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RewardSetResource shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A short paragraph to describe the reward set, usually included in listings.  Max 255 characters
   * @return shortDescription
  **/
  @ApiModelProperty(value = "A short paragraph to describe the reward set, usually included in listings.  Max 255 characters")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public RewardSetResource uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * A provided unique key for this reward set
   * @return uniqueKey
  **/
  @ApiModelProperty(value = "A provided unique key for this reward set")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardSetResource rewardSetResource = (RewardSetResource) o;
    return Objects.equals(this.createdDate, rewardSetResource.createdDate) &&
        Objects.equals(this.currencyRewards, rewardSetResource.currencyRewards) &&
        Objects.equals(this.id, rewardSetResource.id) &&
        Objects.equals(this.itemRewards, rewardSetResource.itemRewards) &&
        Objects.equals(this.longDescription, rewardSetResource.longDescription) &&
        Objects.equals(this.maxPlacing, rewardSetResource.maxPlacing) &&
        Objects.equals(this.name, rewardSetResource.name) &&
        Objects.equals(this.shortDescription, rewardSetResource.shortDescription) &&
        Objects.equals(this.uniqueKey, rewardSetResource.uniqueKey) &&
        Objects.equals(this.updatedDate, rewardSetResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, currencyRewards, id, itemRewards, longDescription, maxPlacing, name, shortDescription, uniqueKey, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardSetResource {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    currencyRewards: ").append(toIndentedString(currencyRewards)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemRewards: ").append(toIndentedString(itemRewards)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    maxPlacing: ").append(toIndentedString(maxPlacing)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

