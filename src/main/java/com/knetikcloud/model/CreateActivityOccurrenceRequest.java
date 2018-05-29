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
import com.knetikcloud.model.CoreActivityOccurrenceSettings;
import com.knetikcloud.model.ItemIdRequest;
import com.knetikcloud.model.Participant;
import com.knetikcloud.model.SelectedSettingRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A occurrence of an activity (the actual game for example). Used to track scores, participants, and provide settings
 */
@ApiModel(description = "A occurrence of an activity (the actual game for example). Used to track scores, participants, and provide settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T13:50:55.134-04:00")
public class CreateActivityOccurrenceRequest {
  @JsonProperty("activity_id")
  private Long activityId = null;

  @JsonProperty("challenge_activity_id")
  private Long challengeActivityId = null;

  @JsonProperty("core_settings")
  private CoreActivityOccurrenceSettings coreSettings = null;

  @JsonProperty("entitlement")
  private ItemIdRequest entitlement = null;

  @JsonProperty("event_id")
  private Long eventId = null;

  @JsonProperty("host")
  private Integer host = null;

  @JsonProperty("settings")
  private List<SelectedSettingRequest> settings = null;

  @JsonProperty("simulated")
  private Boolean simulated = null;

  /**
   * The current status of the occurrence (default: SETUP).
   */
  public enum StatusEnum {
    SETUP("SETUP"),
    
    OPEN("OPEN"),
    
    LAUNCHING("LAUNCHING"),
    
    PLAYING("PLAYING"),
    
    FINISHED("FINISHED"),
    
    ABANDONED("ABANDONED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("users")
  private List<Participant> users = null;

  public CreateActivityOccurrenceRequest activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The id of the activity, only needed when outside of challenge/event
   * @return activityId
  **/
  @ApiModelProperty(value = "The id of the activity, only needed when outside of challenge/event")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public CreateActivityOccurrenceRequest challengeActivityId(Long challengeActivityId) {
    this.challengeActivityId = challengeActivityId;
    return this;
  }

   /**
   * The id of the challenge activity (required if playing in a challenge/event). Note that this is the challenge_activity_id in case the same activity apears twice in the challenge.
   * @return challengeActivityId
  **/
  @ApiModelProperty(value = "The id of the challenge activity (required if playing in a challenge/event). Note that this is the challenge_activity_id in case the same activity apears twice in the challenge.")
  public Long getChallengeActivityId() {
    return challengeActivityId;
  }

  public void setChallengeActivityId(Long challengeActivityId) {
    this.challengeActivityId = challengeActivityId;
  }

  public CreateActivityOccurrenceRequest coreSettings(CoreActivityOccurrenceSettings coreSettings) {
    this.coreSettings = coreSettings;
    return this;
  }

   /**
   * Defines core settings about the activity that affect how it can be created/played by users.
   * @return coreSettings
  **/
  @ApiModelProperty(value = "Defines core settings about the activity that affect how it can be created/played by users.")
  public CoreActivityOccurrenceSettings getCoreSettings() {
    return coreSettings;
  }

  public void setCoreSettings(CoreActivityOccurrenceSettings coreSettings) {
    this.coreSettings = coreSettings;
  }

  public CreateActivityOccurrenceRequest entitlement(ItemIdRequest entitlement) {
    this.entitlement = entitlement;
    return this;
  }

   /**
   * The entitlement item required to enter the occurrence. Required if not part of an event. Must come from the set of entitlement items listed in the activity
   * @return entitlement
  **/
  @ApiModelProperty(value = "The entitlement item required to enter the occurrence. Required if not part of an event. Must come from the set of entitlement items listed in the activity")
  public ItemIdRequest getEntitlement() {
    return entitlement;
  }

  public void setEntitlement(ItemIdRequest entitlement) {
    this.entitlement = entitlement;
  }

  public CreateActivityOccurrenceRequest eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The id of the event this occurence is a part of, if any
   * @return eventId
  **/
  @ApiModelProperty(value = "The id of the event this occurence is a part of, if any")
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }

  public CreateActivityOccurrenceRequest host(Integer host) {
    this.host = host;
    return this;
  }

   /**
   * The host of the occurrence, if not a participant (will be left out of users array). Must be the caller that creates the occurrence unless admin. Requires activity/challenge to allow host_option of &#39;non_player&#39; if not admin as well
   * @return host
  **/
  @ApiModelProperty(value = "The host of the occurrence, if not a participant (will be left out of users array). Must be the caller that creates the occurrence unless admin. Requires activity/challenge to allow host_option of 'non_player' if not admin as well")
  public Integer getHost() {
    return host;
  }

  public void setHost(Integer host) {
    this.host = host;
  }

  public CreateActivityOccurrenceRequest settings(List<SelectedSettingRequest> settings) {
    this.settings = settings;
    return this;
  }

  public CreateActivityOccurrenceRequest addSettingsItem(SelectedSettingRequest settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<SelectedSettingRequest>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * The values selected from the available settings defined for the activity. Ex: difficulty: hard. Can be left out if the activity is played during an event and the settings are already set at the event level. Ex: every monday, difficulty: hard, number of questions: 10, category: sport. Otherwise, the set must exactly match those of the activity.
   * @return settings
  **/
  @ApiModelProperty(value = "The values selected from the available settings defined for the activity. Ex: difficulty: hard. Can be left out if the activity is played during an event and the settings are already set at the event level. Ex: every monday, difficulty: hard, number of questions: 10, category: sport. Otherwise, the set must exactly match those of the activity.")
  public List<SelectedSettingRequest> getSettings() {
    return settings;
  }

  public void setSettings(List<SelectedSettingRequest> settings) {
    this.settings = settings;
  }

  public CreateActivityOccurrenceRequest simulated(Boolean simulated) {
    this.simulated = simulated;
    return this;
  }

   /**
   * Whether this occurrence will be ran as a simulation. Simulations will not be rewarded. Useful for bot play or trials
   * @return simulated
  **/
  @ApiModelProperty(example = "false", value = "Whether this occurrence will be ran as a simulation. Simulations will not be rewarded. Useful for bot play or trials")
  public Boolean isSimulated() {
    return simulated;
  }

  public void setSimulated(Boolean simulated) {
    this.simulated = simulated;
  }

  public CreateActivityOccurrenceRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the occurrence (default: SETUP).
   * @return status
  **/
  @ApiModelProperty(value = "The current status of the occurrence (default: SETUP).")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CreateActivityOccurrenceRequest users(List<Participant> users) {
    this.users = users;
    return this;
  }

  public CreateActivityOccurrenceRequest addUsersItem(Participant usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<Participant>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * The list of users participating in this occurrence. Can only be set directly with ACTIVITIES_ADMIN permission
   * @return users
  **/
  @ApiModelProperty(value = "The list of users participating in this occurrence. Can only be set directly with ACTIVITIES_ADMIN permission")
  public List<Participant> getUsers() {
    return users;
  }

  public void setUsers(List<Participant> users) {
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
    CreateActivityOccurrenceRequest createActivityOccurrenceRequest = (CreateActivityOccurrenceRequest) o;
    return Objects.equals(this.activityId, createActivityOccurrenceRequest.activityId) &&
        Objects.equals(this.challengeActivityId, createActivityOccurrenceRequest.challengeActivityId) &&
        Objects.equals(this.coreSettings, createActivityOccurrenceRequest.coreSettings) &&
        Objects.equals(this.entitlement, createActivityOccurrenceRequest.entitlement) &&
        Objects.equals(this.eventId, createActivityOccurrenceRequest.eventId) &&
        Objects.equals(this.host, createActivityOccurrenceRequest.host) &&
        Objects.equals(this.settings, createActivityOccurrenceRequest.settings) &&
        Objects.equals(this.simulated, createActivityOccurrenceRequest.simulated) &&
        Objects.equals(this.status, createActivityOccurrenceRequest.status) &&
        Objects.equals(this.users, createActivityOccurrenceRequest.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, challengeActivityId, coreSettings, entitlement, eventId, host, settings, simulated, status, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateActivityOccurrenceRequest {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    challengeActivityId: ").append(toIndentedString(challengeActivityId)).append("\n");
    sb.append("    coreSettings: ").append(toIndentedString(coreSettings)).append("\n");
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    simulated: ").append(toIndentedString(simulated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

