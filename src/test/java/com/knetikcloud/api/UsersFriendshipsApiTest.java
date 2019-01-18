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
import com.knetikcloud.model.PageResourceSimpleUserResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
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
     * As a user, either creates or confirm a pending request. As an admin, call this endpoint twice while inverting the IDs to create a confirmed friendship. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFriendTest() throws ApiException {
        String userId = null;
        Integer id = null;
        api.addFriend(userId, id);

        // TODO: test validations
    }
    
    /**
     * Get friends list
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFriendsTest() throws ApiException {
        String userId = null;
        String filterUsername = null;
        Integer filterUserId = null;
        Integer size = null;
        Integer page = null;
        PageResourceSimpleUserResource response = api.getFriends(userId, filterUsername, filterUserId, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns the invite token
     *
     * This is a unique invite token that allows direct connection to the request user.  Exposing that token presents privacy issues if the token is leaked. Use friend request flow instead if confirmation is required. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInviteTokenTest() throws ApiException {
        String userId = null;
        StringWrapper response = api.getInviteToken(userId);

        // TODO: test validations
    }
    
    /**
     * Get pending invites
     *
     * Invites that the specified user received. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvitesTest() throws ApiException {
        String userId = null;
        Integer size = null;
        Integer page = null;
        PageResourceSimpleUserResource response = api.getInvites(userId, size, page);

        // TODO: test validations
    }
    
    /**
     * Redeem friendship token
     *
     * Immediately connects the requested user with the user mapped by the provided invite token. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redeemFriendshipTokenTest() throws ApiException {
        String userId = null;
        StringWrapper token = null;
        api.redeemFriendshipToken(userId, token);

        // TODO: test validations
    }
    
    /**
     * Remove or decline a friend
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FRIENDSHIPS_ADMIN or (FRIENDSHIPS_USER and owner)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeOrDeclineFriendTest() throws ApiException {
        String userId = null;
        Integer id = null;
        api.removeOrDeclineFriend(userId, id);

        // TODO: test validations
    }
    
}
