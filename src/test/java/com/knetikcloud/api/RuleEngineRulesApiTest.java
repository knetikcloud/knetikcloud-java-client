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
import com.knetikcloud.model.BooleanResource;
import com.knetikcloud.model.BreRule;
import com.knetikcloud.model.Expressionobject;
import com.knetikcloud.model.PageResourceBreRule;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RuleEngineRulesApi
 */
@Ignore
public class RuleEngineRulesApiTest {

    private final RuleEngineRulesApi api = new RuleEngineRulesApi();

    
    /**
     * Create a rule
     *
     * Rules define which actions to run when a given event verifies the specified condition. Full list of predicates and other type of expressions can be found at GET /bre/expressions/. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBRERuleTest() throws ApiException {
        BreRule breRule = null;
        BreRule response = api.createBRERule(breRule);

        // TODO: test validations
    }
    
    /**
     * Delete a rule
     *
     * May fail if there are existing rules against it. Cannot delete core rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBRERuleTest() throws ApiException {
        String id = null;
        api.deleteBRERule(id);

        // TODO: test validations
    }
    
    /**
     * Returns a string representation of the provided expression
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREExpressionAsStringTest() throws ApiException {
        Expressionobject expression = null;
        StringWrapper response = api.getBREExpressionAsString(expression);

        // TODO: test validations
    }
    
    /**
     * Get a single rule
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBRERuleTest() throws ApiException {
        String id = null;
        BreRule response = api.getBRERule(id);

        // TODO: test validations
    }
    
    /**
     * List rules
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBRERulesTest() throws ApiException {
        String filterName = null;
        Boolean filterEnabled = null;
        Boolean filterSystem = null;
        String filterTrigger = null;
        String filterAction = null;
        String filterCondition = null;
        Integer size = null;
        Integer page = null;
        PageResourceBreRule response = api.getBRERules(filterName, filterEnabled, filterSystem, filterTrigger, filterAction, filterCondition, size, page);

        // TODO: test validations
    }
    
    /**
     * Enable or disable a rule
     *
     * This is helpful for turning off systems rules which cannot be deleted or modified otherwise. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setBRERuleTest() throws ApiException {
        String id = null;
        BooleanResource enabled = null;
        api.setBRERule(id, enabled);

        // TODO: test validations
    }
    
    /**
     * Update a rule
     *
     * Cannot update system rules. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_RULES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBRERuleTest() throws ApiException {
        String id = null;
        BreRule breRule = null;
        BreRule response = api.updateBRERule(id, breRule);

        // TODO: test validations
    }
    
}
