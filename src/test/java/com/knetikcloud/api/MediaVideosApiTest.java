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
import com.knetikcloud.model.CommentResource;
import com.knetikcloud.model.ContributionResource;
import com.knetikcloud.model.DispositionResource;
import com.knetikcloud.model.FlagResource;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceCommentResource;
import com.knetikcloud.model.PageResourceDispositionResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceVideoRelationshipResource;
import com.knetikcloud.model.PageResourceVideoResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.VideoRelationshipResource;
import com.knetikcloud.model.VideoResource;
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
     * Adds a user to a video&#39;s whitelist
     *
     * Whitelisted users can view video regardless of privacy setting. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserToVideoWhitelistTest() throws ApiException {
        Long id = null;
        IntWrapper userId = null;
        api.addUserToVideoWhitelist(id, userId);

        // TODO: test validations
    }
    
    /**
     * Adds a new video in the system
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addVideoTest() throws ApiException {
        VideoResource videoResource = null;
        VideoResource response = api.addVideo(videoResource);

        // TODO: test validations
    }
    
    /**
     * Add a new video comment
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addVideoCommentTest() throws ApiException {
        Integer videoId = null;
        CommentResource commentResource = null;
        CommentResource response = api.addVideoComment(videoId, commentResource);

        // TODO: test validations
    }
    
    /**
     * Adds a contributor to a video
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addVideoContributorTest() throws ApiException {
        Long videoId = null;
        ContributionResource contributionResource = null;
        api.addVideoContributor(videoId, contributionResource);

        // TODO: test validations
    }
    
    /**
     * Add a new flag
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addVideoFlagTest() throws ApiException {
        Long videoId = null;
        StringWrapper reason = null;
        FlagResource response = api.addVideoFlag(videoId, reason);

        // TODO: test validations
    }
    
    /**
     * Adds one or more existing videos as related to this one
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addVideoRelationshipsTest() throws ApiException {
        Long videoId = null;
        VideoRelationshipResource videoRelationshipResource = null;
        VideoRelationshipResource response = api.addVideoRelationships(videoId, videoRelationshipResource);

        // TODO: test validations
    }
    
    /**
     * Create a video disposition
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVideoDispositionTest() throws ApiException {
        Integer videoId = null;
        DispositionResource dispositionResource = null;
        DispositionResource response = api.createVideoDisposition(videoId, dispositionResource);

        // TODO: test validations
    }
    
    /**
     * Create a video template
     *
     * Video Templates define a type of video and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVideoTemplateTest() throws ApiException {
        TemplateResource videoTemplateResource = null;
        TemplateResource response = api.createVideoTemplate(videoTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Deletes a video from the system if no resources are attached to it
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVideoTest() throws ApiException {
        Long id = null;
        api.deleteVideo(id);

        // TODO: test validations
    }
    
    /**
     * Delete a video comment
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVideoCommentTest() throws ApiException {
        Long videoId = null;
        Long id = null;
        api.deleteVideoComment(videoId, id);

        // TODO: test validations
    }
    
    /**
     * Delete a video disposition
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVideoDispositionTest() throws ApiException {
        Long dispositionId = null;
        api.deleteVideoDisposition(dispositionId);

        // TODO: test validations
    }
    
    /**
     * Delete a flag
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVideoFlagTest() throws ApiException {
        Long videoId = null;
        api.deleteVideoFlag(videoId);

        // TODO: test validations
    }
    
    /**
     * Delete a video&#39;s relationship
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVideoRelationshipTest() throws ApiException {
        Long videoId = null;
        Long id = null;
        api.deleteVideoRelationship(videoId, id);

        // TODO: test validations
    }
    
    /**
     * Delete a video template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVideoTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteVideoTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get user videos
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserVideosTest() throws ApiException {
        Integer userId = null;
        Boolean excludeFlagged = null;
        Integer size = null;
        Integer page = null;
        PageResourceVideoResource response = api.getUserVideos(userId, excludeFlagged, size, page);

        // TODO: test validations
    }
    
    /**
     * Loads a specific video details
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideoTest() throws ApiException {
        Long id = null;
        VideoResource response = api.getVideo(id);

        // TODO: test validations
    }
    
    /**
     * Returns a page of comments for a video
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideoCommentsTest() throws ApiException {
        Integer videoId = null;
        Integer size = null;
        Integer page = null;
        PageResourceCommentResource response = api.getVideoComments(videoId, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns a page of dispositions for a video
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideoDispositionsTest() throws ApiException {
        Integer videoId = null;
        Integer size = null;
        Integer page = null;
        PageResourceDispositionResource response = api.getVideoDispositions(videoId, size, page);

        // TODO: test validations
    }
    
    /**
     * Returns a page of video relationships
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideoRelationshipsTest() throws ApiException {
        Long videoId = null;
        Integer size = null;
        Integer page = null;
        PageResourceVideoRelationshipResource response = api.getVideoRelationships(videoId, size, page);

        // TODO: test validations
    }
    
    /**
     * Get a single video template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideoTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getVideoTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search video templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideoTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getVideoTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Search videos using the documented filters
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideosTest() throws ApiException {
        Boolean excludeFlagged = null;
        Integer filterVideosByUploader = null;
        String filterCategory = null;
        String filterTagset = null;
        String filterVideosByName = null;
        Integer filterVideosByContributor = null;
        Integer filterVideosByAuthor = null;
        Boolean filterHasAuthor = null;
        Boolean filterHasUploader = null;
        String filterRelatedTo = null;
        Boolean filterFriends = null;
        String filterDisposition = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceVideoResource response = api.getVideos(excludeFlagged, filterVideosByUploader, filterCategory, filterTagset, filterVideosByName, filterVideosByContributor, filterVideosByAuthor, filterHasAuthor, filterHasUploader, filterRelatedTo, filterFriends, filterDisposition, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Removes a user from a video&#39;s whitelist
     *
     * Remove the user with the id given in the path from the whitelist of users that can view this video regardless of privacy setting. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserFromVideoWhitelistTest() throws ApiException {
        Long videoId = null;
        Integer id = null;
        api.removeUserFromVideoWhitelist(videoId, id);

        // TODO: test validations
    }
    
    /**
     * Removes a contributor from a video
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeVideoContributorTest() throws ApiException {
        Long videoId = null;
        Integer id = null;
        api.removeVideoContributor(videoId, id);

        // TODO: test validations
    }
    
    /**
     * Modifies a video&#39;s details
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVideoTest() throws ApiException {
        Long id = null;
        VideoResource videoResource = null;
        api.updateVideo(id, videoResource);

        // TODO: test validations
    }
    
    /**
     * Update a video comment
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVideoCommentTest() throws ApiException {
        Long videoId = null;
        Long id = null;
        StringWrapper content = null;
        api.updateVideoComment(videoId, id, content);

        // TODO: test validations
    }
    
    /**
     * Update a video&#39;s relationship details
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VIDEOS_USER or VIDEOS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVideoRelationshipTest() throws ApiException {
        Long videoId = null;
        Long relationshipId = null;
        StringWrapper details = null;
        api.updateVideoRelationship(videoId, relationshipId, details);

        // TODO: test validations
    }
    
    /**
     * Update a video template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVideoTemplateTest() throws ApiException {
        String id = null;
        TemplateResource videoTemplateResource = null;
        TemplateResource response = api.updateVideoTemplate(id, videoTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Increment a video&#39;s view count
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void viewVideoTest() throws ApiException {
        Long id = null;
        api.viewVideo(id);

        // TODO: test validations
    }
    
}