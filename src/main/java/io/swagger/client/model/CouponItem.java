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
import io.swagger.client.model.Behavior;
import io.swagger.client.model.Property;
import io.swagger.client.model.Sku;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CouponItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T01:11:26.271-05:00")
public class CouponItem {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("behaviors")
  private List<Behavior> behaviors = new ArrayList<Behavior>();

  @SerializedName("category")
  private String category = null;

  /**
   * The type of coupon
   */
  public enum CouponTypeHintEnum {
    @SerializedName("coupon_cart")
    CART("coupon_cart"),
    
    @SerializedName("coupon_single_item")
    SINGLE_ITEM("coupon_single_item"),
    
    @SerializedName("coupon_voucher")
    VOUCHER("coupon_voucher"),
    
    @SerializedName("coupon_vendor")
    VENDOR("coupon_vendor"),
    
    @SerializedName("coupon_tag")
    TAG("coupon_tag");

    private String value;

    CouponTypeHintEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("coupon_type_hint")
  private CouponTypeHintEnum couponTypeHint = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("discount_max")
  private Double discountMax = null;

  @SerializedName("discount_min_cart_value")
  private Double discountMinCartValue = null;

  /**
   * The type of coupon discount
   */
  public enum DiscountTypeEnum {
    @SerializedName("value")
    VALUE("value"),
    
    @SerializedName("percentage")
    PERCENTAGE("percentage");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("discount_type")
  private DiscountTypeEnum discountType = null;

  @SerializedName("discount_value")
  private Double discountValue = null;

  @SerializedName("displayable")
  private Boolean displayable = null;

  @SerializedName("exclusive")
  private Boolean exclusive = null;

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

  @SerializedName("item_id")
  private Integer itemId = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("max_quantity")
  private Integer maxQuantity = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self_exclusive")
  private Boolean selfExclusive = null;

  @SerializedName("shipping_tier")
  private Integer shippingTier = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("skus")
  private List<Sku> skus = new ArrayList<Sku>();

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

  @SerializedName("type_hint")
  private String typeHint = null;

  @SerializedName("unique_key")
  private String uniqueKey = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("valid_for_tags")
  private List<String> validForTags = new ArrayList<String>();

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  public CouponItem additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public CouponItem putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public CouponItem behaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public CouponItem addBehaviorsItem(Behavior behaviorsItem) {
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * The behaviors linked to the item, describing various options and interactions. May not be included in item lists
   * @return behaviors
  **/
  @ApiModelProperty(example = "null", value = "The behaviors linked to the item, describing various options and interactions. May not be included in item lists")
  public List<Behavior> getBehaviors() {
    return behaviors;
  }

  public void setBehaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
  }

  public CouponItem category(String category) {
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

  public CouponItem couponTypeHint(CouponTypeHintEnum couponTypeHint) {
    this.couponTypeHint = couponTypeHint;
    return this;
  }

   /**
   * The type of coupon
   * @return couponTypeHint
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of coupon")
  public CouponTypeHintEnum getCouponTypeHint() {
    return couponTypeHint;
  }

  public void setCouponTypeHint(CouponTypeHintEnum couponTypeHint) {
    this.couponTypeHint = couponTypeHint;
  }

   /**
   * The date the item was created, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date the item was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public CouponItem discountMax(Double discountMax) {
    this.discountMax = discountMax;
    return this;
  }

   /**
   * The amount this coupon is maxed out at.  Applies if coupon_type_hint is coupon_cart
   * @return discountMax
  **/
  @ApiModelProperty(example = "null", value = "The amount this coupon is maxed out at.  Applies if coupon_type_hint is coupon_cart")
  public Double getDiscountMax() {
    return discountMax;
  }

  public void setDiscountMax(Double discountMax) {
    this.discountMax = discountMax;
  }

  public CouponItem discountMinCartValue(Double discountMinCartValue) {
    this.discountMinCartValue = discountMinCartValue;
    return this;
  }

   /**
   * The minimium amount needed in the cart for the coupon to apply.  Applies if coupon_type_hint is coupon_cart
   * @return discountMinCartValue
  **/
  @ApiModelProperty(example = "null", value = "The minimium amount needed in the cart for the coupon to apply.  Applies if coupon_type_hint is coupon_cart")
  public Double getDiscountMinCartValue() {
    return discountMinCartValue;
  }

  public void setDiscountMinCartValue(Double discountMinCartValue) {
    this.discountMinCartValue = discountMinCartValue;
  }

  public CouponItem discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * The type of coupon discount
   * @return discountType
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of coupon discount")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public CouponItem discountValue(Double discountValue) {
    this.discountValue = discountValue;
    return this;
  }

   /**
   * The amount the coupon will discount the item
   * @return discountValue
  **/
  @ApiModelProperty(example = "null", required = true, value = "The amount the coupon will discount the item")
  public Double getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(Double discountValue) {
    this.discountValue = discountValue;
  }

  public CouponItem displayable(Boolean displayable) {
    this.displayable = displayable;
    return this;
  }

   /**
   * Whether or not the item is currently displayable.  Default = true
   * @return displayable
  **/
  @ApiModelProperty(example = "false", value = "Whether or not the item is currently displayable.  Default = true")
  public Boolean getDisplayable() {
    return displayable;
  }

  public void setDisplayable(Boolean displayable) {
    this.displayable = displayable;
  }

  public CouponItem exclusive(Boolean exclusive) {
    this.exclusive = exclusive;
    return this;
  }

   /**
   * Whether this coupon is exclusive or not (true means cannot be in same cart as another).  Default = false
   * @return exclusive
  **/
  @ApiModelProperty(example = "false", value = "Whether this coupon is exclusive or not (true means cannot be in same cart as another).  Default = false")
  public Boolean getExclusive() {
    return exclusive;
  }

  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }

  public CouponItem geoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
    return this;
  }

  public CouponItem addGeoCountryListItem(String geoCountryListItem) {
    this.geoCountryList.add(geoCountryListItem);
    return this;
  }

   /**
   * A list of country ID to include in the blacklist/whitelist geo policy
   * @return geoCountryList
  **/
  @ApiModelProperty(example = "null", value = "A list of country ID to include in the blacklist/whitelist geo policy")
  public List<String> getGeoCountryList() {
    return geoCountryList;
  }

  public void setGeoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
  }

  public CouponItem geoPolicyType(GeoPolicyTypeEnum geoPolicyType) {
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

  public CouponItem itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The id of the item the coupon is applied to.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher
   * @return itemId
  **/
  @ApiModelProperty(example = "null", value = "The id of the item the coupon is applied to.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public CouponItem longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A long description of the item
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "A long description of the item")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public CouponItem maxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
    return this;
  }

   /**
   * The maximum quantity of items the coupon can apply to, null if no limit and minimum 1 otherwise.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher
   * @return maxQuantity
  **/
  @ApiModelProperty(example = "null", value = "The maximum quantity of items the coupon can apply to, null if no limit and minimum 1 otherwise.  Applies if coupon_type_hint is coupon_single_item or coupon_voucher")
  public Integer getMaxQuantity() {
    return maxQuantity;
  }

  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  public CouponItem name(String name) {
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

  public CouponItem selfExclusive(Boolean selfExclusive) {
    this.selfExclusive = selfExclusive;
    return this;
  }

   /**
   * Whether this coupon is exclusive to itself or not (true means cannot add two of this same coupon to the same cart).  Default = false
   * @return selfExclusive
  **/
  @ApiModelProperty(example = "false", value = "Whether this coupon is exclusive to itself or not (true means cannot add two of this same coupon to the same cart).  Default = false")
  public Boolean getSelfExclusive() {
    return selfExclusive;
  }

  public void setSelfExclusive(Boolean selfExclusive) {
    this.selfExclusive = selfExclusive;
  }

  public CouponItem shippingTier(Integer shippingTier) {
    this.shippingTier = shippingTier;
    return this;
  }

   /**
   * Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0
   * @return shippingTier
  **/
  @ApiModelProperty(example = "null", value = "Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0")
  public Integer getShippingTier() {
    return shippingTier;
  }

  public void setShippingTier(Integer shippingTier) {
    this.shippingTier = shippingTier;
  }

  public CouponItem shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A short description of the item, max 255 chars
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "A short description of the item, max 255 chars")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public CouponItem skus(List<Sku> skus) {
    this.skus = skus;
    return this;
  }

  public CouponItem addSkusItem(Sku skusItem) {
    this.skus.add(skusItem);
    return this;
  }

   /**
   * The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart
   * @return skus
  **/
  @ApiModelProperty(example = "null", required = true, value = "The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart")
  public List<Sku> getSkus() {
    return skus;
  }

  public void setSkus(List<Sku> skus) {
    this.skus = skus;
  }

  public CouponItem sort(Integer sort) {
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

  public CouponItem storeEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
    return this;
  }

   /**
   * The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store
   * @return storeEnd
  **/
  @ApiModelProperty(example = "null", value = "The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store")
  public Long getStoreEnd() {
    return storeEnd;
  }

  public void setStoreEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
  }

  public CouponItem storeStart(Long storeStart) {
    this.storeStart = storeStart;
    return this;
  }

   /**
   * The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately
   * @return storeStart
  **/
  @ApiModelProperty(example = "null", value = "The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately")
  public Long getStoreStart() {
    return storeStart;
  }

  public void setStoreStart(Long storeStart) {
    this.storeStart = storeStart;
  }

  public CouponItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CouponItem addTagsItem(String tagsItem) {
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

  public CouponItem template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public CouponItem typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * The type of the item
   * @return typeHint
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of the item")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  public CouponItem uniqueKey(String uniqueKey) {
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
   * The date the item was last updated, unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date the item was last updated, unix timestamp in seconds")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public CouponItem validForTags(List<String> validForTags) {
    this.validForTags = validForTags;
    return this;
  }

  public CouponItem addValidForTagsItem(String validForTagsItem) {
    this.validForTags.add(validForTagsItem);
    return this;
  }

   /**
   * A list of tags for a coupon.  The coupon can only apply to an item that has at least one of these tags.  Applies if coupon_type_hint is coupon_tag
   * @return validForTags
  **/
  @ApiModelProperty(example = "null", value = "A list of tags for a coupon.  The coupon can only apply to an item that has at least one of these tags.  Applies if coupon_type_hint is coupon_tag")
  public List<String> getValidForTags() {
    return validForTags;
  }

  public void setValidForTags(List<String> validForTags) {
    this.validForTags = validForTags;
  }

  public CouponItem vendorId(Integer vendorId) {
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
    CouponItem couponItem = (CouponItem) o;
    return Objects.equals(this.additionalProperties, couponItem.additionalProperties) &&
        Objects.equals(this.behaviors, couponItem.behaviors) &&
        Objects.equals(this.category, couponItem.category) &&
        Objects.equals(this.couponTypeHint, couponItem.couponTypeHint) &&
        Objects.equals(this.createdDate, couponItem.createdDate) &&
        Objects.equals(this.discountMax, couponItem.discountMax) &&
        Objects.equals(this.discountMinCartValue, couponItem.discountMinCartValue) &&
        Objects.equals(this.discountType, couponItem.discountType) &&
        Objects.equals(this.discountValue, couponItem.discountValue) &&
        Objects.equals(this.displayable, couponItem.displayable) &&
        Objects.equals(this.exclusive, couponItem.exclusive) &&
        Objects.equals(this.geoCountryList, couponItem.geoCountryList) &&
        Objects.equals(this.geoPolicyType, couponItem.geoPolicyType) &&
        Objects.equals(this.id, couponItem.id) &&
        Objects.equals(this.itemId, couponItem.itemId) &&
        Objects.equals(this.longDescription, couponItem.longDescription) &&
        Objects.equals(this.maxQuantity, couponItem.maxQuantity) &&
        Objects.equals(this.name, couponItem.name) &&
        Objects.equals(this.selfExclusive, couponItem.selfExclusive) &&
        Objects.equals(this.shippingTier, couponItem.shippingTier) &&
        Objects.equals(this.shortDescription, couponItem.shortDescription) &&
        Objects.equals(this.skus, couponItem.skus) &&
        Objects.equals(this.sort, couponItem.sort) &&
        Objects.equals(this.storeEnd, couponItem.storeEnd) &&
        Objects.equals(this.storeStart, couponItem.storeStart) &&
        Objects.equals(this.tags, couponItem.tags) &&
        Objects.equals(this.template, couponItem.template) &&
        Objects.equals(this.typeHint, couponItem.typeHint) &&
        Objects.equals(this.uniqueKey, couponItem.uniqueKey) &&
        Objects.equals(this.updatedDate, couponItem.updatedDate) &&
        Objects.equals(this.validForTags, couponItem.validForTags) &&
        Objects.equals(this.vendorId, couponItem.vendorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, behaviors, category, couponTypeHint, createdDate, discountMax, discountMinCartValue, discountType, discountValue, displayable, exclusive, geoCountryList, geoPolicyType, id, itemId, longDescription, maxQuantity, name, selfExclusive, shippingTier, shortDescription, skus, sort, storeEnd, storeStart, tags, template, typeHint, uniqueKey, updatedDate, validForTags, vendorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponItem {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    couponTypeHint: ").append(toIndentedString(couponTypeHint)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    discountMax: ").append(toIndentedString(discountMax)).append("\n");
    sb.append("    discountMinCartValue: ").append(toIndentedString(discountMinCartValue)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
    sb.append("    displayable: ").append(toIndentedString(displayable)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    geoCountryList: ").append(toIndentedString(geoCountryList)).append("\n");
    sb.append("    geoPolicyType: ").append(toIndentedString(geoPolicyType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfExclusive: ").append(toIndentedString(selfExclusive)).append("\n");
    sb.append("    shippingTier: ").append(toIndentedString(shippingTier)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    storeEnd: ").append(toIndentedString(storeEnd)).append("\n");
    sb.append("    storeStart: ").append(toIndentedString(storeStart)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    validForTags: ").append(toIndentedString(validForTags)).append("\n");
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

