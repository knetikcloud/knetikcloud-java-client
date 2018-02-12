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
import com.knetikcloud.model.BreEventLog;
import com.knetikcloud.model.ForwardLog;
import com.knetikcloud.model.PageResourceBreEventLog;
import com.knetikcloud.model.PageResourceForwardLog;
import com.knetikcloud.model.PageResourceUserActionLog;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserActionLog;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogsApi
 */
@Ignore
public class LogsApiTest {

    private final LogsApi api = new LogsApi();

    
    /**
     * Add a user log entry
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserLogTest() throws ApiException {
        UserActionLog logEntry = null;
        api.addUserLog(logEntry);

        // TODO: test validations
    }
    
    /**
     * Get an existing BRE event log entry by id
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EVENTS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREEventLogTest() throws ApiException {
        String id = null;
        BreEventLog response = api.getBREEventLog(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of BRE event log entries
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EVENTS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREEventLogsTest() throws ApiException {
        String filterStartDate = null;
        String filterEventName = null;
        String filterEventId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        String filterRuleId = null;
        PageResourceBreEventLog response = api.getBREEventLogs(filterStartDate, filterEventName, filterEventId, size, page, order, filterRuleId);

        // TODO: test validations
    }
    
    /**
     * Get an existing forward log entry by id
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EVENTS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREForwardLogTest() throws ApiException {
        String id = null;
        ForwardLog response = api.getBREForwardLog(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of forward log entries
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EVENTS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBREForwardLogsTest() throws ApiException {
        String filterStartDate = null;
        String filterEndDate = null;
        Integer filterStatusCode = null;
        Integer filterUrl = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceForwardLog response = api.getBREForwardLogs(filterStartDate, filterEndDate, filterStatusCode, filterUrl, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Returns a user log entry by id
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LOGS_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLogTest() throws ApiException {
        String id = null;
        UserActionLog response = api.getUserLog(id);

        // TODO: test validations
    }
    
    /**
     * Returns a page of user logs entries
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LOGS_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLogsTest() throws ApiException {
        Integer filterUser = null;
        String filterActionName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceUserActionLog response = api.getUserLogs(filterUser, filterActionName, size, page, order);

        // TODO: test validations
    }
    
}
