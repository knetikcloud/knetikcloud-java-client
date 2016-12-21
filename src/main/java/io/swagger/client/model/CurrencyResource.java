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
 * CurrencyResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:47:52.984-05:00")
public class CurrencyResource {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("factor")
  private Double factor = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The type of currency. Default 'real'
   */
  public enum TypeEnum {
    @SerializedName("real")
    REAL("real"),
    
    @SerializedName("virtual")
    VIRTUAL("virtual");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public CurrencyResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the currency is active. Default true
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the currency is active. Default true")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CurrencyResource code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The unique id code for the currency. Maximum 5 characters
   * @return code
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique id code for the currency. Maximum 5 characters")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

   /**
   * The unix timestamp in seconds the currency was added to the system
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The unix timestamp in seconds the currency was added to the system")
  public Long getCreatedDate() {
    return createdDate;
  }

  public CurrencyResource factor(Double factor) {
    this.factor = factor;
    return this;
  }

   /**
   * The decimal to multiply the system base currency (from config 'currency') to localize to this one. Should be 1 for the base currency itself.
   * @return factor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The decimal to multiply the system base currency (from config 'currency') to localize to this one. Should be 1 for the base currency itself.")
  public Double getFactor() {
    return factor;
  }

  public void setFactor(Double factor) {
    this.factor = factor;
  }

  public CurrencyResource icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * The url for an icon of the currency
   * @return icon
  **/
  @ApiModelProperty(example = "null", value = "The url for an icon of the currency")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public CurrencyResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the currency
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the currency")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrencyResource type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of currency. Default 'real'
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The type of currency. Default 'real'")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

   /**
   * The unix timestamp in seconds the currency was last updated in the system.
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The unix timestamp in seconds the currency was last updated in the system.")
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
    CurrencyResource currencyResource = (CurrencyResource) o;
    return Objects.equals(this.active, currencyResource.active) &&
        Objects.equals(this.code, currencyResource.code) &&
        Objects.equals(this.createdDate, currencyResource.createdDate) &&
        Objects.equals(this.factor, currencyResource.factor) &&
        Objects.equals(this.icon, currencyResource.icon) &&
        Objects.equals(this.name, currencyResource.name) &&
        Objects.equals(this.type, currencyResource.type) &&
        Objects.equals(this.updatedDate, currencyResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, code, createdDate, factor, icon, name, type, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

