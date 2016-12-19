/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import io.swagger.client.model.GroupMemberResource;
import io.swagger.client.model.GroupResource;
import io.swagger.client.model.PageGroupMemberResource;
import io.swagger.client.model.PageGroupResource;
import io.swagger.client.model.PageTemplateResource;
import io.swagger.client.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersGroupsApi
 */
@Ignore
public class UsersGroupsApiTest {

    private final UsersGroupsApi api = new UsersGroupsApi();

    
    /**
     * Adds a new group in the system
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addGroupUsingPOSTTest() throws ApiException {
        GroupResource groupResource = null;
        GroupResource response = api.addGroupUsingPOST(groupResource);

        // TODO: test validations
    }
    
    /**
     * Adds a new member to the group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMemberUsingPOSTTest() throws ApiException {
        String uniqueName = null;
        GroupMemberResource username = null;
        GroupMemberResource response = api.addMemberUsingPOST(uniqueName, username);

        // TODO: test validations
    }
    
    /**
     * Create a group template
     *
     * Group Templates define a type of group and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupTemplateUsingPOSTTest() throws ApiException {
        TemplateResource groupTemplateResource = null;
        TemplateResource response = api.createGroupTemplateUsingPOST(groupTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a group template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupTemplateUsingDELETETest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteGroupTemplateUsingDELETE(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Removes a user from a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupUsingDELETETest() throws ApiException {
        String uniqueName = null;
        Integer userId = null;
        api.deleteGroupUsingDELETE(uniqueName, userId);

        // TODO: test validations
    }
    
    /**
     * Removes a group from the system IF no resources are attached to it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupUsingDELETE1Test() throws ApiException {
        String uniqueName = null;
        api.deleteGroupUsingDELETE1(uniqueName);

        // TODO: test validations
    }
    
    /**
     * Get a single group template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTemplateUsingGETTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getGroupTemplateUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search group templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTemplatesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageTemplateResource response = api.getGroupTemplatesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Loads a specific group&#39;s details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupUsingGETTest() throws ApiException {
        String uniqueName = null;
        GroupResource response = api.getGroupUsingGET(uniqueName);

        // TODO: test validations
    }
    
    /**
     * Lists members of the group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchGroupsUsingGETTest() throws ApiException {
        String uniqueName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageGroupMemberResource response = api.searchGroupsUsingGET(uniqueName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * List and search groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchGroupsUsingGET1Test() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageGroupResource response = api.searchGroupsUsingGET1(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a group template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupTemplateUsingPUTTest() throws ApiException {
        String id = null;
        TemplateResource groupTemplateResource = null;
        api.updateGroupTemplateUsingPUT(id, groupTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Modifies a group&#39;s details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupUsingPUTTest() throws ApiException {
        String uniqueName = null;
        GroupResource groupResource = null;
        api.updateGroupUsingPUT(uniqueName, groupResource);

        // TODO: test validations
    }
    
    /**
     * Change a user&#39;s status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMemberStatusUsingPUTTest() throws ApiException {
        String uniqueName = null;
        Integer userId = null;
        String status = null;
        api.updateMemberStatusUsingPUT(uniqueName, userId, status);

        // TODO: test validations
    }
    
}
