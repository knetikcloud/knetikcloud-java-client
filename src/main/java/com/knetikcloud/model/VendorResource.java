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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VendorResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-20T10:56:48.833-05:00")
public class VendorResource {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  @JsonProperty("create_date")
  private Long createDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("image_url")
  private String imageUrl = null;

  @JsonProperty("manual_approval")
  private Boolean manualApproval = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("primary_contact_email")
  private String primaryContactEmail = null;

  @JsonProperty("primary_contact_name")
  private String primaryContactName = null;

  @JsonProperty("primary_contact_phone")
  private String primaryContactPhone = null;

  @JsonProperty("sales_email")
  private String salesEmail = null;

  @JsonProperty("support_email")
  private String supportEmail = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("update_date")
  private Long updateDate = null;

  @JsonProperty("url")
  private String url = null;

  public VendorResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the vendor is active.  Default &#x3D; true
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the vendor is active.  Default = true")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public VendorResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public VendorResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
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

   /**
   * The date the vendor was added. Unix timestamp in seconds
   * @return createDate
  **/
  @ApiModelProperty(value = "The date the vendor was added. Unix timestamp in seconds")
  public Long getCreateDate() {
    return createDate;
  }

  public VendorResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the vendor
   * @return description
  **/
  @ApiModelProperty(value = "A description of the vendor")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The id of the vendor
   * @return id
  **/
  @ApiModelProperty(value = "The id of the vendor")
  public Integer getId() {
    return id;
  }

  public VendorResource imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The url of an image for the vendor
   * @return imageUrl
  **/
  @ApiModelProperty(value = "The url of an image for the vendor")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public VendorResource manualApproval(Boolean manualApproval) {
    this.manualApproval = manualApproval;
    return this;
  }

   /**
   * Whether the vendor needs to manually approve invoices before they are paid.  A separate checkout flow is required in this case.  Default: false
   * @return manualApproval
  **/
  @ApiModelProperty(example = "false", value = "Whether the vendor needs to manually approve invoices before they are paid.  A separate checkout flow is required in this case.  Default: false")
  public Boolean isManualApproval() {
    return manualApproval;
  }

  public void setManualApproval(Boolean manualApproval) {
    this.manualApproval = manualApproval;
  }

  public VendorResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the vendor
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the vendor")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VendorResource primaryContactEmail(String primaryContactEmail) {
    this.primaryContactEmail = primaryContactEmail;
    return this;
  }

   /**
   * The primary email address for the vendor
   * @return primaryContactEmail
  **/
  @ApiModelProperty(value = "The primary email address for the vendor")
  public String getPrimaryContactEmail() {
    return primaryContactEmail;
  }

  public void setPrimaryContactEmail(String primaryContactEmail) {
    this.primaryContactEmail = primaryContactEmail;
  }

  public VendorResource primaryContactName(String primaryContactName) {
    this.primaryContactName = primaryContactName;
    return this;
  }

   /**
   * The name of the primary contact for the vendor
   * @return primaryContactName
  **/
  @ApiModelProperty(value = "The name of the primary contact for the vendor")
  public String getPrimaryContactName() {
    return primaryContactName;
  }

  public void setPrimaryContactName(String primaryContactName) {
    this.primaryContactName = primaryContactName;
  }

  public VendorResource primaryContactPhone(String primaryContactPhone) {
    this.primaryContactPhone = primaryContactPhone;
    return this;
  }

   /**
   * The primary phone number for the vendor
   * @return primaryContactPhone
  **/
  @ApiModelProperty(value = "The primary phone number for the vendor")
  public String getPrimaryContactPhone() {
    return primaryContactPhone;
  }

  public void setPrimaryContactPhone(String primaryContactPhone) {
    this.primaryContactPhone = primaryContactPhone;
  }

  public VendorResource salesEmail(String salesEmail) {
    this.salesEmail = salesEmail;
    return this;
  }

   /**
   * The email address for sale inquiries for the vendor
   * @return salesEmail
  **/
  @ApiModelProperty(value = "The email address for sale inquiries for the vendor")
  public String getSalesEmail() {
    return salesEmail;
  }

  public void setSalesEmail(String salesEmail) {
    this.salesEmail = salesEmail;
  }

  public VendorResource supportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
    return this;
  }

   /**
   * The email address for support inquiries for the vendor
   * @return supportEmail
  **/
  @ApiModelProperty(value = "The email address for support inquiries for the vendor")
  public String getSupportEmail() {
    return supportEmail;
  }

  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }

  public VendorResource template(String template) {
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

   /**
   * The date the vendor was last updated. Unix timestamp in seconds
   * @return updateDate
  **/
  @ApiModelProperty(value = "The date the vendor was last updated. Unix timestamp in seconds")
  public Long getUpdateDate() {
    return updateDate;
  }

  public VendorResource url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url for the vendor&#39;s site
   * @return url
  **/
  @ApiModelProperty(value = "The url for the vendor's site")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorResource vendorResource = (VendorResource) o;
    return Objects.equals(this.active, vendorResource.active) &&
        Objects.equals(this.additionalProperties, vendorResource.additionalProperties) &&
        Objects.equals(this.createDate, vendorResource.createDate) &&
        Objects.equals(this.description, vendorResource.description) &&
        Objects.equals(this.id, vendorResource.id) &&
        Objects.equals(this.imageUrl, vendorResource.imageUrl) &&
        Objects.equals(this.manualApproval, vendorResource.manualApproval) &&
        Objects.equals(this.name, vendorResource.name) &&
        Objects.equals(this.primaryContactEmail, vendorResource.primaryContactEmail) &&
        Objects.equals(this.primaryContactName, vendorResource.primaryContactName) &&
        Objects.equals(this.primaryContactPhone, vendorResource.primaryContactPhone) &&
        Objects.equals(this.salesEmail, vendorResource.salesEmail) &&
        Objects.equals(this.supportEmail, vendorResource.supportEmail) &&
        Objects.equals(this.template, vendorResource.template) &&
        Objects.equals(this.updateDate, vendorResource.updateDate) &&
        Objects.equals(this.url, vendorResource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalProperties, createDate, description, id, imageUrl, manualApproval, name, primaryContactEmail, primaryContactName, primaryContactPhone, salesEmail, supportEmail, template, updateDate, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    manualApproval: ").append(toIndentedString(manualApproval)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryContactEmail: ").append(toIndentedString(primaryContactEmail)).append("\n");
    sb.append("    primaryContactName: ").append(toIndentedString(primaryContactName)).append("\n");
    sb.append("    primaryContactPhone: ").append(toIndentedString(primaryContactPhone)).append("\n");
    sb.append("    salesEmail: ").append(toIndentedString(salesEmail)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

