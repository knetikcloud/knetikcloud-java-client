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
import io.swagger.client.model.ItemBehaviorDefinitionResource;
import io.swagger.client.model.PropertyDefinitionResource;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemTemplateResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:18:14.481-05:00")
public class ItemTemplateResource {
  @SerializedName("behaviors")
  private List<ItemBehaviorDefinitionResource> behaviors = new ArrayList<ItemBehaviorDefinitionResource>();

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("properties")
  private List<PropertyDefinitionResource> properties = new ArrayList<PropertyDefinitionResource>();

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public ItemTemplateResource behaviors(List<ItemBehaviorDefinitionResource> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public ItemTemplateResource addBehaviorsItem(ItemBehaviorDefinitionResource behaviorsItem) {
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * The customized behaviors that are required or default for this type of item
   * @return behaviors
  **/
  @ApiModelProperty(example = "null", value = "The customized behaviors that are required or default for this type of item")
  public List<ItemBehaviorDefinitionResource> getBehaviors() {
    return behaviors;
  }

  public void setBehaviors(List<ItemBehaviorDefinitionResource> behaviors) {
    this.behaviors = behaviors;
  }

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

  public ItemTemplateResource name(String name) {
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

  public ItemTemplateResource properties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
    return this;
  }

  public ItemTemplateResource addPropertiesItem(PropertyDefinitionResource propertiesItem) {
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
    ItemTemplateResource itemTemplateResource = (ItemTemplateResource) o;
    return Objects.equals(this.behaviors, itemTemplateResource.behaviors) &&
        Objects.equals(this.createdDate, itemTemplateResource.createdDate) &&
        Objects.equals(this.id, itemTemplateResource.id) &&
        Objects.equals(this.name, itemTemplateResource.name) &&
        Objects.equals(this.properties, itemTemplateResource.properties) &&
        Objects.equals(this.updatedDate, itemTemplateResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behaviors, createdDate, id, name, properties, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTemplateResource {\n");
    
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

