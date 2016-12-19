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
import io.swagger.client.model.PageSimpleUserResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersFriendshipsApi
 */
@Ignore
public class UsersFriendshipsApiTest {

    private final UsersFriendshipsApi api = new UsersFriendshipsApi();

    
    /**
     * Add a friend
     *
     * As a user, either creates or confirm a pending request. As an admin, call this endpoint twice while inverting the IDs to create a confirmed friendship.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFriendUsingPOSTTest() throws ApiException {
        String userId = null;
        Integer id = null;
        api.addFriendUsingPOST(userId, id);

        // TODO: test validations
    }
    
    /**
     * Redeem friendship token
     *
     * Immediately connects the requested user with the user mapped by the provided invite token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectUsingTokenUsingPOSTTest() throws ApiException {
        String userId = null;
        String token = null;
        api.connectUsingTokenUsingPOST(userId, token);

        // TODO: test validations
    }
    
    /**
     * Get friends list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFriendsUsingGETTest() throws ApiException {
        String userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageSimpleUserResource response = api.getFriendsUsingGET(userId, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Returns the invite token
     *
     * This is a unique invite token that allows direct connection to the request user.  Exposing that token presents privacy issues if the token is leaked. Use friend request flow instead if confirmation is required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInviteTokenUsingGETTest() throws ApiException {
        String userId = null;
        String response = api.getInviteTokenUsingGET(userId);

        // TODO: test validations
    }
    
    /**
     * Get pending invites
     *
     * Invites that the specified user received
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvitesUsingGETTest() throws ApiException {
        String userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageSimpleUserResource response = api.getInvitesUsingGET(userId, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Remove or decline a friend
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFriendUsingDELETETest() throws ApiException {
        String userId = null;
        Integer id = null;
        api.removeFriendUsingDELETE(userId, id);

        // TODO: test validations
    }
    
}
