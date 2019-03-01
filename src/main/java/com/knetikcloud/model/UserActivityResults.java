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
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * UserActivityResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-01T09:23:20.387-05:00")
public class UserActivityResults {
  @JsonProperty("currency_rewards")
  private List<RewardCurrencyResource> currencyRewards = null;

  @JsonProperty("item_rewards")
  private List<RewardItemResource> itemRewards = null;

  @JsonProperty("rank")
  private Long rank = null;

  @JsonProperty("score")
  private Long score = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("ties")
  private Integer ties = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  @JsonProperty("user")
  private SimpleUserResource user = null;

  public UserActivityResults currencyRewards(List<RewardCurrencyResource> currencyRewards) {
    this.currencyRewards = currencyRewards;
    return this;
  }

  public UserActivityResults addCurrencyRewardsItem(RewardCurrencyResource currencyRewardsItem) {
    if (this.currencyRewards == null) {
      this.currencyRewards = new ArrayList<RewardCurrencyResource>();
    }
    this.currencyRewards.add(currencyRewardsItem);
    return this;
  }

   /**
   * Any currency rewarded to this user
   * @return currencyRewards
  **/
  @ApiModelProperty(value = "Any currency rewarded to this user")
  public List<RewardCurrencyResource> getCurrencyRewards() {
    return currencyRewards;
  }

  public void setCurrencyRewards(List<RewardCurrencyResource> currencyRewards) {
    this.currencyRewards = currencyRewards;
  }

  public UserActivityResults itemRewards(List<RewardItemResource> itemRewards) {
    this.itemRewards = itemRewards;
    return this;
  }

  public UserActivityResults addItemRewardsItem(RewardItemResource itemRewardsItem) {
    if (this.itemRewards == null) {
      this.itemRewards = new ArrayList<RewardItemResource>();
    }
    this.itemRewards.add(itemRewardsItem);
    return this;
  }

   /**
   * Any items rewarded to this user
   * @return itemRewards
  **/
  @ApiModelProperty(value = "Any items rewarded to this user")
  public List<RewardItemResource> getItemRewards() {
    return itemRewards;
  }

  public void setItemRewards(List<RewardItemResource> itemRewards) {
    this.itemRewards = itemRewards;
  }

  public UserActivityResults rank(Long rank) {
    this.rank = rank;
    return this;
  }

   /**
   * The position of the user in the leaderboard. Null means non-compete or disqualification
   * @return rank
  **/
  @ApiModelProperty(value = "The position of the user in the leaderboard. Null means non-compete or disqualification")
  public Long getRank() {
    return rank;
  }

  public void setRank(Long rank) {
    this.rank = rank;
  }

  public UserActivityResults score(Long score) {
    this.score = score;
    return this;
  }

   /**
   * The raw score in this leaderboard. Null means non-compete or disqualification
   * @return score
  **/
  @ApiModelProperty(value = "The raw score in this leaderboard. Null means non-compete or disqualification")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public UserActivityResults tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UserActivityResults addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 10 tags and 50 characters each
   * @return tags
  **/
  @ApiModelProperty(value = "Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 10 tags and 50 characters each")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

   /**
   * The number of users tied at this rank, including this user. 1 means no tie
   * @return ties
  **/
  @ApiModelProperty(value = "The number of users tied at this rank, including this user. 1 means no tie")
  public Integer getTies() {
    return ties;
  }

  public UserActivityResults updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * The date this score was recorded or updated. Unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date this score was recorded or updated. Unix timestamp in seconds")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public UserActivityResults user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The player for this entry
   * @return user
  **/
  @ApiModelProperty(required = true, value = "The player for this entry")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivityResults userActivityResults = (UserActivityResults) o;
    return Objects.equals(this.currencyRewards, userActivityResults.currencyRewards) &&
        Objects.equals(this.itemRewards, userActivityResults.itemRewards) &&
        Objects.equals(this.rank, userActivityResults.rank) &&
        Objects.equals(this.score, userActivityResults.score) &&
        Objects.equals(this.tags, userActivityResults.tags) &&
        Objects.equals(this.ties, userActivityResults.ties) &&
        Objects.equals(this.updatedDate, userActivityResults.updatedDate) &&
        Objects.equals(this.user, userActivityResults.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyRewards, itemRewards, rank, score, tags, ties, updatedDate, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityResults {\n");
    
    sb.append("    currencyRewards: ").append(toIndentedString(currencyRewards)).append("\n");
    sb.append("    itemRewards: ").append(toIndentedString(itemRewards)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    ties: ").append(toIndentedString(ties)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

