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
import com.knetikcloud.model.SimpleReferenceResourcelong;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VideoRelationshipResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T10:18:04.496-04:00")
public class VideoRelationshipResource {
  @JsonProperty("from")
  private SimpleReferenceResourcelong from = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("relationship_details")
  private String relationshipDetails = null;

  @JsonProperty("to")
  private SimpleReferenceResourcelong to = null;

  public VideoRelationshipResource from(SimpleReferenceResourcelong from) {
    this.from = from;
    return this;
  }

   /**
   * The owner of the relationship
   * @return from
  **/
  @ApiModelProperty(value = "The owner of the relationship")
  public SimpleReferenceResourcelong getFrom() {
    return from;
  }

  public void setFrom(SimpleReferenceResourcelong from) {
    this.from = from;
  }

   /**
   * The id of the relationship
   * @return id
  **/
  @ApiModelProperty(value = "The id of the relationship")
  public Long getId() {
    return id;
  }

  public VideoRelationshipResource relationshipDetails(String relationshipDetails) {
    this.relationshipDetails = relationshipDetails;
    return this;
  }

   /**
   * Details about the relationship such as type or other information. Max length 10 characters
   * @return relationshipDetails
  **/
  @ApiModelProperty(required = true, value = "Details about the relationship such as type or other information. Max length 10 characters")
  public String getRelationshipDetails() {
    return relationshipDetails;
  }

  public void setRelationshipDetails(String relationshipDetails) {
    this.relationshipDetails = relationshipDetails;
  }

  public VideoRelationshipResource to(SimpleReferenceResourcelong to) {
    this.to = to;
    return this;
  }

   /**
   * The target of the relationship.
   * @return to
  **/
  @ApiModelProperty(required = true, value = "The target of the relationship.")
  public SimpleReferenceResourcelong getTo() {
    return to;
  }

  public void setTo(SimpleReferenceResourcelong to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoRelationshipResource videoRelationshipResource = (VideoRelationshipResource) o;
    return Objects.equals(this.from, videoRelationshipResource.from) &&
        Objects.equals(this.id, videoRelationshipResource.id) &&
        Objects.equals(this.relationshipDetails, videoRelationshipResource.relationshipDetails) &&
        Objects.equals(this.to, videoRelationshipResource.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, id, relationshipDetails, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoRelationshipResource {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationshipDetails: ").append(toIndentedString(relationshipDetails)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

