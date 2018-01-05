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
 * S3Config
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T09:36:00.854-05:00")
public class S3Config {
  @JsonProperty("bucket_name")
  private String bucketName = null;

  @JsonProperty("cdn_url")
  private String cdnUrl = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("upload_prefix")
  private String uploadPrefix = null;

  public S3Config bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Get bucketName
   * @return bucketName
  **/
  @ApiModelProperty(value = "")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public S3Config cdnUrl(String cdnUrl) {
    this.cdnUrl = cdnUrl;
    return this;
  }

   /**
   * Get cdnUrl
   * @return cdnUrl
  **/
  @ApiModelProperty(value = "")
  public String getCdnUrl() {
    return cdnUrl;
  }

  public void setCdnUrl(String cdnUrl) {
    this.cdnUrl = cdnUrl;
  }

  public S3Config region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public S3Config uploadPrefix(String uploadPrefix) {
    this.uploadPrefix = uploadPrefix;
    return this;
  }

   /**
   * Get uploadPrefix
   * @return uploadPrefix
  **/
  @ApiModelProperty(value = "")
  public String getUploadPrefix() {
    return uploadPrefix;
  }

  public void setUploadPrefix(String uploadPrefix) {
    this.uploadPrefix = uploadPrefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3Config s3Config = (S3Config) o;
    return Objects.equals(this.bucketName, s3Config.bucketName) &&
        Objects.equals(this.cdnUrl, s3Config.cdnUrl) &&
        Objects.equals(this.region, s3Config.region) &&
        Objects.equals(this.uploadPrefix, s3Config.uploadPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, cdnUrl, region, uploadPrefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3Config {\n");
    
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    cdnUrl: ").append(toIndentedString(cdnUrl)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    uploadPrefix: ").append(toIndentedString(uploadPrefix)).append("\n");
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

