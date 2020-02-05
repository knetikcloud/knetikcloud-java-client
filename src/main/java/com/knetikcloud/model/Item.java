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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.knetikcloud.model.Behavior;
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Item
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type_hint", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = ShippingItem.class, name = "shipping_item"),
  @JsonSubTypes.Type(value = BundleItem.class, name = "bundle_item"),
  @JsonSubTypes.Type(value = Subscription.class, name = "subscription"),
  @JsonSubTypes.Type(value = StoreItem.class, name = "item"),
  @JsonSubTypes.Type(value = CouponItem.class, name = "coupon_item"),
  @JsonSubTypes.Type(value = EntitlementItem.class, name = "entitlement"),
})

public class Item {
  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("behaviors")
  private List<Behavior> behaviors = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("long_description")
  private String longDescription = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("short_description")
  private String shortDescription = null;

  @JsonProperty("sort")
  private Integer sort = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("type_hint")
  private String typeHint = null;

  @JsonProperty("unique_key")
  private String uniqueKey = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  public Item additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public Item putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public Item behaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public Item addBehaviorsItem(Behavior behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<Behavior>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * The behaviors linked to the item, describing various options and interactions. May not be included in item lists
   * @return behaviors
  **/
  @ApiModelProperty(value = "The behaviors linked to the item, describing various options and interactions. May not be included in item lists")
  public List<Behavior> getBehaviors() {
    return behaviors;
  }

  public void setBehaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
  }

  public Item category(String category) {
    this.category = category;
    return this;
  }

   /**
   * A category for filtering items
   * @return category
  **/
  @ApiModelProperty(value = "A category for filtering items")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

   /**
   * The date the item was created, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the item was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The id of the item
   * @return id
  **/
  @ApiModelProperty(value = "The id of the item")
  public Integer getId() {
    return id;
  }

  public Item longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A long description of the item
   * @return longDescription
  **/
  @ApiModelProperty(value = "A long description of the item")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public Item name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the item
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the item")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Item shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A short description of the item, max 255 chars
   * @return shortDescription
  **/
  @ApiModelProperty(value = "A short description of the item, max 255 chars")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Item sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * A number to use in sorting items.  Default 500
   * @return sort
  **/
  @ApiModelProperty(value = "A number to use in sorting items.  Default 500")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public Item tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Item addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags used for filtering items
   * @return tags
  **/
  @ApiModelProperty(value = "List of tags used for filtering items")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Item template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default &#x3D; null
   * @return template
  **/
  @ApiModelProperty(value = "An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public Item typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * The type of the item
   * @return typeHint
  **/
  @ApiModelProperty(required = true, value = "The type of the item")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  public Item uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * The unique key for the item
   * @return uniqueKey
  **/
  @ApiModelProperty(value = "The unique key for the item")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

   /**
   * The date the item was last updated, unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the item was last updated, unix timestamp in seconds")
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
    Item item = (Item) o;
    return Objects.equals(this.additionalProperties, item.additionalProperties) &&
        Objects.equals(this.behaviors, item.behaviors) &&
        Objects.equals(this.category, item.category) &&
        Objects.equals(this.createdDate, item.createdDate) &&
        Objects.equals(this.id, item.id) &&
        Objects.equals(this.longDescription, item.longDescription) &&
        Objects.equals(this.name, item.name) &&
        Objects.equals(this.shortDescription, item.shortDescription) &&
        Objects.equals(this.sort, item.sort) &&
        Objects.equals(this.tags, item.tags) &&
        Objects.equals(this.template, item.template) &&
        Objects.equals(this.typeHint, item.typeHint) &&
        Objects.equals(this.uniqueKey, item.uniqueKey) &&
        Objects.equals(this.updatedDate, item.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, behaviors, category, createdDate, id, longDescription, name, shortDescription, sort, tags, template, typeHint, uniqueKey, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
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

