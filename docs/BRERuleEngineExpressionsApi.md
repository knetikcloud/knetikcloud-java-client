# BRERuleEngineExpressionsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLookupTypesUsingGET**](BRERuleEngineExpressionsApi.md#getLookupTypesUsingGET) | **GET** /bre/expressions/lookup | Get a list of &#39;lookup&#39; type expressions


<a name="getLookupTypesUsingGET"></a>
# **getLookupTypesUsingGET**
> List&lt;LookupTypeResource&gt; getLookupTypesUsingGET()

Get a list of &#39;lookup&#39; type expressions

These are expression types that take a second expression as input and produce a value. These can be used in addition to the standard types, like parameter, global and constant (see BRE documentation for details).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BRERuleEngineExpressionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

BRERuleEngineExpressionsApi apiInstance = new BRERuleEngineExpressionsApi();
try {
    List<LookupTypeResource> result = apiInstance.getLookupTypesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineExpressionsApi#getLookupTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LookupTypeResource&gt;**](LookupTypeResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

