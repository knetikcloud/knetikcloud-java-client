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
import io.swagger.client.model.SimpleReferenceResourcelong;

/**
 * ContributionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:41:19.694-05:00")
public class ContributionResource {
  @SerializedName("artist")
  private SimpleReferenceResourcelong artist = null;

  @SerializedName("media")
  private SimpleReferenceResourcelong media = null;

  @SerializedName("role")
  private String role = null;

  public ContributionResource artist(SimpleReferenceResourcelong artist) {
    this.artist = artist;
    return this;
  }

   /**
   * A reference to the contributing artist
   * @return artist
  **/
  @ApiModelProperty(example = "null", required = true, value = "A reference to the contributing artist")
  public SimpleReferenceResourcelong getArtist() {
    return artist;
  }

  public void setArtist(SimpleReferenceResourcelong artist) {
    this.artist = artist;
  }

  public ContributionResource media(SimpleReferenceResourcelong media) {
    this.media = media;
    return this;
  }

   /**
   * A reference to the media being contributed to
   * @return media
  **/
  @ApiModelProperty(example = "null", required = true, value = "A reference to the media being contributed to")
  public SimpleReferenceResourcelong getMedia() {
    return media;
  }

  public void setMedia(SimpleReferenceResourcelong media) {
    this.media = media;
  }

  public ContributionResource role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The nature of the contribution (role of the artist as in 'producer', 'performer', etc)
   * @return role
  **/
  @ApiModelProperty(example = "null", required = true, value = "The nature of the contribution (role of the artist as in 'producer', 'performer', etc)")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributionResource contributionResource = (ContributionResource) o;
    return Objects.equals(this.artist, contributionResource.artist) &&
        Objects.equals(this.media, contributionResource.media) &&
        Objects.equals(this.role, contributionResource.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, media, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributionResource {\n");
    
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

