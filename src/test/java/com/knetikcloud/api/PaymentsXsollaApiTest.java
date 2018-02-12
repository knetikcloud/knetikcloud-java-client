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
import com.knetikcloud.model.Result;
import com.knetikcloud.model.XsollaPaymentRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsXsollaApi
 */
@Ignore
public class PaymentsXsollaApiTest {

    private final PaymentsXsollaApi api = new PaymentsXsollaApi();

    
    /**
     * Create a payment token that should be used to forward the user to Xsolla so they can complete payment
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; XSOLLA_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createXsollaTokenUrlTest() throws ApiException {
        XsollaPaymentRequest request = null;
        String response = api.createXsollaTokenUrl(request);

        // TODO: test validations
    }
    
}