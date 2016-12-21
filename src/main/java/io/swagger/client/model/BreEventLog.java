/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
import io.swagger.client.model.BreRuleLog;
import java.util.ArrayList;
import java.util.List;

/**
 * BreEventLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:18:14.481-05:00")
public class BreEventLog {
  @SerializedName("customer")
  private String customer = null;

  @SerializedName("event_id")
  private Long eventId = null;

  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("event_start_date")
  private Long eventStartDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("parameters")
  private Object parameters = null;

  @SerializedName("rules")
  private List<BreRuleLog> rules = new ArrayList<BreRuleLog>();

   /**
   * The customer of the BRE event log
   * @return customer
  **/
  @ApiModelProperty(example = "null", value = "The customer of the BRE event log")
  public String getCustomer() {
    return customer;
  }

   /**
   * The event id of the BRE event log
   * @return eventId
  **/
  @ApiModelProperty(example = "null", value = "The event id of the BRE event log")
  public Long getEventId() {
    return eventId;
  }

   /**
   * The event name of the BRE event log
   * @return eventName
  **/
  @ApiModelProperty(example = "null", value = "The event name of the BRE event log")
  public String getEventName() {
    return eventName;
  }

   /**
   * The event start date of the BRE event log
   * @return eventStartDate
  **/
  @ApiModelProperty(example = "null", value = "The event start date of the BRE event log")
  public Long getEventStartDate() {
    return eventStartDate;
  }

   /**
   * The id of the BRE event log
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the BRE event log")
  public String getId() {
    return id;
  }

  public BreEventLog parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * The event paramters of the BRE event log
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "The event paramters of the BRE event log")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  public BreEventLog rules(List<BreRuleLog> rules) {
    this.rules = rules;
    return this;
  }

  public BreEventLog addRulesItem(BreRuleLog rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The rules of the BRE event log
   * @return rules
  **/
  @ApiModelProperty(example = "null", value = "The rules of the BRE event log")
  public List<BreRuleLog> getRules() {
    return rules;
  }

  public void setRules(List<BreRuleLog> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreEventLog breEventLog = (BreEventLog) o;
    return Objects.equals(this.customer, breEventLog.customer) &&
        Objects.equals(this.eventId, breEventLog.eventId) &&
        Objects.equals(this.eventName, breEventLog.eventName) &&
        Objects.equals(this.eventStartDate, breEventLog.eventStartDate) &&
        Objects.equals(this.id, breEventLog.id) &&
        Objects.equals(this.parameters, breEventLog.parameters) &&
        Objects.equals(this.rules, breEventLog.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, eventId, eventName, eventStartDate, id, parameters, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreEventLog {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventStartDate: ").append(toIndentedString(eventStartDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

