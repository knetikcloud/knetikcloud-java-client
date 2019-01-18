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
import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.PageResourceVendorResource;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.VendorResource;
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
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVendorTest() throws ApiException {
        VendorResource vendor = null;
        VendorResource response = api.createVendor(vendor);

        // TODO: test validations
    }
    
    /**
     * Create a vendor template
     *
     * Vendor Templates define a type of vendor and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVendorTemplateTest() throws ApiException {
        ItemTemplateResource vendorTemplateResource = null;
        ItemTemplateResource response = api.createVendorTemplate(vendorTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a vendor
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVendorTest() throws ApiException {
        Integer id = null;
        api.deleteVendor(id);

        // TODO: test validations
    }
    
    /**
     * Delete a vendor template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVendorTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteVendorTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get a single vendor
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVendorTest() throws ApiException {
        Integer id = null;
        VendorResource response = api.getVendor(id);

        // TODO: test validations
    }
    
    /**
     * Get a single vendor template
     *
     * Vendor Templates define a type of vendor and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVendorTemplateTest() throws ApiException {
        String id = null;
        ItemTemplateResource response = api.getVendorTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search vendor templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVendorTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceItemTemplateResource response = api.getVendorTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * List and search vendors
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVendorsTest() throws ApiException {
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceVendorResource response = api.getVendors(filterName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a vendor
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VENDORS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVendorTest() throws ApiException {
        Integer id = null;
        VendorResource vendor = null;
        VendorResource response = api.updateVendor(id, vendor);

        // TODO: test validations
    }
    
    /**
     * Update a vendor template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVendorTemplateTest() throws ApiException {
        String id = null;
        PatchResource templatePatchResource = null;
        Boolean testValidation = null;
        ItemTemplateResource response = api.updateVendorTemplate(id, templatePatchResource, testValidation);

        // TODO: test validations
    }
    
}
