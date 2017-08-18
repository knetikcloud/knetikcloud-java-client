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
import com.knetikcloud.model.ExpressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * DateOperationResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-18T11:18:26.299-04:00")
public class DateOperationResource {
  @JsonProperty("args")
  private List<ExpressionResource> args = null;

  @JsonProperty("op")
  private String op = null;

  @JsonProperty("type")
  private String type = null;

  public DateOperationResource args(List<ExpressionResource> args) {
    this.args = args;
    return this;
  }

  public DateOperationResource addArgsItem(ExpressionResource argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<ExpressionResource>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @ApiModelProperty(value = "")
  public List<ExpressionResource> getArgs() {
    return args;
  }

  public void setArgs(List<ExpressionResource> args) {
    this.args = args;
  }

  public DateOperationResource op(String op) {
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @ApiModelProperty(value = "")
  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public DateOperationResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateOperationResource dateOperationResource = (DateOperationResource) o;
    return Objects.equals(this.args, dateOperationResource.args) &&
        Objects.equals(this.op, dateOperationResource.op) &&
        Objects.equals(this.type, dateOperationResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, op, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateOperationResource {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

