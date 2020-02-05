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
 * SelectedSettingRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")
public class SelectedSettingRequest {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public SelectedSettingRequest key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The unique ID for the setting
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The unique ID for the setting")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SelectedSettingRequest value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The unique ID for the option. Must match one of the options from this setting in the activity, if not part of a challenge
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The unique ID for the option. Must match one of the options from this setting in the activity, if not part of a challenge")
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
    SelectedSettingRequest selectedSettingRequest = (SelectedSettingRequest) o;
    return Objects.equals(this.key, selectedSettingRequest.key) &&
        Objects.equals(this.value, selectedSettingRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectedSettingRequest {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

