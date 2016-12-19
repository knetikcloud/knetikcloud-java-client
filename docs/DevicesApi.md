# DevicesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeviceUsingPOST**](DevicesApi.md#createDeviceUsingPOST) | **POST** /devices | Create a device
[**deleteDeviceUsingDELETE**](DevicesApi.md#deleteDeviceUsingDELETE) | **DELETE** /devices/{id} | Delete a device
[**getDeviceUsingGET**](DevicesApi.md#getDeviceUsingGET) | **GET** /devices/{id} | Get a single device
[**getDevicesUsingGET**](DevicesApi.md#getDevicesUsingGET) | **GET** /devices | List and search devices
[**updateDeviceUsingPUT**](DevicesApi.md#updateDeviceUsingPUT) | **PUT** /devices/{id} | Update a device


<a name="createDeviceUsingPOST"></a>
# **createDeviceUsingPOST**
> DeviceResource createDeviceUsingPOST(device)

Create a device

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
DeviceResource device = new DeviceResource(); // DeviceResource | device
try {
    DeviceResource result = apiInstance.createDeviceUsingPOST(device);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#createDeviceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device** | [**DeviceResource**](DeviceResource.md)| device |

### Return type

[**DeviceResource**](DeviceResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDeviceUsingDELETE"></a>
# **deleteDeviceUsingDELETE**
> deleteDeviceUsingDELETE(id)

Delete a device

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
Integer id = 56; // Integer | id
try {
    apiInstance.deleteDeviceUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deleteDeviceUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDeviceUsingGET"></a>
# **getDeviceUsingGET**
> DeviceResource getDeviceUsingGET(id)

Get a single device

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
Integer id = 56; // Integer | id
try {
    DeviceResource result = apiInstance.getDeviceUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#getDeviceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**DeviceResource**](DeviceResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDevicesUsingGET"></a>
# **getDevicesUsingGET**
> PageDeviceResource getDevicesUsingGET(filterMake, filterModel, size, page, order)

List and search devices

Get a list of devices with optional filtering

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
String filterMake = "filterMake_example"; // String | Filter for devices with specified make
String filterModel = "filterModel_example"; // String | Filter for devices with specified model
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "1"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageDeviceResource result = apiInstance.getDevicesUsingGET(filterMake, filterModel, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#getDevicesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterMake** | **String**| Filter for devices with specified make | [optional]
 **filterModel** | **String**| Filter for devices with specified model | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to 1]

### Return type

[**PageDeviceResource**](PageDeviceResource.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateDeviceUsingPUT"></a>
# **updateDeviceUsingPUT**
> updateDeviceUsingPUT(device, id)

Update a device

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DevicesApi apiInstance = new DevicesApi();
DeviceResource device = new DeviceResource(); // DeviceResource | device
Integer id = 56; // Integer | id
try {
    apiInstance.updateDeviceUsingPUT(device, id);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#updateDeviceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device** | [**DeviceResource**](DeviceResource.md)| device |
 **id** | **Integer**| id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

