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
import com.knetikcloud.model.DeviceResource;
import com.knetikcloud.model.PageResourceDeviceResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SimpleUserResource;
import com.knetikcloud.model.TemplateResource;
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
     * Add device users
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDeviceUserTest() throws ApiException {
        List<SimpleUserResource> userResources = null;
        String id = null;
        DeviceResource response = api.addDeviceUser(userResources, id);

        // TODO: test validations
    }
    
    /**
     * Create a device
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
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
     * Create a device template
     *
     * Device Templates define a type of device and the properties they have.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeviceTemplateTest() throws ApiException {
        TemplateResource deviceTemplateResource = null;
        TemplateResource response = api.createDeviceTemplate(deviceTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a device
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeviceTest() throws ApiException {
        String id = null;
        api.deleteDevice(id);

        // TODO: test validations
    }
    
    /**
     * Delete an device template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeviceTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteDeviceTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Delete a device user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeviceUserTest() throws ApiException {
        String id = null;
        Integer userId = null;
        api.deleteDeviceUser(id, userId);

        // TODO: test validations
    }
    
    /**
     * Delete all device users
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeviceUsersTest() throws ApiException {
        String id = null;
        String filterId = null;
        api.deleteDeviceUsers(id, filterId);

        // TODO: test validations
    }
    
    /**
     * Get a single device
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceTest() throws ApiException {
        String id = null;
        DeviceResource response = api.getDevice(id);

        // TODO: test validations
    }
    
    /**
     * Get a single device template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getDeviceTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search device templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getDeviceTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * List and search devices
     *
     * Get a list of devices with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDevicesTest() throws ApiException {
        String filterMake = null;
        String filterModel = null;
        String filterOs = null;
        String filterSerial = null;
        String filterType = null;
        String filterTag = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceDeviceResource response = api.getDevices(filterMake, filterModel, filterOs, filterSerial, filterType, filterTag, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a device
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CUSTOMERS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDeviceTest() throws ApiException {
        DeviceResource device = null;
        String id = null;
        DeviceResource response = api.updateDevice(device, id);

        // TODO: test validations
    }
    
    /**
     * Update an device template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDeviceTemplateTest() throws ApiException {
        String id = null;
        PatchResource templatePatchResource = null;
        Boolean testValidation = null;
        TemplateResource response = api.updateDeviceTemplate(id, templatePatchResource, testValidation);

        // TODO: test validations
    }
    
}
