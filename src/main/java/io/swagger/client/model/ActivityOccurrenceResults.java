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
import io.swagger.client.model.UserActivityResultsResource;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivityOccurrenceResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T15:57:42.671-05:00")
public class ActivityOccurrenceResults {
  @SerializedName("users")
  private List<UserActivityResultsResource> users = new ArrayList<UserActivityResultsResource>();

  public ActivityOccurrenceResults users(List<UserActivityResultsResource> users) {
    this.users = users;
    return this;
  }

  public ActivityOccurrenceResults addUsersItem(UserActivityResultsResource usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed
   * @return users
  **/
  @ApiModelProperty(example = "null", required = true, value = "The game results for each user. Include all users that played (paid to get in) even if they were eliminated without a result. A null metric is allowed")
  public List<UserActivityResultsResource> getUsers() {
    return users;
  }

  public void setUsers(List<UserActivityResultsResource> users) {
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

