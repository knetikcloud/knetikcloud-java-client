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
 * PatchActionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")
public class PatchActionResource {
  /**
   * The action you wish to perform on the resource
   */
  public enum OpEnum {
    REPLACE("replace"),
    
    ADD("add"),
    
    REMOVE("remove"),
    
    TEST("test");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String text) {
      for (OpEnum b : OpEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("op")
  private OpEnum op = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("value")
  private Object value = null;

  public PatchActionResource op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * The action you wish to perform on the resource
   * @return op
  **/
  @ApiModelProperty(required = true, value = "The action you wish to perform on the resource")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public PatchActionResource path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The JSON Pointer (JSON key) you wish to patch
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The JSON Pointer (JSON key) you wish to patch")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PatchActionResource value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The new value for the JSON path
   * @return value
  **/
  @ApiModelProperty(value = "The new value for the JSON path")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchActionResource patchActionResource = (PatchActionResource) o;
    return Objects.equals(this.op, patchActionResource.op) &&
        Objects.equals(this.path, patchActionResource.path) &&
        Objects.equals(this.value, patchActionResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchActionResource {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

