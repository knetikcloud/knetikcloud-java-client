/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
 * CityResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T15:57:42.671-05:00")
public class CityResource {
  @SerializedName("country_code_iso3")
  private String countryCodeIso3 = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("state_code")
  private String stateCode = null;

   /**
   * The iso3 of the country this city is in
   * @return countryCodeIso3
  **/
  @ApiModelProperty(example = "null", value = "The iso3 of the country this city is in")
  public String getCountryCodeIso3() {
    return countryCodeIso3;
  }

   /**
   * The unique ID for this city
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for this city")
  public Integer getId() {
    return id;
  }

   /**
   * The name of the city
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the city")
  public String getName() {
    return name;
  }

   /**
   * The code for the state this city is in
   * @return stateCode
  **/
  @ApiModelProperty(example = "null", value = "The code for the state this city is in")
  public String getStateCode() {
    return stateCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityResource cityResource = (CityResource) o;
    return Objects.equals(this.countryCodeIso3, cityResource.countryCodeIso3) &&
        Objects.equals(this.id, cityResource.id) &&
        Objects.equals(this.name, cityResource.name) &&
        Objects.equals(this.stateCode, cityResource.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodeIso3, id, name, stateCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityResource {\n");
    
    sb.append("    countryCodeIso3: ").append(toIndentedString(countryCodeIso3)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

