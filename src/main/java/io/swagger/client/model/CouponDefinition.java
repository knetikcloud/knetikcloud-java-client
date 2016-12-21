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
import java.util.ArrayList;
import java.util.List;

/**
 * CouponDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:09:22.197-05:00")
public class CouponDefinition {
  @SerializedName("code")
  private String code = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets discountType
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

  @SerializedName("exclusive")
  private Boolean exclusive = null;

  @SerializedName("max_discount")
  private Double maxDiscount = null;

  @SerializedName("max_quantity")
  private Integer maxQuantity = null;

  @SerializedName("min_cart_total")
  private Double minCartTotal = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self_exclusive")
  private Boolean selfExclusive = null;

  @SerializedName("target_item_id")
  private Integer targetItemId = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
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

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("valid_for_tags")
  private List<String> validForTags = new ArrayList<String>();

  @SerializedName("value")
  private Double value = null;

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  public CouponDefinition code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CouponDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CouponDefinition discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * Get discountType
   * @return discountType
  **/
  @ApiModelProperty(example = "null", value = "")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public CouponDefinition exclusive(Boolean exclusive) {
    this.exclusive = exclusive;
    return this;
  }

   /**
   * Get exclusive
   * @return exclusive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getExclusive() {
    return exclusive;
  }

  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }

  public CouponDefinition maxDiscount(Double maxDiscount) {
    this.maxDiscount = maxDiscount;
    return this;
  }

   /**
   * Get maxDiscount
   * @return maxDiscount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMaxDiscount() {
    return maxDiscount;
  }

  public void setMaxDiscount(Double maxDiscount) {
    this.maxDiscount = maxDiscount;
  }

  public CouponDefinition maxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
    return this;
  }

   /**
   * Get maxQuantity
   * @return maxQuantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxQuantity() {
    return maxQuantity;
  }

  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  public CouponDefinition minCartTotal(Double minCartTotal) {
    this.minCartTotal = minCartTotal;
    return this;
  }

   /**
   * Get minCartTotal
   * @return minCartTotal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMinCartTotal() {
    return minCartTotal;
  }

  public void setMinCartTotal(Double minCartTotal) {
    this.minCartTotal = minCartTotal;
  }

  public CouponDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CouponDefinition selfExclusive(Boolean selfExclusive) {
    this.selfExclusive = selfExclusive;
    return this;
  }

   /**
   * Get selfExclusive
   * @return selfExclusive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSelfExclusive() {
    return selfExclusive;
  }

  public void setSelfExclusive(Boolean selfExclusive) {
    this.selfExclusive = selfExclusive;
  }

  public CouponDefinition targetItemId(Integer targetItemId) {
    this.targetItemId = targetItemId;
    return this;
  }

   /**
   * Get targetItemId
   * @return targetItemId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTargetItemId() {
    return targetItemId;
  }

  public void setTargetItemId(Integer targetItemId) {
    this.targetItemId = targetItemId;
  }

  public CouponDefinition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CouponDefinition validForTags(List<String> validForTags) {
    this.validForTags = validForTags;
    return this;
  }

  public CouponDefinition addValidForTagsItem(String validForTagsItem) {
    this.validForTags.add(validForTagsItem);
    return this;
  }

   /**
   * Get validForTags
   * @return validForTags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getValidForTags() {
    return validForTags;
  }

  public void setValidForTags(List<String> validForTags) {
    this.validForTags = validForTags;
  }

  public CouponDefinition value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public CouponDefinition vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(example = "null", value = "")
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
    CouponDefinition couponDefinition = (CouponDefinition) o;
    return Objects.equals(this.code, couponDefinition.code) &&
        Objects.equals(this.description, couponDefinition.description) &&
        Objects.equals(this.discountType, couponDefinition.discountType) &&
        Objects.equals(this.exclusive, couponDefinition.exclusive) &&
        Objects.equals(this.maxDiscount, couponDefinition.maxDiscount) &&
        Objects.equals(this.maxQuantity, couponDefinition.maxQuantity) &&
        Objects.equals(this.minCartTotal, couponDefinition.minCartTotal) &&
        Objects.equals(this.name, couponDefinition.name) &&
        Objects.equals(this.selfExclusive, couponDefinition.selfExclusive) &&
        Objects.equals(this.targetItemId, couponDefinition.targetItemId) &&
        Objects.equals(this.type, couponDefinition.type) &&
        Objects.equals(this.validForTags, couponDefinition.validForTags) &&
        Objects.equals(this.value, couponDefinition.value) &&
        Objects.equals(this.vendorId, couponDefinition.vendorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, discountType, exclusive, maxDiscount, maxQuantity, minCartTotal, name, selfExclusive, targetItemId, type, validForTags, value, vendorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponDefinition {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    maxDiscount: ").append(toIndentedString(maxDiscount)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    minCartTotal: ").append(toIndentedString(minCartTotal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfExclusive: ").append(toIndentedString(selfExclusive)).append("\n");
    sb.append("    targetItemId: ").append(toIndentedString(targetItemId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validForTags: ").append(toIndentedString(validForTags)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

