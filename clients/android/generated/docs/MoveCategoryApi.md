# MoveCategoryApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveCategoryList**](MoveCategoryApi.md#moveCategoryList) | **GET** /api/v2/move-category/ | 
[**moveCategoryRead**](MoveCategoryApi.md#moveCategoryRead) | **GET** /api/v2/move-category/{id}/ | 



## moveCategoryList

> String moveCategoryList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveCategoryApi;

MoveCategoryApi apiInstance = new MoveCategoryApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.moveCategoryList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveCategoryApi#moveCategoryList");
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


## moveCategoryRead

> String moveCategoryRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.MoveCategoryApi;

MoveCategoryApi apiInstance = new MoveCategoryApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.moveCategoryRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoveCategoryApi#moveCategoryRead");
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

