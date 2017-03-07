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
import io.swagger.client.model.Result;
import io.swagger.client.model.XsollaPaymentRequest;
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
     * 
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
    
    /**
     * Receives payment response from Xsolla
     *
     * Only used by Xsolla to call back to JSAPI after processing user payment action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void receiveXsollaNotificationTest() throws ApiException {
        api.receiveXsollaNotification();

        // TODO: test validations
    }
    
}
