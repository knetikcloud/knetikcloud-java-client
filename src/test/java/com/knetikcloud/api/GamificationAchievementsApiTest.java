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

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.AchievementDefinitionResource;
import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.PageResourceAchievementDefinitionResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceUserAchievementGroupResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.UserAchievementGroupResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationAchievementsApi
 */
@Ignore
public class GamificationAchievementsApiTest {

    private final GamificationAchievementsApi api = new GamificationAchievementsApi();

    
    /**
     * Create a new achievement definition
     *
     * If the definition contains a trigger event name, a BRE rule is created, so that tracking logic is executed when the triggering event occurs. If no trigger event name is specified, the user&#39;s achievement status must manually be updated via the API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAchievementTest() throws ApiException {
        AchievementDefinitionResource achievement = null;
        AchievementDefinitionResource response = api.createAchievement(achievement);

        // TODO: test validations
    }
    
    /**
     * Create an achievement template
     *
     * Achievement templates define a type of achievement and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAchievementTemplateTest() throws ApiException {
        TemplateResource template = null;
        TemplateResource response = api.createAchievementTemplate(template);

        // TODO: test validations
    }
    
    /**
     * Delete an achievement definition
     *
     * Will also disable the associated generated rule, if any.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAchievementTest() throws ApiException {
        String name = null;
        api.deleteAchievement(name);

        // TODO: test validations
    }
    
    /**
     * Delete an achievement template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAchievementTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteAchievementTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get a single achievement definition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAchievementTest() throws ApiException {
        String name = null;
        AchievementDefinitionResource response = api.getAchievement(name);

        // TODO: test validations
    }
    
    /**
     * Get a single achievement template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAchievementTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getAchievementTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search achievement templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAchievementTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getAchievementTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get the list of triggers that can be used to trigger an achievement progress update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAchievementTriggersTest() throws ApiException {
        List<BreTriggerResource> response = api.getAchievementTriggers();

        // TODO: test validations
    }
    
    /**
     * Get all achievement definitions in the system
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAchievementsTest() throws ApiException {
        String filterTagset = null;
        String filterName = null;
        Boolean filterHidden = null;
        Boolean filterDerived = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceAchievementDefinitionResource response = api.getAchievements(filterTagset, filterName, filterHidden, filterDerived, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a list of derived achievements
     *
     * Used by other services that depend on achievements
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDerivedAchievementsTest() throws ApiException {
        String name = null;
        List<AchievementDefinitionResource> response = api.getDerivedAchievements(name);

        // TODO: test validations
    }
    
    /**
     * Retrieve progress on a given achievement for a given user
     *
     * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserAchievementProgressTest() throws ApiException {
        Integer userId = null;
        String achievementName = null;
        UserAchievementGroupResource response = api.getUserAchievementProgress(userId, achievementName);

        // TODO: test validations
    }
    
    /**
     * Retrieve progress on achievements for a given user
     *
     * Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserAchievementsProgressTest() throws ApiException {
        Integer userId = null;
        Boolean filterAchievementDerived = null;
        String filterAchievementTagset = null;
        String filterAchievementName = null;
        Integer size = null;
        Integer page = null;
        PageResourceUserAchievementGroupResource response = api.getUserAchievementsProgress(userId, filterAchievementDerived, filterAchievementTagset, filterAchievementName, size, page);

        // TODO: test validations
    }
    
    /**
     * Retrieve progress on a given achievement for all users
     *
     * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersAchievementProgressTest() throws ApiException {
        String achievementName = null;
        Boolean filterAchievementDerived = null;
        String filterAchievementTagset = null;
        String filterAchievementName = null;
        Integer size = null;
        Integer page = null;
        PageResourceUserAchievementGroupResource response = api.getUsersAchievementProgress(achievementName, filterAchievementDerived, filterAchievementTagset, filterAchievementName, size, page);

        // TODO: test validations
    }
    
    /**
     * Retrieve progress on achievements for all users
     *
     * Assets will not be filled in on the resources returned. Use &#39;Get single achievement progress for user&#39; to retrieve the full resource with assets for a given user as needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersAchievementsProgressTest() throws ApiException {
        Boolean filterAchievementDerived = null;
        String filterAchievementTagset = null;
        String filterAchievementName = null;
        Integer size = null;
        Integer page = null;
        PageResourceUserAchievementGroupResource response = api.getUsersAchievementsProgress(filterAchievementDerived, filterAchievementTagset, filterAchievementName, size, page);

        // TODO: test validations
    }
    
    /**
     * Increment an achievement progress record for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and the provided value added to the existing progress. May be negative. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incrementAchievementProgressTest() throws ApiException {
        Integer userId = null;
        String achievementName = null;
        Integer progress = null;
        UserAchievementGroupResource response = api.incrementAchievementProgress(userId, achievementName, progress);

        // TODO: test validations
    }
    
    /**
     * Set an achievement progress record for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise it will be updated and progress set to the provided value. If progress meets or exceeds the achievement&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setAchievementProgressTest() throws ApiException {
        Integer userId = null;
        String achievementName = null;
        Integer progress = null;
        UserAchievementGroupResource response = api.setAchievementProgress(userId, achievementName, progress);

        // TODO: test validations
    }
    
    /**
     * Update an achievement definition
     *
     * The existing generated rule, if any, will be deleted. A new rule will be created if a trigger event name is specified in the new version.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAchievementTest() throws ApiException {
        String name = null;
        AchievementDefinitionResource achievement = null;
        AchievementDefinitionResource response = api.updateAchievement(name, achievement);

        // TODO: test validations
    }
    
    /**
     * Update an achievement template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAchievementTemplateTest() throws ApiException {
        String id = null;
        TemplateResource template = null;
        TemplateResource response = api.updateAchievementTemplate(id, template);

        // TODO: test validations
    }
    
}
