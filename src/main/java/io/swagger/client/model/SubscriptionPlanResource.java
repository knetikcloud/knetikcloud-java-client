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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SubscriptionPlanResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T17:52:02.724-05:00")
public class SubscriptionPlanResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("billing_cycle_length")
  private Integer billingCycleLength = null;

  /**
   * The time period unit to apply to the length of billing cycles
   */
  public enum BillingCycleUnitEnum {
    @SerializedName("millisecond")
    MILLISECOND("millisecond"),
    
    @SerializedName("second")
    SECOND("second"),
    
    @SerializedName("minute")
    MINUTE("minute"),
    
    @SerializedName("hour")
    HOUR("hour"),
    
    @SerializedName("day")
    DAY("day"),
    
    @SerializedName("week")
    WEEK("week"),
    
    @SerializedName("month")
    MONTH("month"),
    
    @SerializedName("year")
    YEAR("year");

    private String value;

    BillingCycleUnitEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("billing_cycle_unit")
  private BillingCycleUnitEnum billingCycleUnit = null;

  @SerializedName("consolidated")
  private Boolean consolidated = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("end_date")
  private Long endDate = null;

  @SerializedName("first_billing_cycle_length")
  private Integer firstBillingCycleLength = null;

  /**
   * The time period unit to apply to the length of the first billing cycle. Required when first_billing_cycle_length is specified
   */
  public enum FirstBillingCycleUnitEnum {
    @SerializedName("millisecond")
    MILLISECOND("millisecond"),
    
    @SerializedName("second")
    SECOND("second"),
    
    @SerializedName("minute")
    MINUTE("minute"),
    
    @SerializedName("hour")
    HOUR("hour"),
    
    @SerializedName("day")
    DAY("day"),
    
    @SerializedName("week")
    WEEK("week"),
    
    @SerializedName("month")
    MONTH("month"),
    
    @SerializedName("year")
    YEAR("year");

    private String value;

    FirstBillingCycleUnitEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("first_billing_cycle_unit")
  private FirstBillingCycleUnitEnum firstBillingCycleUnit = null;

  @SerializedName("grace_period")
  private Integer gracePeriod = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("initial_fee")
  private Double initialFee = null;

  @SerializedName("initial_sku")
  private String initialSku = null;

  @SerializedName("late_payment_fee")
  private Double latePaymentFee = null;

  @SerializedName("late_payment_sku")
  private String latePaymentSku = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("max_bill_attempts")
  private Integer maxBillAttempts = null;

  @SerializedName("max_cycles")
  private Integer maxCycles = null;

  @SerializedName("migrate_to_plan")
  private String migrateToPlan = null;

  @SerializedName("min_cycles")
  private Integer minCycles = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("reactivation_fee")
  private Double reactivationFee = null;

  @SerializedName("reactivation_sku")
  private String reactivationSku = null;

  @SerializedName("recurring_fee")
  private Double recurringFee = null;

  @SerializedName("recurring_sku")
  private String recurringSku = null;

  @SerializedName("start_date")
  private Long startDate = null;

  public SubscriptionPlanResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public SubscriptionPlanResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this subscription
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this subscription")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public SubscriptionPlanResource billingCycleLength(Integer billingCycleLength) {
    this.billingCycleLength = billingCycleLength;
    return this;
  }

   /**
   * The length of the billing cycle in number of billing cycle unit
   * @return billingCycleLength
  **/
  @ApiModelProperty(example = "null", required = true, value = "The length of the billing cycle in number of billing cycle unit")
  public Integer getBillingCycleLength() {
    return billingCycleLength;
  }

  public void setBillingCycleLength(Integer billingCycleLength) {
    this.billingCycleLength = billingCycleLength;
  }

  public SubscriptionPlanResource billingCycleUnit(BillingCycleUnitEnum billingCycleUnit) {
    this.billingCycleUnit = billingCycleUnit;
    return this;
  }

   /**
   * The time period unit to apply to the length of billing cycles
   * @return billingCycleUnit
  **/
  @ApiModelProperty(example = "null", required = true, value = "The time period unit to apply to the length of billing cycles")
  public BillingCycleUnitEnum getBillingCycleUnit() {
    return billingCycleUnit;
  }

  public void setBillingCycleUnit(BillingCycleUnitEnum billingCycleUnit) {
    this.billingCycleUnit = billingCycleUnit;
  }

  public SubscriptionPlanResource consolidated(Boolean consolidated) {
    this.consolidated = consolidated;
    return this;
  }

   /**
   * Whether this plan will be renewed on the consolidated billing cycle
   * @return consolidated
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether this plan will be renewed on the consolidated billing cycle")
  public Boolean getConsolidated() {
    return consolidated;
  }

  public void setConsolidated(Boolean consolidated) {
    this.consolidated = consolidated;
  }

  public SubscriptionPlanResource currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The ISO3 currency code to use for the fees
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "The ISO3 currency code to use for the fees")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public SubscriptionPlanResource endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Used to schedule plan availability end date
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "Used to schedule plan availability end date")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public SubscriptionPlanResource firstBillingCycleLength(Integer firstBillingCycleLength) {
    this.firstBillingCycleLength = firstBillingCycleLength;
    return this;
  }

   /**
   * Optional override for the length of the first billing cycle before the first recurring billing
   * @return firstBillingCycleLength
  **/
  @ApiModelProperty(example = "null", value = "Optional override for the length of the first billing cycle before the first recurring billing")
  public Integer getFirstBillingCycleLength() {
    return firstBillingCycleLength;
  }

  public void setFirstBillingCycleLength(Integer firstBillingCycleLength) {
    this.firstBillingCycleLength = firstBillingCycleLength;
  }

  public SubscriptionPlanResource firstBillingCycleUnit(FirstBillingCycleUnitEnum firstBillingCycleUnit) {
    this.firstBillingCycleUnit = firstBillingCycleUnit;
    return this;
  }

   /**
   * The time period unit to apply to the length of the first billing cycle. Required when first_billing_cycle_length is specified
   * @return firstBillingCycleUnit
  **/
  @ApiModelProperty(example = "null", value = "The time period unit to apply to the length of the first billing cycle. Required when first_billing_cycle_length is specified")
  public FirstBillingCycleUnitEnum getFirstBillingCycleUnit() {
    return firstBillingCycleUnit;
  }

  public void setFirstBillingCycleUnit(FirstBillingCycleUnitEnum firstBillingCycleUnit) {
    this.firstBillingCycleUnit = firstBillingCycleUnit;
  }

  public SubscriptionPlanResource gracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

   /**
   * The number of late payment days before a subscription is canceled
   * @return gracePeriod
  **/
  @ApiModelProperty(example = "null", required = true, value = "The number of late payment days before a subscription is canceled")
  public Integer getGracePeriod() {
    return gracePeriod;
  }

  public void setGracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public SubscriptionPlanResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the plan used to generate the SKUs
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the plan used to generate the SKUs")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubscriptionPlanResource initialFee(Double initialFee) {
    this.initialFee = initialFee;
    return this;
  }

   /**
   * The fee charged when the subscription is purchased
   * @return initialFee
  **/
  @ApiModelProperty(example = "null", required = true, value = "The fee charged when the subscription is purchased")
  public Double getInitialFee() {
    return initialFee;
  }

  public void setInitialFee(Double initialFee) {
    this.initialFee = initialFee;
  }

   /**
   * The SKU to be used when purchasing the subscription through the cart
   * @return initialSku
  **/
  @ApiModelProperty(example = "null", value = "The SKU to be used when purchasing the subscription through the cart")
  public String getInitialSku() {
    return initialSku;
  }

  public SubscriptionPlanResource latePaymentFee(Double latePaymentFee) {
    this.latePaymentFee = latePaymentFee;
    return this;
  }

   /**
   * The fee to add to the bill when an invoice has gone unpaid passed the grace period
   * @return latePaymentFee
  **/
  @ApiModelProperty(example = "null", required = true, value = "The fee to add to the bill when an invoice has gone unpaid passed the grace period")
  public Double getLatePaymentFee() {
    return latePaymentFee;
  }

  public void setLatePaymentFee(Double latePaymentFee) {
    this.latePaymentFee = latePaymentFee;
  }

   /**
   * The SKU that will show on the invoice when the subscription is delinquent
   * @return latePaymentSku
  **/
  @ApiModelProperty(example = "null", value = "The SKU that will show on the invoice when the subscription is delinquent")
  public String getLatePaymentSku() {
    return latePaymentSku;
  }

   /**
   * Whether this plan is locked because it has been purchased by at least one user.  When locked, a number of properties can no longer be changed
   * @return locked
  **/
  @ApiModelProperty(example = "false", value = "Whether this plan is locked because it has been purchased by at least one user.  When locked, a number of properties can no longer be changed")
  public Boolean getLocked() {
    return locked;
  }

  public SubscriptionPlanResource maxBillAttempts(Integer maxBillAttempts) {
    this.maxBillAttempts = maxBillAttempts;
    return this;
  }

   /**
   * The number of charge attempts before the subscription becomes delinquent
   * @return maxBillAttempts
  **/
  @ApiModelProperty(example = "null", required = true, value = "The number of charge attempts before the subscription becomes delinquent")
  public Integer getMaxBillAttempts() {
    return maxBillAttempts;
  }

  public void setMaxBillAttempts(Integer maxBillAttempts) {
    this.maxBillAttempts = maxBillAttempts;
  }

  public SubscriptionPlanResource maxCycles(Integer maxCycles) {
    this.maxCycles = maxCycles;
    return this;
  }

   /**
   * Maximum number of renewals. If a migration plan is provided, the subscription will automatically switch to it when this limit is reached
   * @return maxCycles
  **/
  @ApiModelProperty(example = "null", value = "Maximum number of renewals. If a migration plan is provided, the subscription will automatically switch to it when this limit is reached")
  public Integer getMaxCycles() {
    return maxCycles;
  }

  public void setMaxCycles(Integer maxCycles) {
    this.maxCycles = maxCycles;
  }

  public SubscriptionPlanResource migrateToPlan(String migrateToPlan) {
    this.migrateToPlan = migrateToPlan;
    return this;
  }

   /**
   * Automatically migrate to the specified plan when the subscription is first renewed
   * @return migrateToPlan
  **/
  @ApiModelProperty(example = "null", value = "Automatically migrate to the specified plan when the subscription is first renewed")
  public String getMigrateToPlan() {
    return migrateToPlan;
  }

  public void setMigrateToPlan(String migrateToPlan) {
    this.migrateToPlan = migrateToPlan;
  }

  public SubscriptionPlanResource minCycles(Integer minCycles) {
    this.minCycles = minCycles;
    return this;
  }

   /**
   * The minimum number of renewals to charge for
   * @return minCycles
  **/
  @ApiModelProperty(example = "null", value = "The minimum number of renewals to charge for")
  public Integer getMinCycles() {
    return minCycles;
  }

  public void setMinCycles(Integer minCycles) {
    this.minCycles = minCycles;
  }

  public SubscriptionPlanResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the plan used to generate the SKUs
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the plan used to generate the SKUs")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionPlanResource published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Whether this plan is currently available
   * @return published
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether this plan is currently available")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public SubscriptionPlanResource reactivationFee(Double reactivationFee) {
    this.reactivationFee = reactivationFee;
    return this;
  }

   /**
   * The fee to charge when a suspended subscription is to be re-activated
   * @return reactivationFee
  **/
  @ApiModelProperty(example = "null", required = true, value = "The fee to charge when a suspended subscription is to be re-activated")
  public Double getReactivationFee() {
    return reactivationFee;
  }

  public void setReactivationFee(Double reactivationFee) {
    this.reactivationFee = reactivationFee;
  }

   /**
   * The SKU that will show on the invoice when the subscription is re-activated after a suspension
   * @return reactivationSku
  **/
  @ApiModelProperty(example = "null", value = "The SKU that will show on the invoice when the subscription is re-activated after a suspension")
  public String getReactivationSku() {
    return reactivationSku;
  }

  public SubscriptionPlanResource recurringFee(Double recurringFee) {
    this.recurringFee = recurringFee;
    return this;
  }

   /**
   * The recurring fee to charge for each renewal
   * @return recurringFee
  **/
  @ApiModelProperty(example = "null", required = true, value = "The recurring fee to charge for each renewal")
  public Double getRecurringFee() {
    return recurringFee;
  }

  public void setRecurringFee(Double recurringFee) {
    this.recurringFee = recurringFee;
  }

   /**
   * The SKU that will show on the invoice when the subscription is activated
   * @return recurringSku
  **/
  @ApiModelProperty(example = "null", value = "The SKU that will show on the invoice when the subscription is activated")
  public String getRecurringSku() {
    return recurringSku;
  }

  public SubscriptionPlanResource startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Used to schedule plan availability start date
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "Used to schedule plan availability start date")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPlanResource subscriptionPlanResource = (SubscriptionPlanResource) o;
    return Objects.equals(this.additionalProperties, subscriptionPlanResource.additionalProperties) &&
        Objects.equals(this.billingCycleLength, subscriptionPlanResource.billingCycleLength) &&
        Objects.equals(this.billingCycleUnit, subscriptionPlanResource.billingCycleUnit) &&
        Objects.equals(this.consolidated, subscriptionPlanResource.consolidated) &&
        Objects.equals(this.currencyCode, subscriptionPlanResource.currencyCode) &&
        Objects.equals(this.endDate, subscriptionPlanResource.endDate) &&
        Objects.equals(this.firstBillingCycleLength, subscriptionPlanResource.firstBillingCycleLength) &&
        Objects.equals(this.firstBillingCycleUnit, subscriptionPlanResource.firstBillingCycleUnit) &&
        Objects.equals(this.gracePeriod, subscriptionPlanResource.gracePeriod) &&
        Objects.equals(this.id, subscriptionPlanResource.id) &&
        Objects.equals(this.initialFee, subscriptionPlanResource.initialFee) &&
        Objects.equals(this.initialSku, subscriptionPlanResource.initialSku) &&
        Objects.equals(this.latePaymentFee, subscriptionPlanResource.latePaymentFee) &&
        Objects.equals(this.latePaymentSku, subscriptionPlanResource.latePaymentSku) &&
        Objects.equals(this.locked, subscriptionPlanResource.locked) &&
        Objects.equals(this.maxBillAttempts, subscriptionPlanResource.maxBillAttempts) &&
        Objects.equals(this.maxCycles, subscriptionPlanResource.maxCycles) &&
        Objects.equals(this.migrateToPlan, subscriptionPlanResource.migrateToPlan) &&
        Objects.equals(this.minCycles, subscriptionPlanResource.minCycles) &&
        Objects.equals(this.name, subscriptionPlanResource.name) &&
        Objects.equals(this.published, subscriptionPlanResource.published) &&
        Objects.equals(this.reactivationFee, subscriptionPlanResource.reactivationFee) &&
        Objects.equals(this.reactivationSku, subscriptionPlanResource.reactivationSku) &&
        Objects.equals(this.recurringFee, subscriptionPlanResource.recurringFee) &&
        Objects.equals(this.recurringSku, subscriptionPlanResource.recurringSku) &&
        Objects.equals(this.startDate, subscriptionPlanResource.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, billingCycleLength, billingCycleUnit, consolidated, currencyCode, endDate, firstBillingCycleLength, firstBillingCycleUnit, gracePeriod, id, initialFee, initialSku, latePaymentFee, latePaymentSku, locked, maxBillAttempts, maxCycles, migrateToPlan, minCycles, name, published, reactivationFee, reactivationSku, recurringFee, recurringSku, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlanResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    billingCycleLength: ").append(toIndentedString(billingCycleLength)).append("\n");
    sb.append("    billingCycleUnit: ").append(toIndentedString(billingCycleUnit)).append("\n");
    sb.append("    consolidated: ").append(toIndentedString(consolidated)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    firstBillingCycleLength: ").append(toIndentedString(firstBillingCycleLength)).append("\n");
    sb.append("    firstBillingCycleUnit: ").append(toIndentedString(firstBillingCycleUnit)).append("\n");
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initialFee: ").append(toIndentedString(initialFee)).append("\n");
    sb.append("    initialSku: ").append(toIndentedString(initialSku)).append("\n");
    sb.append("    latePaymentFee: ").append(toIndentedString(latePaymentFee)).append("\n");
    sb.append("    latePaymentSku: ").append(toIndentedString(latePaymentSku)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    maxBillAttempts: ").append(toIndentedString(maxBillAttempts)).append("\n");
    sb.append("    maxCycles: ").append(toIndentedString(maxCycles)).append("\n");
    sb.append("    migrateToPlan: ").append(toIndentedString(migrateToPlan)).append("\n");
    sb.append("    minCycles: ").append(toIndentedString(minCycles)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    reactivationFee: ").append(toIndentedString(reactivationFee)).append("\n");
    sb.append("    reactivationSku: ").append(toIndentedString(reactivationSku)).append("\n");
    sb.append("    recurringFee: ").append(toIndentedString(recurringFee)).append("\n");
    sb.append("    recurringSku: ").append(toIndentedString(recurringSku)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

