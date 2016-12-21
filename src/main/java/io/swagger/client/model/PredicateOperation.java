/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
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
import io.swagger.client.model.Expressionobject;
import io.swagger.client.model.Operator;
import java.util.ArrayList;
import java.util.List;

/**
 * PredicateOperation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:47:52.984-05:00")
public class PredicateOperation {
  @SerializedName("args")
  private List<Expressionobject> args = new ArrayList<Expressionobject>();

  @SerializedName("operator")
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
