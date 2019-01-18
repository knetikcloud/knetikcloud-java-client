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
import com.knetikcloud.model.OptimalPaymentRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsOptimalApi
 */
@Ignore
public class PaymentsOptimalApiTest {

    private final PaymentsOptimalApi api = new PaymentsOptimalApi();

    
    /**
     * Initiate silent post with Optimal
     *
     * Will return the url for a hosted payment endpoint to post to. See Optimal documentation for details. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; OPTIMAL_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void silentPostOptimalTest() throws ApiException {
        OptimalPaymentRequest request = null;
        StringWrapper response = api.silentPostOptimal(request);

        // TODO: test validations
    }
    
}
