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
import io.swagger.client.model.CouponItem;
import io.swagger.client.model.ItemTemplateResource;
import io.swagger.client.model.PageItemTemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreCouponsApi
 */
@Ignore
public class StoreCouponsApiTest {

    private final StoreCouponsApi api = new StoreCouponsApi();

    
    /**
     * Create a coupon item
     *
     * SKUs have to be unique in the entire store.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCouponItemUsingPOSTTest() throws ApiException {
        CouponItem couponItem = null;
        CouponItem response = api.createCouponItemUsingPOST(couponItem);

        // TODO: test validations
    }
    
    /**
     * Create a coupon template
     *
     * Coupon Templates define a type of coupon and the properties they have.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCouponTemplateUsingPOSTTest() throws ApiException {
        ItemTemplateResource couponTemplateResource = null;
        ItemTemplateResource response = api.createCouponTemplateUsingPOST(couponTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a coupon item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCouponItemUsingDELETETest() throws ApiException {
        Integer id = null;
        api.deleteCouponItemUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Delete a coupon template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCouponTemplateUsingDELETETest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteCouponTemplateUsingDELETE(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get a single coupon item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCouponItemUsingGETTest() throws ApiException {
        Integer id = null;
        CouponItem response = api.getCouponItemUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Get a single coupon template
     *
     * Coupon Templates define a type of coupon and the properties they have.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCouponTemplateUsingGETTest() throws ApiException {
        String id = null;
        ItemTemplateResource response = api.getCouponTemplateUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search coupon templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCouponTemplatesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageItemTemplateResource response = api.getCouponTemplatesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a coupon item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCouponItemUsingPUTTest() throws ApiException {
        Integer id = null;
        CouponItem couponItem = null;
        api.updateCouponItemUsingPUT(id, couponItem);

        // TODO: test validations
    }
    
    /**
     * Update a coupon template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCouponTemplateUsingPUTTest() throws ApiException {
        String id = null;
        ItemTemplateResource couponTemplateResource = null;
        api.updateCouponTemplateUsingPUT(id, couponTemplateResource);

        // TODO: test validations
    }
    
}
