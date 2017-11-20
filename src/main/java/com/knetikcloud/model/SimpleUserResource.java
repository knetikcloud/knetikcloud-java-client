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
 * SimpleUserResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-20T10:56:48.833-05:00")
public class SimpleUserResource {
  @JsonProperty("avatar_url")
  private String avatarUrl = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("username")
  private String username = null;

   /**
   * The url of the user&#39;s avatar image
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "The url of the user's avatar image")
  public String getAvatarUrl() {
    return avatarUrl;
  }

   /**
   * The public username of the user
   * @return displayName
  **/
  @ApiModelProperty(value = "The public username of the user")
  public String getDisplayName() {
    return displayName;
  }

  public SimpleUserResource id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the user
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the user")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

   /**
   * The username of the user
   * @return username
  **/
  @ApiModelProperty(value = "The username of the user")
  public String getUsername() {
    return username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleUserResource simpleUserResource = (SimpleUserResource) o;
    return Objects.equals(this.avatarUrl, simpleUserResource.avatarUrl) &&
        Objects.equals(this.displayName, simpleUserResource.displayName) &&
        Objects.equals(this.id, simpleUserResource.id) &&
        Objects.equals(this.username, simpleUserResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, displayName, id, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleUserResource {\n");
    
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

