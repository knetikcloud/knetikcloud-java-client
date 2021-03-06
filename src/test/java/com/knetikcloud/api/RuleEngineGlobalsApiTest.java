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
import com.knetikcloud.model.BreGlobalResource;
import com.knetikcloud.model.PageResourceBreGlobalResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RuleEngineGlobalsApi
 */
@Ignore
public class RuleEngineGlobalsApiTest {

    private final RuleEngineGlobalsApi api = new RuleEngineGlobalsApi();

    
    /**
     * Create a global definition
     *
     * Once created you can then use in a custom rule. Note that global definitions cannot be modified or deleted if in use. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBREGlobalTest() throws ApiException {
        BreGlobalResource breGlobalResource = null;
        BreGlobalResource response = api.createBREGlobal(breGlobalResource);

        // TODO: test validations
    }
    
    /**
     * Delete a global
     *
     * May fail if there are existing rules against it. Cannot delete core globals. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBREGlobalTest() throws ApiException {
        String id = null;
        api.deleteBREGlobal(id);

        // TODO: test validations
    }
    
    /**
     * Get a single global definition
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_USER
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREGlobalTest() throws ApiException {
        String id = null;
        BreGlobalResource response = api.getBREGlobal(id);

        // TODO: test validations
    }
    
    /**
     * List global definitions
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_USER
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREGlobalsTest() throws ApiException {
        Boolean filterSystem = null;
        Integer size = null;
        Integer page = null;
        PageResourceBreGlobalResource response = api.getBREGlobals(filterSystem, size, page);

        // TODO: test validations
    }
    
    /**
     * Update a global definition
     *
     * May fail if new parameters mismatch requirements of existing rules. Cannot update core globals. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_GLOBALS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBREGlobalTest() throws ApiException {
        String id = null;
        BreGlobalResource breGlobalResource = null;
        BreGlobalResource response = api.updateBREGlobal(id, breGlobalResource);

        // TODO: test validations
    }
    
}
