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

/**
 * UserAchievementResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class UserAchievementResource {
  @JsonProperty("achieved")
  private Boolean achieved = null;

  @JsonProperty("achievement_name")
  private String achievementName = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("earned_date")
  private Long earnedDate = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

   /**
   * Flag indicating whether the user has earned the achievement
   * @return achieved
  **/
  @ApiModelProperty(example = "false", value = "Flag indicating whether the user has earned the achievement")
  public Boolean isAchieved() {
    return achieved;
  }

  public UserAchievementResource achievementName(String achievementName) {
    this.achievementName = achievementName;
    return this;
  }

   /**
   * The achievement being tracked.  If used for Leveling, this represents the tier name
   * @return achievementName
  **/
  @ApiModelProperty(required = true, value = "The achievement being tracked.  If used for Leveling, this represents the tier name")
  public String getAchievementName() {
    return achievementName;
  }

  public void setAchievementName(String achievementName) {
    this.achievementName = achievementName;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The date/time the achievement was earned as a unix timestamp in seconds
   * @return earnedDate
  **/
  @ApiModelProperty(value = "The date/time the achievement was earned as a unix timestamp in seconds")
  public Long getEarnedDate() {
    return earnedDate;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAchievementResource userAchievementResource = (UserAchievementResource) o;
    return Objects.equals(this.achieved, userAchievementResource.achieved) &&
        Objects.equals(this.achievementName, userAchievementResource.achievementName) &&
        Objects.equals(this.createdDate, userAchievementResource.createdDate) &&
        Objects.equals(this.earnedDate, userAchievementResource.earnedDate) &&
        Objects.equals(this.updatedDate, userAchievementResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achieved, achievementName, createdDate, earnedDate, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAchievementResource {\n");
    
    sb.append("    achieved: ").append(toIndentedString(achieved)).append("\n");
    sb.append("    achievementName: ").append(toIndentedString(achievementName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    earnedDate: ").append(toIndentedString(earnedDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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
