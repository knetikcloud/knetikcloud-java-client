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
import com.knetikcloud.model.PropertyFieldListResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesPropertiesApi
 */
@Ignore
public class TemplatesPropertiesApiTest {

    private final TemplatesPropertiesApi api = new TemplatesPropertiesApi();

    
    /**
     * Get details for a template property type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatePropertyTypeTest() throws ApiException {
        String type = null;
        PropertyFieldListResource response = api.getTemplatePropertyType(type);

        // TODO: test validations
    }
    
    /**
     * List template property types
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatePropertyTypesTest() throws ApiException {
        List<PropertyFieldListResource> response = api.getTemplatePropertyTypes();

        // TODO: test validations
    }
    
}
