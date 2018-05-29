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
import com.knetikcloud.model.DispositionCount;
import com.knetikcloud.model.DispositionResource;
import com.knetikcloud.model.PageResourceDispositionResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DispositionsApi
 */
@Ignore
public class DispositionsApiTest {

    private final DispositionsApi api = new DispositionsApi();

    
    /**
     * Add a new disposition
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DISPOSITIONS_USER and user, or DISPOSITIONS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDispositionTest() throws ApiException {
        DispositionResource disposition = null;
        DispositionResource response = api.addDisposition(disposition);

        // TODO: test validations
    }
    
    /**
     * Delete a disposition
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DISPOSITIONS_USER and owner, or DISPOSITIONS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDispositionTest() throws ApiException {
        Long id = null;
        api.deleteDisposition(id);

        // TODO: test validations
    }
    
    /**
     * Returns a disposition
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDispositionTest() throws ApiException {
        Long id = null;
        DispositionResource response = api.getDisposition(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of disposition counts
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDispositionCountsTest() throws ApiException {
        String filterCreatedDate = null;
        String filterContext = null;
        String filterOwner = null;
        List<DispositionCount> response = api.getDispositionCounts(filterCreatedDate, filterContext, filterOwner);

        // TODO: test validations
    }
    
    /**
     * Returns a page of dispositions
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDispositionsTest() throws ApiException {
        String filterCreatedDate = null;
        String filterContext = null;
        String filterOwner = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceDispositionResource response = api.getDispositions(filterCreatedDate, filterContext, filterOwner, size, page, order);

        // TODO: test validations
    }
    
}
