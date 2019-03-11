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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.knetikcloud.model.Property;
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DeviceResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T10:18:04.496-04:00")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "device_type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = MobileDeviceResource.class, name = "mobile_device"),
})

public class DeviceResource {
  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("device_type")
  private String deviceType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("mac_address")
  private String macAddress = null;

  @JsonProperty("make")
  private String make = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("os")
  private String os = null;

  @JsonProperty("owner")
  private SimpleUserResource owner = null;

  @JsonProperty("serial")
  private String serial = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  @JsonProperty("users")
  private List<SimpleUserResource> users = null;

  public DeviceResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public DeviceResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template if one is specified
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template if one is specified")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

   /**
   * The date the device log was created
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the device log was created")
  public Long getCreatedDate() {
    return createdDate;
  }

  public DeviceResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the device
   * @return description
  **/
  @ApiModelProperty(value = "The description of the device")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeviceResource deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * The type of device. Use mobile_device to specifically register mobile devices. This particular type will be used to send and receive notifications
   * @return deviceType
  **/
  @ApiModelProperty(value = "The type of device. Use mobile_device to specifically register mobile devices. This particular type will be used to send and receive notifications")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public DeviceResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for this device. Cannot be changed after creation. Default: random
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID for this device. Cannot be changed after creation. Default: random")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeviceResource location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The physical location of the device, coordinates or named place (office, living room, etc)
   * @return location
  **/
  @ApiModelProperty(value = "The physical location of the device, coordinates or named place (office, living room, etc)")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public DeviceResource macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * The MAC (media access control) address of the device
   * @return macAddress
  **/
  @ApiModelProperty(value = "The MAC (media access control) address of the device")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public DeviceResource make(String make) {
    this.make = make;
    return this;
  }

   /**
   * The make of the device
   * @return make
  **/
  @ApiModelProperty(value = "The make of the device")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public DeviceResource model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model of the device
   * @return model
  **/
  @ApiModelProperty(value = "The model of the device")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public DeviceResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the device
   * @return name
  **/
  @ApiModelProperty(value = "The name of the device")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceResource os(String os) {
    this.os = os;
    return this;
  }

   /**
   * The OS (operating system) on the device
   * @return os
  **/
  @ApiModelProperty(value = "The OS (operating system) on the device")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public DeviceResource owner(SimpleUserResource owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The user that owns the device
   * @return owner
  **/
  @ApiModelProperty(value = "The user that owns the device")
  public SimpleUserResource getOwner() {
    return owner;
  }

  public void setOwner(SimpleUserResource owner) {
    this.owner = owner;
  }

  public DeviceResource serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * The serial number of the device
   * @return serial
  **/
  @ApiModelProperty(value = "The serial number of the device")
  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public DeviceResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DeviceResource addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Random tags to facilitate search
   * @return tags
  **/
  @ApiModelProperty(value = "Random tags to facilitate search")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public DeviceResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Use to describe and validate custom properties (custom schema). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(value = "Use to describe and validate custom properties (custom schema). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

   /**
   * The date the device log was updated
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date the device log was updated")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public DeviceResource users(List<SimpleUserResource> users) {
    this.users = users;
    return this;
  }

  public DeviceResource addUsersItem(SimpleUserResource usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<SimpleUserResource>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * The users currently using the device
   * @return users
  **/
  @ApiModelProperty(value = "The users currently using the device")
  public List<SimpleUserResource> getUsers() {
    return users;
  }

  public void setUsers(List<SimpleUserResource> users) {
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
    DeviceResource deviceResource = (DeviceResource) o;
    return Objects.equals(this.additionalProperties, deviceResource.additionalProperties) &&
        Objects.equals(this.createdDate, deviceResource.createdDate) &&
        Objects.equals(this.description, deviceResource.description) &&
        Objects.equals(this.deviceType, deviceResource.deviceType) &&
        Objects.equals(this.id, deviceResource.id) &&
        Objects.equals(this.location, deviceResource.location) &&
        Objects.equals(this.macAddress, deviceResource.macAddress) &&
        Objects.equals(this.make, deviceResource.make) &&
        Objects.equals(this.model, deviceResource.model) &&
        Objects.equals(this.name, deviceResource.name) &&
        Objects.equals(this.os, deviceResource.os) &&
        Objects.equals(this.owner, deviceResource.owner) &&
        Objects.equals(this.serial, deviceResource.serial) &&
        Objects.equals(this.tags, deviceResource.tags) &&
        Objects.equals(this.template, deviceResource.template) &&
        Objects.equals(this.updatedDate, deviceResource.updatedDate) &&
        Objects.equals(this.users, deviceResource.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, createdDate, description, deviceType, id, location, macAddress, make, model, name, os, owner, serial, tags, template, updatedDate, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

