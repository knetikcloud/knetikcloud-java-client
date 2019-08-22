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
import com.knetikcloud.model.ArgumentResource;
import com.knetikcloud.model.Operator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OperationDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T09:25:55.249-04:00")
public class OperationDefinitionResource {
  @JsonProperty("arguments")
  private List<ArgumentResource> arguments = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("operator")
  private Operator operator = null;

  @JsonProperty("return_type")
  private String returnType = null;

  @JsonProperty("template")
  private String template = null;

  public OperationDefinitionResource arguments(List<ArgumentResource> arguments) {
    this.arguments = arguments;
    return this;
  }

  public OperationDefinitionResource addArgumentsItem(ArgumentResource argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<ArgumentResource>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @ApiModelProperty(value = "")
  public List<ArgumentResource> getArguments() {
    return arguments;
  }

  public void setArguments(List<ArgumentResource> arguments) {
    this.arguments = arguments;
  }

  public OperationDefinitionResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OperationDefinitionResource operator(Operator operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(value = "")
  public Operator getOperator() {
    return operator;
  }

  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  public OperationDefinitionResource returnType(String returnType) {
    this.returnType = returnType;
    return this;
  }

   /**
   * Get returnType
   * @return returnType
  **/
  @ApiModelProperty(value = "")
  public String getReturnType() {
    return returnType;
  }

  public void setReturnType(String returnType) {
    this.returnType = returnType;
  }

  public OperationDefinitionResource template(String template) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationDefinitionResource operationDefinitionResource = (OperationDefinitionResource) o;
    return Objects.equals(this.arguments, operationDefinitionResource.arguments) &&
        Objects.equals(this.description, operationDefinitionResource.description) &&
        Objects.equals(this.operator, operationDefinitionResource.operator) &&
        Objects.equals(this.returnType, operationDefinitionResource.returnType) &&
        Objects.equals(this.template, operationDefinitionResource.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, description, operator, returnType, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationDefinitionResource {\n");
    
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

