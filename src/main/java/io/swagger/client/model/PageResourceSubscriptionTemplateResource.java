/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Order;
import io.swagger.client.model.SubscriptionTemplateResource;
import java.util.ArrayList;
import java.util.List;


/**
 * PageResourceSubscriptionTemplateResource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T11:02:36.323-05:00")
public class PageResourceSubscriptionTemplateResource   {
  @SerializedName("content")
  private List<SubscriptionTemplateResource> content = new ArrayList<SubscriptionTemplateResource>();

  @SerializedName("first")
  private Boolean first = null;

  @SerializedName("last")
  private Boolean last = null;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("number_of_elements")
  private Integer numberOfElements = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("sort")
  private List<Order> sort = new ArrayList<Order>();

  @SerializedName("total_elements")
  private Long totalElements = null;

  @SerializedName("total_pages")
  private Integer totalPages = null;

  public PageResourceSubscriptionTemplateResource content(List<SubscriptionTemplateResource> content) {
    this.content = content;
    return this;
  }

  public PageResourceSubscriptionTemplateResource addContentItem(SubscriptionTemplateResource contentItem) {
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SubscriptionTemplateResource> getContent() {
    return content;
  }

  public void setContent(List<SubscriptionTemplateResource> content) {
    this.content = content;
  }

  public PageResourceSubscriptionTemplateResource first(Boolean first) {
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

  public PageResourceSubscriptionTemplateResource last(Boolean last) {
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

  public PageResourceSubscriptionTemplateResource number(Integer number) {
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

  public PageResourceSubscriptionTemplateResource numberOfElements(Integer numberOfElements) {
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

  public PageResourceSubscriptionTemplateResource size(Integer size) {
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

  public PageResourceSubscriptionTemplateResource sort(List<Order> sort) {
    this.sort = sort;
    return this;
  }

  public PageResourceSubscriptionTemplateResource addSortItem(Order sortItem) {
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

  public PageResourceSubscriptionTemplateResource totalElements(Long totalElements) {
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

  public PageResourceSubscriptionTemplateResource totalPages(Integer totalPages) {
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
    PageResourceSubscriptionTemplateResource pageResourceSubscriptionTemplateResource = (PageResourceSubscriptionTemplateResource) o;
    return Objects.equals(this.content, pageResourceSubscriptionTemplateResource.content) &&
        Objects.equals(this.first, pageResourceSubscriptionTemplateResource.first) &&
        Objects.equals(this.last, pageResourceSubscriptionTemplateResource.last) &&
        Objects.equals(this.number, pageResourceSubscriptionTemplateResource.number) &&
        Objects.equals(this.numberOfElements, pageResourceSubscriptionTemplateResource.numberOfElements) &&
        Objects.equals(this.size, pageResourceSubscriptionTemplateResource.size) &&
        Objects.equals(this.sort, pageResourceSubscriptionTemplateResource.sort) &&
        Objects.equals(this.totalElements, pageResourceSubscriptionTemplateResource.totalElements) &&
        Objects.equals(this.totalPages, pageResourceSubscriptionTemplateResource.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, last, number, numberOfElements, size, sort, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResourceSubscriptionTemplateResource {\n");
    
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

