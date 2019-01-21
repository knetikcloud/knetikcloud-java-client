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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MonitoringIncidentEventResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T16:41:04.857-05:00")
public class MonitoringIncidentEventResource {
  @JsonProperty("alert_id")
  private String alertId = null;

  @JsonProperty("date")
  private Long date = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("incident_id")
  private String incidentId = null;

  @JsonProperty("level_name")
  private String levelName = null;

  /**
   * The new status of the alert level
   */
  public enum StatusEnum {
    OK("OK"),
    
    ALARM("ALARM"),
    
    INSUFFICIENT_DATA("INSUFFICIENT_DATA");

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

  @JsonProperty("trigger_value")
  private String triggerValue = null;

  public MonitoringIncidentEventResource alertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

   /**
   * The id of the alert
   * @return alertId
  **/
  @ApiModelProperty(required = true, value = "The id of the alert")
  public String getAlertId() {
    return alertId;
  }

  public void setAlertId(String alertId) {
    this.alertId = alertId;
  }

  public MonitoringIncidentEventResource date(Long date) {
    this.date = date;
    return this;
  }

   /**
   * The date as a unix timestamp in seconds for the event
   * @return date
  **/
  @ApiModelProperty(value = "The date as a unix timestamp in seconds for the event")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public MonitoringIncidentEventResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the incident event
   * @return id
  **/
  @ApiModelProperty(value = "The id of the incident event")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The id of the incident. will be added to any current incident for the alert or a new one created
   * @return incidentId
  **/
  @ApiModelProperty(value = "The id of the incident. will be added to any current incident for the alert or a new one created")
  public String getIncidentId() {
    return incidentId;
  }

  public MonitoringIncidentEventResource levelName(String levelName) {
    this.levelName = levelName;
    return this;
  }

   /**
   * The name of the alert level
   * @return levelName
  **/
  @ApiModelProperty(required = true, value = "The name of the alert level")
  public String getLevelName() {
    return levelName;
  }

  public void setLevelName(String levelName) {
    this.levelName = levelName;
  }

  public MonitoringIncidentEventResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The new status of the alert level
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The new status of the alert level")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MonitoringIncidentEventResource triggerValue(String triggerValue) {
    this.triggerValue = triggerValue;
    return this;
  }

   /**
   * The value that triggered the alarm
   * @return triggerValue
  **/
  @ApiModelProperty(value = "The value that triggered the alarm")
  public String getTriggerValue() {
    return triggerValue;
  }

  public void setTriggerValue(String triggerValue) {
    this.triggerValue = triggerValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringIncidentEventResource monitoringIncidentEventResource = (MonitoringIncidentEventResource) o;
    return Objects.equals(this.alertId, monitoringIncidentEventResource.alertId) &&
        Objects.equals(this.date, monitoringIncidentEventResource.date) &&
        Objects.equals(this.id, monitoringIncidentEventResource.id) &&
        Objects.equals(this.incidentId, monitoringIncidentEventResource.incidentId) &&
        Objects.equals(this.levelName, monitoringIncidentEventResource.levelName) &&
        Objects.equals(this.status, monitoringIncidentEventResource.status) &&
        Objects.equals(this.triggerValue, monitoringIncidentEventResource.triggerValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, date, id, incidentId, levelName, status, triggerValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringIncidentEventResource {\n");
    
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    levelName: ").append(toIndentedString(levelName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggerValue: ").append(toIndentedString(triggerValue)).append("\n");
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

