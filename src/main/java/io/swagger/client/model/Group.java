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
import io.swagger.client.model.Group;
import io.swagger.client.model.Property;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Group
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T18:05:42.900-05:00")
public class Group {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("member_count")
  private Integer memberCount = null;

  @SerializedName("message_of_the_day")
  private String messageOfTheDay = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parent")
  private Group parent = null;

  @SerializedName("properties_string")
  private String propertiesString = null;

  /**
   * Gets or Sets status
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

  public Group additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public Group putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public Group description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Group id(Integer id) {
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

  public Group memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Get memberCount
   * @return memberCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public Group messageOfTheDay(String messageOfTheDay) {
    this.messageOfTheDay = messageOfTheDay;
    return this;
  }

   /**
   * Get messageOfTheDay
   * @return messageOfTheDay
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessageOfTheDay() {
    return messageOfTheDay;
  }

  public void setMessageOfTheDay(String messageOfTheDay) {
    this.messageOfTheDay = messageOfTheDay;
  }

  public Group name(String name) {
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

  public Group parent(Group parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Group getParent() {
    return parent;
  }

  public void setParent(Group parent) {
    this.parent = parent;
  }

  public Group propertiesString(String propertiesString) {
    this.propertiesString = propertiesString;
    return this;
  }

   /**
   * Get propertiesString
   * @return propertiesString
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPropertiesString() {
    return propertiesString;
  }

  public void setPropertiesString(String propertiesString) {
    this.propertiesString = propertiesString;
  }

  public Group status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Group subMemberCount(Integer subMemberCount) {
    this.subMemberCount = subMemberCount;
    return this;
  }

   /**
   * Get subMemberCount
   * @return subMemberCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSubMemberCount() {
    return subMemberCount;
  }

  public void setSubMemberCount(Integer subMemberCount) {
    this.subMemberCount = subMemberCount;
  }

  public Group template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public Group uniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

   /**
   * Get uniqueName
   * @return uniqueName
  **/
  @ApiModelProperty(example = "null", value = "")
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
    Group group = (Group) o;
    return Objects.equals(this.additionalProperties, group.additionalProperties) &&
        Objects.equals(this.description, group.description) &&
        Objects.equals(this.id, group.id) &&
        Objects.equals(this.memberCount, group.memberCount) &&
        Objects.equals(this.messageOfTheDay, group.messageOfTheDay) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.parent, group.parent) &&
        Objects.equals(this.propertiesString, group.propertiesString) &&
        Objects.equals(this.status, group.status) &&
        Objects.equals(this.subMemberCount, group.subMemberCount) &&
        Objects.equals(this.template, group.template) &&
        Objects.equals(this.uniqueName, group.uniqueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, description, id, memberCount, messageOfTheDay, name, parent, propertiesString, status, subMemberCount, template, uniqueName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    messageOfTheDay: ").append(toIndentedString(messageOfTheDay)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    propertiesString: ").append(toIndentedString(propertiesString)).append("\n");
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

