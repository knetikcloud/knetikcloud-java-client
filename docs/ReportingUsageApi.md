# ReportingUsageApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsageByDay**](ReportingUsageApi.md#getUsageByDay) | **GET** /reporting/usage/day | Returns aggregated endpoint usage information by day
[**getUsageByHour**](ReportingUsageApi.md#getUsageByHour) | **GET** /reporting/usage/hour | Returns aggregated endpoint usage information by hour
[**getUsageByMinute**](ReportingUsageApi.md#getUsageByMinute) | **GET** /reporting/usage/minute | Returns aggregated endpoint usage information by minute
[**getUsageByMonth**](ReportingUsageApi.md#getUsageByMonth) | **GET** /reporting/usage/month | Returns aggregated endpoint usage information by month
[**getUsageByYear**](ReportingUsageApi.md#getUsageByYear) | **GET** /reporting/usage/year | Returns aggregated endpoint usage information by year


<a name="getUsageByDay"></a>
# **getUsageByDay**
> PageResourceUsageInfo getUsageByDay(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by day

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingUsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByDay(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByDay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsageByHour"></a>
# **getUsageByHour**
> PageResourceUsageInfo getUsageByHour(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by hour

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingUsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByHour(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByHour");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsageByMinute"></a>
# **getUsageByMinute**
> PageResourceUsageInfo getUsageByMinute(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by minute

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingUsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByMinute(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByMinute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsageByMonth"></a>
# **getUsageByMonth**
> PageResourceUsageInfo getUsageByMonth(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by month

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingUsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByMonth(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByMonth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsageByYear"></a>
# **getUsageByYear**
> PageResourceUsageInfo getUsageByYear(startDate, endDate, combineEndpoints, size, page)

Returns aggregated endpoint usage information by year

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingUsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

ReportingUsageApi apiInstance = new ReportingUsageApi();
Long startDate = 789L; // Long | The beginning of the range being requested, unix timestamp in seconds
Long endDate = 789L; // Long | The ending of the range being requested, unix timestamp in seconds
Boolean combineEndpoints = false; // Boolean | Whether to combine counts from different endpoint. Removes the url and method from the result object
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceUsageInfo result = apiInstance.getUsageByYear(startDate, endDate, combineEndpoints, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingUsageApi#getUsageByYear");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Long**| The beginning of the range being requested, unix timestamp in seconds |
 **endDate** | **Long**| The ending of the range being requested, unix timestamp in seconds |
 **combineEndpoints** | **Boolean**| Whether to combine counts from different endpoint. Removes the url and method from the result object | [optional] [default to false]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceUsageInfo**](PageResourceUsageInfo.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

