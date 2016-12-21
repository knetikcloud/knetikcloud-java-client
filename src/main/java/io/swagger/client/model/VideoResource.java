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
import io.swagger.client.model.CommentResource;
import io.swagger.client.model.ContributionResource;
import io.swagger.client.model.SimpleReferenceResourcelong;
import io.swagger.client.model.SimpleReferenceResourcestring;
import io.swagger.client.model.SimpleUserResource;
import java.util.ArrayList;
import java.util.List;

/**
 * VideoResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:41:19.694-05:00")
public class VideoResource {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("author")
  private SimpleReferenceResourcelong author = null;

  @SerializedName("authored")
  private Long authored = null;

  @SerializedName("banned")
  private Boolean banned = null;

  @SerializedName("category")
  private SimpleReferenceResourcestring category = null;

  @SerializedName("comments")
  private List<CommentResource> comments = new ArrayList<CommentResource>();

  @SerializedName("contributors")
  private List<ContributionResource> contributors = new ArrayList<ContributionResource>();

  @SerializedName("created_date")
  private Long createdDate = null;

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
   * The privacy setting. default: private
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
  private List<String> tags = new ArrayList<String>();

  @SerializedName("thumbnail")
  private String thumbnail = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("uploader")
  private SimpleUserResource uploader = null;

  @SerializedName("views")
  private Long views = null;

  @SerializedName("width")
  private Integer width = null;

   /**
   * Whether the video is available, based on various factors
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the video is available, based on various factors")
  public Boolean getActive() {
    return active;
  }

  public VideoResource author(SimpleReferenceResourcelong author) {
    this.author = author;
    return this;
  }

   /**
   * The original artist of the media
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "The original artist of the media")
  public SimpleReferenceResourcelong getAuthor() {
    return author;
  }

  public void setAuthor(SimpleReferenceResourcelong author) {
    this.author = author;
  }

  public VideoResource authored(Long authored) {
    this.authored = authored;
    return this;
  }

   /**
   * The date the media was created as a unix timestamp in seconds
   * @return authored
  **/
  @ApiModelProperty(example = "null", value = "The date the media was created as a unix timestamp in seconds")
  public Long getAuthored() {
    return authored;
  }

  public void setAuthored(Long authored) {
    this.authored = authored;
  }

   /**
   * Whether the video has been banned or not
   * @return banned
  **/
  @ApiModelProperty(example = "false", value = "Whether the video has been banned or not")
  public Boolean getBanned() {
    return banned;
  }

  public VideoResource category(SimpleReferenceResourcestring category) {
    this.category = category;
    return this;
  }

   /**
   * The category of the video
   * @return category
  **/
  @ApiModelProperty(example = "null", required = true, value = "The category of the video")
  public SimpleReferenceResourcestring getCategory() {
    return category;
  }

  public void setCategory(SimpleReferenceResourcestring category) {
    this.category = category;
  }

  public VideoResource comments(List<CommentResource> comments) {
    this.comments = comments;
    return this;
  }

  public VideoResource addCommentsItem(CommentResource commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * The comments of the video
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "The comments of the video")
  public List<CommentResource> getComments() {
    return comments;
  }

  public void setComments(List<CommentResource> comments) {
    this.comments = comments;
  }

  public VideoResource contributors(List<ContributionResource> contributors) {
    this.contributors = contributors;
    return this;
  }

  public VideoResource addContributorsItem(ContributionResource contributorsItem) {
    this.contributors.add(contributorsItem);
    return this;
  }

   /**
   * Artists that contributed to the creation. See separate endpoint to add to list
   * @return contributors
  **/
  @ApiModelProperty(example = "null", value = "Artists that contributed to the creation. See separate endpoint to add to list")
  public List<ContributionResource> getContributors() {
    return contributors;
  }

  public void setContributors(List<ContributionResource> contributors) {
    this.contributors = contributors;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public VideoResource embed(String embed) {
    this.embed = embed;
    return this;
  }

   /**
   * The country of an embedable version
   * @return embed
  **/
  @ApiModelProperty(example = "null", value = "The country of an embedable version")
  public String getEmbed() {
    return embed;
  }

  public void setEmbed(String embed) {
    this.embed = embed;
  }

  public VideoResource extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * The file extension of the media file. 1-5 characters
   * @return extension
  **/
  @ApiModelProperty(example = "null", required = true, value = "The file extension of the media file. 1-5 characters")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public VideoResource height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the video in px
   * @return height
  **/
  @ApiModelProperty(example = "null", required = true, value = "The height of the video in px")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public VideoResource length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * The length of the video in seconds
   * @return length
  **/
  @ApiModelProperty(example = "null", required = true, value = "The length of the video in seconds")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public VideoResource location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The country of the media. Typically a url. Cannot be blank
   * @return location
  **/
  @ApiModelProperty(example = "null", required = true, value = "The country of the media. Typically a url. Cannot be blank")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public VideoResource longDescription(String longDescription) {
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

  public VideoResource mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * The mime-type of the media
   * @return mimeType
  **/
  @ApiModelProperty(example = "null", value = "The mime-type of the media")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public VideoResource name(String name) {
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

  public VideoResource priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The sort order of the video. default: 100
   * @return priority
  **/
  @ApiModelProperty(example = "null", value = "The sort order of the video. default: 100")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public VideoResource privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * The privacy setting. default: private
   * @return privacy
  **/
  @ApiModelProperty(example = "null", value = "The privacy setting. default: private")
  public PrivacyEnum getPrivacy() {
    return privacy;
  }

  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  public VideoResource published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Whether the video has been made public. Default true
   * @return published
  **/
  @ApiModelProperty(example = "false", value = "Whether the video has been made public. Default true")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public VideoResource shortDescription(String shortDescription) {
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

  public VideoResource size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the media. Minimum 0 if supplied
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "The size of the media. Minimum 0 if supplied")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public VideoResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public VideoResource addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags for the video
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "The tags for the video")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public VideoResource thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * The country of a thumbnail version. Typically a url
   * @return thumbnail
  **/
  @ApiModelProperty(example = "null", value = "The country of a thumbnail version. Typically a url")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public VideoResource uploader(SimpleUserResource uploader) {
    this.uploader = uploader;
    return this;
  }

   /**
   * The user the media was uploaded by. May be null for system uploaded media. May only be set to a user other than the current caller if VIDEOS_ADMIN permission. Null will mean the caller is the uploader unless the caller has VIDEOS_ADMIN permission, in which case it will be set to null
   * @return uploader
  **/
  @ApiModelProperty(example = "null", value = "The user the media was uploaded by. May be null for system uploaded media. May only be set to a user other than the current caller if VIDEOS_ADMIN permission. Null will mean the caller is the uploader unless the caller has VIDEOS_ADMIN permission, in which case it will be set to null")
  public SimpleUserResource getUploader() {
    return uploader;
  }

  public void setUploader(SimpleUserResource uploader) {
    this.uploader = uploader;
  }

   /**
   * The view count of the video
   * @return views
  **/
  @ApiModelProperty(example = "null", value = "The view count of the video")
  public Long getViews() {
    return views;
  }

  public VideoResource width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the video in px
   * @return width
  **/
  @ApiModelProperty(example = "null", required = true, value = "The width of the video in px")
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
    VideoResource videoResource = (VideoResource) o;
    return Objects.equals(this.active, videoResource.active) &&
        Objects.equals(this.author, videoResource.author) &&
        Objects.equals(this.authored, videoResource.authored) &&
        Objects.equals(this.banned, videoResource.banned) &&
        Objects.equals(this.category, videoResource.category) &&
        Objects.equals(this.comments, videoResource.comments) &&
        Objects.equals(this.contributors, videoResource.contributors) &&
        Objects.equals(this.createdDate, videoResource.createdDate) &&
        Objects.equals(this.embed, videoResource.embed) &&
        Objects.equals(this.extension, videoResource.extension) &&
        Objects.equals(this.height, videoResource.height) &&
        Objects.equals(this.id, videoResource.id) &&
        Objects.equals(this.length, videoResource.length) &&
        Objects.equals(this.location, videoResource.location) &&
        Objects.equals(this.longDescription, videoResource.longDescription) &&
        Objects.equals(this.mimeType, videoResource.mimeType) &&
        Objects.equals(this.name, videoResource.name) &&
        Objects.equals(this.priority, videoResource.priority) &&
        Objects.equals(this.privacy, videoResource.privacy) &&
        Objects.equals(this.published, videoResource.published) &&
        Objects.equals(this.shortDescription, videoResource.shortDescription) &&
        Objects.equals(this.size, videoResource.size) &&
        Objects.equals(this.tags, videoResource.tags) &&
        Objects.equals(this.thumbnail, videoResource.thumbnail) &&
        Objects.equals(this.updatedDate, videoResource.updatedDate) &&
        Objects.equals(this.uploader, videoResource.uploader) &&
        Objects.equals(this.views, videoResource.views) &&
        Objects.equals(this.width, videoResource.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, author, authored, banned, category, comments, contributors, createdDate, embed, extension, height, id, length, location, longDescription, mimeType, name, priority, privacy, published, shortDescription, size, tags, thumbnail, updatedDate, uploader, views, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authored: ").append(toIndentedString(authored)).append("\n");
    sb.append("    banned: ").append(toIndentedString(banned)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    contributors: ").append(toIndentedString(contributors)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    uploader: ").append(toIndentedString(uploader)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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

