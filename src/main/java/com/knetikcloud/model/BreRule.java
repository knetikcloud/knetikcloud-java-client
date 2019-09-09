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
import com.knetikcloud.model.ActionContextobject;
import com.knetikcloud.model.PredicateResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * BreRule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-09T10:26:02.967-04:00")
public class BreRule {
  @JsonProperty("actions")
  private List<ActionContextobject> actions = new ArrayList<ActionContextobject>();

  @JsonProperty("condition")
  private PredicateResource condition = null;

  @JsonProperty("condition_text")
  private String conditionText = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("end_date")
  private Long endDate = null;

  @JsonProperty("evaluation_count")
  private Long evaluationCount = null;

  @JsonProperty("event_name")
  private String eventName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("run_count")
  private Long runCount = null;

  @JsonProperty("sort")
  private Integer sort = null;

  @JsonProperty("start_date")
  private Long startDate = null;

  @JsonProperty("system_rule")
  private Boolean systemRule = null;

  public BreRule actions(List<ActionContextobject> actions) {
    this.actions = actions;
    return this;
  }

  public BreRule addActionsItem(ActionContextobject actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * A list of actions to execute, and the mapping for their parameters, when the rule runs. Minimum 1
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "A list of actions to execute, and the mapping for their parameters, when the rule runs. Minimum 1")
  public List<ActionContextobject> getActions() {
    return actions;
  }

  public void setActions(List<ActionContextobject> actions) {
    this.actions = actions;
  }

  public BreRule condition(PredicateResource condition) {
    this.condition = condition;
    return this;
  }

   /**
   * A condition expression that must be met in a given event for the rule to run. Null to always run.
   * @return condition
  **/
  @ApiModelProperty(value = "A condition expression that must be met in a given event for the rule to run. Null to always run.")
  public PredicateResource getCondition() {
    return condition;
  }

  public void setCondition(PredicateResource condition) {
    this.condition = condition;
  }

   /**
   * The condition as a readable string. Filled in by the system from the condition
   * @return conditionText
  **/
  @ApiModelProperty(value = "The condition as a readable string. Filled in by the system from the condition")
  public String getConditionText() {
    return conditionText;
  }

  public BreRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The human readable description of the rule
   * @return description
  **/
  @ApiModelProperty(value = "The human readable description of the rule")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BreRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the rule is enabled to run (in conjunction with dates). Default true
   * @return enabled
  **/
  @ApiModelProperty(example = "false", value = "Whether the rule is enabled to run (in conjunction with dates). Default true")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public BreRule endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date the rule ceases to take effect, or null if never. Unix timestamp in seconds
   * @return endDate
  **/
  @ApiModelProperty(value = "The date the rule ceases to take effect, or null if never. Unix timestamp in seconds")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

   /**
   * How many times the rule has been evaluated (it&#39;s conditions checked, whether it then runs or not)
   * @return evaluationCount
  **/
  @ApiModelProperty(value = "How many times the rule has been evaluated (it's conditions checked, whether it then runs or not)")
  public Long getEvaluationCount() {
    return evaluationCount;
  }

  public BreRule eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The event name of the trigger this rule runs for. Affects which parameters are available
   * @return eventName
  **/
  @ApiModelProperty(required = true, value = "The event name of the trigger this rule runs for. Affects which parameters are available")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public BreRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the rule for later references. If left null a random guid will be generated. Must be unique. Cannot be changed
   * @return id
  **/
  @ApiModelProperty(value = "The id of the rule for later references. If left null a random guid will be generated. Must be unique. Cannot be changed")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BreRule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The human readable name of the rule
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The human readable name of the rule")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * How many times the rule has run
   * @return runCount
  **/
  @ApiModelProperty(value = "How many times the rule has run")
  public Long getRunCount() {
    return runCount;
  }

  public BreRule sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Used to sort rules to control the order they run in. Larger numbered sort values run first.  Default 500
   * @return sort
  **/
  @ApiModelProperty(value = "Used to sort rules to control the order they run in. Larger numbered sort values run first.  Default 500")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public BreRule startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date the rule begins to take effect, or null if always. Unix timestamp in seconds
   * @return startDate
  **/
  @ApiModelProperty(value = "The date the rule begins to take effect, or null if always. Unix timestamp in seconds")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

   /**
   * Whether the rule is a default part of the system. System rules cannot be edited or deleted, but may be disabled
   * @return systemRule
  **/
  @ApiModelProperty(example = "false", value = "Whether the rule is a default part of the system. System rules cannot be edited or deleted, but may be disabled")
  public Boolean isSystemRule() {
    return systemRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreRule breRule = (BreRule) o;
    return Objects.equals(this.actions, breRule.actions) &&
        Objects.equals(this.condition, breRule.condition) &&
        Objects.equals(this.conditionText, breRule.conditionText) &&
        Objects.equals(this.description, breRule.description) &&
        Objects.equals(this.enabled, breRule.enabled) &&
        Objects.equals(this.endDate, breRule.endDate) &&
        Objects.equals(this.evaluationCount, breRule.evaluationCount) &&
        Objects.equals(this.eventName, breRule.eventName) &&
        Objects.equals(this.id, breRule.id) &&
        Objects.equals(this.name, breRule.name) &&
        Objects.equals(this.runCount, breRule.runCount) &&
        Objects.equals(this.sort, breRule.sort) &&
        Objects.equals(this.startDate, breRule.startDate) &&
        Objects.equals(this.systemRule, breRule.systemRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, condition, conditionText, description, enabled, endDate, evaluationCount, eventName, id, name, runCount, sort, startDate, systemRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreRule {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    conditionText: ").append(toIndentedString(conditionText)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    evaluationCount: ").append(toIndentedString(evaluationCount)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runCount: ").append(toIndentedString(runCount)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    systemRule: ").append(toIndentedString(systemRule)).append("\n");
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

