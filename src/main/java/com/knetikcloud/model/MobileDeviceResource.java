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
import com.knetikcloud.model.DeviceResource;
import com.knetikcloud.model.Property;
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import java.util.Map;

/**
 * MobileDeviceResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-09T10:26:02.967-04:00")
public class MobileDeviceResource extends DeviceResource {
  @JsonProperty("authorization")
  private String authorization = null;

  @JsonProperty("imei")
  private String imei = null;

  /**
   * The platform used for push notifications. Only Apple and Android are supported at the moment.
   */
  public enum NotificationPlatformEnum {
    APNS("APNS"),
    
    GCM("GCM");

    private String value;

    NotificationPlatformEnum(String value) {
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
    public static NotificationPlatformEnum fromValue(String text) {
      for (NotificationPlatformEnum b : NotificationPlatformEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("notification_platform")
  private NotificationPlatformEnum notificationPlatform = null;

  @JsonProperty("number")
  private String number = null;

  public MobileDeviceResource authorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

   /**
   * The authorization code for push notifications provided by the provider platform (APNS, GCM, etc).
   * @return authorization
  **/
  @ApiModelProperty(value = "The authorization code for push notifications provided by the provider platform (APNS, GCM, etc).")
  public String getAuthorization() {
    return authorization;
  }

  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }

  public MobileDeviceResource imei(String imei) {
    this.imei = imei;
    return this;
  }

   /**
   * Get imei
   * @return imei
  **/
  @ApiModelProperty(value = "")
  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public MobileDeviceResource notificationPlatform(NotificationPlatformEnum notificationPlatform) {
    this.notificationPlatform = notificationPlatform;
    return this;
  }

   /**
   * The platform used for push notifications. Only Apple and Android are supported at the moment.
   * @return notificationPlatform
  **/
  @ApiModelProperty(value = "The platform used for push notifications. Only Apple and Android are supported at the moment.")
  public NotificationPlatformEnum getNotificationPlatform() {
    return notificationPlatform;
  }

  public void setNotificationPlatform(NotificationPlatformEnum notificationPlatform) {
    this.notificationPlatform = notificationPlatform;
  }

  public MobileDeviceResource number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The phone number associated with this device if applicable, in international format
   * @return number
  **/
  @ApiModelProperty(example = "+14076658943", value = "The phone number associated with this device if applicable, in international format")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileDeviceResource mobileDeviceResource = (MobileDeviceResource) o;
    return Objects.equals(this.authorization, mobileDeviceResource.authorization) &&
        Objects.equals(this.imei, mobileDeviceResource.imei) &&
        Objects.equals(this.notificationPlatform, mobileDeviceResource.notificationPlatform) &&
        Objects.equals(this.number, mobileDeviceResource.number) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorization, imei, notificationPlatform, number, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileDeviceResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    notificationPlatform: ").append(toIndentedString(notificationPlatform)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

