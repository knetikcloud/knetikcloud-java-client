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
import io.swagger.client.model.MetricResource;
import io.swagger.client.model.SimpleUserResource;

/**
 * ActivityUserResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T09:38:48.154-05:00")
public class ActivityUserResource {
  @SerializedName("host")
  private Boolean host = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("joined_date")
  private Long joinedDate = null;

  @SerializedName("left_date")
  private Long leftDate = null;

  @SerializedName("metric")
  private MetricResource metric = null;

  /**
   * The current status of the user in the occurrence (default: present)
   */
  public enum StatusEnum {
    @SerializedName("present")
    PRESENT("present"),
    
    @SerializedName("ready")
    READY("ready"),
    
    @SerializedName("left")
    LEFT("left"),
    
    @SerializedName("surrendered")
    SURRENDERED("surrendered"),
    
    @SerializedName("disconnected")
    DISCONNECTED("disconnected");

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

  @SerializedName("user")
  private SimpleUserResource user = null;

  public ActivityUserResource host(Boolean host) {
    this.host = host;
    return this;
  }

   /**
   * Whether this user is the 'host' of the occurrence and has increased access to settings/etc (default: false)
   * @return host
  **/
  @ApiModelProperty(example = "false", value = "Whether this user is the 'host' of the occurrence and has increased access to settings/etc (default: false)")
  public Boolean getHost() {
    return host;
  }

  public void setHost(Boolean host) {
    this.host = host;
  }

   /**
   * The id of the activity user entry
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the activity user entry")
  public Long getId() {
    return id;
  }

   /**
   * The date this user last joined the occurrence, unix timestamp in seconds
   * @return joinedDate
  **/
  @ApiModelProperty(example = "null", value = "The date this user last joined the occurrence, unix timestamp in seconds")
  public Long getJoinedDate() {
    return joinedDate;
  }

   /**
   * The date this user last left the occurrence, unix timestamp in seconds. Null if still present
   * @return leftDate
  **/
  @ApiModelProperty(example = "null", value = "The date this user last left the occurrence, unix timestamp in seconds. Null if still present")
  public Long getLeftDate() {
    return leftDate;
  }

  public ActivityUserResource metric(MetricResource metric) {
    this.metric = metric;
    return this;
  }

   /**
   * The metric for the user's results, after the game is over
   * @return metric
  **/
  @ApiModelProperty(example = "null", value = "The metric for the user's results, after the game is over")
  public MetricResource getMetric() {
    return metric;
  }

  public void setMetric(MetricResource metric) {
    this.metric = metric;
  }

  public ActivityUserResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the user in the occurrence (default: present)
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The current status of the user in the occurrence (default: present)")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ActivityUserResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The user
   * @return user
  **/
  @ApiModelProperty(example = "null", required = true, value = "The user")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityUserResource activityUserResource = (ActivityUserResource) o;
    return Objects.equals(this.host, activityUserResource.host) &&
        Objects.equals(this.id, activityUserResource.id) &&
        Objects.equals(this.joinedDate, activityUserResource.joinedDate) &&
        Objects.equals(this.leftDate, activityUserResource.leftDate) &&
        Objects.equals(this.metric, activityUserResource.metric) &&
        Objects.equals(this.status, activityUserResource.status) &&
        Objects.equals(this.user, activityUserResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, id, joinedDate, leftDate, metric, status, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityUserResource {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    joinedDate: ").append(toIndentedString(joinedDate)).append("\n");
    sb.append("    leftDate: ").append(toIndentedString(leftDate)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

