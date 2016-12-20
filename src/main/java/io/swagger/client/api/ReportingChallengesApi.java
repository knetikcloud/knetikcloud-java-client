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


import io.swagger.client.model.PageChallengeEventParticipantResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportingChallengesApi {
    private ApiClient apiClient;

    public ReportingChallengesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportingChallengesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getChallengeEventLeaderboardUsingGET */
    private com.squareup.okhttp.Call getChallengeEventLeaderboardUsingGETCall(Long filterEvent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/events/leaderboard".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filterEvent != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_event", filterEvent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getChallengeEventLeaderboardUsingGETValidateBeforeCall(Long filterEvent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getChallengeEventLeaderboardUsingGETCall(filterEvent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a challenge event leaderboard details
     * Lists all leaderboard entries with additional user details
     * @param filterEvent A sepecific challenge event id (optional)
     * @return PageChallengeEventParticipantResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageChallengeEventParticipantResource getChallengeEventLeaderboardUsingGET(Long filterEvent) throws ApiException {
        ApiResponse<PageChallengeEventParticipantResource> resp = getChallengeEventLeaderboardUsingGETWithHttpInfo(filterEvent);
        return resp.getData();
    }

    /**
     * Retrieve a challenge event leaderboard details
     * Lists all leaderboard entries with additional user details
     * @param filterEvent A sepecific challenge event id (optional)
     * @return ApiResponse&lt;PageChallengeEventParticipantResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageChallengeEventParticipantResource> getChallengeEventLeaderboardUsingGETWithHttpInfo(Long filterEvent) throws ApiException {
        com.squareup.okhttp.Call call = getChallengeEventLeaderboardUsingGETValidateBeforeCall(filterEvent, null, null);
        Type localVarReturnType = new TypeToken<PageChallengeEventParticipantResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a challenge event leaderboard details (asynchronously)
     * Lists all leaderboard entries with additional user details
     * @param filterEvent A sepecific challenge event id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChallengeEventLeaderboardUsingGETAsync(Long filterEvent, final ApiCallback<PageChallengeEventParticipantResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChallengeEventLeaderboardUsingGETValidateBeforeCall(filterEvent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageChallengeEventParticipantResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getChallengeEventParticipantsUsingGET */
    private com.squareup.okhttp.Call getChallengeEventParticipantsUsingGETCall(Long filterEvent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/events/participants".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filterEvent != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_event", filterEvent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getChallengeEventParticipantsUsingGETValidateBeforeCall(Long filterEvent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getChallengeEventParticipantsUsingGETCall(filterEvent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a challenge event participant details
     * Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation
     * @param filterEvent A sepecific challenge event id (optional)
     * @return PageChallengeEventParticipantResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageChallengeEventParticipantResource getChallengeEventParticipantsUsingGET(Long filterEvent) throws ApiException {
        ApiResponse<PageChallengeEventParticipantResource> resp = getChallengeEventParticipantsUsingGETWithHttpInfo(filterEvent);
        return resp.getData();
    }

    /**
     * Retrieve a challenge event participant details
     * Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation
     * @param filterEvent A sepecific challenge event id (optional)
     * @return ApiResponse&lt;PageChallengeEventParticipantResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageChallengeEventParticipantResource> getChallengeEventParticipantsUsingGETWithHttpInfo(Long filterEvent) throws ApiException {
        com.squareup.okhttp.Call call = getChallengeEventParticipantsUsingGETValidateBeforeCall(filterEvent, null, null);
        Type localVarReturnType = new TypeToken<PageChallengeEventParticipantResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a challenge event participant details (asynchronously)
     * Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation
     * @param filterEvent A sepecific challenge event id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChallengeEventParticipantsUsingGETAsync(Long filterEvent, final ApiCallback<PageChallengeEventParticipantResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChallengeEventParticipantsUsingGETValidateBeforeCall(filterEvent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageChallengeEventParticipantResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
