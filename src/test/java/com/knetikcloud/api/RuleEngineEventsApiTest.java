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
import com.knetikcloud.model.BreEvent;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RuleEngineEventsApi
 */
@Ignore
public class RuleEngineEventsApiTest {

    private final RuleEngineEventsApi api = new RuleEngineEventsApi();

    
    /**
     * Fire a new event, based on an existing trigger
     *
     * Parameters within the event must match names and types from the trigger. Actual rule execution is asynchornous.  Returns request id, which will be used as the event id. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EVENTS_USER
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendBREEventTest() throws ApiException {
        BreEvent breEvent = null;
        StringWrapper response = api.sendBREEvent(breEvent);

        // TODO: test validations
    }
    
}
