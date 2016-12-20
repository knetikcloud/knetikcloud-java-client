/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
import io.swagger.client.model.Permission;
import java.util.ArrayList;
import java.util.List;

/**
 * Role
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T18:40:53.584-05:00")
public class Role {
  @SerializedName("client_count")
  private Integer clientCount = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("role_permission")
  private List<Permission> rolePermission = new ArrayList<Permission>();

  @SerializedName("user_count")
  private Integer userCount = null;

  public Role clientCount(Integer clientCount) {
    this.clientCount = clientCount;
    return this;
  }

   /**
   * Get clientCount
   * @return clientCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getClientCount() {
    return clientCount;
  }

  public void setClientCount(Integer clientCount) {
    this.clientCount = clientCount;
  }

  public Role createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public Role id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Role locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Role name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Role role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Role rolePermission(List<Permission> rolePermission) {
    this.rolePermission = rolePermission;
    return this;
  }

  public Role addRolePermissionItem(Permission rolePermissionItem) {
    this.rolePermission.add(rolePermissionItem);
    return this;
  }

   /**
   * Get rolePermission
   * @return rolePermission
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Permission> getRolePermission() {
    return rolePermission;
  }

  public void setRolePermission(List<Permission> rolePermission) {
    this.rolePermission = rolePermission;
  }

  public Role userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * Get userCount
   * @return userCount
  **/
  @ApiModelProperty(example = "null", value = "")
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
    Role role = (Role) o;
    return Objects.equals(this.clientCount, role.clientCount) &&
        Objects.equals(this.createdDate, role.createdDate) &&
        Objects.equals(this.id, role.id) &&
        Objects.equals(this.locked, role.locked) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.role, role.role) &&
        Objects.equals(this.rolePermission, role.rolePermission) &&
        Objects.equals(this.userCount, role.userCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCount, createdDate, id, locked, name, role, rolePermission, userCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    clientCount: ").append(toIndentedString(clientCount)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

