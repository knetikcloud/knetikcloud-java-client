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
import io.swagger.client.model.PermissionResource;
import java.util.ArrayList;
import java.util.List;

/**
 * RoleResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T18:05:42.900-05:00")
public class RoleResource {
  @SerializedName("client_count")
  private Integer clientCount = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("role_permission")
  private List<PermissionResource> rolePermission = new ArrayList<PermissionResource>();

  @SerializedName("user_count")
  private Integer userCount = null;

   /**
   * The number of clients this role is assigned to
   * @return clientCount
  **/
  @ApiModelProperty(example = "null", value = "The number of clients this role is assigned to")
  public Integer getClientCount() {
    return clientCount;
  }

   /**
   * The date the role was added. Unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date the role was added. Unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public RoleResource locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Whether a role is locked from being deleted
   * @return locked
  **/
  @ApiModelProperty(example = "false", value = "Whether a role is locked from being deleted")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public RoleResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the role used for display purposes
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the role used for display purposes")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleResource role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The keyword that defines the role
   * @return role
  **/
  @ApiModelProperty(example = "null", value = "The keyword that defines the role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RoleResource rolePermission(List<PermissionResource> rolePermission) {
    this.rolePermission = rolePermission;
    return this;
  }

  public RoleResource addRolePermissionItem(PermissionResource rolePermissionItem) {
    this.rolePermission.add(rolePermissionItem);
    return this;
  }

   /**
   * The list of permissions this role has
   * @return rolePermission
  **/
  @ApiModelProperty(example = "null", value = "The list of permissions this role has")
  public List<PermissionResource> getRolePermission() {
    return rolePermission;
  }

  public void setRolePermission(List<PermissionResource> rolePermission) {
    this.rolePermission = rolePermission;
  }

   /**
   * The number of users this role is assigned to
   * @return userCount
  **/
  @ApiModelProperty(example = "null", value = "The number of users this role is assigned to")
  public Integer getUserCount() {
    return userCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleResource roleResource = (RoleResource) o;
    return Objects.equals(this.clientCount, roleResource.clientCount) &&
        Objects.equals(this.createdDate, roleResource.createdDate) &&
        Objects.equals(this.locked, roleResource.locked) &&
        Objects.equals(this.name, roleResource.name) &&
        Objects.equals(this.role, roleResource.role) &&
        Objects.equals(this.rolePermission, roleResource.rolePermission) &&
        Objects.equals(this.userCount, roleResource.userCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCount, createdDate, locked, name, role, rolePermission, userCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleResource {\n");
    
    sb.append("    clientCount: ").append(toIndentedString(clientCount)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    rolePermission: ").append(toIndentedString(rolePermission)).append("\n");
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

