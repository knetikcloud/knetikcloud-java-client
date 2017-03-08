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
import io.swagger.client.model.User;

/**
 * UserRelationship
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T10:42:53.235-05:00")
public class UserRelationship {
  @SerializedName("child")
  private User child = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("parent")
  private User parent = null;

  public UserRelationship child(User child) {
    this.child = child;
    return this;
  }

   /**
   * Get child
   * @return child
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getChild() {
    return child;
  }

  public void setChild(User child) {
    this.child = child;
  }

  public UserRelationship context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public UserRelationship id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserRelationship parent(User parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getParent() {
    return parent;
  }

  public void setParent(User parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRelationship userRelationship = (UserRelationship) o;
    return Objects.equals(this.child, userRelationship.child) &&
        Objects.equals(this.context, userRelationship.context) &&
        Objects.equals(this.id, userRelationship.id) &&
        Objects.equals(this.parent, userRelationship.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(child, context, id, parent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRelationship {\n");
    
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

