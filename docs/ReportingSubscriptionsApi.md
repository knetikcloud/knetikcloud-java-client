# ReportingSubscriptionsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listBillingReportsUsingGET**](ReportingSubscriptionsApi.md#listBillingReportsUsingGET) | **GET** /reporting/subscription | Get a list of available subscription reports in most recent first order


<a name="listBillingReportsUsingGET"></a>
# **listBillingReportsUsingGET**
> PageResourceBillingReport listBillingReportsUsingGET(size, page)

Get a list of available subscription reports in most recent first order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingSubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

ReportingSubscriptionsApi apiInstance = new ReportingSubscriptionsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceBillingReport result = apiInstance.listBillingReportsUsingGET(size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingSubscriptionsApi#listBillingReportsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceBillingReport**](PageResourceBillingReport.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

