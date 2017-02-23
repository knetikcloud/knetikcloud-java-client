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
import io.swagger.client.model.ItemBehaviorDefinitionResource;
import io.swagger.client.model.PropertyDefinitionResource;
import io.swagger.client.model.TemplateResource;
import java.util.ArrayList;
import java.util.List;

/**
 * StoreItemTemplateResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-23T17:59:31.317-05:00")
public class StoreItemTemplateResource {
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

  @SerializedName("sku_template")
  private TemplateResource skuTemplate = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public StoreItemTemplateResource behaviors(List<ItemBehaviorDefinitionResource> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public StoreItemTemplateResource addBehaviorsItem(ItemBehaviorDefinitionResource behaviorsItem) {
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

  public StoreItemTemplateResource name(String name) {
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

  public StoreItemTemplateResource properties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
    return this;
  }

  public StoreItemTemplateResource addPropertiesItem(PropertyDefinitionResource propertiesItem) {
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

  public StoreItemTemplateResource skuTemplate(TemplateResource skuTemplate) {
    this.skuTemplate = skuTemplate;
    return this;
  }

   /**
   * A template to apply to all skus on an item using this template
   * @return skuTemplate
  **/
  @ApiModelProperty(example = "null", value = "A template to apply to all skus on an item using this template")
  public TemplateResource getSkuTemplate() {
    return skuTemplate;
  }

  public void setSkuTemplate(TemplateResource skuTemplate) {
    this.skuTemplate = skuTemplate;
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
    StoreItemTemplateResource storeItemTemplateResource = (StoreItemTemplateResource) o;
    return Objects.equals(this.behaviors, storeItemTemplateResource.behaviors) &&
        Objects.equals(this.createdDate, storeItemTemplateResource.createdDate) &&
        Objects.equals(this.id, storeItemTemplateResource.id) &&
        Objects.equals(this.name, storeItemTemplateResource.name) &&
        Objects.equals(this.properties, storeItemTemplateResource.properties) &&
        Objects.equals(this.skuTemplate, storeItemTemplateResource.skuTemplate) &&
        Objects.equals(this.updatedDate, storeItemTemplateResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behaviors, createdDate, id, name, properties, skuTemplate, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreItemTemplateResource {\n");
    
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    skuTemplate: ").append(toIndentedString(skuTemplate)).append("\n");
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

