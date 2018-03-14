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
import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.BroadcastableEvent;
import com.knetikcloud.model.ResourceTypeDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ServiceDeployedEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T13:34:49.137-04:00")
public class ServiceDeployedEvent extends BroadcastableEvent {
  @JsonProperty("events")
  private List<BreTriggerResource> events = new ArrayList<BreTriggerResource>();

  @JsonProperty("resources")
  private List<ResourceTypeDescription> resources = new ArrayList<ResourceTypeDescription>();

  @JsonProperty("service_name")
  private String serviceName = null;

  @JsonProperty("swagger_url")
  private String swaggerUrl = null;

  public ServiceDeployedEvent events(List<BreTriggerResource> events) {
    this.events = events;
    return this;
  }

  public ServiceDeployedEvent addEventsItem(BreTriggerResource eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The events fired by this service
   * @return events
  **/
  @ApiModelProperty(required = true, value = "The events fired by this service")
  public List<BreTriggerResource> getEvents() {
    return events;
  }

  public void setEvents(List<BreTriggerResource> events) {
    this.events = events;
  }

  public ServiceDeployedEvent resources(List<ResourceTypeDescription> resources) {
    this.resources = resources;
    return this;
  }

  public ServiceDeployedEvent addResourcesItem(ResourceTypeDescription resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * The resources managed by this service
   * @return resources
  **/
  @ApiModelProperty(required = true, value = "The resources managed by this service")
  public List<ResourceTypeDescription> getResources() {
    return resources;
  }

  public void setResources(List<ResourceTypeDescription> resources) {
    this.resources = resources;
  }

  public ServiceDeployedEvent serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * The unique name for the service. This serves as the unique identifier. Cannot be changed after creation
   * @return serviceName
  **/
  @ApiModelProperty(required = true, value = "The unique name for the service. This serves as the unique identifier. Cannot be changed after creation")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public ServiceDeployedEvent swaggerUrl(String swaggerUrl) {
    this.swaggerUrl = swaggerUrl;
    return this;
  }

   /**
   * The url of the swagger doc
   * @return swaggerUrl
  **/
  @ApiModelProperty(required = true, value = "The url of the swagger doc")
  public String getSwaggerUrl() {
    return swaggerUrl;
  }

  public void setSwaggerUrl(String swaggerUrl) {
    this.swaggerUrl = swaggerUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDeployedEvent serviceDeployedEvent = (ServiceDeployedEvent) o;
    return Objects.equals(this.events, serviceDeployedEvent.events) &&
        Objects.equals(this.resources, serviceDeployedEvent.resources) &&
        Objects.equals(this.serviceName, serviceDeployedEvent.serviceName) &&
        Objects.equals(this.swaggerUrl, serviceDeployedEvent.swaggerUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, resources, serviceName, swaggerUrl, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDeployedEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    swaggerUrl: ").append(toIndentedString(swaggerUrl)).append("\n");
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

