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
import com.knetikcloud.model.UserActivityResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivityOccurrenceResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-03T13:21:30.157-04:00")
public class ActivityOccurrenceResults {
  @JsonProperty("users")
  private List<UserActivityResults> users = new ArrayList<UserActivityResults>();

  public ActivityOccurrenceResults users(List<UserActivityResults> users) {
    this.users = users;
    return this;
  }

  public ActivityOccurrenceResults addUsersItem(UserActivityResults usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed
   * @return users
  **/
  @ApiModelProperty(required = true, value = "The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed")
  public List<UserActivityResults> getUsers() {
    return users;
  }

  public void setUsers(List<UserActivityResults> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityOccurrenceResults activityOccurrenceResults = (ActivityOccurrenceResults) o;
    return Objects.equals(this.users, activityOccurrenceResults.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOccurrenceResults {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

