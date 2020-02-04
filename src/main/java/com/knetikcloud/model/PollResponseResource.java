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
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PollResponseResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-04T16:12:34.695-05:00")
public class PollResponseResource {
  @JsonProperty("answer")
  private String answer = null;

  @JsonProperty("answered_date")
  private Long answeredDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("poll_id")
  private String pollId = null;

  @JsonProperty("user")
  private SimpleUserResource user = null;

  public PollResponseResource answer(String answer) {
    this.answer = answer;
    return this;
  }

   /**
   * The answer to the poll
   * @return answer
  **/
  @ApiModelProperty(required = true, value = "The answer to the poll")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public PollResponseResource answeredDate(Long answeredDate) {
    this.answeredDate = answeredDate;
    return this;
  }

   /**
   * The date the poll was answered, in seconds since unix epoc
   * @return answeredDate
  **/
  @ApiModelProperty(value = "The date the poll was answered, in seconds since unix epoc")
  public Long getAnsweredDate() {
    return answeredDate;
  }

  public void setAnsweredDate(Long answeredDate) {
    this.answeredDate = answeredDate;
  }

   /**
   * The id of the poll response
   * @return id
  **/
  @ApiModelProperty(value = "The id of the poll response")
  public String getId() {
    return id;
  }

  public PollResponseResource pollId(String pollId) {
    this.pollId = pollId;
    return this;
  }

   /**
   * The id of the poll
   * @return pollId
  **/
  @ApiModelProperty(required = true, value = "The id of the poll")
  public String getPollId() {
    return pollId;
  }

  public void setPollId(String pollId) {
    this.pollId = pollId;
  }

  public PollResponseResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "The user")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PollResponseResource pollResponseResource = (PollResponseResource) o;
    return Objects.equals(this.answer, pollResponseResource.answer) &&
        Objects.equals(this.answeredDate, pollResponseResource.answeredDate) &&
        Objects.equals(this.id, pollResponseResource.id) &&
        Objects.equals(this.pollId, pollResponseResource.pollId) &&
        Objects.equals(this.user, pollResponseResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, answeredDate, id, pollId, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollResponseResource {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    answeredDate: ").append(toIndentedString(answeredDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pollId: ").append(toIndentedString(pollId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

