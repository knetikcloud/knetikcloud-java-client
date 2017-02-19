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
import io.swagger.client.model.ActivityEntitlementResource;
import io.swagger.client.model.ActivityUserResource;
import io.swagger.client.model.SelectedSettingResource;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivityOccurrenceResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-19T02:24:50.691-05:00")
public class ActivityOccurrenceResource {
  @SerializedName("activity_id")
  private Long activityId = null;

  @SerializedName("challenge_activity_id")
  private Long challengeActivityId = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("entitlement")
  private ActivityEntitlementResource entitlement = null;

  @SerializedName("event_id")
  private Long eventId = null;

  @SerializedName("id")
  private Long id = null;

  /**
   * Indicate if the rewards have been given out already
   */
  public enum RewardStatusEnum {
    @SerializedName("pending")
    PENDING("pending"),
    
    @SerializedName("failed")
    FAILED("failed"),
    
    @SerializedName("complete")
    COMPLETE("complete"),
    
    @SerializedName("partial")
    PARTIAL("partial");

    private String value;

    RewardStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("reward_status")
  private RewardStatusEnum rewardStatus = null;

  @SerializedName("settings")
  private List<SelectedSettingResource> settings = new ArrayList<SelectedSettingResource>();

  @SerializedName("simulated")
  private Boolean simulated = null;

  @SerializedName("start_date")
  private Long startDate = null;

  /**
   * The current status of the occurrence (default: OPEN)
   */
  public enum StatusEnum {
    @SerializedName("SETUP")
    SETUP("SETUP"),
    
    @SerializedName("OPEN")
    OPEN("OPEN"),
    
    @SerializedName("PLAYING")
    PLAYING("PLAYING"),
    
    @SerializedName("FINISHED")
    FINISHED("FINISHED"),
    
    @SerializedName("ABANDONED")
    ABANDONED("ABANDONED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("users")
  private List<ActivityUserResource> users = new ArrayList<ActivityUserResource>();

  public ActivityOccurrenceResource activityId(Long activityId) {
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

  public ActivityOccurrenceResource challengeActivityId(Long challengeActivityId) {
    this.challengeActivityId = challengeActivityId;
    return this;
  }

   /**
   * The id of the challenge activity (as part of the event, required if eventId set)
   * @return challengeActivityId
  **/
  @ApiModelProperty(example = "null", value = "The id of the challenge activity (as part of the event, required if eventId set)")
  public Long getChallengeActivityId() {
    return challengeActivityId;
  }

  public void setChallengeActivityId(Long challengeActivityId) {
    this.challengeActivityId = challengeActivityId;
  }

   /**
   * The date this occurrence was created, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date this occurrence was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public ActivityOccurrenceResource entitlement(ActivityEntitlementResource entitlement) {
    this.entitlement = entitlement;
    return this;
  }

   /**
   * The entitlement item required to enter the occurrence. Required if not part of an event. Must come from the set of entitlement items listed in the activity
   * @return entitlement
  **/
  @ApiModelProperty(example = "null", value = "The entitlement item required to enter the occurrence. Required if not part of an event. Must come from the set of entitlement items listed in the activity")
  public ActivityEntitlementResource getEntitlement() {
    return entitlement;
  }

  public void setEntitlement(ActivityEntitlementResource entitlement) {
    this.entitlement = entitlement;
  }

  public ActivityOccurrenceResource eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The id of the event
   * @return eventId
  **/
  @ApiModelProperty(example = "null", value = "The id of the event")
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }

   /**
   * The id of the activity occurrence
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the activity occurrence")
  public Long getId() {
    return id;
  }

   /**
   * Indicate if the rewards have been given out already
   * @return rewardStatus
  **/
  @ApiModelProperty(example = "null", value = "Indicate if the rewards have been given out already")
  public RewardStatusEnum getRewardStatus() {
    return rewardStatus;
  }

  public ActivityOccurrenceResource settings(List<SelectedSettingResource> settings) {
    this.settings = settings;
    return this;
  }

  public ActivityOccurrenceResource addSettingsItem(SelectedSettingResource settingsItem) {
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * The list of settings and their options available for this activity. Should be null on create if and only if part of an event
   * @return settings
  **/
  @ApiModelProperty(example = "null", value = "The list of settings and their options available for this activity. Should be null on create if and only if part of an event")
  public List<SelectedSettingResource> getSettings() {
    return settings;
  }

  public void setSettings(List<SelectedSettingResource> settings) {
    this.settings = settings;
  }

  public ActivityOccurrenceResource simulated(Boolean simulated) {
    this.simulated = simulated;
    return this;
  }

   /**
   * Whether this occurrence will be played as a simulation.
   * @return simulated
  **/
  @ApiModelProperty(example = "false", value = "Whether this occurrence will be played as a simulation.")
  public Boolean getSimulated() {
    return simulated;
  }

  public void setSimulated(Boolean simulated) {
    this.simulated = simulated;
  }

   /**
   * The date this occurrence was started, unix timestamp in seconds. null if not yet started
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "The date this occurrence was started, unix timestamp in seconds. null if not yet started")
  public Long getStartDate() {
    return startDate;
  }

  public ActivityOccurrenceResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the occurrence (default: OPEN)
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The current status of the occurrence (default: OPEN)")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * The date this occurrence was last updated, unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date this occurrence was last updated, unix timestamp in seconds")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public ActivityOccurrenceResource users(List<ActivityUserResource> users) {
    this.users = users;
    return this;
  }

  public ActivityOccurrenceResource addUsersItem(ActivityUserResource usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * The list of users playing in this occurrence. Can only be set directly with ACTIVITIES_ADMIN permission
   * @return users
  **/
  @ApiModelProperty(example = "null", value = "The list of users playing in this occurrence. Can only be set directly with ACTIVITIES_ADMIN permission")
  public List<ActivityUserResource> getUsers() {
    return users;
  }

  public void setUsers(List<ActivityUserResource> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityOccurrenceResource activityOccurrenceResource = (ActivityOccurrenceResource) o;
    return Objects.equals(this.activityId, activityOccurrenceResource.activityId) &&
        Objects.equals(this.challengeActivityId, activityOccurrenceResource.challengeActivityId) &&
        Objects.equals(this.createdDate, activityOccurrenceResource.createdDate) &&
        Objects.equals(this.entitlement, activityOccurrenceResource.entitlement) &&
        Objects.equals(this.eventId, activityOccurrenceResource.eventId) &&
        Objects.equals(this.id, activityOccurrenceResource.id) &&
        Objects.equals(this.rewardStatus, activityOccurrenceResource.rewardStatus) &&
        Objects.equals(this.settings, activityOccurrenceResource.settings) &&
        Objects.equals(this.simulated, activityOccurrenceResource.simulated) &&
        Objects.equals(this.startDate, activityOccurrenceResource.startDate) &&
        Objects.equals(this.status, activityOccurrenceResource.status) &&
        Objects.equals(this.updatedDate, activityOccurrenceResource.updatedDate) &&
        Objects.equals(this.users, activityOccurrenceResource.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, challengeActivityId, createdDate, entitlement, eventId, id, rewardStatus, settings, simulated, startDate, status, updatedDate, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOccurrenceResource {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    challengeActivityId: ").append(toIndentedString(challengeActivityId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rewardStatus: ").append(toIndentedString(rewardStatus)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    simulated: ").append(toIndentedString(simulated)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
