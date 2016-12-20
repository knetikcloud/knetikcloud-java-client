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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.LeaderboardEntryResource;
import io.swagger.client.model.LeaderboardResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GamificationLeaderboardsApi {
    private ApiClient apiClient;

    public GamificationLeaderboardsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GamificationLeaderboardsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getLeaderboardUsingGET */
    private com.squareup.okhttp.Call getLeaderboardUsingGETCall(String contextType, String contextId, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/leaderboards/{context_type}/{context_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "context_type" + "\\}", apiClient.escapeString(contextType.toString()))
        .replaceAll("\\{" + "context_id" + "\\}", apiClient.escapeString(contextId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLeaderboardUsingGETValidateBeforeCall(String contextType, String contextId, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'contextType' is set
        if (contextType == null) {
            throw new ApiException("Missing the required parameter 'contextType' when calling getLeaderboardUsingGET(Async)");
        }
        
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException("Missing the required parameter 'contextId' when calling getLeaderboardUsingGET(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getLeaderboardUsingGETCall(contextType, contextId, size, page, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieves leaderboard details and paginated entries
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.
     * @param contextType The context type for the leaderboard (required)
     * @param contextId The context id for the leaderboard (required)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return LeaderboardResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LeaderboardResource getLeaderboardUsingGET(String contextType, String contextId, Integer size, Integer page) throws ApiException {
        ApiResponse<LeaderboardResource> resp = getLeaderboardUsingGETWithHttpInfo(contextType, contextId, size, page);
        return resp.getData();
    }

    /**
     * Retrieves leaderboard details and paginated entries
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.
     * @param contextType The context type for the leaderboard (required)
     * @param contextId The context id for the leaderboard (required)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return ApiResponse&lt;LeaderboardResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LeaderboardResource> getLeaderboardUsingGETWithHttpInfo(String contextType, String contextId, Integer size, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = getLeaderboardUsingGETValidateBeforeCall(contextType, contextId, size, page, null, null);
        Type localVarReturnType = new TypeToken<LeaderboardResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves leaderboard details and paginated entries (asynchronously)
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.
     * @param contextType The context type for the leaderboard (required)
     * @param contextId The context id for the leaderboard (required)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLeaderboardUsingGETAsync(String contextType, String contextId, Integer size, Integer page, final ApiCallback<LeaderboardResource> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLeaderboardUsingGETValidateBeforeCall(contextType, contextId, size, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LeaderboardResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getStrategiesUsingGET */
    private com.squareup.okhttp.Call getStrategiesUsingGETCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/leaderboards/strategies".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getStrategiesUsingGETValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getStrategiesUsingGETCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of available leaderboard strategy names
     * 
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getStrategiesUsingGET() throws ApiException {
        ApiResponse<List<String>> resp = getStrategiesUsingGETWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get a list of available leaderboard strategy names
     * 
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getStrategiesUsingGETWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getStrategiesUsingGETValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of available leaderboard strategy names (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStrategiesUsingGETAsync(final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getStrategiesUsingGETValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUserRankUsingGET */
    private com.squareup.okhttp.Call getUserRankUsingGETCall(String contextType, String contextId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/leaderboards/{context_type}/{context_id}/users/{id}/rank".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "context_type" + "\\}", apiClient.escapeString(contextType.toString()))
        .replaceAll("\\{" + "context_id" + "\\}", apiClient.escapeString(contextId.toString()))
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUserRankUsingGETValidateBeforeCall(String contextType, String contextId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'contextType' is set
        if (contextType == null) {
            throw new ApiException("Missing the required parameter 'contextType' when calling getUserRankUsingGET(Async)");
        }
        
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException("Missing the required parameter 'contextId' when calling getUserRankUsingGET(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUserRankUsingGET(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getUserRankUsingGETCall(contextType, contextId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieves a specific user entry with rank
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.
     * @param contextType The context type for the leaderboard (required)
     * @param contextId The context id for the leaderboard (required)
     * @param id The id of a user (required)
     * @return LeaderboardEntryResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LeaderboardEntryResource getUserRankUsingGET(String contextType, String contextId, String id) throws ApiException {
        ApiResponse<LeaderboardEntryResource> resp = getUserRankUsingGETWithHttpInfo(contextType, contextId, id);
        return resp.getData();
    }

    /**
     * Retrieves a specific user entry with rank
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.
     * @param contextType The context type for the leaderboard (required)
     * @param contextId The context id for the leaderboard (required)
     * @param id The id of a user (required)
     * @return ApiResponse&lt;LeaderboardEntryResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LeaderboardEntryResource> getUserRankUsingGETWithHttpInfo(String contextType, String contextId, String id) throws ApiException {
        com.squareup.okhttp.Call call = getUserRankUsingGETValidateBeforeCall(contextType, contextId, id, null, null);
        Type localVarReturnType = new TypeToken<LeaderboardEntryResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves a specific user entry with rank (asynchronously)
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.
     * @param contextType The context type for the leaderboard (required)
     * @param contextId The context id for the leaderboard (required)
     * @param id The id of a user (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserRankUsingGETAsync(String contextType, String contextId, String id, final ApiCallback<LeaderboardEntryResource> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUserRankUsingGETValidateBeforeCall(contextType, contextId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LeaderboardEntryResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
