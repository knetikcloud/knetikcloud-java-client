/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ActivityOccurrenceCreationFailure;
import io.swagger.client.model.ActivityOccurrenceResource;
import io.swagger.client.model.ActivityResource;
import io.swagger.client.model.PageResourceBareActivityResource;
import io.swagger.client.model.ActivityOccurrenceResults;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitiesApi
 */
public class ActivitiesApiTest {

    private final ActivitiesApi api = new ActivitiesApi();

    
    /**
     * Updated the status of an activity occurrence
     *
     * If setting to &#39;FINISHED&#39; you must POST to /results instead to record the metrics and get synchronous reward results
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeActivityOccurrenceUsingPUTTest() throws ApiException {
        Long activityOccurrenceId = null;
        String activityCccurrenceStatus = null;
        // api.completeActivityOccurrenceUsingPUT(activityOccurrenceId, activityCccurrenceStatus);

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
    public void createActivityOccurrenceUsingPOSTTest() throws ApiException {
        Boolean test = null;
        ActivityOccurrenceResource activityOccurrenceResource = null;
        // ActivityOccurrenceResource response = api.createActivityOccurrenceUsingPOST(test, activityOccurrenceResource);

        // TODO: test validations
    }
    
    /**
     * Create an activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createActivityUsingPOSTTest() throws ApiException {
        ActivityResource activityResource = null;
        // ActivityResource response = api.createActivityUsingPOST(activityResource);

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
    public void deleteActivityUsingDELETETest() throws ApiException {
        Long id = null;
        // api.deleteActivityUsingDELETE(id);

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
    public void getActivitiesUsingGETTest() throws ApiException {
        Boolean filterTemplate = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceBareActivityResource response = api.getActivitiesUsingGET(filterTemplate, size, page, order);

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
    public void getActivityUsingGETTest() throws ApiException {
        Long id = null;
        // ActivityResource response = api.getActivityUsingGET(id);

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
    public void postResultsUsingPOSTTest() throws ApiException {
        Long activityOccurrenceId = null;
        ActivityOccurrenceResults activityOccurrenceResults = null;
        // ActivityOccurrenceResults response = api.postResultsUsingPOST(activityOccurrenceId, activityOccurrenceResults);

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
    public void updateActivityUsingPUTTest() throws ApiException {
        Long id = null;
        ActivityResource activityResource = null;
        // api.updateActivityUsingPUT(id, activityResource);

        // TODO: test validations
    }
    
}
