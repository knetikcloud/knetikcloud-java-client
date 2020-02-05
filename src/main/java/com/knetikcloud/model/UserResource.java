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
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:12.134-05:00")
public class UserResource {
  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("address2")
  private String address2 = null;

  @JsonProperty("avatar_url")
  private String avatarUrl = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("date_of_birth")
  private Long dateOfBirth = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("fullname")
  private String fullname = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("last_activity")
  private Long lastActivity = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("last_updated")
  private Long lastUpdated = null;

  @JsonProperty("member_since")
  private Long memberSince = null;

  @JsonProperty("mobile_number")
  private String mobileNumber = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("username")
  private String username = null;

  public UserResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public UserResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this user type, or be an extra not from the template
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this user type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public UserResource address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The first line of the user&#39;s address (private)
   * @return address
  **/
  @ApiModelProperty(value = "The first line of the user's address (private)")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UserResource address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * The second line of user&#39;s address (private)
   * @return address2
  **/
  @ApiModelProperty(value = "The second line of user's address (private)")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public UserResource avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The url of the user&#39;s avatar image
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "The url of the user's avatar image")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public UserResource city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The user&#39;s city (private)
   * @return city
  **/
  @ApiModelProperty(value = "The user's city (private)")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UserResource dateOfBirth(Long dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The user&#39;s date of birth (private) as a unix timestamp
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "The user's date of birth (private) as a unix timestamp")
  public Long getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Long dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public UserResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The user&#39;s self description (private)
   * @return description
  **/
  @ApiModelProperty(value = "The user's self description (private)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The chosen display name of the user, defaults to username if not present
   * @return displayName
  **/
  @ApiModelProperty(value = "The chosen display name of the user, defaults to username if not present")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserResource email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The user&#39;s email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822)
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822)")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserResource firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The user&#39;s first name (private)
   * @return firstName
  **/
  @ApiModelProperty(value = "The user's first name (private)")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserResource fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * The user&#39;s full name (private)
   * @return fullname
  **/
  @ApiModelProperty(value = "The user's full name (private)")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public UserResource gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The user&#39;s gender (private)
   * @return gender
  **/
  @ApiModelProperty(value = "The user's gender (private)")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

   /**
   * The id of the user
   * @return id
  **/
  @ApiModelProperty(value = "The id of the user")
  public Integer getId() {
    return id;
  }

   /**
   * The date the user last interacted with the API (private)
   * @return lastActivity
  **/
  @ApiModelProperty(value = "The date the user last interacted with the API (private)")
  public Long getLastActivity() {
    return lastActivity;
  }

  public UserResource lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The user&#39;s last name (private)
   * @return lastName
  **/
  @ApiModelProperty(value = "The user's last name (private)")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

   /**
   * The date the user&#39;s info was last updated as a unix timestamp
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "The date the user's info was last updated as a unix timestamp")
  public Long getLastUpdated() {
    return lastUpdated;
  }

   /**
   * The user&#39;s date of registration as a unix timestamp
   * @return memberSince
  **/
  @ApiModelProperty(value = "The user's date of registration as a unix timestamp")
  public Long getMemberSince() {
    return memberSince;
  }

  public UserResource mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * The user&#39;s mobile phone number (private)
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "The user's mobile phone number (private)")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserResource password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The plain text password for the new user account. Required for registration; ignored on profile update.  Use password specific endpoints for editing
   * @return password
  **/
  @ApiModelProperty(value = "The plain text password for the new user account. Required for registration; ignored on profile update.  Use password specific endpoints for editing")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserResource postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The user&#39;s postal code (private)
   * @return postalCode
  **/
  @ApiModelProperty(value = "The user's postal code (private)")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public UserResource state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The user&#39;s state (private)
   * @return state
  **/
  @ApiModelProperty(value = "The user's state (private)")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public UserResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UserResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags on the user. Can only be set by admin. Max length per tag is 64 characters
   * @return tags
  **/
  @ApiModelProperty(value = "Tags on the user. Can only be set by admin. Max length per tag is 64 characters")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public UserResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A user template this user is validated against (private). May be null and no validation of properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "A user template this user is validated against (private). May be null and no validation of properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public UserResource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The login username for the user (private). May be set to match email if system does not require usernames separately.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The login username for the user (private). May be set to match email if system does not require usernames separately.")
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
    UserResource userResource = (UserResource) o;
    return Objects.equals(this.additionalProperties, userResource.additionalProperties) &&
        Objects.equals(this.address, userResource.address) &&
        Objects.equals(this.address2, userResource.address2) &&
        Objects.equals(this.avatarUrl, userResource.avatarUrl) &&
        Objects.equals(this.city, userResource.city) &&
        Objects.equals(this.dateOfBirth, userResource.dateOfBirth) &&
        Objects.equals(this.description, userResource.description) &&
        Objects.equals(this.displayName, userResource.displayName) &&
        Objects.equals(this.email, userResource.email) &&
        Objects.equals(this.firstName, userResource.firstName) &&
        Objects.equals(this.fullname, userResource.fullname) &&
        Objects.equals(this.gender, userResource.gender) &&
        Objects.equals(this.id, userResource.id) &&
        Objects.equals(this.lastActivity, userResource.lastActivity) &&
        Objects.equals(this.lastName, userResource.lastName) &&
        Objects.equals(this.lastUpdated, userResource.lastUpdated) &&
        Objects.equals(this.memberSince, userResource.memberSince) &&
        Objects.equals(this.mobileNumber, userResource.mobileNumber) &&
        Objects.equals(this.password, userResource.password) &&
        Objects.equals(this.postalCode, userResource.postalCode) &&
        Objects.equals(this.state, userResource.state) &&
        Objects.equals(this.tags, userResource.tags) &&
        Objects.equals(this.template, userResource.template) &&
        Objects.equals(this.username, userResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, address, address2, avatarUrl, city, dateOfBirth, description, displayName, email, firstName, fullname, gender, id, lastActivity, lastName, lastUpdated, memberSince, mobileNumber, password, postalCode, state, tags, template, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    memberSince: ").append(toIndentedString(memberSince)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

