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
 * UserActivityResultsResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T09:36:00.854-05:00")
public class UserActivityResultsResource {
  @JsonProperty("score")
  private Long score = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("user_id")
  private Integer userId = null;

  public UserActivityResultsResource score(Long score) {
    this.score = score;
    return this;
  }

   /**
   * The raw score. Null means non-compete or disqualification
   * @return score
  **/
  @ApiModelProperty(value = "The raw score. Null means non-compete or disqualification")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public UserActivityResultsResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UserActivityResultsResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each
   * @return tags
  **/
  @ApiModelProperty(value = "Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public UserActivityResultsResource userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the player
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The id of the player")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivityResultsResource userActivityResultsResource = (UserActivityResultsResource) o;
    return Objects.equals(this.score, userActivityResultsResource.score) &&
        Objects.equals(this.tags, userActivityResultsResource.tags) &&
        Objects.equals(this.userId, userActivityResultsResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, tags, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityResultsResource {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

