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
import io.swagger.client.model.PageVendorResource;
import io.swagger.client.model.VendorResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreVendorsApi
 */
@Ignore
public class StoreVendorsApiTest {

    private final StoreVendorsApi api = new StoreVendorsApi();

    
    /**
     * Create a vendor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVendorUsingPOSTTest() throws ApiException {
        VendorResource vendor = null;
        VendorResource response = api.createVendorUsingPOST(vendor);

        // TODO: test validations
    }
    
    /**
     * Delete a vendor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVendorUsingDELETETest() throws ApiException {
        Integer id = null;
        api.deleteVendorUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Get a single vendor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVendorUsingGETTest() throws ApiException {
        Integer id = null;
        VendorResource response = api.getVendorUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search vendors
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVendorsUsingGETTest() throws ApiException {
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageVendorResource response = api.getVendorsUsingGET(filterName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a vendor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVendorUsingPUTTest() throws ApiException {
        Integer id = null;
        VendorResource vendor = null;
        api.updateVendorUsingPUT(id, vendor);

        // TODO: test validations
    }
    
}
