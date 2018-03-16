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
 * RawEmailResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T11:20:48.459-04:00")
public class RawEmailResource {
  @JsonProperty("body")
  private String body = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("html")
  private Boolean html = null;

  @JsonProperty("recipients")
  private List<Integer> recipients = new ArrayList<Integer>();

  @JsonProperty("subject")
  private String subject = null;

  public RawEmailResource body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The body of the outgoing message.
   * @return body
  **/
  @ApiModelProperty(required = true, value = "The body of the outgoing message.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public RawEmailResource from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Address to attribute the outgoing message to. Optional if the config email.out_address is set.
   * @return from
  **/
  @ApiModelProperty(value = "Address to attribute the outgoing message to. Optional if the config email.out_address is set.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public RawEmailResource html(Boolean html) {
    this.html = html;
    return this;
  }

   /**
   * Whether the body is to be treated as html. Default false.
   * @return html
  **/
  @ApiModelProperty(example = "false", value = "Whether the body is to be treated as html. Default false.")
  public Boolean isHtml() {
    return html;
  }

  public void setHtml(Boolean html) {
    this.html = html;
  }

  public RawEmailResource recipients(List<Integer> recipients) {
    this.recipients = recipients;
    return this;
  }

  public RawEmailResource addRecipientsItem(Integer recipientsItem) {
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

  public RawEmailResource subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the outgoing message.
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "The subject of the outgoing message.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawEmailResource rawEmailResource = (RawEmailResource) o;
    return Objects.equals(this.body, rawEmailResource.body) &&
        Objects.equals(this.from, rawEmailResource.from) &&
        Objects.equals(this.html, rawEmailResource.html) &&
        Objects.equals(this.recipients, rawEmailResource.recipients) &&
        Objects.equals(this.subject, rawEmailResource.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, from, html, recipients, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawEmailResource {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

