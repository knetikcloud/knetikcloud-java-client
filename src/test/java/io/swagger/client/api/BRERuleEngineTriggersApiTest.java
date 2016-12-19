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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BreTriggerResource;
import io.swagger.client.model.PageBreTriggerResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BRERuleEngineTriggersApi
 */
@Ignore
public class BRERuleEngineTriggersApiTest {

    private final BRERuleEngineTriggersApi api = new BRERuleEngineTriggersApi();

    
    /**
     * Create a trigger
     *
     * Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTriggerUsingPOSTTest() throws ApiException {
        BreTriggerResource breTriggerResource = null;
        BreTriggerResource response = api.createTriggerUsingPOST(breTriggerResource);

        // TODO: test validations
    }
    
    /**
     * Delete a trigger
     *
     * May fail if there are existing rules against it. Cannot delete core triggers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTriggerUsingDELETETest() throws ApiException {
        String eventName = null;
        api.deleteTriggerUsingDELETE(eventName);

        // TODO: test validations
    }
    
    /**
     * Get a single trigger
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTriggerUsingGETTest() throws ApiException {
        String eventName = null;
        BreTriggerResource response = api.getTriggerUsingGET(eventName);

        // TODO: test validations
    }
    
    /**
     * List triggers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTriggersUsingGETTest() throws ApiException {
        Boolean filterSystem = null;
        String filterCategory = null;
        String filterName = null;
        Integer size = null;
        Integer page = null;
        PageBreTriggerResource response = api.getTriggersUsingGET(filterSystem, filterCategory, filterName, size, page);

        // TODO: test validations
    }
    
    /**
     * Update a trigger
     *
     * May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTriggerUsingPUTTest() throws ApiException {
        String eventName = null;
        BreTriggerResource breTriggerResource = null;
        api.updateTriggerUsingPUT(eventName, breTriggerResource);

        // TODO: test validations
    }
    
}
