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
import com.knetikcloud.model.BareChallengeActivityResource;
import com.knetikcloud.model.Order;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PageResourceBareChallengeActivityResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-21T15:38:48.994-04:00")
public class PageResourceBareChallengeActivityResource {
  @JsonProperty("content")
  private List<BareChallengeActivityResource> content = new ArrayList<BareChallengeActivityResource>();

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

  @JsonProperty("sort")
  private List<Order> sort = new ArrayList<Order>();

  @JsonProperty("total_elements")
  private Long totalElements = null;

  @JsonProperty("total_pages")
  private Integer totalPages = null;

  public PageResourceBareChallengeActivityResource content(List<BareChallengeActivityResource> content) {
    this.content = content;
    return this;
  }

  public PageResourceBareChallengeActivityResource addContentItem(BareChallengeActivityResource contentItem) {
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BareChallengeActivityResource> getContent() {
    return content;
  }

  public void setContent(List<BareChallengeActivityResource> content) {
    this.content = content;
  }

  public PageResourceBareChallengeActivityResource first(Boolean first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public PageResourceBareChallengeActivityResource last(Boolean last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public PageResourceBareChallengeActivityResource number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageResourceBareChallengeActivityResource numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PageResourceBareChallengeActivityResource size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageResourceBareChallengeActivityResource sort(List<Order> sort) {
    this.sort = sort;
    return this;
  }

  public PageResourceBareChallengeActivityResource addSortItem(Order sortItem) {
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Order> getSort() {
    return sort;
  }

  public void setSort(List<Order> sort) {
    this.sort = sort;
  }

  public PageResourceBareChallengeActivityResource totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageResourceBareChallengeActivityResource totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(example = "null", value = "")
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
    PageResourceBareChallengeActivityResource pageResourceBareChallengeActivityResource = (PageResourceBareChallengeActivityResource) o;
    return Objects.equals(this.content, pageResourceBareChallengeActivityResource.content) &&
        Objects.equals(this.first, pageResourceBareChallengeActivityResource.first) &&
        Objects.equals(this.last, pageResourceBareChallengeActivityResource.last) &&
        Objects.equals(this.number, pageResourceBareChallengeActivityResource.number) &&
        Objects.equals(this.numberOfElements, pageResourceBareChallengeActivityResource.numberOfElements) &&
        Objects.equals(this.size, pageResourceBareChallengeActivityResource.size) &&
        Objects.equals(this.sort, pageResourceBareChallengeActivityResource.sort) &&
        Objects.equals(this.totalElements, pageResourceBareChallengeActivityResource.totalElements) &&
        Objects.equals(this.totalPages, pageResourceBareChallengeActivityResource.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, last, number, numberOfElements, size, sort, totalElements, totalPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResourceBareChallengeActivityResource {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

