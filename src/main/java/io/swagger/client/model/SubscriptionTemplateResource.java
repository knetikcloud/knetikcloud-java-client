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
import io.swagger.client.model.PropertyDefinitionResource;
import io.swagger.client.model.TemplateResource;
import java.util.ArrayList;
import java.util.List;

/**
 * SubscriptionTemplateResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:47:52.984-05:00")
public class SubscriptionTemplateResource {
  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("plan_template")
  private TemplateResource planTemplate = null;

  @SerializedName("properties")
  private List<PropertyDefinitionResource> properties = new ArrayList<PropertyDefinitionResource>();

  @SerializedName("updated_date")
  private Long updatedDate = null;

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The id of the template
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the template")
  public String getId() {
    return id;
  }

  public SubscriptionTemplateResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the template
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the template")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionTemplateResource planTemplate(TemplateResource planTemplate) {
    this.planTemplate = planTemplate;
    return this;
  }

   /**
   * A template to apply to all plans on a subscription using this template
   * @return planTemplate
  **/
  @ApiModelProperty(example = "null", value = "A template to apply to all plans on a subscription using this template")
  public TemplateResource getPlanTemplate() {
    return planTemplate;
  }

  public void setPlanTemplate(TemplateResource planTemplate) {
    this.planTemplate = planTemplate;
  }

  public SubscriptionTemplateResource properties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
    return this;
  }

  public SubscriptionTemplateResource addPropertiesItem(PropertyDefinitionResource propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The customized properties that are present
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "The customized properties that are present")
  public List<PropertyDefinitionResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was last updated in seconds since unix epoch")
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
    SubscriptionTemplateResource subscriptionTemplateResource = (SubscriptionTemplateResource) o;
    return Objects.equals(this.createdDate, subscriptionTemplateResource.createdDate) &&
        Objects.equals(this.id, subscriptionTemplateResource.id) &&
        Objects.equals(this.name, subscriptionTemplateResource.name) &&
        Objects.equals(this.planTemplate, subscriptionTemplateResource.planTemplate) &&
        Objects.equals(this.properties, subscriptionTemplateResource.properties) &&
        Objects.equals(this.updatedDate, subscriptionTemplateResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, id, name, planTemplate, properties, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionTemplateResource {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    planTemplate: ").append(toIndentedString(planTemplate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
