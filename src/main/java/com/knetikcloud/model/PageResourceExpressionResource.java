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
 * PageResourceExpressionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-10T11:34:11.759-04:00")
public class PageResourceExpressionResource {
  @JsonProperty("content")
  private List<ExpressionResource> content = null;

  @JsonProperty("first")
  private Boolean first = null;

  @JsonProperty("last")
  private Boolean last = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("number_of_elements")
  private Integer numberOfElements = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("total_elements")
  private Long totalElements = null;

  @JsonProperty("total_pages")
  private Integer totalPages = null;

  public PageResourceExpressionResource content(List<ExpressionResource> content) {
    this.content = content;
    return this;
  }

  public PageResourceExpressionResource addContentItem(ExpressionResource contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<ExpressionResource>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public List<ExpressionResource> getContent() {
    return content;
  }

  public void setContent(List<ExpressionResource> content) {
    this.content = content;
  }

  public PageResourceExpressionResource first(Boolean first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")
  public Boolean isFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public PageResourceExpressionResource last(Boolean last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")
  public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public PageResourceExpressionResource number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageResourceExpressionResource numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PageResourceExpressionResource size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageResourceExpressionResource totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(value = "")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageResourceExpressionResource totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageResourceExpressionResource pageResourceExpressionResource = (PageResourceExpressionResource) o;
    return Objects.equals(this.content, pageResourceExpressionResource.content) &&
        Objects.equals(this.first, pageResourceExpressionResource.first) &&
        Objects.equals(this.last, pageResourceExpressionResource.last) &&
        Objects.equals(this.number, pageResourceExpressionResource.number) &&
        Objects.equals(this.numberOfElements, pageResourceExpressionResource.numberOfElements) &&
        Objects.equals(this.size, pageResourceExpressionResource.size) &&
        Objects.equals(this.totalElements, pageResourceExpressionResource.totalElements) &&
        Objects.equals(this.totalPages, pageResourceExpressionResource.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, last, number, numberOfElements, size, totalElements, totalPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResourceExpressionResource {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

