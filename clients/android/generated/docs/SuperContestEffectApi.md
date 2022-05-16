# SuperContestEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**superContestEffectList**](SuperContestEffectApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
[**superContestEffectRead**](SuperContestEffectApi.md#superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 



## superContestEffectList

> String superContestEffectList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SuperContestEffectApi;

SuperContestEffectApi apiInstance = new SuperContestEffectApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.superContestEffectList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuperContestEffectApi#superContestEffectList");
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


## superContestEffectRead

> String superContestEffectRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.SuperContestEffectApi;

SuperContestEffectApi apiInstance = new SuperContestEffectApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.superContestEffectRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuperContestEffectApi#superContestEffectRead");
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

