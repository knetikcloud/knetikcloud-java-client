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
import com.knetikcloud.model.ActivityEntitlementResource;
import com.knetikcloud.model.CoreChallengeActivitySettings;
import com.knetikcloud.model.Property;
import com.knetikcloud.model.RewardSetResource;
import com.knetikcloud.model.SelectedSettingResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ChallengeActivityResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:12:34.695-05:00")
public class ChallengeActivityResource {
  @JsonProperty("activity_id")
  private Long activityId = null;

  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("challenge_id")
  private Long challengeId = null;

  @JsonProperty("core_settings")
  private CoreChallengeActivitySettings coreSettings = null;

  @JsonProperty("entitlement")
  private ActivityEntitlementResource entitlement = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("reward_set")
  private RewardSetResource rewardSet = null;

  @JsonProperty("settings")
  private List<SelectedSettingResource> settings = null;

  @JsonProperty("template")
  private String template = null;

  public ChallengeActivityResource activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The id of the activity
   * @return activityId
  **/
  @ApiModelProperty(required = true, value = "The id of the activity")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public ChallengeActivityResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public ChallengeActivityResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
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

  public ChallengeActivityResource challengeId(Long challengeId) {
    this.challengeId = challengeId;
    return this;
  }

   /**
   * The id of the challenge
   * @return challengeId
  **/
  @ApiModelProperty(value = "The id of the challenge")
  public Long getChallengeId() {
    return challengeId;
  }

  public void setChallengeId(Long challengeId) {
    this.challengeId = challengeId;
  }

  public ChallengeActivityResource coreSettings(CoreChallengeActivitySettings coreSettings) {
    this.coreSettings = coreSettings;
    return this;
  }

   /**
   * Defines core settings about the activity that affect how it can be created/played by users. Values may be left null to inherit from parent activity.
   * @return coreSettings
  **/
  @ApiModelProperty(value = "Defines core settings about the activity that affect how it can be created/played by users. Values may be left null to inherit from parent activity.")
  public CoreChallengeActivitySettings getCoreSettings() {
    return coreSettings;
  }

  public void setCoreSettings(CoreChallengeActivitySettings coreSettings) {
    this.coreSettings = coreSettings;
  }

  public ChallengeActivityResource entitlement(ActivityEntitlementResource entitlement) {
    this.entitlement = entitlement;
    return this;
  }

   /**
   * The entitlement item needed to participate in the activity as part of this event. Null indicates free entry. When creating/updating only id is used. Item must be pre-existing
   * @return entitlement
  **/
  @ApiModelProperty(value = "The entitlement item needed to participate in the activity as part of this event. Null indicates free entry. When creating/updating only id is used. Item must be pre-existing")
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
  @ApiModelProperty(value = "The unique ID for this resource")
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
  @ApiModelProperty(value = "The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing")
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
    if (this.settings == null) {
      this.settings = new ArrayList<SelectedSettingResource>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * The list of settings and the select options
   * @return settings
  **/
  @ApiModelProperty(value = "The list of settings and the select options")
  public List<SelectedSettingResource> getSettings() {
    return settings;
  }

  public void setSettings(List<SelectedSettingResource> settings) {
    this.settings = settings;
  }

  public ChallengeActivityResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A challenge activity template this challenge activity is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "A challenge activity template this challenge activity is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
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
        Objects.equals(this.additionalProperties, challengeActivityResource.additionalProperties) &&
        Objects.equals(this.challengeId, challengeActivityResource.challengeId) &&
        Objects.equals(this.coreSettings, challengeActivityResource.coreSettings) &&
        Objects.equals(this.entitlement, challengeActivityResource.entitlement) &&
        Objects.equals(this.id, challengeActivityResource.id) &&
        Objects.equals(this.rewardSet, challengeActivityResource.rewardSet) &&
        Objects.equals(this.settings, challengeActivityResource.settings) &&
        Objects.equals(this.template, challengeActivityResource.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, additionalProperties, challengeId, coreSettings, entitlement, id, rewardSet, settings, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeActivityResource {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    coreSettings: ").append(toIndentedString(coreSettings)).append("\n");
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rewardSet: ").append(toIndentedString(rewardSet)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

