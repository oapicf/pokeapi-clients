# PokeathlonStatApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokeathlonStatList**](PokeathlonStatApi.md#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | 
[**pokeathlonStatRead**](PokeathlonStatApi.md#pokeathlonStatRead) | **GET** /api/v2/pokeathlon-stat/{id}/ | 



## pokeathlonStatList

> String pokeathlonStatList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokeathlonStatApi;

PokeathlonStatApi apiInstance = new PokeathlonStatApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.pokeathlonStatList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokeathlonStatApi#pokeathlonStatList");
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


## pokeathlonStatRead

> String pokeathlonStatRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokeathlonStatApi;

PokeathlonStatApi apiInstance = new PokeathlonStatApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.pokeathlonStatRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokeathlonStatApi#pokeathlonStatRead");
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

