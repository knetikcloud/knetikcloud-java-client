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


import io.swagger.client.model.BreTriggerResource;
import io.swagger.client.model.PageBreTriggerResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BRERuleEngineTriggersApi {
    private ApiClient apiClient;

    public BRERuleEngineTriggersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BRERuleEngineTriggersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createTriggerUsingPOST */
    private com.squareup.okhttp.Call createTriggerUsingPOSTCall(BreTriggerResource breTriggerResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = breTriggerResource;
        
        // create path and map variables
        String localVarPath = "/bre/triggers".replaceAll("\\{format\\}","json");

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createTriggerUsingPOSTValidateBeforeCall(BreTriggerResource breTriggerResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = createTriggerUsingPOSTCall(breTriggerResource, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a trigger
     * Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services
     * @param breTriggerResource The BRE trigger resource object (optional)
     * @return BreTriggerResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BreTriggerResource createTriggerUsingPOST(BreTriggerResource breTriggerResource) throws ApiException {
        ApiResponse<BreTriggerResource> resp = createTriggerUsingPOSTWithHttpInfo(breTriggerResource);
        return resp.getData();
    }

    /**
     * Create a trigger
     * Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services
     * @param breTriggerResource The BRE trigger resource object (optional)
     * @return ApiResponse&lt;BreTriggerResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BreTriggerResource> createTriggerUsingPOSTWithHttpInfo(BreTriggerResource breTriggerResource) throws ApiException {
        com.squareup.okhttp.Call call = createTriggerUsingPOSTValidateBeforeCall(breTriggerResource, null, null);
        Type localVarReturnType = new TypeToken<BreTriggerResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a trigger (asynchronously)
     * Customer added triggers will not be fired automatically or have rules associated with them by default. Custom rules must be added to get use from the trigger and it must then be fired from the outside. See the Bre Event services
     * @param breTriggerResource The BRE trigger resource object (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTriggerUsingPOSTAsync(BreTriggerResource breTriggerResource, final ApiCallback<BreTriggerResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createTriggerUsingPOSTValidateBeforeCall(breTriggerResource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BreTriggerResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteTriggerUsingDELETE */
    private com.squareup.okhttp.Call deleteTriggerUsingDELETECall(String eventName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/bre/triggers/{event_name}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_name" + "\\}", apiClient.escapeString(eventName.toString()));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTriggerUsingDELETEValidateBeforeCall(String eventName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'eventName' is set
        if (eventName == null) {
            throw new ApiException("Missing the required parameter 'eventName' when calling deleteTriggerUsingDELETE(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteTriggerUsingDELETECall(eventName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a trigger
     * May fail if there are existing rules against it. Cannot delete core triggers
     * @param eventName The trigger event name (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTriggerUsingDELETE(String eventName) throws ApiException {
        deleteTriggerUsingDELETEWithHttpInfo(eventName);
    }

    /**
     * Delete a trigger
     * May fail if there are existing rules against it. Cannot delete core triggers
     * @param eventName The trigger event name (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTriggerUsingDELETEWithHttpInfo(String eventName) throws ApiException {
        com.squareup.okhttp.Call call = deleteTriggerUsingDELETEValidateBeforeCall(eventName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a trigger (asynchronously)
     * May fail if there are existing rules against it. Cannot delete core triggers
     * @param eventName The trigger event name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTriggerUsingDELETEAsync(String eventName, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTriggerUsingDELETEValidateBeforeCall(eventName, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getTriggerUsingGET */
    private com.squareup.okhttp.Call getTriggerUsingGETCall(String eventName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/bre/triggers/{event_name}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_name" + "\\}", apiClient.escapeString(eventName.toString()));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTriggerUsingGETValidateBeforeCall(String eventName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'eventName' is set
        if (eventName == null) {
            throw new ApiException("Missing the required parameter 'eventName' when calling getTriggerUsingGET(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getTriggerUsingGETCall(eventName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a single trigger
     * 
     * @param eventName The trigger event name (required)
     * @return BreTriggerResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BreTriggerResource getTriggerUsingGET(String eventName) throws ApiException {
        ApiResponse<BreTriggerResource> resp = getTriggerUsingGETWithHttpInfo(eventName);
        return resp.getData();
    }

    /**
     * Get a single trigger
     * 
     * @param eventName The trigger event name (required)
     * @return ApiResponse&lt;BreTriggerResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BreTriggerResource> getTriggerUsingGETWithHttpInfo(String eventName) throws ApiException {
        com.squareup.okhttp.Call call = getTriggerUsingGETValidateBeforeCall(eventName, null, null);
        Type localVarReturnType = new TypeToken<BreTriggerResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single trigger (asynchronously)
     * 
     * @param eventName The trigger event name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTriggerUsingGETAsync(String eventName, final ApiCallback<BreTriggerResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTriggerUsingGETValidateBeforeCall(eventName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BreTriggerResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTriggersUsingGET */
    private com.squareup.okhttp.Call getTriggersUsingGETCall(Boolean filterSystem, String filterCategory, String filterName, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/bre/triggers".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filterSystem != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_system", filterSystem));
        if (filterCategory != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
        if (filterName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTriggersUsingGETValidateBeforeCall(Boolean filterSystem, String filterCategory, String filterName, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getTriggersUsingGETCall(filterSystem, filterCategory, filterName, size, page, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List triggers
     * 
     * @param filterSystem Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed (optional)
     * @param filterCategory Filter for triggers that are within a specific category (optional)
     * @param filterName Filter for triggers that have names containing the given string (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return PageBreTriggerResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageBreTriggerResource getTriggersUsingGET(Boolean filterSystem, String filterCategory, String filterName, Integer size, Integer page) throws ApiException {
        ApiResponse<PageBreTriggerResource> resp = getTriggersUsingGETWithHttpInfo(filterSystem, filterCategory, filterName, size, page);
        return resp.getData();
    }

    /**
     * List triggers
     * 
     * @param filterSystem Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed (optional)
     * @param filterCategory Filter for triggers that are within a specific category (optional)
     * @param filterName Filter for triggers that have names containing the given string (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return ApiResponse&lt;PageBreTriggerResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageBreTriggerResource> getTriggersUsingGETWithHttpInfo(Boolean filterSystem, String filterCategory, String filterName, Integer size, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = getTriggersUsingGETValidateBeforeCall(filterSystem, filterCategory, filterName, size, page, null, null);
        Type localVarReturnType = new TypeToken<PageBreTriggerResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List triggers (asynchronously)
     * 
     * @param filterSystem Filter for triggers that are system triggers when true, or not when false. Leave off for both mixed (optional)
     * @param filterCategory Filter for triggers that are within a specific category (optional)
     * @param filterName Filter for triggers that have names containing the given string (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTriggersUsingGETAsync(Boolean filterSystem, String filterCategory, String filterName, Integer size, Integer page, final ApiCallback<PageBreTriggerResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTriggersUsingGETValidateBeforeCall(filterSystem, filterCategory, filterName, size, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageBreTriggerResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateTriggerUsingPUT */
    private com.squareup.okhttp.Call updateTriggerUsingPUTCall(String eventName, BreTriggerResource breTriggerResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = breTriggerResource;
        
        // create path and map variables
        String localVarPath = "/bre/triggers/{event_name}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "event_name" + "\\}", apiClient.escapeString(eventName.toString()));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTriggerUsingPUTValidateBeforeCall(String eventName, BreTriggerResource breTriggerResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'eventName' is set
        if (eventName == null) {
            throw new ApiException("Missing the required parameter 'eventName' when calling updateTriggerUsingPUT(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateTriggerUsingPUTCall(eventName, breTriggerResource, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a trigger
     * May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers
     * @param eventName The trigger event name (required)
     * @param breTriggerResource The BRE trigger resource object (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateTriggerUsingPUT(String eventName, BreTriggerResource breTriggerResource) throws ApiException {
        updateTriggerUsingPUTWithHttpInfo(eventName, breTriggerResource);
    }

    /**
     * Update a trigger
     * May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers
     * @param eventName The trigger event name (required)
     * @param breTriggerResource The BRE trigger resource object (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateTriggerUsingPUTWithHttpInfo(String eventName, BreTriggerResource breTriggerResource) throws ApiException {
        com.squareup.okhttp.Call call = updateTriggerUsingPUTValidateBeforeCall(eventName, breTriggerResource, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update a trigger (asynchronously)
     * May fail if new parameters mismatch requirements of existing rules. Cannot update core triggers
     * @param eventName The trigger event name (required)
     * @param breTriggerResource The BRE trigger resource object (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTriggerUsingPUTAsync(String eventName, BreTriggerResource breTriggerResource, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTriggerUsingPUTValidateBeforeCall(eventName, breTriggerResource, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
