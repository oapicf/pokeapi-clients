# GenderApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genderList**](GenderApi.md#genderList) | **GET** /api/v2/gender/ | 
[**genderRead**](GenderApi.md#genderRead) | **GET** /api/v2/gender/{id}/ | 



## genderList

> String genderList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.GenderApi;

GenderApi apiInstance = new GenderApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.genderList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenderApi#genderList");
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


## genderRead

> String genderRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.GenderApi;

GenderApi apiInstance = new GenderApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.genderRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenderApi#genderRead");
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

