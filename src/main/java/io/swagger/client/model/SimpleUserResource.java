/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
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
 * SimpleUserResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T10:21:36.236-05:00")
public class SimpleUserResource {
  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("username")
  private String username = null;

  public SimpleUserResource avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The url of the user's avatar image
   * @return avatarUrl
  **/
  @ApiModelProperty(example = "null", value = "The url of the user's avatar image")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public SimpleUserResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The public username of the user
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "The public username of the user")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SimpleUserResource id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the user
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the user")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SimpleUserResource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of the user
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "The username of the user")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
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

