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
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FileGroupPropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class FileGroupPropertyDefinitionResource extends PropertyDefinitionResource {
  @JsonProperty("file_type")
  private String fileType = null;

  @JsonProperty("max_count")
  private Integer maxCount = null;

  @JsonProperty("max_file_size")
  private Long maxFileSize = null;

  @JsonProperty("min_count")
  private Integer minCount = null;

  public FileGroupPropertyDefinitionResource fileType(String fileType) {
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

  public FileGroupPropertyDefinitionResource maxCount(Integer maxCount) {
    this.maxCount = maxCount;
    return this;
  }

   /**
   * If provided, the maximum number of files in the group
   * @return maxCount
  **/
  @ApiModelProperty(value = "If provided, the maximum number of files in the group")
  public Integer getMaxCount() {
    return maxCount;
  }

  public void setMaxCount(Integer maxCount) {
    this.maxCount = maxCount;
  }

  public FileGroupPropertyDefinitionResource maxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

   /**
   * If provided, the maximum allowed size per file in bytes
   * @return maxFileSize
  **/
  @ApiModelProperty(value = "If provided, the maximum allowed size per file in bytes")
  public Long getMaxFileSize() {
    return maxFileSize;
  }

  public void setMaxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  public FileGroupPropertyDefinitionResource minCount(Integer minCount) {
    this.minCount = minCount;
    return this;
  }

   /**
   * If provided, the minimum number of files in the group
   * @return minCount
  **/
  @ApiModelProperty(value = "If provided, the minimum number of files in the group")
  public Integer getMinCount() {
    return minCount;
  }

  public void setMinCount(Integer minCount) {
    this.minCount = minCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileGroupPropertyDefinitionResource fileGroupPropertyDefinitionResource = (FileGroupPropertyDefinitionResource) o;
    return Objects.equals(this.fileType, fileGroupPropertyDefinitionResource.fileType) &&
        Objects.equals(this.maxCount, fileGroupPropertyDefinitionResource.maxCount) &&
        Objects.equals(this.maxFileSize, fileGroupPropertyDefinitionResource.maxFileSize) &&
        Objects.equals(this.minCount, fileGroupPropertyDefinitionResource.minCount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, maxCount, maxFileSize, minCount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGroupPropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
    sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
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

