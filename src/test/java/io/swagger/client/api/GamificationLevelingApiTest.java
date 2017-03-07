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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BreTriggerResource;
import io.swagger.client.model.LevelingResource;
import io.swagger.client.model.PageResourceLevelingResource;
import io.swagger.client.model.PageResourceUserLevelingResource;
import io.swagger.client.model.Result;
import io.swagger.client.model.UserLevelingResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationLevelingApi
 */
@Ignore
public class GamificationLevelingApiTest {

    private final GamificationLevelingApi api = new GamificationLevelingApi();

    
    /**
     * Create a level schema
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLevelTest() throws ApiException {
        LevelingResource level = null;
        LevelingResource response = api.createLevel(level);

        // TODO: test validations
    }
    
    /**
     * Delete a level
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLevelTest() throws ApiException {
        String name = null;
        api.deleteLevel(name);

        // TODO: test validations
    }
    
    /**
     * Retrieve a level
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLevelTest() throws ApiException {
        String name = null;
        LevelingResource response = api.getLevel(name);

        // TODO: test validations
    }
    
    /**
     * Get the list of triggers that can be used to trigger a leveling progress update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLevelTriggersTest() throws ApiException {
        List<BreTriggerResource> response = api.getLevelTriggers();

        // TODO: test validations
    }
    
    /**
     * List and search levels
     *
     * Get a list of levels schemas with optional filtering
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLevelsTest() throws ApiException {
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceLevelingResource response = api.getLevels(filterName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s progress for a given level schema
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLevelTest() throws ApiException {
        Integer userId = null;
        String name = null;
        UserLevelingResource response = api.getUserLevel(userId, name);

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s progress for all level schemas
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLevelsTest() throws ApiException {
        Integer userId = null;
        PageResourceUserLevelingResource response = api.getUserLevels(userId);

        // TODO: test validations
    }
    
    /**
     * Update a level
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLevelTest() throws ApiException {
        String name = null;
        LevelingResource newLevel = null;
        LevelingResource response = api.updateLevel(name, newLevel);

        // TODO: test validations
    }
    
    /**
     * Update or create a leveling progress record for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise it will be updated. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserLevelTest() throws ApiException {
        Integer userId = null;
        String name = null;
        Integer progress = null;
        api.updateUserLevel(userId, name, progress);

        // TODO: test validations
    }
    
}
