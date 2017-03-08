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

import com.knetikcloud.ApiCallback;
import com.knetikcloud.ApiClient;
import com.knetikcloud.ApiException;
import com.knetikcloud.ApiResponse;
import com.knetikcloud.Configuration;
import com.knetikcloud.Pair;
import com.knetikcloud.ProgressRequestBody;
import com.knetikcloud.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AmazonS3Activity;
import io.swagger.client.model.Result;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmazonWebServicesS3Api {
    private ApiClient apiClient;

    public AmazonWebServicesS3Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AmazonWebServicesS3Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getSignedS3URL */
    private com.squareup.okhttp.Call getSignedS3URLCall(String filename, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/amazon/s3/signedposturl".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filename != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filename", filename));
        if (contentType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "content_type", contentType));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSignedS3URLValidateBeforeCall(String filename, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getSignedS3URLCall(filename, contentType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a signed S3 URL
     * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)
     * @param filename The file name (optional)
     * @param contentType The content type (optional)
     * @return AmazonS3Activity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AmazonS3Activity getSignedS3URL(String filename, String contentType) throws ApiException {
        ApiResponse<AmazonS3Activity> resp = getSignedS3URLWithHttpInfo(filename, contentType);
        return resp.getData();
    }

    /**
     * Get a signed S3 URL
     * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)
     * @param filename The file name (optional)
     * @param contentType The content type (optional)
     * @return ApiResponse&lt;AmazonS3Activity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AmazonS3Activity> getSignedS3URLWithHttpInfo(String filename, String contentType) throws ApiException {
        com.squareup.okhttp.Call call = getSignedS3URLValidateBeforeCall(filename, contentType, null, null);
        Type localVarReturnType = new TypeToken<AmazonS3Activity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a signed S3 URL (asynchronously)
     * Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)
     * @param filename The file name (optional)
     * @param contentType The content type (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSignedS3URLAsync(String filename, String contentType, final ApiCallback<AmazonS3Activity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSignedS3URLValidateBeforeCall(filename, contentType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AmazonS3Activity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
