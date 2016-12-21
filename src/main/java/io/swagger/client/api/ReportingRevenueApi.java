/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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

import io.swagger.client.model.PageResourceRevenueCountryReportResource;
import io.swagger.client.model.RevenueReportResource;
import io.swagger.client.model.PageResourceRevenueProductReportResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportingRevenueApi {
    private ApiClient apiClient;

    public ReportingRevenueApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportingRevenueApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for executiveRevenueCountrySalesUsingGET */
    private com.squareup.okhttp.Call executiveRevenueCountrySalesUsingGETCall(String currencyCode, Long startDate, Long endDate, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling executiveRevenueCountrySalesUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/reporting/revenue/countries/{currency_code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
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

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get revenue info by country
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return PageResourceRevenueCountryReportResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceRevenueCountryReportResource executiveRevenueCountrySalesUsingGET(String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws ApiException {
        ApiResponse<PageResourceRevenueCountryReportResource> resp = executiveRevenueCountrySalesUsingGETWithHttpInfo(currencyCode, startDate, endDate, size, page);
        return resp.getData();
    }

    /**
     * Get revenue info by country
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return ApiResponse&lt;PageResourceRevenueCountryReportResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceRevenueCountryReportResource> executiveRevenueCountrySalesUsingGETWithHttpInfo(String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = executiveRevenueCountrySalesUsingGETCall(currencyCode, startDate, endDate, size, page, null, null);
        Type localVarReturnType = new TypeToken<PageResourceRevenueCountryReportResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get revenue info by country (asynchronously)
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call executiveRevenueCountrySalesUsingGETAsync(String currencyCode, Long startDate, Long endDate, Integer size, Integer page, final ApiCallback<PageResourceRevenueCountryReportResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = executiveRevenueCountrySalesUsingGETCall(currencyCode, startDate, endDate, size, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceRevenueCountryReportResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for executiveRevenueItemSalesUsingGET */
    private com.squareup.okhttp.Call executiveRevenueItemSalesUsingGETCall(String currencyCode, Long startDate, Long endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling executiveRevenueItemSalesUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/reporting/revenue/item-sales/{currency_code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get item revenue info
     * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return RevenueReportResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RevenueReportResource executiveRevenueItemSalesUsingGET(String currencyCode, Long startDate, Long endDate) throws ApiException {
        ApiResponse<RevenueReportResource> resp = executiveRevenueItemSalesUsingGETWithHttpInfo(currencyCode, startDate, endDate);
        return resp.getData();
    }

    /**
     * Get item revenue info
     * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return ApiResponse&lt;RevenueReportResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RevenueReportResource> executiveRevenueItemSalesUsingGETWithHttpInfo(String currencyCode, Long startDate, Long endDate) throws ApiException {
        com.squareup.okhttp.Call call = executiveRevenueItemSalesUsingGETCall(currencyCode, startDate, endDate, null, null);
        Type localVarReturnType = new TypeToken<RevenueReportResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get item revenue info (asynchronously)
     * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call executiveRevenueItemSalesUsingGETAsync(String currencyCode, Long startDate, Long endDate, final ApiCallback<RevenueReportResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = executiveRevenueItemSalesUsingGETCall(currencyCode, startDate, endDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RevenueReportResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for executiveRevenueProductSalesUsingGET */
    private com.squareup.okhttp.Call executiveRevenueProductSalesUsingGETCall(String currencyCode, Long startDate, Long endDate, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling executiveRevenueProductSalesUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/reporting/revenue/products/{currency_code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
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

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get revenue info by item
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return PageResourceRevenueProductReportResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceRevenueProductReportResource executiveRevenueProductSalesUsingGET(String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws ApiException {
        ApiResponse<PageResourceRevenueProductReportResource> resp = executiveRevenueProductSalesUsingGETWithHttpInfo(currencyCode, startDate, endDate, size, page);
        return resp.getData();
    }

    /**
     * Get revenue info by item
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return ApiResponse&lt;PageResourceRevenueProductReportResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceRevenueProductReportResource> executiveRevenueProductSalesUsingGETWithHttpInfo(String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = executiveRevenueProductSalesUsingGETCall(currencyCode, startDate, endDate, size, page, null, null);
        Type localVarReturnType = new TypeToken<PageResourceRevenueProductReportResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get revenue info by item (asynchronously)
     * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call executiveRevenueProductSalesUsingGETAsync(String currencyCode, Long startDate, Long endDate, Integer size, Integer page, final ApiCallback<PageResourceRevenueProductReportResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = executiveRevenueProductSalesUsingGETCall(currencyCode, startDate, endDate, size, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceRevenueProductReportResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for executiveRevenueRefundsUsingGET */
    private com.squareup.okhttp.Call executiveRevenueRefundsUsingGETCall(String currencyCode, Long startDate, Long endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling executiveRevenueRefundsUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/reporting/revenue/refunds/{currency_code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get refund revenue info
     * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
     * @param currencyCode The code for a currency to get refund data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return RevenueReportResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RevenueReportResource executiveRevenueRefundsUsingGET(String currencyCode, Long startDate, Long endDate) throws ApiException {
        ApiResponse<RevenueReportResource> resp = executiveRevenueRefundsUsingGETWithHttpInfo(currencyCode, startDate, endDate);
        return resp.getData();
    }

    /**
     * Get refund revenue info
     * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
     * @param currencyCode The code for a currency to get refund data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return ApiResponse&lt;RevenueReportResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RevenueReportResource> executiveRevenueRefundsUsingGETWithHttpInfo(String currencyCode, Long startDate, Long endDate) throws ApiException {
        com.squareup.okhttp.Call call = executiveRevenueRefundsUsingGETCall(currencyCode, startDate, endDate, null, null);
        Type localVarReturnType = new TypeToken<RevenueReportResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get refund revenue info (asynchronously)
     * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
     * @param currencyCode The code for a currency to get refund data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call executiveRevenueRefundsUsingGETAsync(String currencyCode, Long startDate, Long endDate, final ApiCallback<RevenueReportResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = executiveRevenueRefundsUsingGETCall(currencyCode, startDate, endDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RevenueReportResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for executiveRevenueSubscriptionSalesUsingGET */
    private com.squareup.okhttp.Call executiveRevenueSubscriptionSalesUsingGETCall(String currencyCode, Long startDate, Long endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'currencyCode' is set
        if (currencyCode == null) {
            throw new ApiException("Missing the required parameter 'currencyCode' when calling executiveRevenueSubscriptionSalesUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/reporting/revenue/subscription-sales/{currency_code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "currency_code" + "\\}", apiClient.escapeString(currencyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get subscription revenue info
     * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return RevenueReportResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RevenueReportResource executiveRevenueSubscriptionSalesUsingGET(String currencyCode, Long startDate, Long endDate) throws ApiException {
        ApiResponse<RevenueReportResource> resp = executiveRevenueSubscriptionSalesUsingGETWithHttpInfo(currencyCode, startDate, endDate);
        return resp.getData();
    }

    /**
     * Get subscription revenue info
     * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return ApiResponse&lt;RevenueReportResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RevenueReportResource> executiveRevenueSubscriptionSalesUsingGETWithHttpInfo(String currencyCode, Long startDate, Long endDate) throws ApiException {
        com.squareup.okhttp.Call call = executiveRevenueSubscriptionSalesUsingGETCall(currencyCode, startDate, endDate, null, null);
        Type localVarReturnType = new TypeToken<RevenueReportResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get subscription revenue info (asynchronously)
     * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
     * @param currencyCode The code for a currency to get sales data for (required)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call executiveRevenueSubscriptionSalesUsingGETAsync(String currencyCode, Long startDate, Long endDate, final ApiCallback<RevenueReportResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = executiveRevenueSubscriptionSalesUsingGETCall(currencyCode, startDate, endDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RevenueReportResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
