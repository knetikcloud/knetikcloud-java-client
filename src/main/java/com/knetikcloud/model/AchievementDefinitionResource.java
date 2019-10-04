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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AchievementDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-04T11:36:20.337-04:00")
public class AchievementDefinitionResource {
  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("hidden")
  private Boolean hidden = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("required_progress")
  private Integer requiredProgress = null;

  @JsonProperty("rule_id")
  private String ruleId = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("trigger_event_name")
  private String triggerEventName = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  public AchievementDefinitionResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public AchievementDefinitionResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this resource type
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this resource type")
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

  public AchievementDefinitionResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the achievement
   * @return description
  **/
  @ApiModelProperty(value = "The description of the achievement")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AchievementDefinitionResource hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Whether the achievement is hidden from the user
   * @return hidden
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the achievement is hidden from the user")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public AchievementDefinitionResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the achievement. Must be at least 6 characters in length. IMMUTABLE
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the achievement. Must be at least 6 characters in length. IMMUTABLE")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AchievementDefinitionResource requiredProgress(Integer requiredProgress) {
    this.requiredProgress = requiredProgress;
    return this;
  }

   /**
   * The required progress for the achievement definition
   * @return requiredProgress
  **/
  @ApiModelProperty(required = true, value = "The required progress for the achievement definition")
  public Integer getRequiredProgress() {
    return requiredProgress;
  }

  public void setRequiredProgress(Integer requiredProgress) {
    this.requiredProgress = requiredProgress;
  }

   /**
   * The id of the rule generated for this achievement
   * @return ruleId
  **/
  @ApiModelProperty(value = "The id of the rule generated for this achievement")
  public String getRuleId() {
    return ruleId;
  }

  public AchievementDefinitionResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AchievementDefinitionResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags for the achievement definition
   * @return tags
  **/
  @ApiModelProperty(value = "The tags for the achievement definition")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public AchievementDefinitionResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An achievement template this achievement is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "An achievement template this achievement is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public AchievementDefinitionResource triggerEventName(String triggerEventName) {
    this.triggerEventName = triggerEventName;
    return this;
  }

   /**
   * The name of the trigger event associated with this achievement
   * @return triggerEventName
  **/
  @ApiModelProperty(value = "The name of the trigger event associated with this achievement")
  public String getTriggerEventName() {
    return triggerEventName;
  }

  public void setTriggerEventName(String triggerEventName) {
    this.triggerEventName = triggerEventName;
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
    AchievementDefinitionResource achievementDefinitionResource = (AchievementDefinitionResource) o;
    return Objects.equals(this.additionalProperties, achievementDefinitionResource.additionalProperties) &&
        Objects.equals(this.createdDate, achievementDefinitionResource.createdDate) &&
        Objects.equals(this.description, achievementDefinitionResource.description) &&
        Objects.equals(this.hidden, achievementDefinitionResource.hidden) &&
        Objects.equals(this.name, achievementDefinitionResource.name) &&
        Objects.equals(this.requiredProgress, achievementDefinitionResource.requiredProgress) &&
        Objects.equals(this.ruleId, achievementDefinitionResource.ruleId) &&
        Objects.equals(this.tags, achievementDefinitionResource.tags) &&
        Objects.equals(this.template, achievementDefinitionResource.template) &&
        Objects.equals(this.triggerEventName, achievementDefinitionResource.triggerEventName) &&
        Objects.equals(this.updatedDate, achievementDefinitionResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, createdDate, description, hidden, name, requiredProgress, ruleId, tags, template, triggerEventName, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchievementDefinitionResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requiredProgress: ").append(toIndentedString(requiredProgress)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    triggerEventName: ").append(toIndentedString(triggerEventName)).append("\n");
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

