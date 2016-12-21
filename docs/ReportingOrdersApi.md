# ReportingOrdersApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDailyInvoicesUsingGET**](ReportingOrdersApi.md#getDailyInvoicesUsingGET) | **GET** /reporting/orders/count/{currency_code} | Retrieve invoice counts aggregated by time ranges


<a name="getDailyInvoicesUsingGET"></a>
# **getDailyInvoicesUsingGET**
> PageResourceAggregateInvoiceReportResource getDailyInvoicesUsingGET(currencyCode, granularity, filterPaymentStatus, filterFulfillmentStatus, startDate, endDate)

Retrieve invoice counts aggregated by time ranges

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

ReportingOrdersApi apiInstance = new ReportingOrdersApi();
String currencyCode = "currencyCode_example"; // String | The code for a currency to get sales data for
String granularity = "day"; // String | The time duration to aggregate by
String filterPaymentStatus = "filterPaymentStatus_example"; // String | A payment status to filter results by, can be a comma separated list
String filterFulfillmentStatus = "filterFulfillmentStatus_example"; // String | An invoice fulfillment status to filter results by, can be a comma separated list
Long startDate = 789L; // Long | The start of the time range to return, unix timestamp in seconds. Default is beginning of time
Long endDate = 789L; // Long | The end of the time range to return, unix timestamp in seconds. Default is end of time
try {
    PageResourceAggregateInvoiceReportResource result = apiInstance.getDailyInvoicesUsingGET(currencyCode, granularity, filterPaymentStatus, filterFulfillmentStatus, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingOrdersApi#getDailyInvoicesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyCode** | **String**| The code for a currency to get sales data for |
 **granularity** | **String**| The time duration to aggregate by | [optional] [default to day] [enum: millisecond, second, minute, hour, day, week, month, year]
 **filterPaymentStatus** | **String**| A payment status to filter results by, can be a comma separated list | [optional]
 **filterFulfillmentStatus** | **String**| An invoice fulfillment status to filter results by, can be a comma separated list | [optional]
 **startDate** | **Long**| The start of the time range to return, unix timestamp in seconds. Default is beginning of time | [optional]
 **endDate** | **Long**| The end of the time range to return, unix timestamp in seconds. Default is end of time | [optional]

### Return type

[**PageResourceAggregateInvoiceReportResource**](PageResourceAggregateInvoiceReportResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
