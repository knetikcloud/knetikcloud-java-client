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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PropertyDefinitionResource;
import java.util.ArrayList;
import java.util.List;

/**
 * QuestionTemplateResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T19:56:53.315-05:00")
public class QuestionTemplateResource {
  @SerializedName("answer_property")
  private PropertyDefinitionResource answerProperty = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("properties")
  private List<PropertyDefinitionResource> properties = new ArrayList<PropertyDefinitionResource>();

  @SerializedName("question_property")
  private PropertyDefinitionResource questionProperty = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public QuestionTemplateResource answerProperty(PropertyDefinitionResource answerProperty) {
    this.answerProperty = answerProperty;
    return this;
  }

   /**
   * A property definition for all answers. If included each answer must match this definition's type and be valid
   * @return answerProperty
  **/
  @ApiModelProperty(example = "null", value = "A property definition for all answers. If included each answer must match this definition's type and be valid")
  public PropertyDefinitionResource getAnswerProperty() {
    return answerProperty;
  }

  public void setAnswerProperty(PropertyDefinitionResource answerProperty) {
    this.answerProperty = answerProperty;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The id of the template
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the template")
  public String getId() {
    return id;
  }

  public QuestionTemplateResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the template
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the template")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QuestionTemplateResource properties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
    return this;
  }

  public QuestionTemplateResource addPropertiesItem(PropertyDefinitionResource propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The customized properties that are present
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "The customized properties that are present")
  public List<PropertyDefinitionResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
  }

  public QuestionTemplateResource questionProperty(PropertyDefinitionResource questionProperty) {
    this.questionProperty = questionProperty;
    return this;
  }

   /**
   * A property definition for the question itself. If included the answer must match this definition's type and be valid
   * @return questionProperty
  **/
  @ApiModelProperty(example = "null", value = "A property definition for the question itself. If included the answer must match this definition's type and be valid")
  public PropertyDefinitionResource getQuestionProperty() {
    return questionProperty;
  }

  public void setQuestionProperty(PropertyDefinitionResource questionProperty) {
    this.questionProperty = questionProperty;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionTemplateResource questionTemplateResource = (QuestionTemplateResource) o;
    return Objects.equals(this.answerProperty, questionTemplateResource.answerProperty) &&
        Objects.equals(this.createdDate, questionTemplateResource.createdDate) &&
        Objects.equals(this.id, questionTemplateResource.id) &&
        Objects.equals(this.name, questionTemplateResource.name) &&
        Objects.equals(this.properties, questionTemplateResource.properties) &&
        Objects.equals(this.questionProperty, questionTemplateResource.questionProperty) &&
        Objects.equals(this.updatedDate, questionTemplateResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerProperty, createdDate, id, name, properties, questionProperty, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionTemplateResource {\n");
    
    sb.append("    answerProperty: ").append(toIndentedString(answerProperty)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    questionProperty: ").append(toIndentedString(questionProperty)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

