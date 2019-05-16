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
import com.knetikcloud.model.PropertyDefinitionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FilePropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:07:48.774-04:00")
public class FilePropertyDefinitionResource extends PropertyDefinitionResource {
  @JsonProperty("file_type")
  private String fileType = null;

  @JsonProperty("max_file_size")
  private Long maxFileSize = null;

  public FilePropertyDefinitionResource fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * If provided, a file type that the property must match
   * @return fileType
  **/
  @ApiModelProperty(value = "If provided, a file type that the property must match")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public FilePropertyDefinitionResource maxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

   /**
   * If provided, the maximum allowed file size in bytes
   * @return maxFileSize
  **/
  @ApiModelProperty(value = "If provided, the maximum allowed file size in bytes")
  public Long getMaxFileSize() {
    return maxFileSize;
  }

  public void setMaxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilePropertyDefinitionResource filePropertyDefinitionResource = (FilePropertyDefinitionResource) o;
    return Objects.equals(this.fileType, filePropertyDefinitionResource.fileType) &&
        Objects.equals(this.maxFileSize, filePropertyDefinitionResource.maxFileSize) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, maxFileSize, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
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

