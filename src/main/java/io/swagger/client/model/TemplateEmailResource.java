/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
import io.swagger.client.model.KeyValuePairstringstring;
import java.util.ArrayList;
import java.util.List;

/**
 * TemplateEmailResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T01:11:26.271-05:00")
public class TemplateEmailResource {
  @SerializedName("from")
  private String from = null;

  @SerializedName("recipients")
  private List<Integer> recipients = new ArrayList<Integer>();

  @SerializedName("template_key")
  private String templateKey = null;

  @SerializedName("template_vars")
  private List<KeyValuePairstringstring> templateVars = new ArrayList<KeyValuePairstringstring>();

  public TemplateEmailResource from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Address to attribute the outgoing message to. Optional if the config email.out_address is set.
   * @return from
  **/
  @ApiModelProperty(example = "null", value = "Address to attribute the outgoing message to. Optional if the config email.out_address is set.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public TemplateEmailResource recipients(List<Integer> recipients) {
    this.recipients = recipients;
    return this;
  }

  public TemplateEmailResource addRecipientsItem(Integer recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * A list of user ids to send the message to.
   * @return recipients
  **/
  @ApiModelProperty(example = "null", required = true, value = "A list of user ids to send the message to.")
  public List<Integer> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Integer> recipients) {
    this.recipients = recipients;
  }

  public TemplateEmailResource templateKey(String templateKey) {
    this.templateKey = templateKey;
    return this;
  }

   /**
   * The key for the template
   * @return templateKey
  **/
  @ApiModelProperty(example = "null", required = true, value = "The key for the template")
  public String getTemplateKey() {
    return templateKey;
  }

  public void setTemplateKey(String templateKey) {
    this.templateKey = templateKey;
  }

  public TemplateEmailResource templateVars(List<KeyValuePairstringstring> templateVars) {
    this.templateVars = templateVars;
    return this;
  }

  public TemplateEmailResource addTemplateVarsItem(KeyValuePairstringstring templateVarsItem) {
    this.templateVars.add(templateVarsItem);
    return this;
  }

   /**
   * A list of variables to fill in the template
   * @return templateVars
  **/
  @ApiModelProperty(example = "null", value = "A list of variables to fill in the template")
  public List<KeyValuePairstringstring> getTemplateVars() {
    return templateVars;
  }

  public void setTemplateVars(List<KeyValuePairstringstring> templateVars) {
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
    TemplateEmailResource templateEmailResource = (TemplateEmailResource) o;
    return Objects.equals(this.from, templateEmailResource.from) &&
        Objects.equals(this.recipients, templateEmailResource.recipients) &&
        Objects.equals(this.templateKey, templateEmailResource.templateKey) &&
        Objects.equals(this.templateVars, templateEmailResource.templateVars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, recipients, templateKey, templateVars);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateEmailResource {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    templateKey: ").append(toIndentedString(templateKey)).append("\n");
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

