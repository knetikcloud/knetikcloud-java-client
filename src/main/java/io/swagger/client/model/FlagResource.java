/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
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
 * FlagResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:14:41.572-05:00")
public class FlagResource {
  @SerializedName("context")
  private String context = null;

  @SerializedName("context_id")
  private String contextId = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("user")
  private SimpleUserResource user = null;

  public FlagResource context(String context) {
    this.context = context;
    return this;
  }

   /**
   * The context of that resource
   * @return context
  **/
  @ApiModelProperty(example = "null", required = true, value = "The context of that resource")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public FlagResource contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * The context_id of that resource
   * @return contextId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The context_id of that resource")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
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

  public FlagResource reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The flag reason of that resource
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "The flag reason of that resource")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

   /**
   * The date/time this resource was last updated in seconds since epoch
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was last updated in seconds since epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public FlagResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The basic user resource
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "The basic user resource")
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
    FlagResource flagResource = (FlagResource) o;
    return Objects.equals(this.context, flagResource.context) &&
        Objects.equals(this.contextId, flagResource.contextId) &&
        Objects.equals(this.createdDate, flagResource.createdDate) &&
        Objects.equals(this.id, flagResource.id) &&
        Objects.equals(this.reason, flagResource.reason) &&
        Objects.equals(this.updatedDate, flagResource.updatedDate) &&
        Objects.equals(this.user, flagResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, contextId, createdDate, id, reason, updatedDate, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlagResource {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

