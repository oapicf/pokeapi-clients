# MoveTargetApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveTargetList**](MoveTargetApi.md#moveTargetList) | **GET** /api/v2/move-target/ | 
[**moveTargetRead**](MoveTargetApi.md#moveTargetRead) | **GET** /api/v2/move-target/{id}/ | 



## moveTargetList

> String moveTargetList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveTargetApi;

MoveTargetApi apiInstance = new MoveTargetApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.moveTargetList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveTargetApi#moveTargetList");
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


## moveTargetRead

> String moveTargetRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveTargetApi;

MoveTargetApi apiInstance = new MoveTargetApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.moveTargetRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveTargetApi#moveTargetRead");
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

