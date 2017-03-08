/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
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
import io.swagger.client.model.Affiliate;
import io.swagger.client.model.Country;
import io.swagger.client.model.Currency;
import io.swagger.client.model.GroupMember;
import io.swagger.client.model.Language;
import io.swagger.client.model.Property;
import io.swagger.client.model.Role;
import io.swagger.client.model.Timezone;
import io.swagger.client.model.UserRelationship;
import io.swagger.client.model.UserTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T10:21:36.236-05:00")
public class User {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("address")
  private String address = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("affiliate")
  private Affiliate affiliate = null;

  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("children")
  private List<UserRelationship> children = new ArrayList<UserRelationship>();

  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private Country country = null;

  @SerializedName("currency")
  private Currency currency = null;

  @SerializedName("date_created")
  private Long dateCreated = null;

  @SerializedName("date_of_birth")
  private Long dateOfBirth = null;

  @SerializedName("date_updated")
  private Long dateUpdated = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("fullname")
  private String fullname = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("groups")
  private List<GroupMember> groups = new ArrayList<GroupMember>();

  @SerializedName("guest")
  private Boolean guest = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("invite_token")
  private String inviteToken = null;

  @SerializedName("lang")
  private Language lang = null;

  @SerializedName("last_activity")
  private Long lastActivity = null;

  @SerializedName("last_login")
  private Long lastLogin = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("lockout_attempts")
  private Integer lockoutAttempts = null;

  @SerializedName("lockout_date")
  private Long lockoutDate = null;

  @SerializedName("mobile_number")
  private String mobileNumber = null;

  @SerializedName("old_id")
  private Integer oldId = null;

  @SerializedName("parents")
  private List<UserRelationship> parents = new ArrayList<UserRelationship>();

  @SerializedName("password")
  private String password = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("properties_string")
  private String propertiesString = null;

  @SerializedName("roles")
  private List<Role> roles = new ArrayList<Role>();

  @SerializedName("state")
  private String state = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("tag_strings")
  private List<String> tagStrings = new ArrayList<String>();

  @SerializedName("tags")
  private List<UserTag> tags = new ArrayList<UserTag>();

  @SerializedName("template")
  private String template = null;

  @SerializedName("timezone")
  private Timezone timezone = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("type_hint")
  private String typeHint = null;

  @SerializedName("username")
  private String username = null;

  public User additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public User putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public User address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public User address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public User affiliate(Affiliate affiliate) {
    this.affiliate = affiliate;
    return this;
  }

   /**
   * Get affiliate
   * @return affiliate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Affiliate getAffiliate() {
    return affiliate;
  }

  public void setAffiliate(Affiliate affiliate) {
    this.affiliate = affiliate;
  }

  public User avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public User children(List<UserRelationship> children) {
    this.children = children;
    return this;
  }

  public User addChildrenItem(UserRelationship childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<UserRelationship> getChildren() {
    return children;
  }

  public void setChildren(List<UserRelationship> children) {
    this.children = children;
  }

  public User city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public User country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public User currency(Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(example = "null", value = "")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public User dateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  public User dateOfBirth(Long dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Long dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public User dateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(Long dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public User description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public User displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * Get fullname
   * @return fullname
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public User gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public User groups(List<GroupMember> groups) {
    this.groups = groups;
    return this;
  }

  public User addGroupsItem(GroupMember groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<GroupMember> getGroups() {
    return groups;
  }

  public void setGroups(List<GroupMember> groups) {
    this.groups = groups;
  }

  public User guest(Boolean guest) {
    this.guest = guest;
    return this;
  }

   /**
   * Get guest
   * @return guest
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getGuest() {
    return guest;
  }

  public void setGuest(Boolean guest) {
    this.guest = guest;
  }

  public User id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User inviteToken(String inviteToken) {
    this.inviteToken = inviteToken;
    return this;
  }

   /**
   * Get inviteToken
   * @return inviteToken
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInviteToken() {
    return inviteToken;
  }

  public void setInviteToken(String inviteToken) {
    this.inviteToken = inviteToken;
  }

  public User lang(Language lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @ApiModelProperty(example = "null", value = "")
  public Language getLang() {
    return lang;
  }

  public void setLang(Language lang) {
    this.lang = lang;
  }

  public User lastActivity(Long lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Get lastActivity
   * @return lastActivity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(Long lastActivity) {
    this.lastActivity = lastActivity;
  }

  public User lastLogin(Long lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(Long lastLogin) {
    this.lastLogin = lastLogin;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User lockoutAttempts(Integer lockoutAttempts) {
    this.lockoutAttempts = lockoutAttempts;
    return this;
  }

   /**
   * Get lockoutAttempts
   * @return lockoutAttempts
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLockoutAttempts() {
    return lockoutAttempts;
  }

  public void setLockoutAttempts(Integer lockoutAttempts) {
    this.lockoutAttempts = lockoutAttempts;
  }

  public User lockoutDate(Long lockoutDate) {
    this.lockoutDate = lockoutDate;
    return this;
  }

   /**
   * Get lockoutDate
   * @return lockoutDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLockoutDate() {
    return lockoutDate;
  }

  public void setLockoutDate(Long lockoutDate) {
    this.lockoutDate = lockoutDate;
  }

  public User mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public User oldId(Integer oldId) {
    this.oldId = oldId;
    return this;
  }

   /**
   * Get oldId
   * @return oldId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOldId() {
    return oldId;
  }

  public void setOldId(Integer oldId) {
    this.oldId = oldId;
  }

  public User parents(List<UserRelationship> parents) {
    this.parents = parents;
    return this;
  }

  public User addParentsItem(UserRelationship parentsItem) {
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<UserRelationship> getParents() {
    return parents;
  }

  public void setParents(List<UserRelationship> parents) {
    this.parents = parents;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public User propertiesString(String propertiesString) {
    this.propertiesString = propertiesString;
    return this;
  }

   /**
   * Get propertiesString
   * @return propertiesString
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPropertiesString() {
    return propertiesString;
  }

  public void setPropertiesString(String propertiesString) {
    this.propertiesString = propertiesString;
  }

  public User roles(List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(Role rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public User state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public User status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public User tagStrings(List<String> tagStrings) {
    this.tagStrings = tagStrings;
    return this;
  }

  public User addTagStringsItem(String tagStringsItem) {
    this.tagStrings.add(tagStringsItem);
    return this;
  }

   /**
   * Get tagStrings
   * @return tagStrings
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getTagStrings() {
    return tagStrings;
  }

  public void setTagStrings(List<String> tagStrings) {
    this.tagStrings = tagStrings;
  }

  public User tags(List<UserTag> tags) {
    this.tags = tags;
    return this;
  }

  public User addTagsItem(UserTag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<UserTag> getTags() {
    return tags;
  }

  public void setTags(List<UserTag> tags) {
    this.tags = tags;
  }

  public User template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public User timezone(Timezone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(example = "null", value = "")
  public Timezone getTimezone() {
    return timezone;
  }

  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }

  public User token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public User typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * Get typeHint
   * @return typeHint
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "")
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
    User user = (User) o;
    return Objects.equals(this.additionalProperties, user.additionalProperties) &&
        Objects.equals(this.address, user.address) &&
        Objects.equals(this.address2, user.address2) &&
        Objects.equals(this.affiliate, user.affiliate) &&
        Objects.equals(this.avatarUrl, user.avatarUrl) &&
        Objects.equals(this.children, user.children) &&
        Objects.equals(this.city, user.city) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.currency, user.currency) &&
        Objects.equals(this.dateCreated, user.dateCreated) &&
        Objects.equals(this.dateOfBirth, user.dateOfBirth) &&
        Objects.equals(this.dateUpdated, user.dateUpdated) &&
        Objects.equals(this.description, user.description) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.fullname, user.fullname) &&
        Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.guest, user.guest) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.inviteToken, user.inviteToken) &&
        Objects.equals(this.lang, user.lang) &&
        Objects.equals(this.lastActivity, user.lastActivity) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.lockoutAttempts, user.lockoutAttempts) &&
        Objects.equals(this.lockoutDate, user.lockoutDate) &&
        Objects.equals(this.mobileNumber, user.mobileNumber) &&
        Objects.equals(this.oldId, user.oldId) &&
        Objects.equals(this.parents, user.parents) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.postalCode, user.postalCode) &&
        Objects.equals(this.propertiesString, user.propertiesString) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.tagStrings, user.tagStrings) &&
        Objects.equals(this.tags, user.tags) &&
        Objects.equals(this.template, user.template) &&
        Objects.equals(this.timezone, user.timezone) &&
        Objects.equals(this.token, user.token) &&
        Objects.equals(this.typeHint, user.typeHint) &&
        Objects.equals(this.username, user.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, address, address2, affiliate, avatarUrl, children, city, country, currency, dateCreated, dateOfBirth, dateUpdated, description, displayName, email, firstName, fullname, gender, groups, guest, id, inviteToken, lang, lastActivity, lastLogin, lastName, lockoutAttempts, lockoutDate, mobileNumber, oldId, parents, password, postalCode, propertiesString, roles, state, status, tagStrings, tags, template, timezone, token, typeHint, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    guest: ").append(toIndentedString(guest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteToken: ").append(toIndentedString(inviteToken)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lockoutAttempts: ").append(toIndentedString(lockoutAttempts)).append("\n");
    sb.append("    lockoutDate: ").append(toIndentedString(lockoutDate)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    oldId: ").append(toIndentedString(oldId)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    propertiesString: ").append(toIndentedString(propertiesString)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tagStrings: ").append(toIndentedString(tagStrings)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
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

