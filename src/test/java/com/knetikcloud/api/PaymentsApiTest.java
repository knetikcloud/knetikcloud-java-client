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


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.PaymentAuthorizationResource;
import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
@Ignore
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    
    /**
     * Create a new payment method for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentMethodTest() throws ApiException {
        Integer userId = null;
        PaymentMethodResource paymentMethod = null;
        PaymentMethodResource response = api.createPaymentMethod(userId, paymentMethod);

        // TODO: test validations
    }
    
    /**
     * Delete an existing payment method for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePaymentMethodTest() throws ApiException {
        Integer userId = null;
        Integer id = null;
        api.deletePaymentMethod(userId, id);

        // TODO: test validations
    }
    
    /**
     * Get a single payment method for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentMethodTest() throws ApiException {
        Integer userId = null;
        Integer id = null;
        PaymentMethodResource response = api.getPaymentMethod(userId, id);

        // TODO: test validations
    }
    
    /**
     * Get all payment methods for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentMethodsTest() throws ApiException {
        Integer userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        List<PaymentMethodResource> response = api.getPaymentMethods(userId, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Authorize payment of an invoice for later capture
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentAuthorizationTest() throws ApiException {
        PaymentAuthorizationResource request = null;
        PaymentAuthorizationResource response = api.paymentAuthorization(request);

        // TODO: test validations
    }
    
    /**
     * Capture an existing invoice payment authorization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentCaptureTest() throws ApiException {
        Integer id = null;
        api.paymentCapture(id);

        // TODO: test validations
    }
    
    /**
     * Update an existing payment method for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePaymentMethodTest() throws ApiException {
        Integer userId = null;
        Integer id = null;
        PaymentMethodResource paymentMethod = null;
        PaymentMethodResource response = api.updatePaymentMethod(userId, id, paymentMethod);

        // TODO: test validations
    }
    
}
