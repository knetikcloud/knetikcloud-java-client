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
 * MetricResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:12:34.695-05:00")
public class MetricResource {
  @JsonProperty("activity_occurence_id")
  private Long activityOccurenceId = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("user_id")
  private Integer userId = null;

  @JsonProperty("value")
  private Long value = null;

  public MetricResource activityOccurenceId(Long activityOccurenceId) {
    this.activityOccurenceId = activityOccurenceId;
    return this;
  }

   /**
   * The id of the activity occurence where this score/metric occurred
   * @return activityOccurenceId
  **/
  @ApiModelProperty(required = true, value = "The id of the activity occurence where this score/metric occurred")
  public Long getActivityOccurenceId() {
    return activityOccurenceId;
  }

  public void setActivityOccurenceId(Long activityOccurenceId) {
    this.activityOccurenceId = activityOccurenceId;
  }

  public MetricResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MetricResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 10 tags and 50 characters each
   * @return tags
  **/
  @ApiModelProperty(value = "Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 10 tags and 50 characters each")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public MetricResource userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user this metric is for. Default to caller and requires METRICS_ADMIN permission to specify another
   * @return userId
  **/
  @ApiModelProperty(value = "The id of the user this metric is for. Default to caller and requires METRICS_ADMIN permission to specify another")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public MetricResource value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * The value/score of the metric
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value/score of the metric")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
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
    MetricResource metricResource = (MetricResource) o;
    return Objects.equals(this.activityOccurenceId, metricResource.activityOccurenceId) &&
        Objects.equals(this.tags, metricResource.tags) &&
        Objects.equals(this.userId, metricResource.userId) &&
        Objects.equals(this.value, metricResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityOccurenceId, tags, userId, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricResource {\n");
    
    sb.append("    activityOccurenceId: ").append(toIndentedString(activityOccurenceId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

