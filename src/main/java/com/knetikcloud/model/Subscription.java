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
import com.knetikcloud.model.Sku;
import com.knetikcloud.model.StoreItem;
import com.knetikcloud.model.SubscriptionPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Subscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-10T16:28:25.565-04:00")
public class Subscription extends StoreItem {
  /**
   * Gets or Sets availability
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

  @JsonProperty("consolidation_day_of_month")
  private Integer consolidationDayOfMonth = null;

  @JsonProperty("subscription_plans")
  private List<SubscriptionPlan> subscriptionPlans = null;

  public Subscription availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  public Subscription consolidationDayOfMonth(Integer consolidationDayOfMonth) {
    this.consolidationDayOfMonth = consolidationDayOfMonth;
    return this;
  }

   /**
   * Get consolidationDayOfMonth
   * @return consolidationDayOfMonth
  **/
  @ApiModelProperty(value = "")
  public Integer getConsolidationDayOfMonth() {
    return consolidationDayOfMonth;
  }

  public void setConsolidationDayOfMonth(Integer consolidationDayOfMonth) {
    this.consolidationDayOfMonth = consolidationDayOfMonth;
  }

  public Subscription subscriptionPlans(List<SubscriptionPlan> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
    return this;
  }

  public Subscription addSubscriptionPlansItem(SubscriptionPlan subscriptionPlansItem) {
    if (this.subscriptionPlans == null) {
      this.subscriptionPlans = new ArrayList<SubscriptionPlan>();
    }
    this.subscriptionPlans.add(subscriptionPlansItem);
    return this;
  }

   /**
   * Get subscriptionPlans
   * @return subscriptionPlans
  **/
  @ApiModelProperty(value = "")
  public List<SubscriptionPlan> getSubscriptionPlans() {
    return subscriptionPlans;
  }

  public void setSubscriptionPlans(List<SubscriptionPlan> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.availability, subscription.availability) &&
        Objects.equals(this.consolidationDayOfMonth, subscription.consolidationDayOfMonth) &&
        Objects.equals(this.subscriptionPlans, subscription.subscriptionPlans) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, consolidationDayOfMonth, subscriptionPlans, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    consolidationDayOfMonth: ").append(toIndentedString(consolidationDayOfMonth)).append("\n");
    sb.append("    subscriptionPlans: ").append(toIndentedString(subscriptionPlans)).append("\n");
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

