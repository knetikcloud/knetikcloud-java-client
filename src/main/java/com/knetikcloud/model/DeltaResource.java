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
 * DeltaResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T13:21:30.157-04:00")
public class DeltaResource {
  @JsonProperty("category_id")
  private String categoryId = null;

  @JsonProperty("media_type")
  private String mediaType = null;

  @JsonProperty("question_id")
  private String questionId = null;

  /**
   * Whether the question was updated or removed
   */
  public enum StateEnum {
    UPDATED("UPDATED"),
    
    REMOVED("REMOVED");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  public DeltaResource categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The id of the category for question
   * @return categoryId
  **/
  @ApiModelProperty(value = "The id of the category for question")
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public DeltaResource mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The media type of the question
   * @return mediaType
  **/
  @ApiModelProperty(value = "The media type of the question")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public DeltaResource questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }

   /**
   * The id of the question
   * @return questionId
  **/
  @ApiModelProperty(value = "The id of the question")
  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  public DeltaResource state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Whether the question was updated or removed
   * @return state
  **/
  @ApiModelProperty(value = "Whether the question was updated or removed")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public DeltaResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DeltaResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags for the question
   * @return tags
  **/
  @ApiModelProperty(value = "The tags for the question")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public DeltaResource updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * The date this question was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date this question was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeltaResource deltaResource = (DeltaResource) o;
    return Objects.equals(this.categoryId, deltaResource.categoryId) &&
        Objects.equals(this.mediaType, deltaResource.mediaType) &&
        Objects.equals(this.questionId, deltaResource.questionId) &&
        Objects.equals(this.state, deltaResource.state) &&
        Objects.equals(this.tags, deltaResource.tags) &&
        Objects.equals(this.updatedDate, deltaResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, mediaType, questionId, state, tags, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeltaResource {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

