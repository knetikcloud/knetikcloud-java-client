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
import com.knetikcloud.model.Property;
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ArticleResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-05T08:46:21.119-04:00")
public class ArticleResource {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("category")
  private NestedCategory category = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("creator")
  private SimpleUserResource creator = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  @JsonProperty("view_count")
  private Integer viewCount = null;

  public ArticleResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the article is active
   * @return active
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the article is active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ArticleResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public ArticleResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
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

  public ArticleResource body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The body of the article
   * @return body
  **/
  @ApiModelProperty(required = true, value = "The body of the article")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public ArticleResource category(NestedCategory category) {
    this.category = category;
    return this;
  }

   /**
   * The category for the article
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The category for the article")
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

  public ArticleResource creator(SimpleUserResource creator) {
    this.creator = creator;
    return this;
  }

   /**
   * The creator of the article. Default: caller
   * @return creator
  **/
  @ApiModelProperty(value = "The creator of the article. Default: caller")
  public SimpleUserResource getCreator() {
    return creator;
  }

  public void setCreator(SimpleUserResource creator) {
    this.creator = creator;
  }

   /**
   * The id of the article. Default: random
   * @return id
  **/
  @ApiModelProperty(value = "The id of the article. Default: random")
  public String getId() {
    return id;
  }

  public ArticleResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ArticleResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags for the article
   * @return tags
  **/
  @ApiModelProperty(value = "The tags for the article")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ArticleResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An article template this article is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "An article template this article is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public ArticleResource title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the article
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title of the article")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public ArticleResource viewCount(Integer viewCount) {
    this.viewCount = viewCount;
    return this;
  }

   /**
   * The view count of the article
   * @return viewCount
  **/
  @ApiModelProperty(value = "The view count of the article")
  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleResource articleResource = (ArticleResource) o;
    return Objects.equals(this.active, articleResource.active) &&
        Objects.equals(this.additionalProperties, articleResource.additionalProperties) &&
        Objects.equals(this.body, articleResource.body) &&
        Objects.equals(this.category, articleResource.category) &&
        Objects.equals(this.createdDate, articleResource.createdDate) &&
        Objects.equals(this.creator, articleResource.creator) &&
        Objects.equals(this.id, articleResource.id) &&
        Objects.equals(this.tags, articleResource.tags) &&
        Objects.equals(this.template, articleResource.template) &&
        Objects.equals(this.title, articleResource.title) &&
        Objects.equals(this.updatedDate, articleResource.updatedDate) &&
        Objects.equals(this.viewCount, articleResource.viewCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalProperties, body, category, createdDate, creator, id, tags, template, title, updatedDate, viewCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
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

