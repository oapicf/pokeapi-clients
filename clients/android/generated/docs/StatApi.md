# StatApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statList**](StatApi.md#statList) | **GET** /api/v2/stat/ | 
[**statRead**](StatApi.md#statRead) | **GET** /api/v2/stat/{id}/ | 



## statList

> String statList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.StatApi;

StatApi apiInstance = new StatApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.statList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatApi#statList");
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


## statRead

> String statRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.StatApi;

StatApi apiInstance = new StatApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.statRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatApi#statRead");
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

