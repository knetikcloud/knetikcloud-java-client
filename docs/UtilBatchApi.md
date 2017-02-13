# UtilBatchApi

All URIs are relative to *https://integration.knetikcloud.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendBatch**](UtilBatchApi.md#sendBatch) | **POST** /batch | Request to run API call given the method, content type, path url, and body of request


<a name="sendBatch"></a>
# **sendBatch**
> sendBatch(batch)

Request to run API call given the method, content type, path url, and body of request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilBatchApi;


UtilBatchApi apiInstance = new UtilBatchApi();
Batch batch = new Batch(); // Batch | The batch object
try {
    apiInstance.sendBatch(batch);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilBatchApi#sendBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch** | [**Batch**](Batch.md)| The batch object | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

