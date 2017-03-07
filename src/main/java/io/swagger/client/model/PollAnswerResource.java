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

/**
 * PollAnswerResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T17:07:29.133-05:00")
public class PollAnswerResource {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("text")
  private String text = null;

   /**
   * The number of uesrs that selected this answer
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "The number of uesrs that selected this answer")
  public Integer getCount() {
    return count;
  }

  public PollAnswerResource key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key to the answer (for code reference)
   * @return key
  **/
  @ApiModelProperty(example = "null", required = true, value = "The key to the answer (for code reference)")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public PollAnswerResource text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text of the answer (for user display)
   * @return text
  **/
  @ApiModelProperty(example = "null", required = true, value = "The text of the answer (for user display)")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PollAnswerResource pollAnswerResource = (PollAnswerResource) o;
    return Objects.equals(this.count, pollAnswerResource.count) &&
        Objects.equals(this.key, pollAnswerResource.key) &&
        Objects.equals(this.text, pollAnswerResource.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, key, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollAnswerResource {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

