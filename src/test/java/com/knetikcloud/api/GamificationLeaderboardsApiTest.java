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
import com.knetikcloud.model.LeaderboardEntryResource;
import com.knetikcloud.model.LeaderboardResource;
import com.knetikcloud.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationLeaderboardsApi
 */
@Ignore
public class GamificationLeaderboardsApiTest {

    private final GamificationLeaderboardsApi api = new GamificationLeaderboardsApi();

    
    /**
     * Retrieves leaderboard details and paginated entries
     *
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. Sorting is based on the fields of LeaderboardEntryResource rather than the returned LeaderboardResource. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeaderboardTest() throws ApiException {
        String contextType = null;
        String contextId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        LeaderboardResource response = api.getLeaderboard(contextType, contextId, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Retrieves a specific user entry with rank
     *
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeaderboardRankTest() throws ApiException {
        String contextType = null;
        String contextId = null;
        String id = null;
        LeaderboardEntryResource response = api.getLeaderboardRank(contextType, contextId, id);

        // TODO: test validations
    }
    
    /**
     * Get a list of available leaderboard strategy names
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeaderboardStrategiesTest() throws ApiException {
        List<String> response = api.getLeaderboardStrategies();

        // TODO: test validations
    }
    
}
