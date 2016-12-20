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

/**
 * UsageInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T18:40:53.584-05:00")
public class UsageInfo {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("date")
  private Long date = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("url")
  private String url = null;

  public UsageInfo count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * The number of requests within the range
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "The number of requests within the range")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public UsageInfo date(Long date) {
    this.date = date;
    return this;
  }

   /**
   * The date at the start of the range (see granularity)
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "The date at the start of the range (see granularity)")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public UsageInfo method(String method) {
    this.method = method;
    return this;
  }

   /**
   * The http method
   * @return method
  **/
  @ApiModelProperty(example = "null", value = "The http method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public UsageInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url path
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The url path")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageInfo usageInfo = (UsageInfo) o;
    return Objects.equals(this.count, usageInfo.count) &&
        Objects.equals(this.date, usageInfo.date) &&
        Objects.equals(this.method, usageInfo.method) &&
        Objects.equals(this.url, usageInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, date, method, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageInfo {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

