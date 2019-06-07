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
import com.knetikcloud.model.Property;
import com.knetikcloud.model.SimpleGroupResource;
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupMemberResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-07T13:18:12.930-04:00")
public class GroupMemberResource {
  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("group")
  private SimpleGroupResource group = null;

  @JsonProperty("implicit")
  private Boolean implicit = null;

  @JsonProperty("member_since")
  private Long memberSince = null;

  @JsonProperty("membership_id")
  private Long membershipId = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  @JsonProperty("user")
  private SimpleUserResource user = null;

  public GroupMemberResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public GroupMemberResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this type, or be an extra not from the template
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public GroupMemberResource group(SimpleGroupResource group) {
    this.group = group;
    return this;
  }

   /**
   * The group. Id is the unique name
   * @return group
  **/
  @ApiModelProperty(value = "The group. Id is the unique name")
  public SimpleGroupResource getGroup() {
    return group;
  }

  public void setGroup(SimpleGroupResource group) {
    this.group = group;
  }

   /**
   * Whether this membership is explicit (the user was added directly to the group) or implicit (the user was added only to one or more child groups)
   * @return implicit
  **/
  @ApiModelProperty(example = "false", value = "Whether this membership is explicit (the user was added directly to the group) or implicit (the user was added only to one or more child groups)")
  public Boolean isImplicit() {
    return implicit;
  }

   /**
   * The group member&#39;s membership date as a unix timestamp
   * @return memberSince
  **/
  @ApiModelProperty(value = "The group member's membership date as a unix timestamp")
  public Long getMemberSince() {
    return memberSince;
  }

   /**
   * The id of the membership entry
   * @return membershipId
  **/
  @ApiModelProperty(value = "The id of the membership entry")
  public Long getMembershipId() {
    return membershipId;
  }

  public GroupMemberResource order(String order) {
    this.order = order;
    return this;
  }

   /**
   * The position of the member in the group if applicable. Read notes for details
   * @return order
  **/
  @ApiModelProperty(value = "The position of the member in the group if applicable. Read notes for details")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public GroupMemberResource status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The member&#39;s status. Max size 50. Default: member
   * @return status
  **/
  @ApiModelProperty(value = "The member's status. Max size 50. Default: member")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GroupMemberResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A template this member additional properties are validated against (private). May be null and no validation of properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "A template this member additional properties are validated against (private). May be null and no validation of properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

   /**
   * The date the group member&#39;s info was updated as a unix timestamp
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the group member's info was updated as a unix timestamp")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public GroupMemberResource user(SimpleUserResource user) {
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
    GroupMemberResource groupMemberResource = (GroupMemberResource) o;
    return Objects.equals(this.additionalProperties, groupMemberResource.additionalProperties) &&
        Objects.equals(this.group, groupMemberResource.group) &&
        Objects.equals(this.implicit, groupMemberResource.implicit) &&
        Objects.equals(this.memberSince, groupMemberResource.memberSince) &&
        Objects.equals(this.membershipId, groupMemberResource.membershipId) &&
        Objects.equals(this.order, groupMemberResource.order) &&
        Objects.equals(this.status, groupMemberResource.status) &&
        Objects.equals(this.template, groupMemberResource.template) &&
        Objects.equals(this.updatedDate, groupMemberResource.updatedDate) &&
        Objects.equals(this.user, groupMemberResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, group, implicit, memberSince, membershipId, order, status, template, updatedDate, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMemberResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    implicit: ").append(toIndentedString(implicit)).append("\n");
    sb.append("    memberSince: ").append(toIndentedString(memberSince)).append("\n");
    sb.append("    membershipId: ").append(toIndentedString(membershipId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

