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
 * ActionVariableResource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T11:02:36.323-05:00")
public class ActionVariableResource   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("optional")
  private Boolean optional = null;

  @SerializedName("type")
  private String type = null;

  public ActionVariableResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the variable
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the variable")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActionVariableResource optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Whether this variable is optional and can be left out/null
   * @return optional
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether this variable is optional and can be left out/null")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public ActionVariableResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the variable (see variable type endpoint for list)
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of the variable (see variable type endpoint for list)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionVariableResource actionVariableResource = (ActionVariableResource) o;
    return Objects.equals(this.name, actionVariableResource.name) &&
        Objects.equals(this.optional, actionVariableResource.optional) &&
        Objects.equals(this.type, actionVariableResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionVariableResource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

