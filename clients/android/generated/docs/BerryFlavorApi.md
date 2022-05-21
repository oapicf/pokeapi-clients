# BerryFlavorApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFlavorList**](BerryFlavorApi.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | 
[**berryFlavorRead**](BerryFlavorApi.md#berryFlavorRead) | **GET** /api/v2/berry-flavor/{id}/ | 



## berryFlavorList

> String berryFlavorList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.BerryFlavorApi;

BerryFlavorApi apiInstance = new BerryFlavorApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.berryFlavorList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BerryFlavorApi#berryFlavorList");
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


## berryFlavorRead

> String berryFlavorRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.BerryFlavorApi;

BerryFlavorApi apiInstance = new BerryFlavorApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.berryFlavorRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BerryFlavorApi#berryFlavorRead");
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

