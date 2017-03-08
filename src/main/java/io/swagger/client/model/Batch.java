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
import io.swagger.client.model.BatchRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Batch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T23:51:18.933-05:00")
public class Batch {
  @SerializedName("batch")
  private List<BatchRequest> batch = new ArrayList<BatchRequest>();

  public Batch batch(List<BatchRequest> batch) {
    this.batch = batch;
    return this;
  }

  public Batch addBatchItem(BatchRequest batchItem) {
    this.batch.add(batchItem);
    return this;
  }

   /**
   * Get batch
   * @return batch
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BatchRequest> getBatch() {
    return batch;
  }

  public void setBatch(List<BatchRequest> batch) {
    this.batch = batch;
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
    return Objects.equals(this.batch, batch.batch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
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

