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
 * CountryTaxResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T11:36:22.734-05:00")
public class CountryTaxResource {
  @SerializedName("country_iso3")
  private String countryIso3 = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rate")
  private Double rate = null;

  @SerializedName("tax_shipping")
  private Boolean taxShipping = null;

  public CountryTaxResource countryIso3(String countryIso3) {
    this.countryIso3 = countryIso3;
    return this;
  }

   /**
   * The iso3 code of the country, cannot be changed
   * @return countryIso3
  **/
  @ApiModelProperty(example = "null", required = true, value = "The iso3 code of the country, cannot be changed")
  public String getCountryIso3() {
    return countryIso3;
  }

  public void setCountryIso3(String countryIso3) {
    this.countryIso3 = countryIso3;
  }

  public CountryTaxResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tax
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the tax")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CountryTaxResource rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The tax rate as a percentage to a maximum of two decimal places (1.5 means 1.5%)
   * @return rate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The tax rate as a percentage to a maximum of two decimal places (1.5 means 1.5%)")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public CountryTaxResource taxShipping(Boolean taxShipping) {
    this.taxShipping = taxShipping;
    return this;
  }

   /**
   * Whether the tax applies to shipping costs
   * @return taxShipping
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the tax applies to shipping costs")
  public Boolean getTaxShipping() {
    return taxShipping;
  }

  public void setTaxShipping(Boolean taxShipping) {
    this.taxShipping = taxShipping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryTaxResource countryTaxResource = (CountryTaxResource) o;
    return Objects.equals(this.countryIso3, countryTaxResource.countryIso3) &&
        Objects.equals(this.name, countryTaxResource.name) &&
        Objects.equals(this.rate, countryTaxResource.rate) &&
        Objects.equals(this.taxShipping, countryTaxResource.taxShipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryIso3, name, rate, taxShipping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryTaxResource {\n");
    
    sb.append("    countryIso3: ").append(toIndentedString(countryIso3)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    taxShipping: ").append(toIndentedString(taxShipping)).append("\n");
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

