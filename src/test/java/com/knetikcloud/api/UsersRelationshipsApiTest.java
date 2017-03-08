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


package com.knetikcloud.api;

import com.knetikcloud.ApiException;
import io.swagger.client.model.PageResourceUserRelationshipResource;
import io.swagger.client.model.Result;
import io.swagger.client.model.UserRelationshipResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersRelationshipsApi
 */
@Ignore
public class UsersRelationshipsApiTest {

    private final UsersRelationshipsApi api = new UsersRelationshipsApi();

    
    /**
     * Create a user relationship
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserRelationshipTest() throws ApiException {
        UserRelationshipResource relationship = null;
        UserRelationshipResource response = api.createUserRelationship(relationship);

        // TODO: test validations
    }
    
    /**
     * Delete a user relationship
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserRelationshipTest() throws ApiException {
        Long id = null;
        api.deleteUserRelationship(id);

        // TODO: test validations
    }
    
    /**
     * Get a user relationship
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserRelationshipTest() throws ApiException {
        Long id = null;
        UserRelationshipResource response = api.getUserRelationship(id);

        // TODO: test validations
    }
    
    /**
     * Get a list of user relationships
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserRelationshipsTest() throws ApiException {
        PageResourceUserRelationshipResource response = api.getUserRelationships();

        // TODO: test validations
    }
    
    /**
     * Update a user relationship
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserRelationshipTest() throws ApiException {
        Long id = null;
        UserRelationshipResource relationship = null;
        UserRelationshipResource response = api.updateUserRelationship(id, relationship);

        // TODO: test validations
    }
    
}