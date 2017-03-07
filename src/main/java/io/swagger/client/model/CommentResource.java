/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SimpleUserResource;

/**
 * CommentResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T17:07:29.133-05:00")
public class CommentResource {
  @SerializedName("content")
  private String content = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("context_id")
  private Integer contextId = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("user")
  private SimpleUserResource user = null;

  public CommentResource content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The comment content of that resource
   * @return content
  **/
  @ApiModelProperty(example = "null", required = true, value = "The comment content of that resource")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CommentResource context(String context) {
    this.context = context;
    return this;
  }

   /**
   * The type of object this comment applies to (ex: video, article, etc). Required when passed to /comments
   * @return context
  **/
  @ApiModelProperty(example = "null", value = "The type of object this comment applies to (ex: video, article, etc). Required when passed to /comments")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public CommentResource contextId(Integer contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * The id of the object this comment applies to.  Required when passed to /comments
   * @return contextId
  **/
  @ApiModelProperty(example = "null", value = "The id of the object this comment applies to.  Required when passed to /comments")
  public Integer getContextId() {
    return contextId;
  }

  public void setContextId(Integer contextId) {
    this.contextId = contextId;
  }

   /**
   * The date/time this resource was created in seconds since epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

   /**
   * The summary of that resource
   * @return summary
  **/
  @ApiModelProperty(example = "null", value = "The summary of that resource")
  public String getSummary() {
    return summary;
  }

   /**
   * The date/time this resource was last updated in seconds since epoch
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was last updated in seconds since epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public CommentResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The user who created the comment
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "The user who created the comment")
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
    CommentResource commentResource = (CommentResource) o;
    return Objects.equals(this.content, commentResource.content) &&
        Objects.equals(this.context, commentResource.context) &&
        Objects.equals(this.contextId, commentResource.contextId) &&
        Objects.equals(this.createdDate, commentResource.createdDate) &&
        Objects.equals(this.id, commentResource.id) &&
        Objects.equals(this.summary, commentResource.summary) &&
        Objects.equals(this.updatedDate, commentResource.updatedDate) &&
        Objects.equals(this.user, commentResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, context, contextId, createdDate, id, summary, updatedDate, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentResource {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

