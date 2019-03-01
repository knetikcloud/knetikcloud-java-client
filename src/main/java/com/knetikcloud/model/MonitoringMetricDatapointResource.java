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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MonitoringMetricDatapointResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-01T09:23:20.387-05:00")
public class MonitoringMetricDatapointResource {
  @JsonProperty("dimensions")
  private Map<String, String> dimensions = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("timestamp")
  private Long timestamp = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  public MonitoringMetricDatapointResource dimensions(Map<String, String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public MonitoringMetricDatapointResource putDimensionsItem(String key, String dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new HashMap<String, String>();
    }
    this.dimensions.put(key, dimensionsItem);
    return this;
  }

   /**
   * Dimensions giving context to the datapoint. Map of keys to values (example: {\&quot;location\&quot;: \&quot;USA\&quot;, \&quot;user\&quot;: \&quot;75\&quot;}). Cannot include the | symbol
   * @return dimensions
  **/
  @ApiModelProperty(value = "Dimensions giving context to the datapoint. Map of keys to values (example: {\"location\": \"USA\", \"user\": \"75\"}). Cannot include the | symbol")
  public Map<String, String> getDimensions() {
    return dimensions;
  }

  public void setDimensions(Map<String, String> dimensions) {
    this.dimensions = dimensions;
  }

  public MonitoringMetricDatapointResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the metric. Required for batch endpoint
   * @return id
  **/
  @ApiModelProperty(value = "The id of the metric. Required for batch endpoint")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MonitoringMetricDatapointResource timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The unix timestamp in seconds the datapoint occurred, default: now
   * @return timestamp
  **/
  @ApiModelProperty(value = "The unix timestamp in seconds the datapoint occurred, default: now")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public MonitoringMetricDatapointResource value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the datapoint
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the datapoint")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringMetricDatapointResource monitoringMetricDatapointResource = (MonitoringMetricDatapointResource) o;
    return Objects.equals(this.dimensions, monitoringMetricDatapointResource.dimensions) &&
        Objects.equals(this.id, monitoringMetricDatapointResource.id) &&
        Objects.equals(this.timestamp, monitoringMetricDatapointResource.timestamp) &&
        Objects.equals(this.value, monitoringMetricDatapointResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, id, timestamp, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringMetricDatapointResource {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

