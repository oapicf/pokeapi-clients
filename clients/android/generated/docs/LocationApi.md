# LocationApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationList**](LocationApi.md#locationList) | **GET** /api/v2/location/ | 
[**locationRead**](LocationApi.md#locationRead) | **GET** /api/v2/location/{id}/ | 



## locationList

> String locationList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.locationList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationList");
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


## locationRead

> String locationRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.LocationApi;

LocationApi apiInstance = new LocationApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.locationRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#locationRead");
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

