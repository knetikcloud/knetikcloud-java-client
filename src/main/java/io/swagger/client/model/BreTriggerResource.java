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
import io.swagger.client.model.BreTriggerParameterDefinition;
import java.util.ArrayList;
import java.util.List;

/**
 * BreTriggerResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T19:56:53.315-05:00")
public class BreTriggerResource {
  /**
   * The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category 'custom'
   */
  public enum CategoryEnum {
    @SerializedName("achievement")
    ACHIEVEMENT("achievement"),
    
    @SerializedName("behavior")
    BEHAVIOR("behavior"),
    
    @SerializedName("comment")
    COMMENT("comment"),
    
    @SerializedName("disposition")
    DISPOSITION("disposition"),
    
    @SerializedName("device")
    DEVICE("device"),
    
    @SerializedName("entitlement")
    ENTITLEMENT("entitlement"),
    
    @SerializedName("friends")
    FRIENDS("friends"),
    
    @SerializedName("fulfillment")
    FULFILLMENT("fulfillment"),
    
    @SerializedName("gamification")
    GAMIFICATION("gamification"),
    
    @SerializedName("inventory")
    INVENTORY("inventory"),
    
    @SerializedName("invoice")
    INVOICE("invoice"),
    
    @SerializedName("media")
    MEDIA("media"),
    
    @SerializedName("scheduler")
    SCHEDULER("scheduler"),
    
    @SerializedName("store")
    STORE("store"),
    
    @SerializedName("subscription")
    SUBSCRIPTION("subscription"),
    
    @SerializedName("user")
    USER("user"),
    
    @SerializedName("wallet")
    WALLET("wallet"),
    
    @SerializedName("custom")
    CUSTOM("custom"),
    
    @SerializedName("challenge")
    CHALLENGE("challenge"),
    
    @SerializedName("activity")
    ACTIVITY("activity"),
    
    @SerializedName("campaign")
    CAMPAIGN("campaign"),
    
    @SerializedName("event")
    EVENT("event");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("parameters")
  private List<BreTriggerParameterDefinition> parameters = new ArrayList<BreTriggerParameterDefinition>();

  @SerializedName("system_trigger")
  private Boolean systemTrigger = null;

  @SerializedName("trigger_description")
  private String triggerDescription = null;

  @SerializedName("trigger_name")
  private String triggerName = null;

   /**
   * The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category 'custom'
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "The category this trigger belongs to. See endpoints for related asset information. All new triggers are in category 'custom'")
  public CategoryEnum getCategory() {
    return category;
  }

  public BreTriggerResource eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The unique name for the event. This serves as the unique identifier. Cannot be changed after creation
   * @return eventName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique name for the event. This serves as the unique identifier. Cannot be changed after creation")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public BreTriggerResource parameters(List<BreTriggerParameterDefinition> parameters) {
    this.parameters = parameters;
    return this;
  }

  public BreTriggerResource addParametersItem(BreTriggerParameterDefinition parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * A list af parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "A list af parameters that will be sent with the event when the trigger is fired. These must be included in the event and match the described types")
  public List<BreTriggerParameterDefinition> getParameters() {
    return parameters;
  }

  public void setParameters(List<BreTriggerParameterDefinition> parameters) {
    this.parameters = parameters;
  }

   /**
   * Where this trigger came from. System triggers cannot be removed or updated
   * @return systemTrigger
  **/
  @ApiModelProperty(example = "false", value = "Where this trigger came from. System triggers cannot be removed or updated")
  public Boolean getSystemTrigger() {
    return systemTrigger;
  }

  public BreTriggerResource triggerDescription(String triggerDescription) {
    this.triggerDescription = triggerDescription;
    return this;
  }

   /**
   * A description of the trigger
   * @return triggerDescription
  **/
  @ApiModelProperty(example = "null", required = true, value = "A description of the trigger")
  public String getTriggerDescription() {
    return triggerDescription;
  }

  public void setTriggerDescription(String triggerDescription) {
    this.triggerDescription = triggerDescription;
  }

  public BreTriggerResource triggerName(String triggerName) {
    this.triggerName = triggerName;
    return this;
  }

   /**
   * A human readable name for this trigger
   * @return triggerName
  **/
  @ApiModelProperty(example = "null", required = true, value = "A human readable name for this trigger")
  public String getTriggerName() {
    return triggerName;
  }

  public void setTriggerName(String triggerName) {
    this.triggerName = triggerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreTriggerResource breTriggerResource = (BreTriggerResource) o;
    return Objects.equals(this.category, breTriggerResource.category) &&
        Objects.equals(this.eventName, breTriggerResource.eventName) &&
        Objects.equals(this.parameters, breTriggerResource.parameters) &&
        Objects.equals(this.systemTrigger, breTriggerResource.systemTrigger) &&
        Objects.equals(this.triggerDescription, breTriggerResource.triggerDescription) &&
        Objects.equals(this.triggerName, breTriggerResource.triggerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, eventName, parameters, systemTrigger, triggerDescription, triggerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreTriggerResource {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    systemTrigger: ").append(toIndentedString(systemTrigger)).append("\n");
    sb.append("    triggerDescription: ").append(toIndentedString(triggerDescription)).append("\n");
    sb.append("    triggerName: ").append(toIndentedString(triggerName)).append("\n");
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

