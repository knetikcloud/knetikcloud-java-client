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
 * Property
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T16:41:04.857-05:00")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = MapProperty.class, name = "map"),
  @JsonSubTypes.Type(value = IntegerProperty.class, name = "integer"),
  @JsonSubTypes.Type(value = FileProperty.class, name = "file"),
  @JsonSubTypes.Type(value = TextProperty.class, name = "text"),
  @JsonSubTypes.Type(value = DoubleProperty.class, name = "double"),
  @JsonSubTypes.Type(value = DateProperty.class, name = "date"),
  @JsonSubTypes.Type(value = AudioGroupProperty.class, name = "audio_group"),
  @JsonSubTypes.Type(value = ImageProperty.class, name = "image"),
  @JsonSubTypes.Type(value = VideoGroupProperty.class, name = "video_group"),
  @JsonSubTypes.Type(value = FormattedTextProperty.class, name = "formatted_text"),
  @JsonSubTypes.Type(value = FileGroupProperty.class, name = "file_group"),
  @JsonSubTypes.Type(value = BooleanProperty.class, name = "boolean"),
  @JsonSubTypes.Type(value = AudioProperty.class, name = "audio"),
  @JsonSubTypes.Type(value = LongProperty.class, name = "long"),
  @JsonSubTypes.Type(value = ImageGroupProperty.class, name = "image_group"),
  @JsonSubTypes.Type(value = ListProperty.class, name = "list"),
  @JsonSubTypes.Type(value = VideoProperty.class, name = "video"),
})

public class Property {
  @JsonProperty("type")
  private String type = null;

  public Property type(String type) {
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
    Property property = (Property) o;
    return Objects.equals(this.type, property.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    
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

