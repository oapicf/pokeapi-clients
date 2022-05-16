# VersionApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionList**](VersionApi.md#versionList) | **GET** /api/v2/version/ | 
[**versionRead**](VersionApi.md#versionRead) | **GET** /api/v2/version/{id}/ | 



## versionList

> String versionList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.VersionApi;

VersionApi apiInstance = new VersionApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.versionList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionApi#versionList");
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


## versionRead

> String versionRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.VersionApi;

VersionApi apiInstance = new VersionApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.versionRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionApi#versionRead");
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

