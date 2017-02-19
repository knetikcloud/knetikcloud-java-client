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
import io.swagger.client.model.Property;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-19T02:24:50.691-05:00")
public class GroupResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("member_count")
  private Integer memberCount = null;

  @SerializedName("message_of_the_day")
  private String messageOfTheDay = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parent")
  private String parent = null;

  /**
   * The status which describes whether other users can freely join the group or not
   */
  public enum StatusEnum {
    @SerializedName("open")
    OPEN("open"),
    
    @SerializedName("closed")
    CLOSED("closed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("sub_member_count")
  private Integer subMemberCount = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("unique_name")
  private String uniqueName = null;

  public GroupResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public GroupResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public GroupResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the group. Max 250 characters
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A description of the group. Max 250 characters")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The number of users in the group
   * @return memberCount
  **/
  @ApiModelProperty(example = "null", value = "The number of users in the group")
  public Integer getMemberCount() {
    return memberCount;
  }

  public GroupResource messageOfTheDay(String messageOfTheDay) {
    this.messageOfTheDay = messageOfTheDay;
    return this;
  }

   /**
   * A message of the day for members of the group
   * @return messageOfTheDay
  **/
  @ApiModelProperty(example = "null", value = "A message of the day for members of the group")
  public String getMessageOfTheDay() {
    return messageOfTheDay;
  }

  public void setMessageOfTheDay(String messageOfTheDay) {
    this.messageOfTheDay = messageOfTheDay;
  }

  public GroupResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the group. Max 50 characters
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the group. Max 50 characters")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupResource parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The unique name of another group that this group is a subset of
   * @return parent
  **/
  @ApiModelProperty(example = "null", value = "The unique name of another group that this group is a subset of")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public GroupResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status which describes whether other users can freely join the group or not
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "The status which describes whether other users can freely join the group or not")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * The number of users in child groups
   * @return subMemberCount
  **/
  @ApiModelProperty(example = "null", value = "The number of users in child groups")
  public Integer getSubMemberCount() {
    return subMemberCount;
  }

  public GroupResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A group template this group is validated against. May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "A group template this group is validated against. May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public GroupResource uniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

   /**
   * Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created
   * @return uniqueName
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created")
  public String getUniqueName() {
    return uniqueName;
  }

  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupResource groupResource = (GroupResource) o;
    return Objects.equals(this.additionalProperties, groupResource.additionalProperties) &&
        Objects.equals(this.description, groupResource.description) &&
        Objects.equals(this.memberCount, groupResource.memberCount) &&
        Objects.equals(this.messageOfTheDay, groupResource.messageOfTheDay) &&
        Objects.equals(this.name, groupResource.name) &&
        Objects.equals(this.parent, groupResource.parent) &&
        Objects.equals(this.status, groupResource.status) &&
        Objects.equals(this.subMemberCount, groupResource.subMemberCount) &&
        Objects.equals(this.template, groupResource.template) &&
        Objects.equals(this.uniqueName, groupResource.uniqueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, description, memberCount, messageOfTheDay, name, parent, status, subMemberCount, template, uniqueName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    messageOfTheDay: ").append(toIndentedString(messageOfTheDay)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subMemberCount: ").append(toIndentedString(subMemberCount)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
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
