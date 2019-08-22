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
import com.knetikcloud.model.ErrorResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Result
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T09:25:55.249-04:00")
public class Result {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("request_id")
  private String requestId = null;

  @JsonProperty("result")
  private List<ErrorResource> result = null;

   /**
   * The JSAPI error code
   * @return code
  **/
  @ApiModelProperty(value = "The JSAPI error code")
  public Integer getCode() {
    return code;
  }

   /**
   * The id used for debugging lookup
   * @return requestId
  **/
  @ApiModelProperty(value = "The id used for debugging lookup")
  public String getRequestId() {
    return requestId;
  }

  public Result result(List<ErrorResource> result) {
    this.result = result;
    return this;
  }

  public Result addResultItem(ErrorResource resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<ErrorResource>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * The error object
   * @return result
  **/
  @ApiModelProperty(value = "The error object")
  public List<ErrorResource> getResult() {
    return result;
  }

  public void setResult(List<ErrorResource> result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.code, result.code) &&
        Objects.equals(this.requestId, result.requestId) &&
        Objects.equals(this.result, result.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, requestId, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

