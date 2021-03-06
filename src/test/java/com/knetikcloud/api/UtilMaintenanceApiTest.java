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
import com.knetikcloud.model.Maintenance;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilMaintenanceApi
 */
@Ignore
public class UtilMaintenanceApiTest {

    private final UtilMaintenanceApi api = new UtilMaintenanceApi();

    
    /**
     * Delete maintenance info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMaintenanceTest() throws ApiException {
        api.deleteMaintenance();

        // TODO: test validations
    }
    
    /**
     * Get current maintenance info
     *
     * Get current maintenance info. 404 if no maintenance. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMaintenanceTest() throws ApiException {
        Maintenance response = api.getMaintenance();

        // TODO: test validations
    }
    
    /**
     * Set current maintenance info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; MAINTENANCE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setMaintenanceTest() throws ApiException {
        Maintenance maintenance = null;
        api.setMaintenance(maintenance);

        // TODO: test validations
    }
    
}
