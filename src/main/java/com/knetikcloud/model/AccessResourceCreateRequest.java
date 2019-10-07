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
import com.knetikcloud.model.AccessEntryResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AccessResourceCreateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-07T16:44:21.413-04:00")
public class AccessResourceCreateRequest {
  @JsonProperty("access")
  private List<AccessEntryResource> access = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("parent_id")
  private String parentId = null;

  @JsonProperty("parent_type")
  private String parentType = null;

  @JsonProperty("sid_replacements")
  private Map<String, String> sidReplacements = null;

  public AccessResourceCreateRequest access(List<AccessEntryResource> access) {
    this.access = access;
    return this;
  }

  public AccessResourceCreateRequest addAccessItem(AccessEntryResource accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<AccessEntryResource>();
    }
    this.access.add(accessItem);
    return this;
  }

   /**
   * The access list for the resource. If null on create, will take default from type
   * @return access
  **/
  @ApiModelProperty(value = "The access list for the resource. If null on create, will take default from type")
  public List<AccessEntryResource> getAccess() {
    return access;
  }

  public void setAccess(List<AccessEntryResource> access) {
    this.access = access;
  }

  public AccessResourceCreateRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the resource we are defining access for
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the resource we are defining access for")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccessResourceCreateRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * The id of the parent resource (null if parent top level)
   * @return parentId
  **/
  @ApiModelProperty(value = "The id of the parent resource (null if parent top level)")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public AccessResourceCreateRequest parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

   /**
   * The type of the parent resource (null for top level)
   * @return parentType
  **/
  @ApiModelProperty(required = true, value = "The type of the parent resource (null for top level)")
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public AccessResourceCreateRequest sidReplacements(Map<String, String> sidReplacements) {
    this.sidReplacements = sidReplacements;
    return this;
  }

  public AccessResourceCreateRequest putSidReplacementsItem(String key, String sidReplacementsItem) {
    if (this.sidReplacements == null) {
      this.sidReplacements = new HashMap<String, String>();
    }
    this.sidReplacements.put(key, sidReplacementsItem);
    return this;
  }

   /**
   * Sid placeholders mapped to sid replacement value. Useful for injecting owner/creator id.
   * @return sidReplacements
  **/
  @ApiModelProperty(value = "Sid placeholders mapped to sid replacement value. Useful for injecting owner/creator id.")
  public Map<String, String> getSidReplacements() {
    return sidReplacements;
  }

  public void setSidReplacements(Map<String, String> sidReplacements) {
    this.sidReplacements = sidReplacements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessResourceCreateRequest accessResourceCreateRequest = (AccessResourceCreateRequest) o;
    return Objects.equals(this.access, accessResourceCreateRequest.access) &&
        Objects.equals(this.id, accessResourceCreateRequest.id) &&
        Objects.equals(this.parentId, accessResourceCreateRequest.parentId) &&
        Objects.equals(this.parentType, accessResourceCreateRequest.parentType) &&
        Objects.equals(this.sidReplacements, accessResourceCreateRequest.sidReplacements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, id, parentId, parentType, sidReplacements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessResourceCreateRequest {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    sidReplacements: ").append(toIndentedString(sidReplacements)).append("\n");
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

