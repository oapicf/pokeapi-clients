# GrowthRateApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**growthRateList**](GrowthRateApi.md#growthRateList) | **GET** /api/v2/growth-rate/ | 
[**growthRateRead**](GrowthRateApi.md#growthRateRead) | **GET** /api/v2/growth-rate/{id}/ | 



## growthRateList

> String growthRateList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.GrowthRateApi;

GrowthRateApi apiInstance = new GrowthRateApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.growthRateList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrowthRateApi#growthRateList");
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


## growthRateRead

> String growthRateRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.GrowthRateApi;

GrowthRateApi apiInstance = new GrowthRateApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.growthRateRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrowthRateApi#growthRateRead");
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

