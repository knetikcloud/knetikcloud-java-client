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
 * BareChallengeActivityResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-09T10:26:02.967-04:00")
public class BareChallengeActivityResource {
  @JsonProperty("activity_id")
  private Long activityId = null;

  @JsonProperty("challenge_id")
  private Long challengeId = null;

  @JsonProperty("id")
  private Long id = null;

  public BareChallengeActivityResource activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The id of the activity
   * @return activityId
  **/
  @ApiModelProperty(required = true, value = "The id of the activity")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public BareChallengeActivityResource challengeId(Long challengeId) {
    this.challengeId = challengeId;
    return this;
  }

   /**
   * The id of the challenge
   * @return challengeId
  **/
  @ApiModelProperty(required = true, value = "The id of the challenge")
  public Long getChallengeId() {
    return challengeId;
  }

  public void setChallengeId(Long challengeId) {
    this.challengeId = challengeId;
  }

   /**
   * The unique ID for this resource
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for this resource")
  public Long getId() {
    return id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BareChallengeActivityResource bareChallengeActivityResource = (BareChallengeActivityResource) o;
    return Objects.equals(this.activityId, bareChallengeActivityResource.activityId) &&
        Objects.equals(this.challengeId, bareChallengeActivityResource.challengeId) &&
        Objects.equals(this.id, bareChallengeActivityResource.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, challengeId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BareChallengeActivityResource {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

