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
import com.knetikcloud.model.BroadcastableEvent;
import com.knetikcloud.model.CustomerConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RemoveCustomerEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-16T13:17:28.027-04:00")
public class RemoveCustomerEvent extends BroadcastableEvent {
  @JsonProperty("customer_config")
  private CustomerConfig customerConfig = null;

  public RemoveCustomerEvent customerConfig(CustomerConfig customerConfig) {
    this.customerConfig = customerConfig;
    return this;
  }

   /**
   * Get customerConfig
   * @return customerConfig
  **/
  @ApiModelProperty(value = "")
  public CustomerConfig getCustomerConfig() {
    return customerConfig;
  }

  public void setCustomerConfig(CustomerConfig customerConfig) {
    this.customerConfig = customerConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveCustomerEvent removeCustomerEvent = (RemoveCustomerEvent) o;
    return Objects.equals(this.customerConfig, removeCustomerEvent.customerConfig) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerConfig, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveCustomerEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customerConfig: ").append(toIndentedString(customerConfig)).append("\n");
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

