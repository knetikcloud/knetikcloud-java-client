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
import com.knetikcloud.model.AccessSubTypeResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AccessSubTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")
public class AccessSubTypeResource {
  @JsonProperty("actions")
  private List<String> actions = new ArrayList<String>();

  @JsonProperty("default_access")
  private List<AccessEntryResource> defaultAccess = new ArrayList<AccessEntryResource>();

  @JsonProperty("inherited_access")
  private List<AccessEntryResource> inheritedAccess = new ArrayList<AccessEntryResource>();

  @JsonProperty("replacement_sids")
  private List<String> replacementSids = null;

  @JsonProperty("sub_types")
  private List<AccessSubTypeResource> subTypes = new ArrayList<AccessSubTypeResource>();

  @JsonProperty("type")
  private String type = null;

  public AccessSubTypeResource actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public AccessSubTypeResource addActionsItem(String actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The actions that are possible for the resource type
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "The actions that are possible for the resource type")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public AccessSubTypeResource defaultAccess(List<AccessEntryResource> defaultAccess) {
    this.defaultAccess = defaultAccess;
    return this;
  }

  public AccessSubTypeResource addDefaultAccessItem(AccessEntryResource defaultAccessItem) {
    this.defaultAccess.add(defaultAccessItem);
    return this;
  }

   /**
   * An access list to be copied into new resources of this sub type under this parent. Can include SIDs from the replacement_sid list, which will be replaced when the sub resource if first created
   * @return defaultAccess
  **/
  @ApiModelProperty(required = true, value = "An access list to be copied into new resources of this sub type under this parent. Can include SIDs from the replacement_sid list, which will be replaced when the sub resource if first created")
  public List<AccessEntryResource> getDefaultAccess() {
    return defaultAccess;
  }

  public void setDefaultAccess(List<AccessEntryResource> defaultAccess) {
    this.defaultAccess = defaultAccess;
  }

  public AccessSubTypeResource inheritedAccess(List<AccessEntryResource> inheritedAccess) {
    this.inheritedAccess = inheritedAccess;
    return this;
  }

  public AccessSubTypeResource addInheritedAccessItem(AccessEntryResource inheritedAccessItem) {
    this.inheritedAccess.add(inheritedAccessItem);
    return this;
  }

   /**
   * An access list to provide blanket access to all sub resources of this type under this parent
   * @return inheritedAccess
  **/
  @ApiModelProperty(required = true, value = "An access list to provide blanket access to all sub resources of this type under this parent")
  public List<AccessEntryResource> getInheritedAccess() {
    return inheritedAccess;
  }

  public void setInheritedAccess(List<AccessEntryResource> inheritedAccess) {
    this.inheritedAccess = inheritedAccess;
  }

  public AccessSubTypeResource replacementSids(List<String> replacementSids) {
    this.replacementSids = replacementSids;
    return this;
  }

  public AccessSubTypeResource addReplacementSidsItem(String replacementSidsItem) {
    if (this.replacementSids == null) {
      this.replacementSids = new ArrayList<String>();
    }
    this.replacementSids.add(replacementSidsItem);
    return this;
  }

   /**
   * A list of placeholder sids that can be included in the access list to be replaced when a resource is first created
   * @return replacementSids
  **/
  @ApiModelProperty(value = "A list of placeholder sids that can be included in the access list to be replaced when a resource is first created")
  public List<String> getReplacementSids() {
    return replacementSids;
  }

  public void setReplacementSids(List<String> replacementSids) {
    this.replacementSids = replacementSids;
  }

  public AccessSubTypeResource subTypes(List<AccessSubTypeResource> subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  public AccessSubTypeResource addSubTypesItem(AccessSubTypeResource subTypesItem) {
    this.subTypes.add(subTypesItem);
    return this;
  }

   /**
   * List of resource types that can inherit from this one, to define default access lists on creation
   * @return subTypes
  **/
  @ApiModelProperty(required = true, value = "List of resource types that can inherit from this one, to define default access lists on creation")
  public List<AccessSubTypeResource> getSubTypes() {
    return subTypes;
  }

  public void setSubTypes(List<AccessSubTypeResource> subTypes) {
    this.subTypes = subTypes;
  }

  public AccessSubTypeResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The sub type we are defining access for
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The sub type we are defining access for")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSubTypeResource accessSubTypeResource = (AccessSubTypeResource) o;
    return Objects.equals(this.actions, accessSubTypeResource.actions) &&
        Objects.equals(this.defaultAccess, accessSubTypeResource.defaultAccess) &&
        Objects.equals(this.inheritedAccess, accessSubTypeResource.inheritedAccess) &&
        Objects.equals(this.replacementSids, accessSubTypeResource.replacementSids) &&
        Objects.equals(this.subTypes, accessSubTypeResource.subTypes) &&
        Objects.equals(this.type, accessSubTypeResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, defaultAccess, inheritedAccess, replacementSids, subTypes, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSubTypeResource {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    defaultAccess: ").append(toIndentedString(defaultAccess)).append("\n");
    sb.append("    inheritedAccess: ").append(toIndentedString(inheritedAccess)).append("\n");
    sb.append("    replacementSids: ").append(toIndentedString(replacementSids)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

