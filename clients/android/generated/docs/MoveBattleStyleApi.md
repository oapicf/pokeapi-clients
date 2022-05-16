# MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveBattleStyleList**](MoveBattleStyleApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | 
[**moveBattleStyleRead**](MoveBattleStyleApi.md#moveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 



## moveBattleStyleList

> String moveBattleStyleList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveBattleStyleApi;

MoveBattleStyleApi apiInstance = new MoveBattleStyleApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.moveBattleStyleList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveBattleStyleApi#moveBattleStyleList");
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


## moveBattleStyleRead

> String moveBattleStyleRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveBattleStyleApi;

MoveBattleStyleApi apiInstance = new MoveBattleStyleApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.moveBattleStyleRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveBattleStyleApi#moveBattleStyleRead");
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

