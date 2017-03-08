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
 * OauthAccessTokenResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T19:56:53.315-05:00")
public class OauthAccessTokenResource {
  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("username")
  private String username = null;

  public OauthAccessTokenResource clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The key of the client assosciated with the token
   * @return clientId
  **/
  @ApiModelProperty(example = "null", value = "The key of the client assosciated with the token")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OauthAccessTokenResource token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The token.  Not shown in list view
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "The token.  Not shown in list view")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public OauthAccessTokenResource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of the user associated with the token
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "The username of the user associated with the token")
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
    OauthAccessTokenResource oauthAccessTokenResource = (OauthAccessTokenResource) o;
    return Objects.equals(this.clientId, oauthAccessTokenResource.clientId) &&
        Objects.equals(this.token, oauthAccessTokenResource.token) &&
        Objects.equals(this.username, oauthAccessTokenResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, token, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResource {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

