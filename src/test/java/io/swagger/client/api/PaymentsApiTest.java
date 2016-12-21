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
import io.swagger.client.model.PaymentMethodResource;
import io.swagger.client.model.PaymentAuthorizationResource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
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
    public void createPaymentMethodUsingPOSTTest() throws ApiException {
        Integer userId = null;
        PaymentMethodResource paymentMethod = null;
        // PaymentMethodResource response = api.createPaymentMethodUsingPOST(userId, paymentMethod);

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
    public void deletePaymentMethodUsingDELETETest() throws ApiException {
        Integer userId = null;
        Integer id = null;
        // api.deletePaymentMethodUsingDELETE(userId, id);

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
    public void getPaymentMethodUsingGETTest() throws ApiException {
        Integer userId = null;
        Integer id = null;
        // PaymentMethodResource response = api.getPaymentMethodUsingGET(userId, id);

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
    public void getPaymentMethodsUsingGETTest() throws ApiException {
        Integer userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // List<PaymentMethodResource> response = api.getPaymentMethodsUsingGET(userId, size, page, order);

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
    public void paymentAuthorizationUsingPOSTTest() throws ApiException {
        PaymentAuthorizationResource request = null;
        // PaymentAuthorizationResource response = api.paymentAuthorizationUsingPOST(request);

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
    public void paymentCaptureUsingPOSTTest() throws ApiException {
        Integer id = null;
        // api.paymentCaptureUsingPOST(id);

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
    public void updatePaymentMethodUsingPUTTest() throws ApiException {
        Integer userId = null;
        Integer id = null;
        PaymentMethodResource paymentMethod = null;
        // api.updatePaymentMethodUsingPUT(userId, id, paymentMethod);

        // TODO: test validations
    }
    
}
