# LoginControllerApi

All URIs are relative to *https://devsandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](LoginControllerApi.md#login) | **GET** /login | login


<a name="login"></a>
# **login**
> String login()

login

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.LoginControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

LoginControllerApi apiInstance = new LoginControllerApi();
try {
    String result = apiInstance.login();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginControllerApi#login");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

