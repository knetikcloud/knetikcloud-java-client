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
import io.swagger.client.model.DeviceResource;
import io.swagger.client.model.PageResourceDeviceResource;
import io.swagger.client.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesApi
 */
@Ignore
public class DevicesApiTest {

    private final DevicesApi api = new DevicesApi();

    
    /**
     * Create a device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeviceTest() throws ApiException {
        DeviceResource device = null;
        DeviceResource response = api.createDevice(device);

        // TODO: test validations
    }
    
    /**
     * Delete a device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeviceTest() throws ApiException {
        Integer id = null;
        api.deleteDevice(id);

        // TODO: test validations
    }
    
    /**
     * Get a single device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceTest() throws ApiException {
        Integer id = null;
        DeviceResource response = api.getDevice(id);

        // TODO: test validations
    }
    
    /**
     * List and search devices
     *
     * Get a list of devices with optional filtering
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDevicesTest() throws ApiException {
        String filterMake = null;
        String filterModel = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceDeviceResource response = api.getDevices(filterMake, filterModel, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDeviceTest() throws ApiException {
        DeviceResource device = null;
        Integer id = null;
        DeviceResource response = api.updateDevice(device, id);

        // TODO: test validations
    }
    
}