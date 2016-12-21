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
 * UserBaseResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T23:09:22.197-05:00")
public class UserBaseResource {
  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("fullname")
  private String fullname = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("username")
  private String username = null;

  public UserBaseResource avatarUrl(String avatarUrl) {
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

  public UserBaseResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The chosen display name of the user, defaults to username if not present
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "The chosen display name of the user, defaults to username if not present")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserBaseResource email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822)
   * @return email
  **/
  @ApiModelProperty(example = "null", required = true, value = "The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822)")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserBaseResource fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * The user's full name (private)
   * @return fullname
  **/
  @ApiModelProperty(example = "null", value = "The user's full name (private)")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

   /**
   * The id of the user
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the user")
  public Integer getId() {
    return id;
  }

  public UserBaseResource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The login username for the user (private). May be set to match email if system does not require usernames separately.
   * @return username
  **/
  @ApiModelProperty(example = "null", required = true, value = "The login username for the user (private). May be set to match email if system does not require usernames separately.")
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
    UserBaseResource userBaseResource = (UserBaseResource) o;
    return Objects.equals(this.avatarUrl, userBaseResource.avatarUrl) &&
        Objects.equals(this.displayName, userBaseResource.displayName) &&
        Objects.equals(this.email, userBaseResource.email) &&
        Objects.equals(this.fullname, userBaseResource.fullname) &&
        Objects.equals(this.id, userBaseResource.id) &&
        Objects.equals(this.username, userBaseResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, displayName, email, fullname, id, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBaseResource {\n");
    
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
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

