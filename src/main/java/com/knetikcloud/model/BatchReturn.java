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
 * BatchReturn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-01T09:23:20.387-05:00")
public class BatchReturn {
  @JsonProperty("body")
  private Object body = null;

  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("uri")
  private String uri = null;

  public BatchReturn body(Object body) {
    this.body = body;
    return this;
  }

   /**
   * The result body
   * @return body
  **/
  @ApiModelProperty(value = "The result body")
  public Object getBody() {
    return body;
  }

  public void setBody(Object body) {
    this.body = body;
  }

   /**
   * The HTTP response code
   * @return code
  **/
  @ApiModelProperty(value = "The HTTP response code")
  public Integer getCode() {
    return code;
  }

   /**
   * Full URI of REST call
   * @return uri
  **/
  @ApiModelProperty(value = "Full URI of REST call")
  public String getUri() {
    return uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchReturn batchReturn = (BatchReturn) o;
    return Objects.equals(this.body, batchReturn.body) &&
        Objects.equals(this.code, batchReturn.code) &&
        Objects.equals(this.uri, batchReturn.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, code, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchReturn {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

