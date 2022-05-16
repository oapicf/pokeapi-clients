# VersionGroupApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionGroupList**](VersionGroupApi.md#versionGroupList) | **GET** /api/v2/version-group/ | 
[**versionGroupRead**](VersionGroupApi.md#versionGroupRead) | **GET** /api/v2/version-group/{id}/ | 



## versionGroupList

> String versionGroupList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.VersionGroupApi;

VersionGroupApi apiInstance = new VersionGroupApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.versionGroupList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionGroupApi#versionGroupList");
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


## versionGroupRead

> String versionGroupRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.VersionGroupApi;

VersionGroupApi apiInstance = new VersionGroupApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.versionGroupRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionGroupApi#versionGroupRead");
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

