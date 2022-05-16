# MoveApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveList**](MoveApi.md#moveList) | **GET** /api/v2/move/ | 
[**moveRead**](MoveApi.md#moveRead) | **GET** /api/v2/move/{id}/ | 



## moveList

> String moveList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveApi;

MoveApi apiInstance = new MoveApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.moveList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveApi#moveList");
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


## moveRead

> String moveRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveApi;

MoveApi apiInstance = new MoveApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.moveRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveApi#moveRead");
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

