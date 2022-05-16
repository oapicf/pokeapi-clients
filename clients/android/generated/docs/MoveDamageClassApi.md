# MoveDamageClassApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveDamageClassList**](MoveDamageClassApi.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | 
[**moveDamageClassRead**](MoveDamageClassApi.md#moveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ | 



## moveDamageClassList

> String moveDamageClassList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveDamageClassApi;

MoveDamageClassApi apiInstance = new MoveDamageClassApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.moveDamageClassList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveDamageClassApi#moveDamageClassList");
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


## moveDamageClassRead

> String moveDamageClassRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveDamageClassApi;

MoveDamageClassApi apiInstance = new MoveDamageClassApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.moveDamageClassRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveDamageClassApi#moveDamageClassRead");
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

