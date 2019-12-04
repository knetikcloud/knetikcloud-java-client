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
 * VariableTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-04T08:56:21.771-05:00")
public class VariableTypeResource {
  /**
   * The base class of the type
   */
  public enum BaseEnum {
    NUMBER("NUMBER"),
    
    INTEGER("INTEGER"),
    
    STRING("STRING"),
    
    DATE("DATE"),
    
    BOOLEAN("BOOLEAN");

    private String value;

    BaseEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BaseEnum fromValue(String text) {
      for (BaseEnum b : BaseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("base")
  private BaseEnum base = null;

  @JsonProperty("enumerable")
  private Boolean enumerable = null;

  @JsonProperty("name")
  private String name = null;

  public VariableTypeResource base(BaseEnum base) {
    this.base = base;
    return this;
  }

   /**
   * The base class of the type
   * @return base
  **/
  @ApiModelProperty(required = true, value = "The base class of the type")
  public BaseEnum getBase() {
    return base;
  }

  public void setBase(BaseEnum base) {
    this.base = base;
  }

   /**
   * Whether the type comes from a set of valid values that the system can provided (such as users)
   * @return enumerable
  **/
  @ApiModelProperty(example = "false", value = "Whether the type comes from a set of valid values that the system can provided (such as users)")
  public Boolean isEnumerable() {
    return enumerable;
  }

  public VariableTypeResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the variable type. Used as the unique id
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the variable type. Used as the unique id")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableTypeResource variableTypeResource = (VariableTypeResource) o;
    return Objects.equals(this.base, variableTypeResource.base) &&
        Objects.equals(this.enumerable, variableTypeResource.enumerable) &&
        Objects.equals(this.name, variableTypeResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, enumerable, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableTypeResource {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    enumerable: ").append(toIndentedString(enumerable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

