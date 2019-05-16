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
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FileProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:17:28.027-04:00")
public class FileProperty extends Property {
  @JsonProperty("crc")
  private String crc = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("file_type")
  private String fileType = null;

  @JsonProperty("url")
  private String url = null;

  public FileProperty crc(String crc) {
    this.crc = crc;
    return this;
  }

   /**
   * A crc value for file integrity verification
   * @return crc
  **/
  @ApiModelProperty(value = "A crc value for file integrity verification")
  public String getCrc() {
    return crc;
  }

  public void setCrc(String crc) {
    this.crc = crc;
  }

  public FileProperty description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the file
   * @return description
  **/
  @ApiModelProperty(value = "A description of the file")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FileProperty fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * The type of file such as txt, mp3, mov or csv
   * @return fileType
  **/
  @ApiModelProperty(value = "The type of file such as txt, mp3, mov or csv")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public FileProperty url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url of the file
   * @return url
  **/
  @ApiModelProperty(value = "The url of the file")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileProperty fileProperty = (FileProperty) o;
    return Objects.equals(this.crc, fileProperty.crc) &&
        Objects.equals(this.description, fileProperty.description) &&
        Objects.equals(this.fileType, fileProperty.fileType) &&
        Objects.equals(this.url, fileProperty.url) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crc, description, fileType, url, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileProperty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    crc: ").append(toIndentedString(crc)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

