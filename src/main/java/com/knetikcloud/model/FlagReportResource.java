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
 * FlagReportResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class FlagReportResource {
  @JsonProperty("context")
  private String context = null;

  @JsonProperty("context_id")
  private String contextId = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("reason")
  private String reason = null;

  /**
   * The resolution of that resource
   */
  public enum ResolutionEnum {
    BANNED("banned"),
    
    IGNORED("ignored");

    private String value;

    ResolutionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResolutionEnum fromValue(String text) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("resolution")
  private ResolutionEnum resolution = null;

  @JsonProperty("resolved")
  private Long resolved = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

   /**
   * The context of that resource 
   * @return context
  **/
  @ApiModelProperty(value = "The context of that resource ")
  public String getContext() {
    return context;
  }

   /**
   * The context ID of that resource
   * @return contextId
  **/
  @ApiModelProperty(value = "The context ID of that resource")
  public String getContextId() {
    return contextId;
  }

   /**
   * The date/time this resource was created in seconds since epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public FlagReportResource reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of that resource required only in case of active resolution
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of that resource required only in case of active resolution")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public FlagReportResource resolution(ResolutionEnum resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * The resolution of that resource
   * @return resolution
  **/
  @ApiModelProperty(required = true, value = "The resolution of that resource")
  public ResolutionEnum getResolution() {
    return resolution;
  }

  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }

   /**
   * The date/time this report was resolved in seconds since epoch. Null if not resolved yet
   * @return resolved
  **/
  @ApiModelProperty(value = "The date/time this report was resolved in seconds since epoch. Null if not resolved yet")
  public Long getResolved() {
    return resolved;
  }

   /**
   * The date/time this resource was last updated in seconds since epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlagReportResource flagReportResource = (FlagReportResource) o;
    return Objects.equals(this.context, flagReportResource.context) &&
        Objects.equals(this.contextId, flagReportResource.contextId) &&
        Objects.equals(this.createdDate, flagReportResource.createdDate) &&
        Objects.equals(this.id, flagReportResource.id) &&
        Objects.equals(this.reason, flagReportResource.reason) &&
        Objects.equals(this.resolution, flagReportResource.resolution) &&
        Objects.equals(this.resolved, flagReportResource.resolved) &&
        Objects.equals(this.updatedDate, flagReportResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, contextId, createdDate, id, reason, resolution, resolved, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlagReportResource {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

