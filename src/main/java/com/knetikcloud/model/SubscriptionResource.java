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
import com.knetikcloud.model.Behavior;
import com.knetikcloud.model.Property;
import com.knetikcloud.model.SubscriptionPlanResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SubscriptionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T13:21:30.157-04:00")
public class SubscriptionResource {
  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  /**
   * Who can purchase this subscription
   */
  public enum AvailabilityEnum {
    ALL("all"),
    
    NEW_SUBSCRIBERS("new_subscribers");

    private String value;

    AvailabilityEnum(String value) {
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
    public static AvailabilityEnum fromValue(String text) {
      for (AvailabilityEnum b : AvailabilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("availability")
  private AvailabilityEnum availability = null;

  @JsonProperty("behaviors")
  private List<Behavior> behaviors = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("consolidation_day_of_month")
  private Integer consolidationDayOfMonth = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("displayable")
  private Boolean displayable = null;

  @JsonProperty("geo_country_list")
  private List<String> geoCountryList = null;

  /**
   * The geo policy type for the subscription
   */
  public enum GeoPolicyTypeEnum {
    WHITELIST("whitelist"),
    
    BLACKLIST("blacklist");

    private String value;

    GeoPolicyTypeEnum(String value) {
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
    public static GeoPolicyTypeEnum fromValue(String text) {
      for (GeoPolicyTypeEnum b : GeoPolicyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("geo_policy_type")
  private GeoPolicyTypeEnum geoPolicyType = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("long_description")
  private String longDescription = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("plans")
  private List<SubscriptionPlanResource> plans = null;

  @JsonProperty("short_description")
  private String shortDescription = null;

  @JsonProperty("sort")
  private Integer sort = null;

  @JsonProperty("store_end")
  private Long storeEnd = null;

  @JsonProperty("store_start")
  private Long storeStart = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("unique_key")
  private String uniqueKey = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  @JsonProperty("vendor_id")
  private Integer vendorId = null;

  public SubscriptionResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public SubscriptionResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * The additional properties for the subscription
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "The additional properties for the subscription")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public SubscriptionResource availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Who can purchase this subscription
   * @return availability
  **/
  @ApiModelProperty(value = "Who can purchase this subscription")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  public SubscriptionResource behaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public SubscriptionResource addBehaviorsItem(Behavior behaviorsItem) {
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

  public SubscriptionResource category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The category of the subscription
   * @return category
  **/
  @ApiModelProperty(value = "The category of the subscription")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public SubscriptionResource consolidationDayOfMonth(Integer consolidationDayOfMonth) {
    this.consolidationDayOfMonth = consolidationDayOfMonth;
    return this;
  }

   /**
   * The day of the month 1..31 this subscription will renew
   * @return consolidationDayOfMonth
  **/
  @ApiModelProperty(value = "The day of the month 1..31 this subscription will renew")
  public Integer getConsolidationDayOfMonth() {
    return consolidationDayOfMonth;
  }

  public void setConsolidationDayOfMonth(Integer consolidationDayOfMonth) {
    this.consolidationDayOfMonth = consolidationDayOfMonth;
  }

   /**
   * The date the item was created, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the item was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public SubscriptionResource displayable(Boolean displayable) {
    this.displayable = displayable;
    return this;
  }

   /**
   * Whether or not the item is currently visible to users. Does not block purchase; Use store_start or store_end to block purchase.  Default &#x3D; true
   * @return displayable
  **/
  @ApiModelProperty(example = "false", value = "Whether or not the item is currently visible to users. Does not block purchase; Use store_start or store_end to block purchase.  Default = true")
  public Boolean isDisplayable() {
    return displayable;
  }

  public void setDisplayable(Boolean displayable) {
    this.displayable = displayable;
  }

  public SubscriptionResource geoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
    return this;
  }

  public SubscriptionResource addGeoCountryListItem(String geoCountryListItem) {
    if (this.geoCountryList == null) {
      this.geoCountryList = new ArrayList<String>();
    }
    this.geoCountryList.add(geoCountryListItem);
    return this;
  }

   /**
   * The geo country list for the subscription
   * @return geoCountryList
  **/
  @ApiModelProperty(value = "The geo country list for the subscription")
  public List<String> getGeoCountryList() {
    return geoCountryList;
  }

  public void setGeoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
  }

  public SubscriptionResource geoPolicyType(GeoPolicyTypeEnum geoPolicyType) {
    this.geoPolicyType = geoPolicyType;
    return this;
  }

   /**
   * The geo policy type for the subscription
   * @return geoPolicyType
  **/
  @ApiModelProperty(value = "The geo policy type for the subscription")
  public GeoPolicyTypeEnum getGeoPolicyType() {
    return geoPolicyType;
  }

  public void setGeoPolicyType(GeoPolicyTypeEnum geoPolicyType) {
    this.geoPolicyType = geoPolicyType;
  }

   /**
   * The id of the item
   * @return id
  **/
  @ApiModelProperty(value = "The id of the item")
  public Integer getId() {
    return id;
  }

  public SubscriptionResource longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A long description of the subscription
   * @return longDescription
  **/
  @ApiModelProperty(value = "A long description of the subscription")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public SubscriptionResource name(String name) {
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

  public SubscriptionResource plans(List<SubscriptionPlanResource> plans) {
    this.plans = plans;
    return this;
  }

  public SubscriptionResource addPlansItem(SubscriptionPlanResource plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<SubscriptionPlanResource>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * The billing options for this subscription
   * @return plans
  **/
  @ApiModelProperty(value = "The billing options for this subscription")
  public List<SubscriptionPlanResource> getPlans() {
    return plans;
  }

  public void setPlans(List<SubscriptionPlanResource> plans) {
    this.plans = plans;
  }

  public SubscriptionResource shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A short description of the subscription.  Max 255 characters
   * @return shortDescription
  **/
  @ApiModelProperty(value = "A short description of the subscription.  Max 255 characters")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public SubscriptionResource sort(Integer sort) {
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

  public SubscriptionResource storeEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
    return this;
  }

   /**
   * Used to schedule removal from store.  Null means the subscription will never be removed
   * @return storeEnd
  **/
  @ApiModelProperty(value = "Used to schedule removal from store.  Null means the subscription will never be removed")
  public Long getStoreEnd() {
    return storeEnd;
  }

  public void setStoreEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
  }

  public SubscriptionResource storeStart(Long storeStart) {
    this.storeStart = storeStart;
    return this;
  }

   /**
   * Used to schedule appearance in store.  Null means the subscription will appear now
   * @return storeStart
  **/
  @ApiModelProperty(value = "Used to schedule appearance in store.  Null means the subscription will appear now")
  public Long getStoreStart() {
    return storeStart;
  }

  public void setStoreStart(Long storeStart) {
    this.storeStart = storeStart;
  }

  public SubscriptionResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SubscriptionResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags for the subscription
   * @return tags
  **/
  @ApiModelProperty(value = "The tags for the subscription")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SubscriptionResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * The template being used
   * @return template
  **/
  @ApiModelProperty(value = "The template being used")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public SubscriptionResource uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * The unique key of the subscription
   * @return uniqueKey
  **/
  @ApiModelProperty(value = "The unique key of the subscription")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

   /**
   * The date the item was last updated
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the item was last updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public SubscriptionResource vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The id of the vendor
   * @return vendorId
  **/
  @ApiModelProperty(required = true, value = "The id of the vendor")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResource subscriptionResource = (SubscriptionResource) o;
    return Objects.equals(this.additionalProperties, subscriptionResource.additionalProperties) &&
        Objects.equals(this.availability, subscriptionResource.availability) &&
        Objects.equals(this.behaviors, subscriptionResource.behaviors) &&
        Objects.equals(this.category, subscriptionResource.category) &&
        Objects.equals(this.consolidationDayOfMonth, subscriptionResource.consolidationDayOfMonth) &&
        Objects.equals(this.createdDate, subscriptionResource.createdDate) &&
        Objects.equals(this.displayable, subscriptionResource.displayable) &&
        Objects.equals(this.geoCountryList, subscriptionResource.geoCountryList) &&
        Objects.equals(this.geoPolicyType, subscriptionResource.geoPolicyType) &&
        Objects.equals(this.id, subscriptionResource.id) &&
        Objects.equals(this.longDescription, subscriptionResource.longDescription) &&
        Objects.equals(this.name, subscriptionResource.name) &&
        Objects.equals(this.plans, subscriptionResource.plans) &&
        Objects.equals(this.shortDescription, subscriptionResource.shortDescription) &&
        Objects.equals(this.sort, subscriptionResource.sort) &&
        Objects.equals(this.storeEnd, subscriptionResource.storeEnd) &&
        Objects.equals(this.storeStart, subscriptionResource.storeStart) &&
        Objects.equals(this.tags, subscriptionResource.tags) &&
        Objects.equals(this.template, subscriptionResource.template) &&
        Objects.equals(this.uniqueKey, subscriptionResource.uniqueKey) &&
        Objects.equals(this.updatedDate, subscriptionResource.updatedDate) &&
        Objects.equals(this.vendorId, subscriptionResource.vendorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, availability, behaviors, category, consolidationDayOfMonth, createdDate, displayable, geoCountryList, geoPolicyType, id, longDescription, name, plans, shortDescription, sort, storeEnd, storeStart, tags, template, uniqueKey, updatedDate, vendorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    consolidationDayOfMonth: ").append(toIndentedString(consolidationDayOfMonth)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    displayable: ").append(toIndentedString(displayable)).append("\n");
    sb.append("    geoCountryList: ").append(toIndentedString(geoCountryList)).append("\n");
    sb.append("    geoPolicyType: ").append(toIndentedString(geoPolicyType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    storeEnd: ").append(toIndentedString(storeEnd)).append("\n");
    sb.append("    storeStart: ").append(toIndentedString(storeStart)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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

