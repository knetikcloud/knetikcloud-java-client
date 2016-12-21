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
 * Config
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T11:02:36.323-05:00")
public class Config   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("public_read")
  private Boolean publicRead = null;

  @SerializedName("value")
  private String value = null;

  public Config name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the config
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the config")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Config publicRead(Boolean publicRead) {
    this.publicRead = publicRead;
    return this;
  }

   /**
   * Whether the config is public for viewing. True means that it can be publicly viewed by all. Default: false
   * @return publicRead
  **/
  @ApiModelProperty(example = "false", value = "Whether the config is public for viewing. True means that it can be publicly viewed by all. Default: false")
  public Boolean getPublicRead() {
    return publicRead;
  }

  public void setPublicRead(Boolean publicRead) {
    this.publicRead = publicRead;
  }

  public Config value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the config
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "The value of the config")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return Objects.equals(this.name, config.name) &&
        Objects.equals(this.publicRead, config.publicRead) &&
        Objects.equals(this.value, config.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, publicRead, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicRead: ").append(toIndentedString(publicRead)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

