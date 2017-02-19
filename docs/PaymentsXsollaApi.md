# PaymentsXsollaApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createXsollaTokenUrl**](PaymentsXsollaApi.md#createXsollaTokenUrl) | **POST** /payment/provider/xsolla/payment | Create a payment token that should be used to forward the user to Xsolla so they can complete payment
[**receiveXsollaNotification**](PaymentsXsollaApi.md#receiveXsollaNotification) | **POST** /payment/provider/xsolla/notifications | Receives payment response from Xsolla


<a name="createXsollaTokenUrl"></a>
# **createXsollaTokenUrl**
> String createXsollaTokenUrl(request)

Create a payment token that should be used to forward the user to Xsolla so they can complete payment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentsXsollaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PaymentsXsollaApi apiInstance = new PaymentsXsollaApi();
XsollaPaymentRequest request = new XsollaPaymentRequest(); // XsollaPaymentRequest | The payment request to be sent to XSolla
try {
    String result = apiInstance.createXsollaTokenUrl(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsXsollaApi#createXsollaTokenUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**XsollaPaymentRequest**](XsollaPaymentRequest.md)| The payment request to be sent to XSolla | [optional]

### Return type

**String**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="receiveXsollaNotification"></a>
# **receiveXsollaNotification**
> receiveXsollaNotification()

Receives payment response from Xsolla

Only used by Xsolla to call back to JSAPI after processing user payment action

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentsXsollaApi;


PaymentsXsollaApi apiInstance = new PaymentsXsollaApi();
try {
    apiInstance.receiveXsollaNotification();
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsXsollaApi#receiveXsollaNotification");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
