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
import com.knetikcloud.model.Behavior;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GuestPlayable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T09:25:55.249-04:00")
public class GuestPlayable extends Behavior {
  @JsonProperty("allowed")
  private Boolean allowed = null;

  @JsonProperty("leaderboard")
  private Boolean leaderboard = null;

  public GuestPlayable allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

   /**
   * Whether guests are allowed to use items
   * @return allowed
  **/
  @ApiModelProperty(example = "false", value = "Whether guests are allowed to use items")
  public Boolean isAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public GuestPlayable leaderboard(Boolean leaderboard) {
    this.leaderboard = leaderboard;
    return this;
  }

   /**
   * Whether guests are allowed on the leaderboard
   * @return leaderboard
  **/
  @ApiModelProperty(example = "false", value = "Whether guests are allowed on the leaderboard")
  public Boolean isLeaderboard() {
    return leaderboard;
  }

  public void setLeaderboard(Boolean leaderboard) {
    this.leaderboard = leaderboard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestPlayable guestPlayable = (GuestPlayable) o;
    return Objects.equals(this.allowed, guestPlayable.allowed) &&
        Objects.equals(this.leaderboard, guestPlayable.leaderboard) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, leaderboard, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestPlayable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    leaderboard: ").append(toIndentedString(leaderboard)).append("\n");
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

