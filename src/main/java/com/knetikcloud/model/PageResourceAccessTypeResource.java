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
import com.knetikcloud.model.AccessTypeResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PageResourceAccessTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-09T10:26:02.967-04:00")
public class PageResourceAccessTypeResource {
  @JsonProperty("content")
  private List<AccessTypeResource> content = null;

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

  public PageResourceAccessTypeResource content(List<AccessTypeResource> content) {
    this.content = content;
    return this;
  }

  public PageResourceAccessTypeResource addContentItem(AccessTypeResource contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<AccessTypeResource>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public List<AccessTypeResource> getContent() {
    return content;
  }

  public void setContent(List<AccessTypeResource> content) {
    this.content = content;
  }

  public PageResourceAccessTypeResource first(Boolean first) {
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

  public PageResourceAccessTypeResource last(Boolean last) {
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

  public PageResourceAccessTypeResource number(Integer number) {
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

  public PageResourceAccessTypeResource numberOfElements(Integer numberOfElements) {
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

  public PageResourceAccessTypeResource size(Integer size) {
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

  public PageResourceAccessTypeResource totalElements(Long totalElements) {
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

  public PageResourceAccessTypeResource totalPages(Integer totalPages) {
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
    PageResourceAccessTypeResource pageResourceAccessTypeResource = (PageResourceAccessTypeResource) o;
    return Objects.equals(this.content, pageResourceAccessTypeResource.content) &&
        Objects.equals(this.first, pageResourceAccessTypeResource.first) &&
        Objects.equals(this.last, pageResourceAccessTypeResource.last) &&
        Objects.equals(this.number, pageResourceAccessTypeResource.number) &&
        Objects.equals(this.numberOfElements, pageResourceAccessTypeResource.numberOfElements) &&
        Objects.equals(this.size, pageResourceAccessTypeResource.size) &&
        Objects.equals(this.totalElements, pageResourceAccessTypeResource.totalElements) &&
        Objects.equals(this.totalPages, pageResourceAccessTypeResource.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, last, number, numberOfElements, size, totalElements, totalPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResourceAccessTypeResource {\n");
    
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

