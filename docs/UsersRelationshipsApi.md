# UsersRelationshipsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRelationshipUsingPOST**](UsersRelationshipsApi.md#addRelationshipUsingPOST) | **POST** /users/relationships | Create a user relationship
[**deleteRelationshipUsingDELETE**](UsersRelationshipsApi.md#deleteRelationshipUsingDELETE) | **DELETE** /users/relationships/{id} | Delete a user relationship
[**getRelationshipUsingGET**](UsersRelationshipsApi.md#getRelationshipUsingGET) | **GET** /users/relationships/{id} | Get a user relationship
[**getRelationshipsUsingGET**](UsersRelationshipsApi.md#getRelationshipsUsingGET) | **GET** /users/relationships | Get a list of user relationships
[**updateRelationshipUsingPUT**](UsersRelationshipsApi.md#updateRelationshipUsingPUT) | **PUT** /users/relationships/{id} | Update a user relationship


<a name="addRelationshipUsingPOST"></a>
# **addRelationshipUsingPOST**
> UserRelationshipResource addRelationshipUsingPOST(relationship)

Create a user relationship

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
UserRelationshipResource relationship = new UserRelationshipResource(); // UserRelationshipResource | The new relationship
try {
    UserRelationshipResource result = apiInstance.addRelationshipUsingPOST(relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#addRelationshipUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship** | [**UserRelationshipResource**](UserRelationshipResource.md)| The new relationship | [optional]

### Return type

[**UserRelationshipResource**](UserRelationshipResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRelationshipUsingDELETE"></a>
# **deleteRelationshipUsingDELETE**
> deleteRelationshipUsingDELETE(id)

Delete a user relationship

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
Long id = 789L; // Long | The id of the relationship
try {
    apiInstance.deleteRelationshipUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#deleteRelationshipUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the relationship |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationshipUsingGET"></a>
# **getRelationshipUsingGET**
> UserRelationshipResource getRelationshipUsingGET(id)

Get a user relationship

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
Long id = 789L; // Long | The id of the relationship
try {
    UserRelationshipResource result = apiInstance.getRelationshipUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#getRelationshipUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the relationship |

### Return type

[**UserRelationshipResource**](UserRelationshipResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationshipsUsingGET"></a>
# **getRelationshipsUsingGET**
> PageUserRelationshipResource getRelationshipsUsingGET()

Get a list of user relationships

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
try {
    PageUserRelationshipResource result = apiInstance.getRelationshipsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#getRelationshipsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PageUserRelationshipResource**](PageUserRelationshipResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRelationshipUsingPUT"></a>
# **updateRelationshipUsingPUT**
> UserRelationshipResource updateRelationshipUsingPUT(id, relationship)

Update a user relationship

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersRelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UsersRelationshipsApi apiInstance = new UsersRelationshipsApi();
Long id = 789L; // Long | The id of the relationship
UserRelationshipResource relationship = new UserRelationshipResource(); // UserRelationshipResource | The new relationship
try {
    UserRelationshipResource result = apiInstance.updateRelationshipUsingPUT(id, relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersRelationshipsApi#updateRelationshipUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the relationship |
 **relationship** | [**UserRelationshipResource**](UserRelationshipResource.md)| The new relationship | [optional]

### Return type

[**UserRelationshipResource**](UserRelationshipResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

