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
import io.swagger.client.model.CampaignResource;
import io.swagger.client.model.PageResourceCampaignResource;
import io.swagger.client.model.PageResourceChallengeResource;
import io.swagger.client.model.PageResourceTemplateResource;
import io.swagger.client.model.Result;
import io.swagger.client.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignsApi
 */
@Ignore
public class CampaignsApiTest {

    private final CampaignsApi api = new CampaignsApi();

    
    /**
     * Add a challenge to a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addChallengeToCampaignTest() throws ApiException {
        Long id = null;
        Long challengeId = null;
        api.addChallengeToCampaign(id, challengeId);

        // TODO: test validations
    }
    
    /**
     * Create a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCampaignTest() throws ApiException {
        CampaignResource campaignResource = null;
        CampaignResource response = api.createCampaign(campaignResource);

        // TODO: test validations
    }
    
    /**
     * Create a campaign template
     *
     * Campaign Templates define a type of campaign and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCampaignTemplateTest() throws ApiException {
        TemplateResource campaignTemplateResource = null;
        TemplateResource response = api.createCampaignTemplate(campaignTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCampaignTest() throws ApiException {
        Long id = null;
        api.deleteCampaign(id);

        // TODO: test validations
    }
    
    /**
     * Delete a campaign template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCampaignTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteCampaignTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Returns a single campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignTest() throws ApiException {
        Long id = null;
        CampaignResource response = api.getCampaign(id);

        // TODO: test validations
    }
    
    /**
     * List the challenges associated with a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignChallengesTest() throws ApiException {
        Long id = null;
        PageResourceChallengeResource response = api.getCampaignChallenges(id);

        // TODO: test validations
    }
    
    /**
     * Get a single campaign template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getCampaignTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search campaign templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getCampaignTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * List and search campaigns
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignsTest() throws ApiException {
        Boolean filterActive = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceCampaignResource response = api.getCampaigns(filterActive, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Remove a challenge from a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeChallengeFromCampaignTest() throws ApiException {
        Long campaignId = null;
        Long id = null;
        api.removeChallengeFromCampaign(campaignId, id);

        // TODO: test validations
    }
    
    /**
     * Update a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCampaignTest() throws ApiException {
        Long id = null;
        CampaignResource campaignResource = null;
        CampaignResource response = api.updateCampaign(id, campaignResource);

        // TODO: test validations
    }
    
    /**
     * Update an campaign template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCampaignTemplateTest() throws ApiException {
        String id = null;
        TemplateResource campaignTemplateResource = null;
        TemplateResource response = api.updateCampaignTemplate(id, campaignTemplateResource);

        // TODO: test validations
    }
    
}
