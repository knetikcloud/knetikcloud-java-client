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
import com.knetikcloud.model.NestedCategory;
import com.knetikcloud.model.PollAnswerResource;
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PollResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T15:25:18.305-04:00")
public class PollResource {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("answers")
  private List<PollAnswerResource> answers = new ArrayList<PollAnswerResource>();

  @JsonProperty("category")
  private NestedCategory category = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("text")
  private String text = null;

  /**
   * The media type of the poll
   */
  public enum TypeEnum {
    TEXT("TEXT"),
    
    IMAGE("IMAGE"),
    
    VIDEO("VIDEO"),
    
    AUDIO("AUDIO");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  public PollResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the poll is active
   * @return active
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the poll is active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public PollResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public PollResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public PollResource answers(List<PollAnswerResource> answers) {
    this.answers = answers;
    return this;
  }

  public PollResource addAnswersItem(PollAnswerResource answersItem) {
    this.answers.add(answersItem);
    return this;
  }

   /**
   * The answers to the poll
   * @return answers
  **/
  @ApiModelProperty(required = true, value = "The answers to the poll")
  public List<PollAnswerResource> getAnswers() {
    return answers;
  }

  public void setAnswers(List<PollAnswerResource> answers) {
    this.answers = answers;
  }

  public PollResource category(NestedCategory category) {
    this.category = category;
    return this;
  }

   /**
   * The category for the poll
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The category for the poll")
  public NestedCategory getCategory() {
    return category;
  }

  public void setCategory(NestedCategory category) {
    this.category = category;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The id of the poll
   * @return id
  **/
  @ApiModelProperty(value = "The id of the poll")
  public String getId() {
    return id;
  }

  public PollResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PollResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags for the poll
   * @return tags
  **/
  @ApiModelProperty(value = "The tags for the poll")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public PollResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A poll template this poll is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "A poll template this poll is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public PollResource text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text of the poll
   * @return text
  **/
  @ApiModelProperty(required = true, value = "The text of the poll")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public PollResource type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The media type of the poll
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The media type of the poll")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
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
    PollResource pollResource = (PollResource) o;
    return Objects.equals(this.active, pollResource.active) &&
        Objects.equals(this.additionalProperties, pollResource.additionalProperties) &&
        Objects.equals(this.answers, pollResource.answers) &&
        Objects.equals(this.category, pollResource.category) &&
        Objects.equals(this.createdDate, pollResource.createdDate) &&
        Objects.equals(this.id, pollResource.id) &&
        Objects.equals(this.tags, pollResource.tags) &&
        Objects.equals(this.template, pollResource.template) &&
        Objects.equals(this.text, pollResource.text) &&
        Objects.equals(this.type, pollResource.type) &&
        Objects.equals(this.updatedDate, pollResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalProperties, answers, category, createdDate, id, tags, template, text, type, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

