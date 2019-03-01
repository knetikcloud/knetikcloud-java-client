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
import com.knetikcloud.model.InnerQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SearchQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-01T09:23:20.387-05:00")
public class SearchQuery {
  @JsonProperty("from")
  private Integer from = null;

  @JsonProperty("query")
  private InnerQuery query = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sort")
  private Object sort = null;

  @JsonProperty("source")
  private Object source = null;

  public SearchQuery from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * Index of the first result to be returned for pagination
   * @return from
  **/
  @ApiModelProperty(value = "Index of the first result to be returned for pagination")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public SearchQuery query(InnerQuery query) {
    this.query = query;
    return this;
  }

   /**
   * The query body
   * @return query
  **/
  @ApiModelProperty(required = true, value = "The query body")
  public InnerQuery getQuery() {
    return query;
  }

  public void setQuery(InnerQuery query) {
    this.query = query;
  }

  public SearchQuery size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The maximum number of results to be returned for pagination
   * @return size
  **/
  @ApiModelProperty(value = "The maximum number of results to be returned for pagination")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public SearchQuery sort(Object sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Elasticsearch sort
   * @return sort
  **/
  @ApiModelProperty(value = "Elasticsearch sort")
  public Object getSort() {
    return sort;
  }

  public void setSort(Object sort) {
    this.sort = sort;
  }

  public SearchQuery source(Object source) {
    this.source = source;
    return this;
  }

   /**
   * Elasticsearch source
   * @return source
  **/
  @ApiModelProperty(value = "Elasticsearch source")
  public Object getSource() {
    return source;
  }

  public void setSource(Object source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchQuery searchQuery = (SearchQuery) o;
    return Objects.equals(this.from, searchQuery.from) &&
        Objects.equals(this.query, searchQuery.query) &&
        Objects.equals(this.size, searchQuery.size) &&
        Objects.equals(this.sort, searchQuery.sort) &&
        Objects.equals(this.source, searchQuery.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, query, size, sort, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchQuery {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

