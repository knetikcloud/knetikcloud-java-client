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


package com.knetikcloud.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.knetikcloud.model.FileProperty;
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * FileGroupProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-21T15:38:48.994-04:00")
public class FileGroupProperty extends Property {
  @JsonProperty("files")
  private List<FileProperty> files = new ArrayList<FileProperty>();

  public FileGroupProperty files(List<FileProperty> files) {
    this.files = files;
    return this;
  }

  public FileGroupProperty addFilesItem(FileProperty filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * The list of files
   * @return files
  **/
  @ApiModelProperty(example = "null", value = "The list of files")
  public List<FileProperty> getFiles() {
    return files;
  }

  public void setFiles(List<FileProperty> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileGroupProperty fileGroupProperty = (FileGroupProperty) o;
    return Objects.equals(this.files, fileGroupProperty.files) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileGroupProperty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

