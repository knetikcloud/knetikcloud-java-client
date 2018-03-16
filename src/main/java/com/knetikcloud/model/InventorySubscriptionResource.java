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
import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.SimpleUserResource;
import com.knetikcloud.model.SubscriptionCreditResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * InventorySubscriptionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T15:25:18.305-04:00")
public class InventorySubscriptionResource {
  @JsonProperty("bill_date")
  private Long billDate = null;

  @JsonProperty("credit")
  private BigDecimal credit = null;

  @JsonProperty("credit_log")
  private List<SubscriptionCreditResource> creditLog = null;

  @JsonProperty("grace_end")
  private Long graceEnd = null;

  @JsonProperty("inventory_id")
  private Integer inventoryId = null;

  /**
   * The inventory status object
   */
  public enum InventoryStatusEnum {
    PENDING("pending"),
    
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    InventoryStatusEnum(String value) {
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
    public static InventoryStatusEnum fromValue(String text) {
      for (InventoryStatusEnum b : InventoryStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("inventory_status")
  private InventoryStatusEnum inventoryStatus = null;

  @JsonProperty("item_id")
  private Integer itemId = null;

  @JsonProperty("payment_method")
  private PaymentMethodResource paymentMethod = null;

  @JsonProperty("price_override")
  private BigDecimal priceOverride = null;

  @JsonProperty("price_override_reason")
  private String priceOverrideReason = null;

  @JsonProperty("recurring_price")
  private BigDecimal recurringPrice = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("start_date")
  private Long startDate = null;

  @JsonProperty("subscription_status")
  private Integer subscriptionStatus = null;

  @JsonProperty("user")
  private SimpleUserResource user = null;

  public InventorySubscriptionResource billDate(Long billDate) {
    this.billDate = billDate;
    return this;
  }

   /**
   * The date the subscription will be billed
   * @return billDate
  **/
  @ApiModelProperty(value = "The date the subscription will be billed")
  public Long getBillDate() {
    return billDate;
  }

  public void setBillDate(Long billDate) {
    this.billDate = billDate;
  }

   /**
   * A credit of money already applied to a subscription for the next bill, or a debt if negative
   * @return credit
  **/
  @ApiModelProperty(value = "A credit of money already applied to a subscription for the next bill, or a debt if negative")
  public BigDecimal getCredit() {
    return credit;
  }

  public InventorySubscriptionResource creditLog(List<SubscriptionCreditResource> creditLog) {
    this.creditLog = creditLog;
    return this;
  }

  public InventorySubscriptionResource addCreditLogItem(SubscriptionCreditResource creditLogItem) {
    if (this.creditLog == null) {
      this.creditLog = new ArrayList<SubscriptionCreditResource>();
    }
    this.creditLog.add(creditLogItem);
    return this;
  }

   /**
   * A record of past and present credit/debt changes
   * @return creditLog
  **/
  @ApiModelProperty(value = "A record of past and present credit/debt changes")
  public List<SubscriptionCreditResource> getCreditLog() {
    return creditLog;
  }

  public void setCreditLog(List<SubscriptionCreditResource> creditLog) {
    this.creditLog = creditLog;
  }

  public InventorySubscriptionResource graceEnd(Long graceEnd) {
    this.graceEnd = graceEnd;
    return this;
  }

   /**
   * The date the grace period ends
   * @return graceEnd
  **/
  @ApiModelProperty(value = "The date the grace period ends")
  public Long getGraceEnd() {
    return graceEnd;
  }

  public void setGraceEnd(Long graceEnd) {
    this.graceEnd = graceEnd;
  }

  public InventorySubscriptionResource inventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
    return this;
  }

   /**
   * The id of the inventory
   * @return inventoryId
  **/
  @ApiModelProperty(value = "The id of the inventory")
  public Integer getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
  }

  public InventorySubscriptionResource inventoryStatus(InventoryStatusEnum inventoryStatus) {
    this.inventoryStatus = inventoryStatus;
    return this;
  }

   /**
   * The inventory status object
   * @return inventoryStatus
  **/
  @ApiModelProperty(value = "The inventory status object")
  public InventoryStatusEnum getInventoryStatus() {
    return inventoryStatus;
  }

  public void setInventoryStatus(InventoryStatusEnum inventoryStatus) {
    this.inventoryStatus = inventoryStatus;
  }

  public InventorySubscriptionResource itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The id of the item
   * @return itemId
  **/
  @ApiModelProperty(value = "The id of the item")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public InventorySubscriptionResource paymentMethod(PaymentMethodResource paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method object
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The payment method object")
  public PaymentMethodResource getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodResource paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public InventorySubscriptionResource priceOverride(BigDecimal priceOverride) {
    this.priceOverride = priceOverride;
    return this;
  }

   /**
   * The recurring price that has been set to override the base price. Null if not overriding
   * @return priceOverride
  **/
  @ApiModelProperty(value = "The recurring price that has been set to override the base price. Null if not overriding")
  public BigDecimal getPriceOverride() {
    return priceOverride;
  }

  public void setPriceOverride(BigDecimal priceOverride) {
    this.priceOverride = priceOverride;
  }

  public InventorySubscriptionResource priceOverrideReason(String priceOverrideReason) {
    this.priceOverrideReason = priceOverrideReason;
    return this;
  }

   /**
   * An explanation for the reason the price is being overridden
   * @return priceOverrideReason
  **/
  @ApiModelProperty(value = "An explanation for the reason the price is being overridden")
  public String getPriceOverrideReason() {
    return priceOverrideReason;
  }

  public void setPriceOverrideReason(String priceOverrideReason) {
    this.priceOverrideReason = priceOverrideReason;
  }

  public InventorySubscriptionResource recurringPrice(BigDecimal recurringPrice) {
    this.recurringPrice = recurringPrice;
    return this;
  }

   /**
   * The default recurring price
   * @return recurringPrice
  **/
  @ApiModelProperty(value = "The default recurring price")
  public BigDecimal getRecurringPrice() {
    return recurringPrice;
  }

  public void setRecurringPrice(BigDecimal recurringPrice) {
    this.recurringPrice = recurringPrice;
  }

  public InventorySubscriptionResource sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The recurring sku of the subscription
   * @return sku
  **/
  @ApiModelProperty(value = "The recurring sku of the subscription")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public InventorySubscriptionResource startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date the subscription will start
   * @return startDate
  **/
  @ApiModelProperty(value = "The date the subscription will start")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public InventorySubscriptionResource subscriptionStatus(Integer subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
    return this;
  }

   /**
   * The status of the subscription
   * @return subscriptionStatus
  **/
  @ApiModelProperty(value = "The status of the subscription")
  public Integer getSubscriptionStatus() {
    return subscriptionStatus;
  }

  public void setSubscriptionStatus(Integer subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
  }

  public InventorySubscriptionResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The user
   * @return user
  **/
  @ApiModelProperty(value = "The user")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventorySubscriptionResource inventorySubscriptionResource = (InventorySubscriptionResource) o;
    return Objects.equals(this.billDate, inventorySubscriptionResource.billDate) &&
        Objects.equals(this.credit, inventorySubscriptionResource.credit) &&
        Objects.equals(this.creditLog, inventorySubscriptionResource.creditLog) &&
        Objects.equals(this.graceEnd, inventorySubscriptionResource.graceEnd) &&
        Objects.equals(this.inventoryId, inventorySubscriptionResource.inventoryId) &&
        Objects.equals(this.inventoryStatus, inventorySubscriptionResource.inventoryStatus) &&
        Objects.equals(this.itemId, inventorySubscriptionResource.itemId) &&
        Objects.equals(this.paymentMethod, inventorySubscriptionResource.paymentMethod) &&
        Objects.equals(this.priceOverride, inventorySubscriptionResource.priceOverride) &&
        Objects.equals(this.priceOverrideReason, inventorySubscriptionResource.priceOverrideReason) &&
        Objects.equals(this.recurringPrice, inventorySubscriptionResource.recurringPrice) &&
        Objects.equals(this.sku, inventorySubscriptionResource.sku) &&
        Objects.equals(this.startDate, inventorySubscriptionResource.startDate) &&
        Objects.equals(this.subscriptionStatus, inventorySubscriptionResource.subscriptionStatus) &&
        Objects.equals(this.user, inventorySubscriptionResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billDate, credit, creditLog, graceEnd, inventoryId, inventoryStatus, itemId, paymentMethod, priceOverride, priceOverrideReason, recurringPrice, sku, startDate, subscriptionStatus, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventorySubscriptionResource {\n");
    
    sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    creditLog: ").append(toIndentedString(creditLog)).append("\n");
    sb.append("    graceEnd: ").append(toIndentedString(graceEnd)).append("\n");
    sb.append("    inventoryId: ").append(toIndentedString(inventoryId)).append("\n");
    sb.append("    inventoryStatus: ").append(toIndentedString(inventoryStatus)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    priceOverride: ").append(toIndentedString(priceOverride)).append("\n");
    sb.append("    priceOverrideReason: ").append(toIndentedString(priceOverrideReason)).append("\n");
    sb.append("    recurringPrice: ").append(toIndentedString(recurringPrice)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

