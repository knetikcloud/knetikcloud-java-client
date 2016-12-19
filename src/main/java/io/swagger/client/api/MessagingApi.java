/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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


import io.swagger.client.model.RawEmailResource;
import io.swagger.client.model.RawSMSResource;
import io.swagger.client.model.TemplateEmailResource;
import io.swagger.client.model.TemplateSMSResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingApi {
    private ApiClient apiClient;

    public MessagingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for sendRawEmailUsingPOST */
    private com.squareup.okhttp.Call sendRawEmailUsingPOSTCall(RawEmailResource rawEmailResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = rawEmailResource;
        
        // create path and map variables
        String localVarPath = "/messaging/raw-email".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call sendRawEmailUsingPOSTValidateBeforeCall(RawEmailResource rawEmailResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = sendRawEmailUsingPOSTCall(rawEmailResource, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send a raw email to one or more users
     * 
     * @param rawEmailResource The new raw email to be sent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void sendRawEmailUsingPOST(RawEmailResource rawEmailResource) throws ApiException {
        sendRawEmailUsingPOSTWithHttpInfo(rawEmailResource);
    }

    /**
     * Send a raw email to one or more users
     * 
     * @param rawEmailResource The new raw email to be sent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> sendRawEmailUsingPOSTWithHttpInfo(RawEmailResource rawEmailResource) throws ApiException {
        com.squareup.okhttp.Call call = sendRawEmailUsingPOSTValidateBeforeCall(rawEmailResource, null, null);
        return apiClient.execute(call);
    }

    /**
     * Send a raw email to one or more users (asynchronously)
     * 
     * @param rawEmailResource The new raw email to be sent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendRawEmailUsingPOSTAsync(RawEmailResource rawEmailResource, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sendRawEmailUsingPOSTValidateBeforeCall(rawEmailResource, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for sendRawSMSUsingPOST */
    private com.squareup.okhttp.Call sendRawSMSUsingPOSTCall(RawSMSResource rawSMSResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = rawSMSResource;
        
        // create path and map variables
        String localVarPath = "/messaging/raw-sms".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call sendRawSMSUsingPOSTValidateBeforeCall(RawSMSResource rawSMSResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = sendRawSMSUsingPOSTCall(rawSMSResource, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send a raw SMS
     * Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     * @param rawSMSResource The new raw SMS to be sent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void sendRawSMSUsingPOST(RawSMSResource rawSMSResource) throws ApiException {
        sendRawSMSUsingPOSTWithHttpInfo(rawSMSResource);
    }

    /**
     * Send a raw SMS
     * Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     * @param rawSMSResource The new raw SMS to be sent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> sendRawSMSUsingPOSTWithHttpInfo(RawSMSResource rawSMSResource) throws ApiException {
        com.squareup.okhttp.Call call = sendRawSMSUsingPOSTValidateBeforeCall(rawSMSResource, null, null);
        return apiClient.execute(call);
    }

    /**
     * Send a raw SMS (asynchronously)
     * Sends a raw SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     * @param rawSMSResource The new raw SMS to be sent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendRawSMSUsingPOSTAsync(RawSMSResource rawSMSResource, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sendRawSMSUsingPOSTValidateBeforeCall(rawSMSResource, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for sendRawSMSUsingPOST1 */
    private com.squareup.okhttp.Call sendRawSMSUsingPOST1Call(TemplateSMSResource templateSMSResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = templateSMSResource;
        
        // create path and map variables
        String localVarPath = "/messaging/templated-sms".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call sendRawSMSUsingPOST1ValidateBeforeCall(TemplateSMSResource templateSMSResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = sendRawSMSUsingPOST1Call(templateSMSResource, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send a new templated SMS
     * Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     * @param templateSMSResource The new template SMS to be sent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void sendRawSMSUsingPOST1(TemplateSMSResource templateSMSResource) throws ApiException {
        sendRawSMSUsingPOST1WithHttpInfo(templateSMSResource);
    }

    /**
     * Send a new templated SMS
     * Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     * @param templateSMSResource The new template SMS to be sent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> sendRawSMSUsingPOST1WithHttpInfo(TemplateSMSResource templateSMSResource) throws ApiException {
        com.squareup.okhttp.Call call = sendRawSMSUsingPOST1ValidateBeforeCall(templateSMSResource, null, null);
        return apiClient.execute(call);
    }

    /**
     * Send a new templated SMS (asynchronously)
     * Sends a templated SMS text message to one or more users. User&#39;s without registered mobile numbers will be skipped.
     * @param templateSMSResource The new template SMS to be sent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendRawSMSUsingPOST1Async(TemplateSMSResource templateSMSResource, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sendRawSMSUsingPOST1ValidateBeforeCall(templateSMSResource, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for sendTemplateEmailUsingPOST */
    private com.squareup.okhttp.Call sendTemplateEmailUsingPOSTCall(TemplateEmailResource messageResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = messageResource;
        
        // create path and map variables
        String localVarPath = "/messaging/templated-email".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call sendTemplateEmailUsingPOSTValidateBeforeCall(TemplateEmailResource messageResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = sendTemplateEmailUsingPOSTCall(messageResource, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send a templated email to one or more users
     * 
     * @param messageResource The new template email to be sent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void sendTemplateEmailUsingPOST(TemplateEmailResource messageResource) throws ApiException {
        sendTemplateEmailUsingPOSTWithHttpInfo(messageResource);
    }

    /**
     * Send a templated email to one or more users
     * 
     * @param messageResource The new template email to be sent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> sendTemplateEmailUsingPOSTWithHttpInfo(TemplateEmailResource messageResource) throws ApiException {
        com.squareup.okhttp.Call call = sendTemplateEmailUsingPOSTValidateBeforeCall(messageResource, null, null);
        return apiClient.execute(call);
    }

    /**
     * Send a templated email to one or more users (asynchronously)
     * 
     * @param messageResource The new template email to be sent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendTemplateEmailUsingPOSTAsync(TemplateEmailResource messageResource, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sendTemplateEmailUsingPOSTValidateBeforeCall(messageResource, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
