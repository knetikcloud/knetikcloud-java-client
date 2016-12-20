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
 * SelectedSettingResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T09:38:48.154-05:00")
public class SelectedSettingResource {
  @SerializedName("key")
  private String key = null;

  @SerializedName("key_name")
  private String keyName = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("value_name")
  private String valueName = null;

  public SelectedSettingResource key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The unique ID for the setting
   * @return key
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique ID for the setting")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SelectedSettingResource keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * The textual name of the setting
   * @return keyName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The textual name of the setting")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public SelectedSettingResource value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The unique ID for the option
   * @return value
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique ID for the option")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SelectedSettingResource valueName(String valueName) {
    this.valueName = valueName;
    return this;
  }

   /**
   * The textual name of the option
   * @return valueName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The textual name of the option")
  public String getValueName() {
    return valueName;
  }

  public void setValueName(String valueName) {
    this.valueName = valueName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectedSettingResource selectedSettingResource = (SelectedSettingResource) o;
    return Objects.equals(this.key, selectedSettingResource.key) &&
        Objects.equals(this.keyName, selectedSettingResource.keyName) &&
        Objects.equals(this.value, selectedSettingResource.value) &&
        Objects.equals(this.valueName, selectedSettingResource.valueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, keyName, value, valueName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectedSettingResource {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueName: ").append(toIndentedString(valueName)).append("\n");
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

