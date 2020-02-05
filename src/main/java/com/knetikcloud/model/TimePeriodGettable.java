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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TimePeriodGettable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")
public class TimePeriodGettable extends Behavior {
  @JsonProperty("get_limit")
  private Integer getLimit = null;

  @JsonProperty("group_name")
  private String groupName = null;

  @JsonProperty("time_length")
  private Integer timeLength = null;

  @JsonProperty("unit_of_time")
  private String unitOfTime = null;

  public TimePeriodGettable getLimit(Integer getLimit) {
    this.getLimit = getLimit;
    return this;
  }

   /**
   * The time period limit
   * @return getLimit
  **/
  @ApiModelProperty(required = true, value = "The time period limit")
  public Integer getGetLimit() {
    return getLimit;
  }

  public void setGetLimit(Integer getLimit) {
    this.getLimit = getLimit;
  }

  public TimePeriodGettable groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * The name of a group of items. Multiple items with the same group name will be limited together, leave null to be assigned a random unique name. It is typical that the other properties here will be the same for all, but this is not enforced and the item being recieved will use its settings.
   * @return groupName
  **/
  @ApiModelProperty(value = "The name of a group of items. Multiple items with the same group name will be limited together, leave null to be assigned a random unique name. It is typical that the other properties here will be the same for all, but this is not enforced and the item being recieved will use its settings.")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public TimePeriodGettable timeLength(Integer timeLength) {
    this.timeLength = timeLength;
    return this;
  }

   /**
   * The length of time
   * @return timeLength
  **/
  @ApiModelProperty(required = true, value = "The length of time")
  public Integer getTimeLength() {
    return timeLength;
  }

  public void setTimeLength(Integer timeLength) {
    this.timeLength = timeLength;
  }

  public TimePeriodGettable unitOfTime(String unitOfTime) {
    this.unitOfTime = unitOfTime;
    return this;
  }

   /**
   * The unit of time
   * @return unitOfTime
  **/
  @ApiModelProperty(required = true, value = "The unit of time")
  public String getUnitOfTime() {
    return unitOfTime;
  }

  public void setUnitOfTime(String unitOfTime) {
    this.unitOfTime = unitOfTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriodGettable timePeriodGettable = (TimePeriodGettable) o;
    return Objects.equals(this.getLimit, timePeriodGettable.getLimit) &&
        Objects.equals(this.groupName, timePeriodGettable.groupName) &&
        Objects.equals(this.timeLength, timePeriodGettable.timeLength) &&
        Objects.equals(this.unitOfTime, timePeriodGettable.unitOfTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getLimit, groupName, timeLength, unitOfTime, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriodGettable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    getLimit: ").append(toIndentedString(getLimit)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    timeLength: ").append(toIndentedString(timeLength)).append("\n");
    sb.append("    unitOfTime: ").append(toIndentedString(unitOfTime)).append("\n");
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

