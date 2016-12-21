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


import io.swagger.client.model.PageResourceMapstringobject;
import io.swagger.client.model.SearchReferenceMapping;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for externalAddUsingPOST */
    private com.squareup.okhttp.Call externalAddUsingPOSTCall(String type, String id, Object object, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = object;
        
        // create path and map variables
        String localVarPath = "/search/index/{type}/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
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

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call externalAddUsingPOSTValidateBeforeCall(String type, String id, Object object, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling externalAddUsingPOST(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling externalAddUsingPOST(Async)");
        }
        
        
        com.squareup.okhttp.Call call = externalAddUsingPOSTCall(type, id, object, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a new object to an index
     * Mainly intended for internal use.
     * @param type The index type (required)
     * @param id The ID of the object (required)
     * @param object The object to add (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void externalAddUsingPOST(String type, String id, Object object) throws ApiException {
        externalAddUsingPOSTWithHttpInfo(type, id, object);
    }

    /**
     * Add a new object to an index
     * Mainly intended for internal use.
     * @param type The index type (required)
     * @param id The ID of the object (required)
     * @param object The object to add (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> externalAddUsingPOSTWithHttpInfo(String type, String id, Object object) throws ApiException {
        com.squareup.okhttp.Call call = externalAddUsingPOSTValidateBeforeCall(type, id, object, null, null);
        return apiClient.execute(call);
    }

    /**
     * Add a new object to an index (asynchronously)
     * Mainly intended for internal use.
     * @param type The index type (required)
     * @param id The ID of the object (required)
     * @param object The object to add (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call externalAddUsingPOSTAsync(String type, String id, Object object, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = externalAddUsingPOSTValidateBeforeCall(type, id, object, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for externalDeleteAllUsingDELETE */
    private com.squareup.okhttp.Call externalDeleteAllUsingDELETECall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/index/{type}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call externalDeleteAllUsingDELETEValidateBeforeCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling externalDeleteAllUsingDELETE(Async)");
        }
        
        
        com.squareup.okhttp.Call call = externalDeleteAllUsingDELETECall(type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete all objects in an index
     * Mainly intended for internal use
     * @param type The index type (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void externalDeleteAllUsingDELETE(String type) throws ApiException {
        externalDeleteAllUsingDELETEWithHttpInfo(type);
    }

    /**
     * Delete all objects in an index
     * Mainly intended for internal use
     * @param type The index type (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> externalDeleteAllUsingDELETEWithHttpInfo(String type) throws ApiException {
        com.squareup.okhttp.Call call = externalDeleteAllUsingDELETEValidateBeforeCall(type, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete all objects in an index (asynchronously)
     * Mainly intended for internal use
     * @param type The index type (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call externalDeleteAllUsingDELETEAsync(String type, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = externalDeleteAllUsingDELETEValidateBeforeCall(type, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for externalDeleteUsingDELETE */
    private com.squareup.okhttp.Call externalDeleteUsingDELETECall(String type, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/index/{type}/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
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

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call externalDeleteUsingDELETEValidateBeforeCall(String type, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling externalDeleteUsingDELETE(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling externalDeleteUsingDELETE(Async)");
        }
        
        
        com.squareup.okhttp.Call call = externalDeleteUsingDELETECall(type, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete an object
     * Mainly intended for internal use. Requires SEARCH_ADMIN.
     * @param type The index type (required)
     * @param id The ID of the object to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void externalDeleteUsingDELETE(String type, String id) throws ApiException {
        externalDeleteUsingDELETEWithHttpInfo(type, id);
    }

    /**
     * Delete an object
     * Mainly intended for internal use. Requires SEARCH_ADMIN.
     * @param type The index type (required)
     * @param id The ID of the object to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> externalDeleteUsingDELETEWithHttpInfo(String type, String id) throws ApiException {
        com.squareup.okhttp.Call call = externalDeleteUsingDELETEValidateBeforeCall(type, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an object (asynchronously)
     * Mainly intended for internal use. Requires SEARCH_ADMIN.
     * @param type The index type (required)
     * @param id The ID of the object to delete (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call externalDeleteUsingDELETEAsync(String type, String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = externalDeleteUsingDELETEValidateBeforeCall(type, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for externalRegisterUsingPOST */
    private com.squareup.okhttp.Call externalRegisterUsingPOSTCall(List<SearchReferenceMapping> mappings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = mappings;
        
        // create path and map variables
        String localVarPath = "/search/mappings".replaceAll("\\{format\\}","json");

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

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call externalRegisterUsingPOSTValidateBeforeCall(List<SearchReferenceMapping> mappings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = externalRegisterUsingPOSTCall(mappings, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Register reference mappings
     * Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.
     * @param mappings The mappings to add (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void externalRegisterUsingPOST(List<SearchReferenceMapping> mappings) throws ApiException {
        externalRegisterUsingPOSTWithHttpInfo(mappings);
    }

    /**
     * Register reference mappings
     * Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.
     * @param mappings The mappings to add (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> externalRegisterUsingPOSTWithHttpInfo(List<SearchReferenceMapping> mappings) throws ApiException {
        com.squareup.okhttp.Call call = externalRegisterUsingPOSTValidateBeforeCall(mappings, null, null);
        return apiClient.execute(call);
    }

    /**
     * Register reference mappings (asynchronously)
     * Add a new type mapping to connect data from one index to another, or discover an exsting one. Mainly intended for internal use.
     * @param mappings The mappings to add (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call externalRegisterUsingPOSTAsync(List<SearchReferenceMapping> mappings, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = externalRegisterUsingPOSTValidateBeforeCall(mappings, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for searchUsingPOST */
    private com.squareup.okhttp.Call searchUsingPOSTCall(String type, Object query, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = query;
        
        // create path and map variables
        String localVarPath = "/search/index/{type}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchUsingPOSTValidateBeforeCall(String type, Object query, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling searchUsingPOST(Async)");
        }
        
        
        com.squareup.okhttp.Call call = searchUsingPOSTCall(type, query, size, page, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Search an index
     * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.
     * @param type The index type (required)
     * @param query The query to be used for the search (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return PageResourceMapstringobject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceMapstringobject searchUsingPOST(String type, Object query, Integer size, Integer page) throws ApiException {
        ApiResponse<PageResourceMapstringobject> resp = searchUsingPOSTWithHttpInfo(type, query, size, page);
        return resp.getData();
    }

    /**
     * Search an index
     * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.
     * @param type The index type (required)
     * @param query The query to be used for the search (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return ApiResponse&lt;PageResourceMapstringobject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceMapstringobject> searchUsingPOSTWithHttpInfo(String type, Object query, Integer size, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = searchUsingPOSTValidateBeforeCall(type, query, size, page, null, null);
        Type localVarReturnType = new TypeToken<PageResourceMapstringobject>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search an index (asynchronously)
     * The body is an ElasticSearch query in JSON format. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options. The searchable object&#39;s format depends on on the type. See individual search endpoints on other resources for details on their format.
     * @param type The index type (required)
     * @param query The query to be used for the search (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchUsingPOSTAsync(String type, Object query, Integer size, Integer page, final ApiCallback<PageResourceMapstringobject> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchUsingPOSTValidateBeforeCall(type, query, size, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceMapstringobject>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
