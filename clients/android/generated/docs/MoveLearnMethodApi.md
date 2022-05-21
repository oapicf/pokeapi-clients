# MoveLearnMethodApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveLearnMethodList**](MoveLearnMethodApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | 
[**moveLearnMethodRead**](MoveLearnMethodApi.md#moveLearnMethodRead) | **GET** /api/v2/move-learn-method/{id}/ | 



## moveLearnMethodList

> String moveLearnMethodList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveLearnMethodApi;

MoveLearnMethodApi apiInstance = new MoveLearnMethodApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.moveLearnMethodList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveLearnMethodApi#moveLearnMethodList");
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


## moveLearnMethodRead

> String moveLearnMethodRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveLearnMethodApi;

MoveLearnMethodApi apiInstance = new MoveLearnMethodApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.moveLearnMethodRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveLearnMethodApi#moveLearnMethodRead");
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

