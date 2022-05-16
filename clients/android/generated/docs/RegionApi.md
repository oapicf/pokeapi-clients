# RegionApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**regionList**](RegionApi.md#regionList) | **GET** /api/v2/region/ | 
[**regionRead**](RegionApi.md#regionRead) | **GET** /api/v2/region/{id}/ | 



## regionList

> String regionList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.RegionApi;

RegionApi apiInstance = new RegionApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.regionList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegionApi#regionList");
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


## regionRead

> String regionRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.RegionApi;

RegionApi apiInstance = new RegionApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.regionRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegionApi#regionRead");
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

