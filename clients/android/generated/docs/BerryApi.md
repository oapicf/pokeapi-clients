# BerryApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryList**](BerryApi.md#berryList) | **GET** /api/v2/berry/ | 
[**berryRead**](BerryApi.md#berryRead) | **GET** /api/v2/berry/{id}/ | 



## berryList

> String berryList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.BerryApi;

BerryApi apiInstance = new BerryApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.berryList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BerryApi#berryList");
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


## berryRead

> String berryRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.BerryApi;

BerryApi apiInstance = new BerryApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.berryRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BerryApi#berryRead");
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

