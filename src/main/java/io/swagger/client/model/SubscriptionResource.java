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
import io.swagger.client.model.Property;
import io.swagger.client.model.SubscriptionPlanResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SubscriptionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T19:56:53.315-05:00")
public class SubscriptionResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  /**
   * Who can purchase this subscription
   */
  public enum AvailabilityEnum {
    @SerializedName("all")
    ALL("all"),
    
    @SerializedName("new_subscribers")
    NEW_SUBSCRIBERS("new_subscribers");

    private String value;

    AvailabilityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("availability")
  private AvailabilityEnum availability = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("consolidation_day_of_month")
  private Integer consolidationDayOfMonth = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("geo_country_list")
  private List<String> geoCountryList = new ArrayList<String>();

  /**
   * Whether to use the geo_country_list as a black list or white list for item geographical availability
   */
  public enum GeoPolicyTypeEnum {
    @SerializedName("whitelist")
    WHITELIST("whitelist"),
    
    @SerializedName("blacklist")
    BLACKLIST("blacklist");

    private String value;

    GeoPolicyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("geo_policy_type")
  private GeoPolicyTypeEnum geoPolicyType = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("plans")
  private List<SubscriptionPlanResource> plans = new ArrayList<SubscriptionPlanResource>();

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("sort")
  private Integer sort = null;

  @SerializedName("store_end")
  private Long storeEnd = null;

  @SerializedName("store_start")
  private Long storeStart = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("template")
  private String template = null;

  @SerializedName("unique_key")
  private String uniqueKey = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  public SubscriptionResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public SubscriptionResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of item additional properties, keyed on the property name. Must match the names and types defined in the template for this item type.
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of item additional properties, keyed on the property name. Must match the names and types defined in the template for this item type.")
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
  @ApiModelProperty(example = "null", value = "Who can purchase this subscription")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  public SubscriptionResource category(String category) {
    this.category = category;
    return this;
  }

   /**
   * A category for filtering items
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "A category for filtering items")
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
  @ApiModelProperty(example = "null", value = "The day of the month 1..31 this subscription will renew")
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
  @ApiModelProperty(example = "null", value = "The date the item was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public SubscriptionResource geoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
    return this;
  }

  public SubscriptionResource addGeoCountryListItem(String geoCountryListItem) {
    this.geoCountryList.add(geoCountryListItem);
    return this;
  }

   /**
   * A list of country iso3 codes to include in the blacklist/whitelist geo policy
   * @return geoCountryList
  **/
  @ApiModelProperty(example = "null", value = "A list of country iso3 codes to include in the blacklist/whitelist geo policy")
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
   * Whether to use the geo_country_list as a black list or white list for item geographical availability
   * @return geoPolicyType
  **/
  @ApiModelProperty(example = "null", value = "Whether to use the geo_country_list as a black list or white list for item geographical availability")
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
  @ApiModelProperty(example = "null", value = "The id of the item")
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
  @ApiModelProperty(example = "null", value = "A long description of the subscription")
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
  @ApiModelProperty(example = "null", required = true, value = "The name of the item")
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
    this.plans.add(plansItem);
    return this;
  }

   /**
   * The billing options for this subscription
   * @return plans
  **/
  @ApiModelProperty(example = "null", value = "The billing options for this subscription")
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
  @ApiModelProperty(example = "null", value = "A short description of the subscription.  Max 255 characters")
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
  @ApiModelProperty(example = "null", value = "A number to use in sorting items.  Default 500")
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
  @ApiModelProperty(example = "null", value = "Used to schedule removal from store.  Null means the subscription will never be removed")
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
  @ApiModelProperty(example = "null", value = "Used to schedule appearance in store.  Null means the subscription will appear now")
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
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags used for filtering items
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "List of tags used for filtering items")
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
   * An item template this item is validated against. May be null and no validation of additional properties will be done.
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "An item template this item is validated against. May be null and no validation of additional properties will be done.")
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
   * The unique key for the item
   * @return uniqueKey
  **/
  @ApiModelProperty(example = "null", value = "The unique key for the item")
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
  @ApiModelProperty(example = "null", value = "The date the item was last updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public SubscriptionResource vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The vendor who provides the item
   * @return vendorId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The vendor who provides the item")
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
        Objects.equals(this.category, subscriptionResource.category) &&
        Objects.equals(this.consolidationDayOfMonth, subscriptionResource.consolidationDayOfMonth) &&
        Objects.equals(this.createdDate, subscriptionResource.createdDate) &&
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
    return Objects.hash(additionalProperties, availability, category, consolidationDayOfMonth, createdDate, geoCountryList, geoPolicyType, id, longDescription, name, plans, shortDescription, sort, storeEnd, storeStart, tags, template, uniqueKey, updatedDate, vendorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    consolidationDayOfMonth: ").append(toIndentedString(consolidationDayOfMonth)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

