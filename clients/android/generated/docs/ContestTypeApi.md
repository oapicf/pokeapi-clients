# ContestTypeApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestTypeList**](ContestTypeApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | 
[**contestTypeRead**](ContestTypeApi.md#contestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 



## contestTypeList

> String contestTypeList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ContestTypeApi;

ContestTypeApi apiInstance = new ContestTypeApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.contestTypeList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContestTypeApi#contestTypeList");
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


## contestTypeRead

> String contestTypeRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ContestTypeApi;

ContestTypeApi apiInstance = new ContestTypeApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.contestTypeRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContestTypeApi#contestTypeRead");
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

