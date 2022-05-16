# ItemFlingEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemFlingEffectList**](ItemFlingEffectApi.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | 
[**itemFlingEffectRead**](ItemFlingEffectApi.md#itemFlingEffectRead) | **GET** /api/v2/item-fling-effect/{id}/ | 



## itemFlingEffectList

> String itemFlingEffectList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemFlingEffectApi;

ItemFlingEffectApi apiInstance = new ItemFlingEffectApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.itemFlingEffectList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemFlingEffectApi#itemFlingEffectList");
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


## itemFlingEffectRead

> String itemFlingEffectRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemFlingEffectApi;

ItemFlingEffectApi apiInstance = new ItemFlingEffectApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.itemFlingEffectRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemFlingEffectApi#itemFlingEffectRead");
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

