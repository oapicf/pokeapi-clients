# GenerationApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](GenerationApi.md#generationList) | **GET** /api/v2/generation/ | 
[**generationRead**](GenerationApi.md#generationRead) | **GET** /api/v2/generation/{id}/ | 



## generationList

> String generationList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.GenerationApi;

GenerationApi apiInstance = new GenerationApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.generationList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerationApi#generationList");
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


## generationRead

> String generationRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.GenerationApi;

GenerationApi apiInstance = new GenerationApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.generationRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerationApi#generationRead");
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

