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
 * BatchRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:18:14.481-05:00")
public class BatchRequest {
  @SerializedName("body")
  private Object body = null;

  @SerializedName("content_type")
  private String contentType = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("timeout")
  private Integer timeout = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("uri")
  private String uri = null;

  public BatchRequest body(Object body) {
    this.body = body;
    return this;
  }

   /**
   * The request body as would be passed to the URI
   * @return body
  **/
  @ApiModelProperty(example = "null", required = true, value = "The request body as would be passed to the URI")
  public Object getBody() {
    return body;
  }

  public void setBody(Object body) {
    this.body = body;
  }

  public BatchRequest contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Content type used, Ex:(application/json)
   * @return contentType
  **/
  @ApiModelProperty(example = "null", required = true, value = "Content type used, Ex:(application/json)")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public BatchRequest method(String method) {
    this.method = method;
    return this;
  }

   /**
   * The HTTP method used, Ex: (GET)
   * @return method
  **/
  @ApiModelProperty(example = "null", required = true, value = "The HTTP method used, Ex: (GET)")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public BatchRequest timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Time in seconds before process will timeout.  Default is 60.  Range is 1-300
   * @return timeout
  **/
  @ApiModelProperty(example = "null", required = true, value = "Time in seconds before process will timeout.  Default is 60.  Range is 1-300")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public BatchRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The oauth token only
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "The oauth token only")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public BatchRequest uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Full URI of REST call
   * @return uri
  **/
  @ApiModelProperty(example = "null", required = true, value = "Full URI of REST call")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequest batchRequest = (BatchRequest) o;
    return Objects.equals(this.body, batchRequest.body) &&
        Objects.equals(this.contentType, batchRequest.contentType) &&
        Objects.equals(this.method, batchRequest.method) &&
        Objects.equals(this.timeout, batchRequest.timeout) &&
        Objects.equals(this.token, batchRequest.token) &&
        Objects.equals(this.uri, batchRequest.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, contentType, method, timeout, token, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequest {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

