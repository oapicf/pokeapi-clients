# ContestEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestEffectList**](ContestEffectApi.md#contestEffectList) | **GET** /api/v2/contest-effect/ | 
[**contestEffectRead**](ContestEffectApi.md#contestEffectRead) | **GET** /api/v2/contest-effect/{id}/ | 



## contestEffectList

> String contestEffectList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ContestEffectApi;

ContestEffectApi apiInstance = new ContestEffectApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.contestEffectList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContestEffectApi#contestEffectList");
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


## contestEffectRead

> String contestEffectRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ContestEffectApi;

ContestEffectApi apiInstance = new ContestEffectApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.contestEffectRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContestEffectApi#contestEffectRead");
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

