/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import java.util.ArrayList;
import java.util.List;

/**
 * ClientResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T15:57:42.671-05:00")
public class ClientResource {
  @SerializedName("access_token_validity_seconds")
  private Integer accessTokenValiditySeconds = null;

  @SerializedName("client_key")
  private String clientKey = null;

  @SerializedName("grant_types")
  private List<String> grantTypes = new ArrayList<String>();

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("is_public")
  private Boolean isPublic = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("redirect_uris")
  private List<String> redirectUris = new ArrayList<String>();

  @SerializedName("refresh_token_validity_seconds")
  private Integer refreshTokenValiditySeconds = null;

  @SerializedName("secret")
  private String secret = null;

  public ClientResource accessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    return this;
  }

   /**
   * The time limit of the token in seconds
   * @return accessTokenValiditySeconds
  **/
  @ApiModelProperty(example = "null", value = "The time limit of the token in seconds")
  public Integer getAccessTokenValiditySeconds() {
    return accessTokenValiditySeconds;
  }

  public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
  }

  public ClientResource clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * The client key, cannot be edited once created
   * @return clientKey
  **/
  @ApiModelProperty(example = "null", required = true, value = "The client key, cannot be edited once created")
  public String getClientKey() {
    return clientKey;
  }

  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  public ClientResource grantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public ClientResource addGrantTypesItem(String grantTypesItem) {
    this.grantTypes.add(grantTypesItem);
    return this;
  }

   /**
   * The grant types of the client
   * @return grantTypes
  **/
  @ApiModelProperty(example = "null", value = "The grant types of the client")
  public List<String> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }

   /**
   * The id of the client
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the client")
  public Integer getId() {
    return id;
  }

  public ClientResource isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Whether the client is public or not
   * @return isPublic
  **/
  @ApiModelProperty(example = "false", value = "Whether the client is public or not")
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public ClientResource locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Whether a client is locked from being deleted
   * @return locked
  **/
  @ApiModelProperty(example = "false", value = "Whether a client is locked from being deleted")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public ClientResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the client
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the client")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientResource redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public ClientResource addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * The redirect uris of the client
   * @return redirectUris
  **/
  @ApiModelProperty(example = "null", value = "The redirect uris of the client")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public ClientResource refreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    return this;
  }

   /**
   * The time limit of the refresh token in seconds
   * @return refreshTokenValiditySeconds
  **/
  @ApiModelProperty(example = "null", value = "The time limit of the refresh token in seconds")
  public Integer getRefreshTokenValiditySeconds() {
    return refreshTokenValiditySeconds;
  }

  public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
  }

  public ClientResource secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The secret key of the client
   * @return secret
  **/
  @ApiModelProperty(example = "null", required = true, value = "The secret key of the client")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientResource clientResource = (ClientResource) o;
    return Objects.equals(this.accessTokenValiditySeconds, clientResource.accessTokenValiditySeconds) &&
        Objects.equals(this.clientKey, clientResource.clientKey) &&
        Objects.equals(this.grantTypes, clientResource.grantTypes) &&
        Objects.equals(this.id, clientResource.id) &&
        Objects.equals(this.isPublic, clientResource.isPublic) &&
        Objects.equals(this.locked, clientResource.locked) &&
        Objects.equals(this.name, clientResource.name) &&
        Objects.equals(this.redirectUris, clientResource.redirectUris) &&
        Objects.equals(this.refreshTokenValiditySeconds, clientResource.refreshTokenValiditySeconds) &&
        Objects.equals(this.secret, clientResource.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenValiditySeconds, clientKey, grantTypes, id, isPublic, locked, name, redirectUris, refreshTokenValiditySeconds, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientResource {\n");
    
    sb.append("    accessTokenValiditySeconds: ").append(toIndentedString(accessTokenValiditySeconds)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    refreshTokenValiditySeconds: ").append(toIndentedString(refreshTokenValiditySeconds)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

