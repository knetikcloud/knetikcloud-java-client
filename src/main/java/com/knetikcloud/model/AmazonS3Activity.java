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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AmazonS3Activity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-05T10:20:50.333-04:00")
public class AmazonS3Activity {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("cdn_url")
  private String cdnUrl = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("object_key")
  private String objectKey = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("user_id")
  private Integer userId = null;

  public AmazonS3Activity action(String action) {
    this.action = action;
    return this;
  }

   /**
   * S3 action (i.e., &#39;PUT&#39;) associated with the activity
   * @return action
  **/
  @ApiModelProperty(value = "S3 action (i.e., 'PUT') associated with the activity")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public AmazonS3Activity cdnUrl(String cdnUrl) {
    this.cdnUrl = cdnUrl;
    return this;
  }

   /**
   * URL for accessing the resource. Will use a CDN if configured, or direct to S3 if not
   * @return cdnUrl
  **/
  @ApiModelProperty(value = "URL for accessing the resource. Will use a CDN if configured, or direct to S3 if not")
  public String getCdnUrl() {
    return cdnUrl;
  }

  public void setCdnUrl(String cdnUrl) {
    this.cdnUrl = cdnUrl;
  }

  public AmazonS3Activity createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date the resource was created in S3
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date the resource was created in S3")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public AmazonS3Activity filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Name of the file being processed as a resource in S3
   * @return filename
  **/
  @ApiModelProperty(value = "Name of the file being processed as a resource in S3")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

   /**
   * Unique id of the S3 activity
   * @return id
  **/
  @ApiModelProperty(value = "Unique id of the S3 activity")
  public Long getId() {
    return id;
  }

  public AmazonS3Activity objectKey(String objectKey) {
    this.objectKey = objectKey;
    return this;
  }

   /**
   * S3 object key for the resource
   * @return objectKey
  **/
  @ApiModelProperty(value = "S3 object key for the resource")
  public String getObjectKey() {
    return objectKey;
  }

  public void setObjectKey(String objectKey) {
    this.objectKey = objectKey;
  }

  public AmazonS3Activity url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL that one can PUT the file to, to upload it to S3
   * @return url
  **/
  @ApiModelProperty(value = "URL that one can PUT the file to, to upload it to S3")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AmazonS3Activity userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user that created this S3 activity
   * @return userId
  **/
  @ApiModelProperty(value = "The id of the user that created this S3 activity")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonS3Activity amazonS3Activity = (AmazonS3Activity) o;
    return Objects.equals(this.action, amazonS3Activity.action) &&
        Objects.equals(this.cdnUrl, amazonS3Activity.cdnUrl) &&
        Objects.equals(this.createdDate, amazonS3Activity.createdDate) &&
        Objects.equals(this.filename, amazonS3Activity.filename) &&
        Objects.equals(this.id, amazonS3Activity.id) &&
        Objects.equals(this.objectKey, amazonS3Activity.objectKey) &&
        Objects.equals(this.url, amazonS3Activity.url) &&
        Objects.equals(this.userId, amazonS3Activity.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, cdnUrl, createdDate, filename, id, objectKey, url, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonS3Activity {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    cdnUrl: ").append(toIndentedString(cdnUrl)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

