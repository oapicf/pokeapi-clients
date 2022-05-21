# PalParkAreaApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**palParkAreaList**](PalParkAreaApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | 
[**palParkAreaRead**](PalParkAreaApi.md#palParkAreaRead) | **GET** /api/v2/pal-park-area/{id}/ | 



## palParkAreaList

> String palParkAreaList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PalParkAreaApi;

PalParkAreaApi apiInstance = new PalParkAreaApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.palParkAreaList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalParkAreaApi#palParkAreaList");
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


## palParkAreaRead

> String palParkAreaRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PalParkAreaApi;

PalParkAreaApi apiInstance = new PalParkAreaApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.palParkAreaRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PalParkAreaApi#palParkAreaRead");
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

