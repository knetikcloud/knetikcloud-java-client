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

/**
 * VariableTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:47:52.984-05:00")
public class VariableTypeResource {
  /**
   * The base class of the type
   */
  public enum BaseEnum {
    @SerializedName("NUMBER")
    NUMBER("NUMBER"),
    
    @SerializedName("INTEGER")
    INTEGER("INTEGER"),
    
    @SerializedName("STRING")
    STRING("STRING"),
    
    @SerializedName("DATE")
    DATE("DATE"),
    
    @SerializedName("BOOLEAN")
    BOOLEAN("BOOLEAN");

    private String value;

    BaseEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("base")
  private BaseEnum base = null;

  @SerializedName("name")
  private String name = null;

  public VariableTypeResource base(BaseEnum base) {
    this.base = base;
    return this;
  }

   /**
   * The base class of the type
   * @return base
  **/
  @ApiModelProperty(example = "null", required = true, value = "The base class of the type")
  public BaseEnum getBase() {
    return base;
  }

  public void setBase(BaseEnum base) {
    this.base = base;
  }

  public VariableTypeResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the variable type. Used as the unique id
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the variable type. Used as the unique id")
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
        Objects.equals(this.name, variableTypeResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableTypeResource {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
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

