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
import com.knetikcloud.model.BatchRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Batch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-07T16:44:21.413-04:00")
public class Batch {
  @JsonProperty("batch")
  private List<BatchRequest> batch = new ArrayList<BatchRequest>();

  @JsonProperty("timeout")
  private Integer timeout = null;

  public Batch batch(List<BatchRequest> batch) {
    this.batch = batch;
    return this;
  }

  public Batch addBatchItem(BatchRequest batchItem) {
    this.batch.add(batchItem);
    return this;
  }

   /**
   * The list of batch requests
   * @return batch
  **/
  @ApiModelProperty(required = true, value = "The list of batch requests")
  public List<BatchRequest> getBatch() {
    return batch;
  }

  public void setBatch(List<BatchRequest> batch) {
    this.batch = batch;
  }

  public Batch timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * The amount of time before a request token is returned instead of the batch result.  Default is 60.  Range is 0-300
   * @return timeout
  **/
  @ApiModelProperty(required = true, value = "The amount of time before a request token is returned instead of the batch result.  Default is 60.  Range is 0-300")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return Objects.equals(this.batch, batch.batch) &&
        Objects.equals(this.timeout, batch.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batch, timeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

