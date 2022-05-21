# MoveAilmentApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](MoveAilmentApi.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | 
[**moveAilmentRead**](MoveAilmentApi.md#moveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ | 



## moveAilmentList

> String moveAilmentList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveAilmentApi;

MoveAilmentApi apiInstance = new MoveAilmentApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.moveAilmentList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveAilmentApi#moveAilmentList");
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


## moveAilmentRead

> String moveAilmentRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveAilmentApi;

MoveAilmentApi apiInstance = new MoveAilmentApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.moveAilmentRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveAilmentApi#moveAilmentRead");
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

