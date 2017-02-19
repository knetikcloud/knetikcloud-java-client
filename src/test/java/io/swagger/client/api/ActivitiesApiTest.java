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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ActivityOccurrenceCreationFailure;
import io.swagger.client.model.ActivityOccurrenceResource;
import io.swagger.client.model.ActivityOccurrenceResults;
import io.swagger.client.model.ActivityResource;
import io.swagger.client.model.PageResourceBareActivityResource;
import io.swagger.client.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitiesApi
 */
@Ignore
public class ActivitiesApiTest {

    private final ActivitiesApi api = new ActivitiesApi();

    
    /**
     * Create an activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createActivityTest() throws ApiException {
        ActivityResource activityResource = null;
        ActivityResource response = api.createActivity(activityResource);

        // TODO: test validations
    }
    
    /**
     * Create a new activity occurrence
     *
     * Has to enforce extra rules if not used as an admin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createActivityOccurrenceTest() throws ApiException {
        Boolean test = null;
        ActivityOccurrenceResource activityOccurrenceResource = null;
        ActivityOccurrenceResource response = api.createActivityOccurrence(test, activityOccurrenceResource);

        // TODO: test validations
    }
    
    /**
     * Delete an activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteActivityTest() throws ApiException {
        Long id = null;
        api.deleteActivity(id);

        // TODO: test validations
    }
    
    /**
     * List activity definitions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivitiesTest() throws ApiException {
        Boolean filterTemplate = null;
        String filterName = null;
        String filterId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceBareActivityResource response = api.getActivities(filterTemplate, filterName, filterId, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivityTest() throws ApiException {
        Long id = null;
        ActivityResource response = api.getActivity(id);

        // TODO: test validations
    }
    
    /**
     * Sets the status of an activity occurrence to FINISHED and logs metrics
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setActivityOccurrenceResultsTest() throws ApiException {
        Long activityOccurrenceId = null;
        ActivityOccurrenceResults activityOccurrenceResults = null;
        ActivityOccurrenceResults response = api.setActivityOccurrenceResults(activityOccurrenceId, activityOccurrenceResults);

        // TODO: test validations
    }
    
    /**
     * Update an activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateActivityTest() throws ApiException {
        Long id = null;
        ActivityResource activityResource = null;
        ActivityResource response = api.updateActivity(id, activityResource);

        // TODO: test validations
    }
    
    /**
     * Updated the status of an activity occurrence
     *
     * If setting to &#39;FINISHED&#39; you must POST to /results instead to record the metrics and get synchronous reward results
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateActivityOccurrenceTest() throws ApiException {
        Long activityOccurrenceId = null;
        String activityCccurrenceStatus = null;
        api.updateActivityOccurrence(activityOccurrenceId, activityCccurrenceStatus);

        // TODO: test validations
    }
    
}