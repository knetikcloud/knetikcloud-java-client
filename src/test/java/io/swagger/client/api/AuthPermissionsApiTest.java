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
import io.swagger.client.model.PermissionResource;
import io.swagger.client.model.PageResourcePermissionResource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthPermissionsApi
 */
public class AuthPermissionsApiTest {

    private final AuthPermissionsApi api = new AuthPermissionsApi();

    
    /**
     * Create a new permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPermissionUsingPOSTTest() throws ApiException {
        PermissionResource permissionResource = null;
        // PermissionResource response = api.createPermissionUsingPOST(permissionResource);

        // TODO: test validations
    }
    
    /**
     * Delete a permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePermissionUsingDELETETest() throws ApiException {
        String permission = null;
        Boolean force = null;
        // api.deletePermissionUsingDELETE(permission, force);

        // TODO: test validations
    }
    
    /**
     * Get a single permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPermissionUsingGETTest() throws ApiException {
        String permission = null;
        // PermissionResource response = api.getPermissionUsingGET(permission);

        // TODO: test validations
    }
    
    /**
     * List and search permissions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPermissionUsingGET1Test() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourcePermissionResource response = api.getPermissionUsingGET1(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePermissionUsingPUTTest() throws ApiException {
        String permission = null;
        PermissionResource permissionResource = null;
        // api.updatePermissionUsingPUT(permission, permissionResource);

        // TODO: test validations
    }
    
}
