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
import io.swagger.client.model.SubscriptionTemplateResource;
import io.swagger.client.model.SubscriptionResource;
import io.swagger.client.model.PageResourceSubscriptionTemplateResource;
import io.swagger.client.model.PageResourceSubscriptionResource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreSubscriptionsApi
 */
public class StoreSubscriptionsApiTest {

    private final StoreSubscriptionsApi api = new StoreSubscriptionsApi();

    
    /**
     * Create a subscription template
     *
     * Subscription Templates define a type of subscription and the properties they have.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubscriptionTemplateUsingPOSTTest() throws ApiException {
        SubscriptionTemplateResource subscriptionTemplateResource = null;
        // SubscriptionTemplateResource response = api.createSubscriptionTemplateUsingPOST(subscriptionTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Creates a subscription item and associated plans
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubscriptionUsingPOSTTest() throws ApiException {
        SubscriptionResource subscriptionResource = null;
        // SubscriptionResource response = api.createSubscriptionUsingPOST(subscriptionResource);

        // TODO: test validations
    }
    
    /**
     * Delete a subscription plan
     *
     * Must not be locked or a migration target
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePlanUsingDELETETest() throws ApiException {
        Integer id = null;
        String planId = null;
        // api.deletePlanUsingDELETE(id, planId);

        // TODO: test validations
    }
    
    /**
     * Delete a subscription template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubscriptionTemplateUsingDELETETest() throws ApiException {
        String id = null;
        String cascade = null;
        // api.deleteSubscriptionTemplateUsingDELETE(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get a single subscription template
     *
     * Subscription Templates define a type of subscription and the properties they have.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionTemplateUsingGETTest() throws ApiException {
        String id = null;
        // SubscriptionTemplateResource response = api.getSubscriptionTemplateUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search subscription templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionTemplatesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceSubscriptionTemplateResource response = api.getSubscriptionTemplatesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Retrieve a single subscription item and associated plans
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionUsingGETTest() throws ApiException {
        Integer id = null;
        // SubscriptionResource response = api.getSubscriptionUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List available subscription items and associated plans
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSubscriptionsUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceSubscriptionResource response = api.listSubscriptionsUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Processes subscriptions and charge dues
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processUsingPOSTTest() throws ApiException {
        // api.processUsingPOST();

        // TODO: test validations
    }
    
    /**
     * Update a subscription template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSubscriptionTemplateUsingPUTTest() throws ApiException {
        String id = null;
        SubscriptionTemplateResource subscriptionTemplateResource = null;
        // api.updateSubscriptionTemplateUsingPUT(id, subscriptionTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Updates a subscription item and associated plans
     *
     * Will not remove plans left out
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSubscriptionUsingPUTTest() throws ApiException {
        Integer id = null;
        SubscriptionResource subscriptionResource = null;
        // api.updateSubscriptionUsingPUT(id, subscriptionResource);

        // TODO: test validations
    }
    
}
