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
import io.swagger.client.model.ContributionResource;
import io.swagger.client.model.Property;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ArtistResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T23:51:18.933-05:00")
public class ArtistResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("born")
  private String born = null;

  @SerializedName("contribution_count")
  private Integer contributionCount = null;

  @SerializedName("contributions")
  private List<ContributionResource> contributions = new ArrayList<ContributionResource>();

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("died")
  private String died = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public ArtistResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public ArtistResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
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

  public ArtistResource born(String born) {
    this.born = born;
    return this;
  }

   /**
   * YYYY/MM/DD when this artist was born
   * @return born
  **/
  @ApiModelProperty(example = "null", value = "YYYY/MM/DD when this artist was born")
  public String getBorn() {
    return born;
  }

  public void setBorn(String born) {
    this.born = born;
  }

   /**
   * The current number of contributions the artist has made
   * @return contributionCount
  **/
  @ApiModelProperty(example = "null", value = "The current number of contributions the artist has made")
  public Integer getContributionCount() {
    return contributionCount;
  }

  public ArtistResource contributions(List<ContributionResource> contributions) {
    this.contributions = contributions;
    return this;
  }

  public ArtistResource addContributionsItem(ContributionResource contributionsItem) {
    this.contributions.add(contributionsItem);
    return this;
  }

   /**
   * The list of media this artist has contributed to as well as role(s) during contribution.  Use media endpoint to add contributions
   * @return contributions
  **/
  @ApiModelProperty(example = "null", value = "The list of media this artist has contributed to as well as role(s) during contribution.  Use media endpoint to add contributions")
  public List<ContributionResource> getContributions() {
    return contributions;
  }

  public void setContributions(List<ContributionResource> contributions) {
    this.contributions = contributions;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public ArtistResource died(String died) {
    this.died = died;
    return this;
  }

   /**
   * YYYY/MM/DD when this artist died
   * @return died
  **/
  @ApiModelProperty(example = "null", value = "YYYY/MM/DD when this artist died")
  public String getDied() {
    return died;
  }

  public void setDied(String died) {
    this.died = died;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public ArtistResource longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public ArtistResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user friendly name of that resource
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArtistResource priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The sort order priority ofr the artist.  Default 100
   * @return priority
  **/
  @ApiModelProperty(example = "null", value = "The sort order priority ofr the artist.  Default 100")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ArtistResource shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public ArtistResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An artist template this artist is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "An artist template this artist is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was last updated in seconds since unix epoch")
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
    ArtistResource artistResource = (ArtistResource) o;
    return Objects.equals(this.additionalProperties, artistResource.additionalProperties) &&
        Objects.equals(this.born, artistResource.born) &&
        Objects.equals(this.contributionCount, artistResource.contributionCount) &&
        Objects.equals(this.contributions, artistResource.contributions) &&
        Objects.equals(this.createdDate, artistResource.createdDate) &&
        Objects.equals(this.died, artistResource.died) &&
        Objects.equals(this.id, artistResource.id) &&
        Objects.equals(this.longDescription, artistResource.longDescription) &&
        Objects.equals(this.name, artistResource.name) &&
        Objects.equals(this.priority, artistResource.priority) &&
        Objects.equals(this.shortDescription, artistResource.shortDescription) &&
        Objects.equals(this.template, artistResource.template) &&
        Objects.equals(this.updatedDate, artistResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, born, contributionCount, contributions, createdDate, died, id, longDescription, name, priority, shortDescription, template, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    born: ").append(toIndentedString(born)).append("\n");
    sb.append("    contributionCount: ").append(toIndentedString(contributionCount)).append("\n");
    sb.append("    contributions: ").append(toIndentedString(contributions)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    died: ").append(toIndentedString(died)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

