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
import com.knetikcloud.model.SimpleReferenceResourceint;
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserItemLogResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:07:48.774-04:00")
public class UserItemLogResource {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("info")
  private String info = null;

  @JsonProperty("item")
  private SimpleReferenceResourceint item = null;

  @JsonProperty("log_date")
  private Long logDate = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("user")
  private SimpleUserResource user = null;

  @JsonProperty("user_inventory")
  private Integer userInventory = null;

   /**
   * The log entry id
   * @return id
  **/
  @ApiModelProperty(value = "The log entry id")
  public Integer getId() {
    return id;
  }

  public UserItemLogResource info(String info) {
    this.info = info;
    return this;
  }

   /**
   * Additional information defined by the type
   * @return info
  **/
  @ApiModelProperty(value = "Additional information defined by the type")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public UserItemLogResource item(SimpleReferenceResourceint item) {
    this.item = item;
    return this;
  }

   /**
   * The item interacted with
   * @return item
  **/
  @ApiModelProperty(value = "The item interacted with")
  public SimpleReferenceResourceint getItem() {
    return item;
  }

  public void setItem(SimpleReferenceResourceint item) {
    this.item = item;
  }

   /**
   * The date/time this event occurred in seconds since epoch
   * @return logDate
  **/
  @ApiModelProperty(value = "The date/time this event occurred in seconds since epoch")
  public Long getLogDate() {
    return logDate;
  }

  public UserItemLogResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of event
   * @return type
  **/
  @ApiModelProperty(value = "The type of event")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UserItemLogResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The user making the interaction
   * @return user
  **/
  @ApiModelProperty(value = "The user making the interaction")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }

  public UserItemLogResource userInventory(Integer userInventory) {
    this.userInventory = userInventory;
    return this;
  }

   /**
   * The id of the inventory entry this event is related to, if any
   * @return userInventory
  **/
  @ApiModelProperty(value = "The id of the inventory entry this event is related to, if any")
  public Integer getUserInventory() {
    return userInventory;
  }

  public void setUserInventory(Integer userInventory) {
    this.userInventory = userInventory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserItemLogResource userItemLogResource = (UserItemLogResource) o;
    return Objects.equals(this.id, userItemLogResource.id) &&
        Objects.equals(this.info, userItemLogResource.info) &&
        Objects.equals(this.item, userItemLogResource.item) &&
        Objects.equals(this.logDate, userItemLogResource.logDate) &&
        Objects.equals(this.type, userItemLogResource.type) &&
        Objects.equals(this.user, userItemLogResource.user) &&
        Objects.equals(this.userInventory, userItemLogResource.userInventory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, info, item, logDate, type, user, userInventory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserItemLogResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    logDate: ").append(toIndentedString(logDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userInventory: ").append(toIndentedString(userInventory)).append("\n");
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

