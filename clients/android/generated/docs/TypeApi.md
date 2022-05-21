# TypeApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**typeList**](TypeApi.md#typeList) | **GET** /api/v2/type/ | 
[**typeRead**](TypeApi.md#typeRead) | **GET** /api/v2/type/{id}/ | 



## typeList

> String typeList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.TypeApi;

TypeApi apiInstance = new TypeApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.typeList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TypeApi#typeList");
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


## typeRead

> String typeRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.TypeApi;

TypeApi apiInstance = new TypeApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.typeRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TypeApi#typeRead");
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

