# LocationAreaApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationAreaList**](LocationAreaApi.md#locationAreaList) | **GET** /api/v2/location-area/ | 
[**locationAreaRead**](LocationAreaApi.md#locationAreaRead) | **GET** /api/v2/location-area/{id}/ | 



## locationAreaList

> String locationAreaList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationAreaApi;

LocationAreaApi apiInstance = new LocationAreaApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.locationAreaList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAreaApi#locationAreaList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to null]
 **offset** | **Integer**|  | [optional] [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


## locationAreaRead

> String locationAreaRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationAreaApi;

LocationAreaApi apiInstance = new LocationAreaApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.locationAreaRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAreaApi#locationAreaRead");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  | [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

