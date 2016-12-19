/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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

/**
 * GooglePaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T18:22:48.635-05:00")
public class GooglePaymentRequest {
  @SerializedName("json_payload")
  private String jsonPayload = null;

  @SerializedName("signature")
  private String signature = null;

  public GooglePaymentRequest jsonPayload(String jsonPayload) {
    this.jsonPayload = jsonPayload;
    return this;
  }

   /**
   * The json payload exactly as sent from Google
   * @return jsonPayload
  **/
  @ApiModelProperty(example = "null", required = true, value = "The json payload exactly as sent from Google")
  public String getJsonPayload() {
    return jsonPayload;
  }

  public void setJsonPayload(String jsonPayload) {
    this.jsonPayload = jsonPayload;
  }

  public GooglePaymentRequest signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * The signature from Google to verify the payload
   * @return signature
  **/
  @ApiModelProperty(example = "null", required = true, value = "The signature from Google to verify the payload")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePaymentRequest googlePaymentRequest = (GooglePaymentRequest) o;
    return Objects.equals(this.jsonPayload, googlePaymentRequest.jsonPayload) &&
        Objects.equals(this.signature, googlePaymentRequest.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonPayload, signature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePaymentRequest {\n");
    
    sb.append("    jsonPayload: ").append(toIndentedString(jsonPayload)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

