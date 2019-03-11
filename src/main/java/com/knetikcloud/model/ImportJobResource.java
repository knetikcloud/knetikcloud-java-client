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
import com.knetikcloud.model.ImportJobOutputResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ImportJobResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T10:18:04.496-04:00")
public class ImportJobResource {
  @JsonProperty("category_id")
  private String categoryId = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("output")
  private List<ImportJobOutputResource> output = null;

  @JsonProperty("record_count")
  private Long recordCount = null;

  /**
   * The status of the job
   */
  public enum StatusEnum {
    PENDING_VALIDATION("PENDING_VALIDATION"),
    
    VALIDATING("VALIDATING"),
    
    VALID("VALID"),
    
    INVALID("INVALID"),
    
    PENDING_PROCESS("PENDING_PROCESS"),
    
    PROCESSING("PROCESSING"),
    
    PROCESSED("PROCESSED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("vendor")
  private String vendor = null;

  public ImportJobResource categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The id of the category to assign all questions in the import to
   * @return categoryId
  **/
  @ApiModelProperty(required = true, value = "The id of the category to assign all questions in the import to")
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

   /**
   * The date the job was created in seconds since unix epoc
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the job was created in seconds since unix epoc")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The id of the job
   * @return id
  **/
  @ApiModelProperty(value = "The id of the job")
  public Long getId() {
    return id;
  }

  public ImportJobResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A name for this import for later reference
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A name for this import for later reference")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImportJobResource output(List<ImportJobOutputResource> output) {
    this.output = output;
    return this;
  }

  public ImportJobResource addOutputItem(ImportJobOutputResource outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<ImportJobOutputResource>();
    }
    this.output.add(outputItem);
    return this;
  }

   /**
   * Error information from validation
   * @return output
  **/
  @ApiModelProperty(value = "Error information from validation")
  public List<ImportJobOutputResource> getOutput() {
    return output;
  }

  public void setOutput(List<ImportJobOutputResource> output) {
    this.output = output;
  }

   /**
   * The number of questions form the CSV file. Filled in after validation
   * @return recordCount
  **/
  @ApiModelProperty(value = "The number of questions form the CSV file. Filled in after validation")
  public Long getRecordCount() {
    return recordCount;
  }

  public ImportJobResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the job
   * @return status
  **/
  @ApiModelProperty(value = "The status of the job")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * The date the job was last updated in seconds since unix epoc
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the job was last updated in seconds since unix epoc")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public ImportJobResource url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url of a CSV file to pull trivia questions from. Cannot be changed after initial POST
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The url of a CSV file to pull trivia questions from. Cannot be changed after initial POST")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ImportJobResource vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * The vendor who supplied this set of questions
   * @return vendor
  **/
  @ApiModelProperty(required = true, value = "The vendor who supplied this set of questions")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportJobResource importJobResource = (ImportJobResource) o;
    return Objects.equals(this.categoryId, importJobResource.categoryId) &&
        Objects.equals(this.createdDate, importJobResource.createdDate) &&
        Objects.equals(this.id, importJobResource.id) &&
        Objects.equals(this.name, importJobResource.name) &&
        Objects.equals(this.output, importJobResource.output) &&
        Objects.equals(this.recordCount, importJobResource.recordCount) &&
        Objects.equals(this.status, importJobResource.status) &&
        Objects.equals(this.updatedDate, importJobResource.updatedDate) &&
        Objects.equals(this.url, importJobResource.url) &&
        Objects.equals(this.vendor, importJobResource.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, createdDate, id, name, output, recordCount, status, updatedDate, url, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJobResource {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

