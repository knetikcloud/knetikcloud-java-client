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
 * PermissionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T13:50:55.134-04:00")
public class PermissionResource {
  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("locked")
  private Boolean locked = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parent")
  private String parent = null;

  @JsonProperty("permission")
  private String permission = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

   /**
   * The date the permission was added. Unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the permission was added. Unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public PermissionResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the permission
   * @return description
  **/
  @ApiModelProperty(value = "The description of the permission")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PermissionResource locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Whether a permission is locked from being deleted
   * @return locked
  **/
  @ApiModelProperty(example = "false", value = "Whether a permission is locked from being deleted")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public PermissionResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the permission used for display purposes
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the permission used for display purposes")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PermissionResource parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The name of the parent of the permission
   * @return parent
  **/
  @ApiModelProperty(value = "The name of the parent of the permission")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public PermissionResource permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * The keyword that defines the permission
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "The keyword that defines the permission")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

   /**
   * The date the permission was updated. Unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the permission was updated. Unix timestamp in seconds")
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
    PermissionResource permissionResource = (PermissionResource) o;
    return Objects.equals(this.createdDate, permissionResource.createdDate) &&
        Objects.equals(this.description, permissionResource.description) &&
        Objects.equals(this.locked, permissionResource.locked) &&
        Objects.equals(this.name, permissionResource.name) &&
        Objects.equals(this.parent, permissionResource.parent) &&
        Objects.equals(this.permission, permissionResource.permission) &&
        Objects.equals(this.updatedDate, permissionResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, description, locked, name, parent, permission, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionResource {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

