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
import io.swagger.client.model.NewPasswordRequest;
import io.swagger.client.model.PageResourceTemplateResource;
import io.swagger.client.model.PageResourceUserBaseResource;
import io.swagger.client.model.TemplateResource;
import io.swagger.client.model.UserResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Add a tag to a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTagUsingPOST1Test() throws ApiException {
        Integer userId = null;
        String tag = null;
        api.addTagUsingPOST1(userId, tag);

        // TODO: test validations
    }
    
    /**
     * Create a user template
     *
     * User Templates define a type of user and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTemplateUsingPOSTTest() throws ApiException {
        TemplateResource userTemplateResource = null;
        TemplateResource response = api.createUserTemplateUsingPOST(userTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a user template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTemplateUsingDELETETest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteUserTemplateUsingDELETE(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Choose a new password after a reset
     *
     * Finish resetting a user&#39;s password using the secret provided from the password-reset endpoint.  Password should be in plain text and will be encrypted on receipt. Use SSL for security.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void doPasswordResetUsingPUTTest() throws ApiException {
        Integer id = null;
        NewPasswordRequest newPasswordRequest = null;
        api.doPasswordResetUsingPUT(id, newPasswordRequest);

        // TODO: test validations
    }
    
    /**
     * List tags for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagsUsingGET3Test() throws ApiException {
        Integer userId = null;
        List<String> response = api.getTagsUsingGET3(userId);

        // TODO: test validations
    }
    
    /**
     * Get a single user template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTemplateUsingGETTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getUserTemplateUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search user templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTemplatesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getUserTemplatesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single user
     *
     * Additional private info is included as USERS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserUsingGETTest() throws ApiException {
        String id = null;
        UserResource response = api.getUserUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search users
     *
     * Additional private info is included as USERS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersUsingGETTest() throws ApiException {
        String filterDisplayname = null;
        String filterEmail = null;
        String filterFirstname = null;
        String filterFullname = null;
        String filterLastname = null;
        String filterUsername = null;
        String filterTag = null;
        String filterGroup = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceUserBaseResource response = api.getUsersUsingGET(filterDisplayname, filterEmail, filterFirstname, filterFullname, filterLastname, filterUsername, filterTag, filterGroup, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Reset a user&#39;s password
     *
     * A reset code will be generated and a &#39;forgot_password&#39; BRE event will be fired with that code; this can be routed to the user as needed and submitted to the &#39;choose a new password&#39; endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiatePasswordResetUsingPOSTTest() throws ApiException {
        Integer id = null;
        api.initiatePasswordResetUsingPOST(id);

        // TODO: test validations
    }
    
    /**
     * Register a new user
     *
     * Password should be in plain text and will be encrypted on receipt. Use SSL for security
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerUserUsingPOSTTest() throws ApiException {
        UserResource userResource = null;
        UserResource response = api.registerUserUsingPOST(userResource);

        // TODO: test validations
    }
    
    /**
     * Remove a tag from a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeTagUsingDELETE1Test() throws ApiException {
        Integer userId = null;
        String tag = null;
        api.removeTagUsingDELETE1(userId, tag);

        // TODO: test validations
    }
    
    /**
     * Set a user&#39;s password
     *
     * Password should be in plain text and will be encrypted on receipt. Use SSL for security.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPasswordUsingPUTTest() throws ApiException {
        Integer id = null;
        String password = null;
        api.setPasswordUsingPUT(id, password);

        // TODO: test validations
    }
    
    /**
     * Update a user template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTemplateUsingPUTTest() throws ApiException {
        String id = null;
        TemplateResource userTemplateResource = null;
        api.updateUserTemplateUsingPUT(id, userTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Update a user&#39;s info
     *
     * Password will not be edited on this endpoint, use password specific endpoints.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserUsingPUTTest() throws ApiException {
        String id = null;
        UserResource userResource = null;
        api.updateUserUsingPUT(id, userResource);

        // TODO: test validations
    }
    
}
