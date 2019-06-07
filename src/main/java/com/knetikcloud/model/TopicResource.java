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
 * TopicResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T13:18:12.930-04:00")
public class TopicResource {
  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("locked")
  private Boolean locked = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  @JsonProperty("user_count")
  private Integer userCount = null;

  public TopicResource createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * The created date of the topic
   * @return createdDate
  **/
  @ApiModelProperty(value = "The created date of the topic")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public TopicResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the topic
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name of the topic")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public TopicResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for this topic
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for this topic")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TopicResource locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Whether this topic is locked or not.
   * @return locked
  **/
  @ApiModelProperty(example = "false", value = "Whether this topic is locked or not.")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public TopicResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TopicResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Random tags to facilitate search
   * @return tags
  **/
  @ApiModelProperty(value = "Random tags to facilitate search")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public TopicResource updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * The last time the topic was updated
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The last time the topic was updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public TopicResource userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * The subscribed user count of the topic
   * @return userCount
  **/
  @ApiModelProperty(value = "The subscribed user count of the topic")
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicResource topicResource = (TopicResource) o;
    return Objects.equals(this.createdDate, topicResource.createdDate) &&
        Objects.equals(this.displayName, topicResource.displayName) &&
        Objects.equals(this.id, topicResource.id) &&
        Objects.equals(this.locked, topicResource.locked) &&
        Objects.equals(this.tags, topicResource.tags) &&
        Objects.equals(this.updatedDate, topicResource.updatedDate) &&
        Objects.equals(this.userCount, topicResource.userCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, displayName, id, locked, tags, updatedDate, userCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicResource {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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

