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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-12T16:33:56.846-04:00")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = ImagePropertyDefinitionResource.class, name = "image"),
  @JsonSubTypes.Type(value = LongPropertyDefinitionResource.class, name = "long"),
  @JsonSubTypes.Type(value = BooleanPropertyDefinitionResource.class, name = "boolean"),
  @JsonSubTypes.Type(value = ImageGroupPropertyDefinitionResource.class, name = "image_group"),
  @JsonSubTypes.Type(value = AudioGroupPropertyDefinitionResource.class, name = "audio_group"),
  @JsonSubTypes.Type(value = DatePropertyDefinitionResource.class, name = "date"),
  @JsonSubTypes.Type(value = MapPropertyDefinitionResource.class, name = "map"),
  @JsonSubTypes.Type(value = TextPropertyDefinitionResource.class, name = "text"),
  @JsonSubTypes.Type(value = AudioPropertyDefinitionResource.class, name = "audio"),
  @JsonSubTypes.Type(value = FileGroupPropertyDefinitionResource.class, name = "file_group"),
  @JsonSubTypes.Type(value = VideoPropertyDefinitionResource.class, name = "video"),
  @JsonSubTypes.Type(value = FormattedTextPropertyDefinitionResource.class, name = "formatted_text"),
  @JsonSubTypes.Type(value = ListPropertyDefinitionResource.class, name = "list"),
  @JsonSubTypes.Type(value = DoublePropertyDefinitionResource.class, name = "double"),
  @JsonSubTypes.Type(value = VideoGroupPropertyDefinitionResource.class, name = "video_group"),
  @JsonSubTypes.Type(value = FilePropertyDefinitionResource.class, name = "file"),
  @JsonSubTypes.Type(value = IntegerPropertyDefinitionResource.class, name = "integer"),
})

public class PropertyDefinitionResource {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("friendly_name")
  private String friendlyName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("option_label_path")
  private String optionLabelPath = null;

  @JsonProperty("option_value_path")
  private String optionValuePath = null;

  @JsonProperty("options_url")
  private String optionsUrl = null;

  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("type")
  private String type = null;

  public PropertyDefinitionResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the property
   * @return description
  **/
  @ApiModelProperty(value = "The description of the property")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PropertyDefinitionResource friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * The friendly front-facing name of the property
   * @return friendlyName
  **/
  @ApiModelProperty(value = "The friendly front-facing name of the property")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public PropertyDefinitionResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the property. Must start with a letter
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the property. Must start with a letter")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PropertyDefinitionResource optionLabelPath(String optionLabelPath) {
    this.optionLabelPath = optionLabelPath;
    return this;
  }

   /**
   * The JSON path to the option label
   * @return optionLabelPath
  **/
  @ApiModelProperty(example = "path.to.label", value = "The JSON path to the option label")
  public String getOptionLabelPath() {
    return optionLabelPath;
  }

  public void setOptionLabelPath(String optionLabelPath) {
    this.optionLabelPath = optionLabelPath;
  }

  public PropertyDefinitionResource optionValuePath(String optionValuePath) {
    this.optionValuePath = optionValuePath;
    return this;
  }

   /**
   * The JSON path to the option value
   * @return optionValuePath
  **/
  @ApiModelProperty(example = "path.to.value", value = "The JSON path to the option value")
  public String getOptionValuePath() {
    return optionValuePath;
  }

  public void setOptionValuePath(String optionValuePath) {
    this.optionValuePath = optionValuePath;
  }

  public PropertyDefinitionResource optionsUrl(String optionsUrl) {
    this.optionsUrl = optionsUrl;
    return this;
  }

   /**
   * URL of service containing the property options (assumed JSON array)
   * @return optionsUrl
  **/
  @ApiModelProperty(value = "URL of service containing the property options (assumed JSON array)")
  public String getOptionsUrl() {
    return optionsUrl;
  }

  public void setOptionsUrl(String optionsUrl) {
    this.optionsUrl = optionsUrl;
  }

  public PropertyDefinitionResource required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Whether the property is required
   * @return required
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the property is required")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public PropertyDefinitionResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the property. Used for polymorphic type recognition and thus must match an expected type with additional properties.")
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
    PropertyDefinitionResource propertyDefinitionResource = (PropertyDefinitionResource) o;
    return Objects.equals(this.description, propertyDefinitionResource.description) &&
        Objects.equals(this.friendlyName, propertyDefinitionResource.friendlyName) &&
        Objects.equals(this.name, propertyDefinitionResource.name) &&
        Objects.equals(this.optionLabelPath, propertyDefinitionResource.optionLabelPath) &&
        Objects.equals(this.optionValuePath, propertyDefinitionResource.optionValuePath) &&
        Objects.equals(this.optionsUrl, propertyDefinitionResource.optionsUrl) &&
        Objects.equals(this.required, propertyDefinitionResource.required) &&
        Objects.equals(this.type, propertyDefinitionResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, friendlyName, name, optionLabelPath, optionValuePath, optionsUrl, required, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyDefinitionResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optionLabelPath: ").append(toIndentedString(optionLabelPath)).append("\n");
    sb.append("    optionValuePath: ").append(toIndentedString(optionValuePath)).append("\n");
    sb.append("    optionsUrl: ").append(toIndentedString(optionsUrl)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

