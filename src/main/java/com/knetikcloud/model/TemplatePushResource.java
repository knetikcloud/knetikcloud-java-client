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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * TemplatePushResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T13:34:49.137-04:00")
public class TemplatePushResource {
  @JsonProperty("recipients")
  private List<Integer> recipients = new ArrayList<Integer>();

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("template_vars")
  private Object templateVars = null;

  public TemplatePushResource recipients(List<Integer> recipients) {
    this.recipients = recipients;
    return this;
  }

  public TemplatePushResource addRecipientsItem(Integer recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * A list of user ids to send the message to.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "A list of user ids to send the message to.")
  public List<Integer> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Integer> recipients) {
    this.recipients = recipients;
  }

  public TemplatePushResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A mustache template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "A mustache template")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public TemplatePushResource templateVars(Object templateVars) {
    this.templateVars = templateVars;
    return this;
  }

   /**
   * A map of values to fill in the template
   * @return templateVars
  **/
  @ApiModelProperty(value = "A map of values to fill in the template")
  public Object getTemplateVars() {
    return templateVars;
  }

  public void setTemplateVars(Object templateVars) {
    this.templateVars = templateVars;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatePushResource templatePushResource = (TemplatePushResource) o;
    return Objects.equals(this.recipients, templatePushResource.recipients) &&
        Objects.equals(this.template, templatePushResource.template) &&
        Objects.equals(this.templateVars, templatePushResource.templateVars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients, template, templateVars);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatePushResource {\n");
    
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateVars: ").append(toIndentedString(templateVars)).append("\n");
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

