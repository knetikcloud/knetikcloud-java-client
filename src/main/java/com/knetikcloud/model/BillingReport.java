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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BillingReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-18T00:47:55.457-04:00")
public class BillingReport {
  @JsonProperty("created")
  private Long created = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("last_known_failures")
  private List<String> lastKnownFailures = null;

  @JsonProperty("statistics")
  private Map<String, Integer> statistics = null;

  public BillingReport created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public BillingReport id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingReport lastKnownFailures(List<String> lastKnownFailures) {
    this.lastKnownFailures = lastKnownFailures;
    return this;
  }

  public BillingReport addLastKnownFailuresItem(String lastKnownFailuresItem) {
    if (this.lastKnownFailures == null) {
      this.lastKnownFailures = new ArrayList<String>();
    }
    this.lastKnownFailures.add(lastKnownFailuresItem);
    return this;
  }

   /**
   * Get lastKnownFailures
   * @return lastKnownFailures
  **/
  @ApiModelProperty(value = "")
  public List<String> getLastKnownFailures() {
    return lastKnownFailures;
  }

  public void setLastKnownFailures(List<String> lastKnownFailures) {
    this.lastKnownFailures = lastKnownFailures;
  }

  public BillingReport statistics(Map<String, Integer> statistics) {
    this.statistics = statistics;
    return this;
  }

  public BillingReport putStatisticsItem(String key, Integer statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new HashMap<String, Integer>();
    }
    this.statistics.put(key, statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(value = "")
  public Map<String, Integer> getStatistics() {
    return statistics;
  }

  public void setStatistics(Map<String, Integer> statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingReport billingReport = (BillingReport) o;
    return Objects.equals(this.created, billingReport.created) &&
        Objects.equals(this.id, billingReport.id) &&
        Objects.equals(this.lastKnownFailures, billingReport.lastKnownFailures) &&
        Objects.equals(this.statistics, billingReport.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, id, lastKnownFailures, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingReport {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastKnownFailures: ").append(toIndentedString(lastKnownFailures)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

