# StoreBundlesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBundleItemUsingPOST**](StoreBundlesApi.md#createBundleItemUsingPOST) | **POST** /store/bundles | Create a bundle item
[**createBundleTemplateUsingPOST**](StoreBundlesApi.md#createBundleTemplateUsingPOST) | **POST** /store/bundles/templates | Create a bundle template
[**deleteBundleTemplateUsingDELETE**](StoreBundlesApi.md#deleteBundleTemplateUsingDELETE) | **DELETE** /store/bundles/templates/{id} | Delete a bundle template
[**deleteStoreItemUsingDELETE**](StoreBundlesApi.md#deleteStoreItemUsingDELETE) | **DELETE** /store/bundles/{id} | Delete a bundle item
[**getBundleTemplateUsingGET**](StoreBundlesApi.md#getBundleTemplateUsingGET) | **GET** /store/bundles/templates/{id} | Get a single bundle template
[**getBundleTemplatesUsingGET**](StoreBundlesApi.md#getBundleTemplatesUsingGET) | **GET** /store/bundles/templates | List and search bundle templates
[**getStoreItemUsingGET**](StoreBundlesApi.md#getStoreItemUsingGET) | **GET** /store/bundles/{id} | Get a single bundle item
[**updateBundleItemUsingPUT**](StoreBundlesApi.md#updateBundleItemUsingPUT) | **PUT** /store/bundles/{id} | Update a bundle item
[**updateBundleTemplateUsingPUT**](StoreBundlesApi.md#updateBundleTemplateUsingPUT) | **PUT** /store/bundles/templates/{id} | Update a bundle template


<a name="createBundleItemUsingPOST"></a>
# **createBundleItemUsingPOST**
> BundleItem createBundleItemUsingPOST(bundleItem)

Create a bundle item

The SKU for the bundle itself must be unique and there can only be one SKU.  Extra notes for price_override:  The price of all the items (multiplied by the quantity) must equal the price of the bundle.  With individual prices set, items will be processed individually and can be refunded as such.  However, if all prices are set to null, the price of the bundle will be used and will be treated as one item.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreBundlesApi;


StoreBundlesApi apiInstance = new StoreBundlesApi();
BundleItem bundleItem = new BundleItem(); // BundleItem | The bundle item object
try {
    BundleItem result = apiInstance.createBundleItemUsingPOST(bundleItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreBundlesApi#createBundleItemUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleItem** | [**BundleItem**](BundleItem.md)| The bundle item object | [optional]

### Return type

[**BundleItem**](BundleItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="createBundleTemplateUsingPOST"></a>
# **createBundleTemplateUsingPOST**
> ItemTemplateResource createBundleTemplateUsingPOST(bundleTemplateResource)

Create a bundle template

Bundle Templates define a type of bundle and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreBundlesApi;


StoreBundlesApi apiInstance = new StoreBundlesApi();
ItemTemplateResource bundleTemplateResource = new ItemTemplateResource(); // ItemTemplateResource | The new bundle template
try {
    ItemTemplateResource result = apiInstance.createBundleTemplateUsingPOST(bundleTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreBundlesApi#createBundleTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleTemplateResource** | [**ItemTemplateResource**](ItemTemplateResource.md)| The new bundle template | [optional]

### Return type

[**ItemTemplateResource**](ItemTemplateResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="deleteBundleTemplateUsingDELETE"></a>
# **deleteBundleTemplateUsingDELETE**
> deleteBundleTemplateUsingDELETE(id, cascade)

Delete a bundle template

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreBundlesApi;


StoreBundlesApi apiInstance = new StoreBundlesApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | force deleting the template if it's attached to other objects, cascade = detach
try {
    apiInstance.deleteBundleTemplateUsingDELETE(id, cascade);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreBundlesApi#deleteBundleTemplateUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **cascade** | **String**| force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="deleteStoreItemUsingDELETE"></a>
# **deleteStoreItemUsingDELETE**
> deleteStoreItemUsingDELETE(id)

Delete a bundle item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreBundlesApi;


StoreBundlesApi apiInstance = new StoreBundlesApi();
Integer id = 56; // Integer | The id of the bundle
try {
    apiInstance.deleteStoreItemUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreBundlesApi#deleteStoreItemUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the bundle |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="getBundleTemplateUsingGET"></a>
# **getBundleTemplateUsingGET**
> ItemTemplateResource getBundleTemplateUsingGET(id)

Get a single bundle template

Bundle Templates define a type of bundle and the properties they have.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreBundlesApi;


StoreBundlesApi apiInstance = new StoreBundlesApi();
String id = "id_example"; // String | The id of the template
try {
    ItemTemplateResource result = apiInstance.getBundleTemplateUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreBundlesApi#getBundleTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |

### Return type

[**ItemTemplateResource**](ItemTemplateResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="getBundleTemplatesUsingGET"></a>
# **getBundleTemplatesUsingGET**
> PageItemTemplateResource getBundleTemplatesUsingGET(size, page, order)

List and search bundle templates

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreBundlesApi;


StoreBundlesApi apiInstance = new StoreBundlesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "1"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageItemTemplateResource result = apiInstance.getBundleTemplatesUsingGET(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreBundlesApi#getBundleTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to 1]

### Return type

[**PageItemTemplateResource**](PageItemTemplateResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="getStoreItemUsingGET"></a>
# **getStoreItemUsingGET**
> BundleItem getStoreItemUsingGET(id)

Get a single bundle item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreBundlesApi;


StoreBundlesApi apiInstance = new StoreBundlesApi();
Integer id = 56; // Integer | The id of the bundle
try {
    BundleItem result = apiInstance.getStoreItemUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreBundlesApi#getStoreItemUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the bundle |

### Return type

[**BundleItem**](BundleItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="updateBundleItemUsingPUT"></a>
# **updateBundleItemUsingPUT**
> updateBundleItemUsingPUT(id, bundleItem)

Update a bundle item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreBundlesApi;


StoreBundlesApi apiInstance = new StoreBundlesApi();
Integer id = 56; // Integer | The id of the bundle
BundleItem bundleItem = new BundleItem(); // BundleItem | The bundle item object
try {
    apiInstance.updateBundleItemUsingPUT(id, bundleItem);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreBundlesApi#updateBundleItemUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the bundle |
 **bundleItem** | [**BundleItem**](BundleItem.md)| The bundle item object | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="updateBundleTemplateUsingPUT"></a>
# **updateBundleTemplateUsingPUT**
> updateBundleTemplateUsingPUT(id, bundleTemplateResource)

Update a bundle template

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreBundlesApi;


StoreBundlesApi apiInstance = new StoreBundlesApi();
String id = "id_example"; // String | The id of the template
ItemTemplateResource bundleTemplateResource = new ItemTemplateResource(); // ItemTemplateResource | The bundle template resource object
try {
    apiInstance.updateBundleTemplateUsingPUT(id, bundleTemplateResource);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreBundlesApi#updateBundleTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **bundleTemplateResource** | [**ItemTemplateResource**](ItemTemplateResource.md)| The bundle template resource object | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

