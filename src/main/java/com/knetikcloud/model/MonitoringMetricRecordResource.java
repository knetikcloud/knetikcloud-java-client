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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MonitoringMetricRecordResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T13:11:52.660-05:00")
public class MonitoringMetricRecordResource {
  @JsonProperty("dimensions")
  private Map<String, String> dimensions = null;

  public MonitoringMetricRecordResource dimensions(Map<String, String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public MonitoringMetricRecordResource putDimensionsItem(String key, String dimensionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringMetricRecordResource monitoringMetricRecordResource = (MonitoringMetricRecordResource) o;
    return Objects.equals(this.dimensions, monitoringMetricRecordResource.dimensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringMetricRecordResource {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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

