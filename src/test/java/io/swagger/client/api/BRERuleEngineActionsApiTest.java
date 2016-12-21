/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
import io.swagger.client.model.ActionResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BRERuleEngineActionsApi
 */
@Ignore
public class BRERuleEngineActionsApiTest {

    private final BRERuleEngineActionsApi api = new BRERuleEngineActionsApi();

    
    /**
     * Get a list of available actions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionsUsingGETTest() throws ApiException {
        String filterCategory = null;
        String filterName = null;
        List<ActionResource> response = api.getActionsUsingGET(filterCategory, filterName);

        // TODO: test validations
    }
    
}
