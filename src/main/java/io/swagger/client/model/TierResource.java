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
import io.swagger.client.model.Property;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TierResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T09:38:48.154-05:00")
public class TierResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("required_progress")
  private Integer requiredProgress = null;

  @SerializedName("trigger_event_name")
  private String triggerEventName = null;

  public TierResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public TierResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public TierResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tier
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the tier")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TierResource requiredProgress(Integer requiredProgress) {
    this.requiredProgress = requiredProgress;
    return this;
  }

   /**
   * The required progress for the tier
   * @return requiredProgress
  **/
  @ApiModelProperty(example = "null", required = true, value = "The required progress for the tier")
  public Integer getRequiredProgress() {
    return requiredProgress;
  }

  public void setRequiredProgress(Integer requiredProgress) {
    this.requiredProgress = requiredProgress;
  }

  public TierResource triggerEventName(String triggerEventName) {
    this.triggerEventName = triggerEventName;
    return this;
  }

   /**
   * The name of the triggered event
   * @return triggerEventName
  **/
  @ApiModelProperty(example = "null", value = "The name of the triggered event")
  public String getTriggerEventName() {
    return triggerEventName;
  }

  public void setTriggerEventName(String triggerEventName) {
    this.triggerEventName = triggerEventName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TierResource tierResource = (TierResource) o;
    return Objects.equals(this.additionalProperties, tierResource.additionalProperties) &&
        Objects.equals(this.name, tierResource.name) &&
        Objects.equals(this.requiredProgress, tierResource.requiredProgress) &&
        Objects.equals(this.triggerEventName, tierResource.triggerEventName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, name, requiredProgress, triggerEventName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TierResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requiredProgress: ").append(toIndentedString(requiredProgress)).append("\n");
    sb.append("    triggerEventName: ").append(toIndentedString(triggerEventName)).append("\n");
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

