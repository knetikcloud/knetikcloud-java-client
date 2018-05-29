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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SearchDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T13:50:55.134-04:00")
public class SearchDocument {
  @JsonProperty("data")
  private Object data = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("template_version_data")
  private Object templateVersionData = null;

  @JsonProperty("type")
  private String type = null;

  public SearchDocument data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public SearchDocument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SearchDocument template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public SearchDocument templateVersionData(Object templateVersionData) {
    this.templateVersionData = templateVersionData;
    return this;
  }

   /**
   * Get templateVersionData
   * @return templateVersionData
  **/
  @ApiModelProperty(value = "")
  public Object getTemplateVersionData() {
    return templateVersionData;
  }

  public void setTemplateVersionData(Object templateVersionData) {
    this.templateVersionData = templateVersionData;
  }

  public SearchDocument type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchDocument searchDocument = (SearchDocument) o;
    return Objects.equals(this.data, searchDocument.data) &&
        Objects.equals(this.id, searchDocument.id) &&
        Objects.equals(this.template, searchDocument.template) &&
        Objects.equals(this.templateVersionData, searchDocument.templateVersionData) &&
        Objects.equals(this.type, searchDocument.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, id, template, templateVersionData, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchDocument {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateVersionData: ").append(toIndentedString(templateVersionData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
