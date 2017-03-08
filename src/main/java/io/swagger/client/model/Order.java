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

/**
 * Order
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T19:56:53.315-05:00")
public class Order {
  @SerializedName("ascending")
  private Boolean ascending = null;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    @SerializedName("ASC")
    ASC("ASC"),
    
    @SerializedName("DESC")
    DESC("DESC");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;

  @SerializedName("ignore_case")
  private Boolean ignoreCase = null;

  /**
   * Gets or Sets nullHandling
   */
  public enum NullHandlingEnum {
    @SerializedName("NATIVE")
    NATIVE("NATIVE"),
    
    @SerializedName("NULLS_FIRST")
    NULLS_FIRST("NULLS_FIRST"),
    
    @SerializedName("NULLS_LAST")
    NULLS_LAST("NULLS_LAST");

    private String value;

    NullHandlingEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("null_handling")
  private NullHandlingEnum nullHandling = null;

  @SerializedName("property")
  private String property = null;

  public Order ascending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }

   /**
   * Get ascending
   * @return ascending
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAscending() {
    return ascending;
  }

  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }

  public Order direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(example = "null", value = "")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public Order ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public Order nullHandling(NullHandlingEnum nullHandling) {
    this.nullHandling = nullHandling;
    return this;
  }

   /**
   * Get nullHandling
   * @return nullHandling
  **/
  @ApiModelProperty(example = "null", value = "")
  public NullHandlingEnum getNullHandling() {
    return nullHandling;
  }

  public void setNullHandling(NullHandlingEnum nullHandling) {
    this.nullHandling = nullHandling;
  }

  public Order property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.ascending, order.ascending) &&
        Objects.equals(this.direction, order.direction) &&
        Objects.equals(this.ignoreCase, order.ignoreCase) &&
        Objects.equals(this.nullHandling, order.nullHandling) &&
        Objects.equals(this.property, order.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ascending, direction, ignoreCase, nullHandling, property);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    nullHandling: ").append(toIndentedString(nullHandling)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

