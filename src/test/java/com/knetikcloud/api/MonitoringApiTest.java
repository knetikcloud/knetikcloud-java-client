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


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.MonitoringAlertResource;
import com.knetikcloud.model.MonitoringIncidentEventResource;
import com.knetikcloud.model.MonitoringIncidentResource;
import com.knetikcloud.model.MonitoringMetricDatapointResource;
import com.knetikcloud.model.MonitoringMetricResource;
import com.knetikcloud.model.PageResourceMonitoringAlertResource;
import com.knetikcloud.model.PageResourceMonitoringIncidentEventResource;
import com.knetikcloud.model.PageResourceMonitoringIncidentResource;
import com.knetikcloud.model.PageResourceMonitoringMetricResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MonitoringApi
 */
@Ignore
public class MonitoringApiTest {

    private final MonitoringApi api = new MonitoringApi();

    
    /**
     * Create a new alert
     *
     * &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAlertTest() throws ApiException {
        MonitoringAlertResource alertResource = null;
        MonitoringAlertResource response = api.createAlert(alertResource);

        // TODO: test validations
    }
    
    /**
     * Create a new metric
     *
     * &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMetricTest() throws ApiException {
        MonitoringMetricResource metricResource = null;
        MonitoringMetricResource response = api.createMetric(metricResource);

        // TODO: test validations
    }
    
    /**
     * Delete an existing alert
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAlertTest() throws ApiException {
        String id = null;
        api.deleteAlert(id);

        // TODO: test validations
    }
    
    /**
     * Delete a metric datapoint
     *
     * Only works for counter and guage type. &lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDatapointTest() throws ApiException {
        String id = null;
        String dimensions = null;
        api.deleteDatapoint(id, dimensions);

        // TODO: test validations
    }
    
    /**
     * End an existing incident
     *
     * Does not delete the incident, but marks it as resolved by setting the end date.&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIncidentTest() throws ApiException {
        String id = null;
        api.deleteIncident(id);

        // TODO: test validations
    }
    
    /**
     * Delete an existing metric
     *
     * This will delete all metrics referencing this metric as its parent.  &lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMetricTest() throws ApiException {
        String id = null;
        api.deleteMetric(id);

        // TODO: test validations
    }
    
    /**
     * Get a single alert
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlertTest() throws ApiException {
        String id = null;
        MonitoringAlertResource response = api.getAlert(id);

        // TODO: test validations
    }
    
    /**
     * List and search alerts
     *
     * Get a list of alerts with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlertsTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceMonitoringAlertResource response = api.getAlerts(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single incident
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncidentTest() throws ApiException {
        String id = null;
        MonitoringIncidentResource response = api.getIncident(id);

        // TODO: test validations
    }
    
    /**
     * Get the events of an incident
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncidentEventsTest() throws ApiException {
        String id = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceMonitoringIncidentEventResource response = api.getIncidentEvents(id, size, page, order);

        // TODO: test validations
    }
    
    /**
     * List and search incidents
     *
     * Get a list of incidents with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncidentsTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceMonitoringIncidentResource response = api.getIncidents(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single metric
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetricTest() throws ApiException {
        String id = null;
        MonitoringMetricResource response = api.getMetric(id);

        // TODO: test validations
    }
    
    /**
     * List and search metrics
     *
     * Get a list of metrics with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetricsTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceMonitoringMetricResource response = api.getMetrics(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Post a metric datapoint batch
     *
     * Only works with counter and gauge metrics. Re-submit the entire batch in case of failure. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postBatchTest() throws ApiException {
        List<MonitoringMetricDatapointResource> batch = null;
        api.postBatch(batch);

        // TODO: test validations
    }
    
    /**
     * Post a metric datapoint
     *
     * Only works with counter and gauge metrics. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDatapointTest() throws ApiException {
        String id = null;
        MonitoringMetricDatapointResource metricDatapoint = null;
        api.postDatapoint(id, metricDatapoint);

        // TODO: test validations
    }
    
    /**
     * Report an incident event
     *
     * Updates the current incident for an alert or starts a new one if none current. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void receiveEventTest() throws ApiException {
        MonitoringIncidentEventResource incidentResource = null;
        MonitoringIncidentResource response = api.receiveEvent(incidentResource);

        // TODO: test validations
    }
    
    /**
     * Update an existing alert
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAlertTest() throws ApiException {
        String id = null;
        MonitoringAlertResource alertResource = null;
        api.updateAlert(id, alertResource);

        // TODO: test validations
    }
    
    /**
     * Update an existing metric
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMetricTest() throws ApiException {
        String id = null;
        MonitoringMetricResource metricResource = null;
        api.updateMetric(id, metricResource);

        // TODO: test validations
    }
    
}
