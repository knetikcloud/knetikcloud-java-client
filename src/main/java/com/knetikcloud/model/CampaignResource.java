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
import com.knetikcloud.model.Property;
import com.knetikcloud.model.RewardSetResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CampaignResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T17:13:34.700-04:00")
public class CampaignResource {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("leaderboard_strategy")
  private String leaderboardStrategy = null;

  @JsonProperty("long_description")
  private String longDescription = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("next_challenge")
  private String nextChallenge = null;

  @JsonProperty("next_challenge_date")
  private Long nextChallengeDate = null;

  @JsonProperty("reward_set")
  private RewardSetResource rewardSet = null;

  /**
   * Indicate if the rewards have been given out already
   */
  public enum RewardStatusEnum {
    PENDING("pending"),
    
    FAILED("failed"),
    
    COMPLETE("complete"),
    
    PARTIAL("partial");

    private String value;

    RewardStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RewardStatusEnum fromValue(String text) {
      for (RewardStatusEnum b : RewardStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("reward_status")
  private RewardStatusEnum rewardStatus = null;

  @JsonProperty("short_description")
  private String shortDescription = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  public CampaignResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the campaign is active or not.  Defaults to false
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the campaign is active or not.  Defaults to false")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CampaignResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public CampaignResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public CampaignResource leaderboardStrategy(String leaderboardStrategy) {
    this.leaderboardStrategy = leaderboardStrategy;
    return this;
  }

   /**
   * The strategy for calculating the leaderboard. Defaults to highest score. Value MUST come from the list of available strategies from the Leaderboard Service
   * @return leaderboardStrategy
  **/
  @ApiModelProperty(value = "The strategy for calculating the leaderboard. Defaults to highest score. Value MUST come from the list of available strategies from the Leaderboard Service")
  public String getLeaderboardStrategy() {
    return leaderboardStrategy;
  }

  public void setLeaderboardStrategy(String leaderboardStrategy) {
    this.leaderboardStrategy = leaderboardStrategy;
  }

  public CampaignResource longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return longDescription
  **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public CampaignResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user friendly name of that resource
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * The name of the next challenge coming up
   * @return nextChallenge
  **/
  @ApiModelProperty(value = "The name of the next challenge coming up")
  public String getNextChallenge() {
    return nextChallenge;
  }

   /**
   * The date/time of the next challenge coming up
   * @return nextChallengeDate
  **/
  @ApiModelProperty(value = "The date/time of the next challenge coming up")
  public Long getNextChallengeDate() {
    return nextChallengeDate;
  }

  public CampaignResource rewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
    return this;
  }

   /**
   * The rewards to give at the end of the campaign. When creating/updating only id is used. Reward set must be pre-existing
   * @return rewardSet
  **/
  @ApiModelProperty(value = "The rewards to give at the end of the campaign. When creating/updating only id is used. Reward set must be pre-existing")
  public RewardSetResource getRewardSet() {
    return rewardSet;
  }

  public void setRewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
  }

   /**
   * Indicate if the rewards have been given out already
   * @return rewardStatus
  **/
  @ApiModelProperty(value = "Indicate if the rewards have been given out already")
  public RewardStatusEnum getRewardStatus() {
    return rewardStatus;
  }

  public CampaignResource shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return shortDescription
  **/
  @ApiModelProperty(value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public CampaignResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A campaign template this campaign is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "A campaign template this campaign is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
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
    CampaignResource campaignResource = (CampaignResource) o;
    return Objects.equals(this.active, campaignResource.active) &&
        Objects.equals(this.additionalProperties, campaignResource.additionalProperties) &&
        Objects.equals(this.createdDate, campaignResource.createdDate) &&
        Objects.equals(this.id, campaignResource.id) &&
        Objects.equals(this.leaderboardStrategy, campaignResource.leaderboardStrategy) &&
        Objects.equals(this.longDescription, campaignResource.longDescription) &&
        Objects.equals(this.name, campaignResource.name) &&
        Objects.equals(this.nextChallenge, campaignResource.nextChallenge) &&
        Objects.equals(this.nextChallengeDate, campaignResource.nextChallengeDate) &&
        Objects.equals(this.rewardSet, campaignResource.rewardSet) &&
        Objects.equals(this.rewardStatus, campaignResource.rewardStatus) &&
        Objects.equals(this.shortDescription, campaignResource.shortDescription) &&
        Objects.equals(this.template, campaignResource.template) &&
        Objects.equals(this.updatedDate, campaignResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalProperties, createdDate, id, leaderboardStrategy, longDescription, name, nextChallenge, nextChallengeDate, rewardSet, rewardStatus, shortDescription, template, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaderboardStrategy: ").append(toIndentedString(leaderboardStrategy)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextChallenge: ").append(toIndentedString(nextChallenge)).append("\n");
    sb.append("    nextChallengeDate: ").append(toIndentedString(nextChallengeDate)).append("\n");
    sb.append("    rewardSet: ").append(toIndentedString(rewardSet)).append("\n");
    sb.append("    rewardStatus: ").append(toIndentedString(rewardStatus)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

