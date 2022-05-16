# NatureApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**natureList**](NatureApi.md#natureList) | **GET** /api/v2/nature/ | 
[**natureRead**](NatureApi.md#natureRead) | **GET** /api/v2/nature/{id}/ | 



## natureList

> String natureList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.NatureApi;

NatureApi apiInstance = new NatureApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.natureList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NatureApi#natureList");
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


## natureRead

> String natureRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.NatureApi;

NatureApi apiInstance = new NatureApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.natureRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NatureApi#natureRead");
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

