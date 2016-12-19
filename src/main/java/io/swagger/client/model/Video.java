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
import io.swagger.client.model.Artist;
import io.swagger.client.model.CollectionVideoContribution;
import io.swagger.client.model.User;
import io.swagger.client.model.VideoTag;
import java.util.ArrayList;
import java.util.List;

/**
 * Video
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:14:41.572-05:00")
public class Video {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("author")
  private Artist author = null;

  @SerializedName("authored")
  private Long authored = null;

  @SerializedName("banned")
  private Boolean banned = null;

  @SerializedName("category_id")
  private String categoryId = null;

  @SerializedName("category_name")
  private String categoryName = null;

  @SerializedName("contributors")
  private CollectionVideoContribution contributors = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("embed")
  private String embed = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("mime_type")
  private String mimeType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("priority")
  private Integer priority = null;

  /**
   * Gets or Sets privacy
   */
  public enum PrivacyEnum {
    @SerializedName("private")
    PRIVATE("private"),
    
    @SerializedName("friends")
    FRIENDS("friends"),
    
    @SerializedName("public")
    PUBLIC("public");

    private String value;

    PrivacyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("privacy")
  private PrivacyEnum privacy = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("tags")
  private List<VideoTag> tags = new ArrayList<VideoTag>();

  @SerializedName("thumbnail")
  private String thumbnail = null;

  @SerializedName("updated")
  private Long updated = null;

  @SerializedName("uploader")
  private User uploader = null;

  @SerializedName("views")
  private Long views = null;

  @SerializedName("whitelist")
  private List<User> whitelist = new ArrayList<User>();

  @SerializedName("width")
  private Integer width = null;

  public Video active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Video author(Artist author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "")
  public Artist getAuthor() {
    return author;
  }

  public void setAuthor(Artist author) {
    this.author = author;
  }

  public Video authored(Long authored) {
    this.authored = authored;
    return this;
  }

   /**
   * Get authored
   * @return authored
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAuthored() {
    return authored;
  }

  public void setAuthored(Long authored) {
    this.authored = authored;
  }

  public Video banned(Boolean banned) {
    this.banned = banned;
    return this;
  }

   /**
   * Get banned
   * @return banned
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBanned() {
    return banned;
  }

  public void setBanned(Boolean banned) {
    this.banned = banned;
  }

  public Video categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public Video categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public Video contributors(CollectionVideoContribution contributors) {
    this.contributors = contributors;
    return this;
  }

   /**
   * Get contributors
   * @return contributors
  **/
  @ApiModelProperty(example = "null", value = "")
  public CollectionVideoContribution getContributors() {
    return contributors;
  }

  public void setContributors(CollectionVideoContribution contributors) {
    this.contributors = contributors;
  }

  public Video created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public Video embed(String embed) {
    this.embed = embed;
    return this;
  }

   /**
   * Get embed
   * @return embed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmbed() {
    return embed;
  }

  public void setEmbed(String embed) {
    this.embed = embed;
  }

  public Video extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public Video height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Video id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Video length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Video location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Video longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * Get longDescription
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public Video mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Video name(String name) {
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

  public Video priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Video privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @ApiModelProperty(example = "null", value = "")
  public PrivacyEnum getPrivacy() {
    return privacy;
  }

  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  public Video published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public Video shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Video size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Video tags(List<VideoTag> tags) {
    this.tags = tags;
    return this;
  }

  public Video addTagsItem(VideoTag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VideoTag> getTags() {
    return tags;
  }

  public void setTags(List<VideoTag> tags) {
    this.tags = tags;
  }

  public Video thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Video updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public Video uploader(User uploader) {
    this.uploader = uploader;
    return this;
  }

   /**
   * Get uploader
   * @return uploader
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getUploader() {
    return uploader;
  }

  public void setUploader(User uploader) {
    this.uploader = uploader;
  }

  public Video views(Long views) {
    this.views = views;
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getViews() {
    return views;
  }

  public void setViews(Long views) {
    this.views = views;
  }

  public Video whitelist(List<User> whitelist) {
    this.whitelist = whitelist;
    return this;
  }

  public Video addWhitelistItem(User whitelistItem) {
    this.whitelist.add(whitelistItem);
    return this;
  }

   /**
   * Get whitelist
   * @return whitelist
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<User> getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(List<User> whitelist) {
    this.whitelist = whitelist;
  }

  public Video width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.active, video.active) &&
        Objects.equals(this.author, video.author) &&
        Objects.equals(this.authored, video.authored) &&
        Objects.equals(this.banned, video.banned) &&
        Objects.equals(this.categoryId, video.categoryId) &&
        Objects.equals(this.categoryName, video.categoryName) &&
        Objects.equals(this.contributors, video.contributors) &&
        Objects.equals(this.created, video.created) &&
        Objects.equals(this.embed, video.embed) &&
        Objects.equals(this.extension, video.extension) &&
        Objects.equals(this.height, video.height) &&
        Objects.equals(this.id, video.id) &&
        Objects.equals(this.length, video.length) &&
        Objects.equals(this.location, video.location) &&
        Objects.equals(this.longDescription, video.longDescription) &&
        Objects.equals(this.mimeType, video.mimeType) &&
        Objects.equals(this.name, video.name) &&
        Objects.equals(this.priority, video.priority) &&
        Objects.equals(this.privacy, video.privacy) &&
        Objects.equals(this.published, video.published) &&
        Objects.equals(this.shortDescription, video.shortDescription) &&
        Objects.equals(this.size, video.size) &&
        Objects.equals(this.tags, video.tags) &&
        Objects.equals(this.thumbnail, video.thumbnail) &&
        Objects.equals(this.updated, video.updated) &&
        Objects.equals(this.uploader, video.uploader) &&
        Objects.equals(this.views, video.views) &&
        Objects.equals(this.whitelist, video.whitelist) &&
        Objects.equals(this.width, video.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, author, authored, banned, categoryId, categoryName, contributors, created, embed, extension, height, id, length, location, longDescription, mimeType, name, priority, privacy, published, shortDescription, size, tags, thumbnail, updated, uploader, views, whitelist, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authored: ").append(toIndentedString(authored)).append("\n");
    sb.append("    banned: ").append(toIndentedString(banned)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    contributors: ").append(toIndentedString(contributors)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    uploader: ").append(toIndentedString(uploader)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

