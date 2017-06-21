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
import com.knetikcloud.model.Expressionobject;
import com.knetikcloud.model.Operator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PredicateOperation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-21T15:38:48.994-04:00")
public class PredicateOperation {
  @JsonProperty("args")
  private List<Expressionobject> args = new ArrayList<Expressionobject>();

  @JsonProperty("operator")
  private Operator operator = null;

  public PredicateOperation args(List<Expressionobject> args) {
    this.args = args;
    return this;
  }

  public PredicateOperation addArgsItem(Expressionobject argsItem) {
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Expressionobject> getArgs() {
    return args;
  }

  public void setArgs(List<Expressionobject> args) {
    this.args = args;
  }

  public PredicateOperation operator(Operator operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(example = "null", value = "")
  public Operator getOperator() {
    return operator;
  }

  public void setOperator(Operator operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredicateOperation predicateOperation = (PredicateOperation) o;
    return Objects.equals(this.args, predicateOperation.args) &&
        Objects.equals(this.operator, predicateOperation.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredicateOperation {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

