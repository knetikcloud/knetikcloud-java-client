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
 * GroupMemberResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T19:56:53.315-05:00")
public class GroupMemberResource {
  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("id")
  private Integer id = null;

  /**
   * The member's access level. Default: member
   */
  public enum StatusEnum {
    @SerializedName("moderator")
    MODERATOR("moderator"),
    
    @SerializedName("member")
    MEMBER("member");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("username")
  private String username = null;

  public GroupMemberResource avatarUrl(String avatarUrl) {
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

  public GroupMemberResource displayName(String displayName) {
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

  public GroupMemberResource id(Integer id) {
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

  public GroupMemberResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The member's access level. Default: member
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "The member's access level. Default: member")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GroupMemberResource username(String username) {
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
    GroupMemberResource groupMemberResource = (GroupMemberResource) o;
    return Objects.equals(this.avatarUrl, groupMemberResource.avatarUrl) &&
        Objects.equals(this.displayName, groupMemberResource.displayName) &&
        Objects.equals(this.id, groupMemberResource.id) &&
        Objects.equals(this.status, groupMemberResource.status) &&
        Objects.equals(this.username, groupMemberResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, displayName, id, status, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMemberResource {\n");
    
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

