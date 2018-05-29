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
 * StateResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T13:50:55.134-04:00")
public class StateResource {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("country_code_iso3")
  private String countryCodeIso3 = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

   /**
   * The code of the state
   * @return code
  **/
  @ApiModelProperty(value = "The code of the state")
  public String getCode() {
    return code;
  }

   /**
   * The iso3 of the country this state is in
   * @return countryCodeIso3
  **/
  @ApiModelProperty(value = "The iso3 of the country this state is in")
  public String getCountryCodeIso3() {
    return countryCodeIso3;
  }

   /**
   * The unique ID for the state
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for the state")
  public Integer getId() {
    return id;
  }

   /**
   * The name of the state
   * @return name
  **/
  @ApiModelProperty(value = "The name of the state")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateResource stateResource = (StateResource) o;
    return Objects.equals(this.code, stateResource.code) &&
        Objects.equals(this.countryCodeIso3, stateResource.countryCodeIso3) &&
        Objects.equals(this.id, stateResource.id) &&
        Objects.equals(this.name, stateResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, countryCodeIso3, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateResource {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    countryCodeIso3: ").append(toIndentedString(countryCodeIso3)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

