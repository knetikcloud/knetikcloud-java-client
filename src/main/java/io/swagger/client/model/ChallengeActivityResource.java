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
import io.swagger.client.model.ActivityEntitlementResource;
import io.swagger.client.model.RewardSetResource;
import io.swagger.client.model.SelectedSettingResource;
import java.util.ArrayList;
import java.util.List;

/**
 * ChallengeActivityResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T18:05:42.900-05:00")
public class ChallengeActivityResource {
  @SerializedName("activity_id")
  private Long activityId = null;

  @SerializedName("challenge_id")
  private Long challengeId = null;

  @SerializedName("entitlement")
  private ActivityEntitlementResource entitlement = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("reward_set")
  private RewardSetResource rewardSet = null;

  @SerializedName("settings")
  private List<SelectedSettingResource> settings = new ArrayList<SelectedSettingResource>();

  public ChallengeActivityResource activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The id of the activity
   * @return activityId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the activity")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public ChallengeActivityResource challengeId(Long challengeId) {
    this.challengeId = challengeId;
    return this;
  }

   /**
   * The id of the challenge
   * @return challengeId
  **/
  @ApiModelProperty(example = "null", value = "The id of the challenge")
  public Long getChallengeId() {
    return challengeId;
  }

  public void setChallengeId(Long challengeId) {
    this.challengeId = challengeId;
  }

  public ChallengeActivityResource entitlement(ActivityEntitlementResource entitlement) {
    this.entitlement = entitlement;
    return this;
  }

   /**
   * The entitlement item needed to participate in the activity as part of this event. Null indicates free entry. When creating/updating only id is used. Item must be pre-existing
   * @return entitlement
  **/
  @ApiModelProperty(example = "null", value = "The entitlement item needed to participate in the activity as part of this event. Null indicates free entry. When creating/updating only id is used. Item must be pre-existing")
  public ActivityEntitlementResource getEntitlement() {
    return entitlement;
  }

  public void setEntitlement(ActivityEntitlementResource entitlement) {
    this.entitlement = entitlement;
  }

   /**
   * The unique ID for this resource
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for this resource")
  public Long getId() {
    return id;
  }

  public ChallengeActivityResource rewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
    return this;
  }

   /**
   * The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing
   * @return rewardSet
  **/
  @ApiModelProperty(example = "null", value = "The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing")
  public RewardSetResource getRewardSet() {
    return rewardSet;
  }

  public void setRewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
  }

  public ChallengeActivityResource settings(List<SelectedSettingResource> settings) {
    this.settings = settings;
    return this;
  }

  public ChallengeActivityResource addSettingsItem(SelectedSettingResource settingsItem) {
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * The list of settings and the select options
   * @return settings
  **/
  @ApiModelProperty(example = "null", value = "The list of settings and the select options")
  public List<SelectedSettingResource> getSettings() {
    return settings;
  }

  public void setSettings(List<SelectedSettingResource> settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeActivityResource challengeActivityResource = (ChallengeActivityResource) o;
    return Objects.equals(this.activityId, challengeActivityResource.activityId) &&
        Objects.equals(this.challengeId, challengeActivityResource.challengeId) &&
        Objects.equals(this.entitlement, challengeActivityResource.entitlement) &&
        Objects.equals(this.id, challengeActivityResource.id) &&
        Objects.equals(this.rewardSet, challengeActivityResource.rewardSet) &&
        Objects.equals(this.settings, challengeActivityResource.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, challengeId, entitlement, id, rewardSet, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeActivityResource {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rewardSet: ").append(toIndentedString(rewardSet)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

