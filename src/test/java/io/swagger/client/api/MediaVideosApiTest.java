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
import io.swagger.client.model.CommentResource;
import io.swagger.client.model.ContributionResource;
import io.swagger.client.model.DispositionResource;
import io.swagger.client.model.FlagResource;
import io.swagger.client.model.PageResourceCommentResource;
import io.swagger.client.model.PageResourceDispositionResource;
import io.swagger.client.model.PageResourceVideoRelationshipResource;
import io.swagger.client.model.PageResourceVideoResource;
import io.swagger.client.model.VideoRelationshipResource;
import io.swagger.client.model.VideoResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaVideosApi
 */
@Ignore
public class MediaVideosApiTest {

    private final MediaVideosApi api = new MediaVideosApi();

    
    /**
     * Add a new video comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCommentUsingPOST1Test() throws ApiException {
        Integer videoId = null;
        CommentResource commentResource = null;
        CommentResource response = api.addCommentUsingPOST1(videoId, commentResource);

        // TODO: test validations
    }
    
    /**
     * Adds a contributor to a video
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addContributorUsingPOSTTest() throws ApiException {
        Long videoId = null;
        ContributionResource contributionResource = null;
        api.addContributorUsingPOST(videoId, contributionResource);

        // TODO: test validations
    }
    
    /**
     * Add a new Video disposition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDispositionUsingPOST1Test() throws ApiException {
        Integer videoId = null;
        DispositionResource dispositionResource = null;
        DispositionResource response = api.addDispositionUsingPOST1(videoId, dispositionResource);

        // TODO: test validations
    }
    
    /**
     * Add a new flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFlagUsingPOSTTest() throws ApiException {
        Long videoId = null;
        String reason = null;
        api.addFlagUsingPOST(videoId, reason);

        // TODO: test validations
    }
    
    /**
     * Adds one or more existing videos as related to this one
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRelatedUsingPOSTTest() throws ApiException {
        Long videoId = null;
        VideoRelationshipResource videoRelationshipResource = null;
        VideoRelationshipResource response = api.addRelatedUsingPOST(videoId, videoRelationshipResource);

        // TODO: test validations
    }
    
    /**
     * Adds a new video in the system
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addVideoUsingPOSTTest() throws ApiException {
        VideoResource videoResource = null;
        VideoResource response = api.addVideoUsingPOST(videoResource);

        // TODO: test validations
    }
    
    /**
     * Adds a user to a video&#39;s whitelist
     *
     * Whitelisted users can view video regardless of privacy setting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWhitelistUsingPOSTTest() throws ApiException {
        Long id = null;
        Integer userId = null;
        api.addWhitelistUsingPOST(id, userId);

        // TODO: test validations
    }
    
    /**
     * Delete a video comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCommentUsingDELETE1Test() throws ApiException {
        Long videoId = null;
        Long id = null;
        api.deleteCommentUsingDELETE1(videoId, id);

        // TODO: test validations
    }
    
    /**
     * Delete a video comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDispositionUsingDELETE1Test() throws ApiException {
        Long dispositionId = null;
        api.deleteDispositionUsingDELETE1(dispositionId);

        // TODO: test validations
    }
    
    /**
     * Delete a flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFlagUsingDELETETest() throws ApiException {
        Long videoId = null;
        api.deleteFlagUsingDELETE(videoId);

        // TODO: test validations
    }
    
    /**
     * Delete a video&#39;s relationship
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRelationshipUsingDELETE1Test() throws ApiException {
        Long videoId = null;
        Long id = null;
        api.deleteRelationshipUsingDELETE1(videoId, id);

        // TODO: test validations
    }
    
    /**
     * Removes a video from the system if no resources are attached to it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVideoUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteVideoUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Returns a page of comments for a video
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentsUsingGET1Test() throws ApiException {
        Integer videoId = null;
        Integer size = null;
        Integer page = null;
        PageResourceCommentResource response = api.getCommentsUsingGET1(videoId, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns a page of dispositions for a video
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDispositionsUsingGET1Test() throws ApiException {
        Integer videoId = null;
        Integer size = null;
        Integer page = null;
        PageResourceDispositionResource response = api.getDispositionsUsingGET1(videoId, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns a page of video relationships
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRelatedUsingGETTest() throws ApiException {
        Long videoId = null;
        Integer size = null;
        Integer page = null;
        PageResourceVideoRelationshipResource response = api.getRelatedUsingGET(videoId, size, page);

        // TODO: test validations
    }
    
    /**
     * Get user videos
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserVideosUsingGETTest() throws ApiException {
        Integer userId = null;
        Boolean excludeFlagged = null;
        Integer size = null;
        Integer page = null;
        PageResourceVideoResource response = api.getUserVideosUsingGET(userId, excludeFlagged, size, page);

        // TODO: test validations
    }
    
    /**
     * Loads a specific video details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideoUsingGETTest() throws ApiException {
        Long id = null;
        VideoResource response = api.getVideoUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Removes a contributor from a video
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeContributorUsingDELETETest() throws ApiException {
        Long videoId = null;
        Integer id = null;
        api.removeContributorUsingDELETE(videoId, id);

        // TODO: test validations
    }
    
    /**
     * Removes a user from a video&#39;s whitelist
     *
     * Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeWhitelistUsingDELETETest() throws ApiException {
        Long videoId = null;
        Integer id = null;
        api.removeWhitelistUsingDELETE(videoId, id);

        // TODO: test validations
    }
    
    /**
     * Search videos using the documented filters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchVideosUsingGETTest() throws ApiException {
        Boolean excludeFlagged = null;
        String filterVideosByUploader = null;
        String filterCategory = null;
        String filterTagset = null;
        String filterVideosByName = null;
        String filterVideosByContributor = null;
        String filterVideosByAuthor = null;
        Boolean filterHasAuthor = null;
        Boolean filterHasUploader = null;
        String filterRelatedTo = null;
        Boolean filterFriends = null;
        String filterDisposition = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceVideoResource response = api.searchVideosUsingGET(excludeFlagged, filterVideosByUploader, filterCategory, filterTagset, filterVideosByName, filterVideosByContributor, filterVideosByAuthor, filterHasAuthor, filterHasUploader, filterRelatedTo, filterFriends, filterDisposition, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update video comment content 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCommentUsingPUT1Test() throws ApiException {
        Long videoId = null;
        Long id = null;
        String content = null;
        api.updateCommentUsingPUT1(videoId, id, content);

        // TODO: test validations
    }
    
    /**
     * Update a video&#39;s relationship details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRelationshipUsingPUT1Test() throws ApiException {
        Long videoId = null;
        Long relationshipId = null;
        String details = null;
        api.updateRelationshipUsingPUT1(videoId, relationshipId, details);

        // TODO: test validations
    }
    
    /**
     * Modifies a video&#39;s details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVideoUsingPUTTest() throws ApiException {
        Long id = null;
        VideoResource videoResource = null;
        api.updateVideoUsingPUT(id, videoResource);

        // TODO: test validations
    }
    
    /**
     * Increment a video&#39;s view count
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void viewVideoUsingPOSTTest() throws ApiException {
        Long id = null;
        api.viewVideoUsingPOST(id);

        // TODO: test validations
    }
    
}