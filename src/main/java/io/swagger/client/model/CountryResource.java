/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CountryResource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T11:02:36.323-05:00")
public class CountryResource   {
  @SerializedName("iso2")
  private String iso2 = null;

  @SerializedName("iso3")
  private String iso3 = null;

  @SerializedName("name")
  private String name = null;

   /**
   * The iso2 of the country
   * @return iso2
  **/
  @ApiModelProperty(example = "null", value = "The iso2 of the country")
  public String getIso2() {
    return iso2;
  }

   /**
   * The iso3 of the country
   * @return iso3
  **/
  @ApiModelProperty(example = "null", value = "The iso3 of the country")
  public String getIso3() {
    return iso3;
  }

   /**
   * The name of the country resource
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the country resource")
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
    CountryResource countryResource = (CountryResource) o;
    return Objects.equals(this.iso2, countryResource.iso2) &&
        Objects.equals(this.iso3, countryResource.iso3) &&
        Objects.equals(this.name, countryResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iso2, iso3, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryResource {\n");
    
    sb.append("    iso2: ").append(toIndentedString(iso2)).append("\n");
    sb.append("    iso3: ").append(toIndentedString(iso3)).append("\n");
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

