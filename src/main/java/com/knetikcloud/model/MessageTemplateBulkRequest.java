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
import java.util.ArrayList;
import java.util.List;

/**
 * MessageTemplateBulkRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-25T09:42:19.526-04:00")
public class MessageTemplateBulkRequest {
  @JsonProperty("data")
  private Object data = null;

  @JsonProperty("ids")
  private List<String> ids = new ArrayList<String>();

  public MessageTemplateBulkRequest data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * The data to fill the templates with
   * @return data
  **/
  @ApiModelProperty(required = true, value = "The data to fill the templates with")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public MessageTemplateBulkRequest ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public MessageTemplateBulkRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * A list of message template ids
   * @return ids
  **/
  @ApiModelProperty(required = true, value = "A list of message template ids")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplateBulkRequest messageTemplateBulkRequest = (MessageTemplateBulkRequest) o;
    return Objects.equals(this.data, messageTemplateBulkRequest.data) &&
        Objects.equals(this.ids, messageTemplateBulkRequest.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, ids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateBulkRequest {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

