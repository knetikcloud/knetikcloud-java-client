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
import java.util.List;

/**
 * MonitoringMetricResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-05T10:20:50.333-04:00")
public class MonitoringMetricResource {
  @JsonProperty("dimension_keys")
  private List<String> dimensionKeys = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * The type of metric.  Cannot be updated once set.  counter: a cumulative metric that represents a single monotonically increasing counter whose value can only increase or be reset to zero on restart.  delta: a metric to track the change in value of another gauge metric once started.  gauge: a metric that represents a single numerical value that can arbitrarily go up and down.  timer: a metric that functions as a running timer once started.
   */
  public enum MetricTypeEnum {
    COUNTER("counter"),
    
    GAUGE("gauge");

    private String value;

    MetricTypeEnum(String value) {
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
    public static MetricTypeEnum fromValue(String text) {
      for (MetricTypeEnum b : MetricTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("metric_type")
  private MetricTypeEnum metricType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parent_metric_id")
  private String parentMetricId = null;

  public MonitoringMetricResource dimensionKeys(List<String> dimensionKeys) {
    this.dimensionKeys = dimensionKeys;
    return this;
  }

  public MonitoringMetricResource addDimensionKeysItem(String dimensionKeysItem) {
    if (this.dimensionKeys == null) {
      this.dimensionKeys = new ArrayList<String>();
    }
    this.dimensionKeys.add(dimensionKeysItem);
    return this;
  }

   /**
   * The sets of dimensions that datapoints may be recorded with (each datapoint must have dimensions keys exactly matching this set)
   * @return dimensionKeys
  **/
  @ApiModelProperty(value = "The sets of dimensions that datapoints may be recorded with (each datapoint must have dimensions keys exactly matching this set)")
  public List<String> getDimensionKeys() {
    return dimensionKeys;
  }

  public void setDimensionKeys(List<String> dimensionKeys) {
    this.dimensionKeys = dimensionKeys;
  }

  public MonitoringMetricResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the metric. Cannot be changed
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the metric. Cannot be changed")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MonitoringMetricResource metricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
    return this;
  }

   /**
   * The type of metric.  Cannot be updated once set.  counter: a cumulative metric that represents a single monotonically increasing counter whose value can only increase or be reset to zero on restart.  delta: a metric to track the change in value of another gauge metric once started.  gauge: a metric that represents a single numerical value that can arbitrarily go up and down.  timer: a metric that functions as a running timer once started.
   * @return metricType
  **/
  @ApiModelProperty(required = true, value = "The type of metric.  Cannot be updated once set.  counter: a cumulative metric that represents a single monotonically increasing counter whose value can only increase or be reset to zero on restart.  delta: a metric to track the change in value of another gauge metric once started.  gauge: a metric that represents a single numerical value that can arbitrarily go up and down.  timer: a metric that functions as a running timer once started.")
  public MetricTypeEnum getMetricType() {
    return metricType;
  }

  public void setMetricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
  }

  public MonitoringMetricResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the metric, for display purposes. Will default if not provided
   * @return name
  **/
  @ApiModelProperty(value = "The name of the metric, for display purposes. Will default if not provided")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MonitoringMetricResource parentMetricId(String parentMetricId) {
    this.parentMetricId = parentMetricId;
    return this;
  }

   /**
   * The id of the parent metric.  Cannot be updated once set.  Needed for delta metrics only.
   * @return parentMetricId
  **/
  @ApiModelProperty(value = "The id of the parent metric.  Cannot be updated once set.  Needed for delta metrics only.")
  public String getParentMetricId() {
    return parentMetricId;
  }

  public void setParentMetricId(String parentMetricId) {
    this.parentMetricId = parentMetricId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringMetricResource monitoringMetricResource = (MonitoringMetricResource) o;
    return Objects.equals(this.dimensionKeys, monitoringMetricResource.dimensionKeys) &&
        Objects.equals(this.id, monitoringMetricResource.id) &&
        Objects.equals(this.metricType, monitoringMetricResource.metricType) &&
        Objects.equals(this.name, monitoringMetricResource.name) &&
        Objects.equals(this.parentMetricId, monitoringMetricResource.parentMetricId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionKeys, id, metricType, name, parentMetricId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringMetricResource {\n");
    
    sb.append("    dimensionKeys: ").append(toIndentedString(dimensionKeys)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentMetricId: ").append(toIndentedString(parentMetricId)).append("\n");
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

