# EggGroupApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eggGroupList**](EggGroupApi.md#eggGroupList) | **GET** /api/v2/egg-group/ | 
[**eggGroupRead**](EggGroupApi.md#eggGroupRead) | **GET** /api/v2/egg-group/{id}/ | 



## eggGroupList

> String eggGroupList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EggGroupApi;

EggGroupApi apiInstance = new EggGroupApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.eggGroupList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EggGroupApi#eggGroupList");
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


## eggGroupRead

> String eggGroupRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.EggGroupApi;

EggGroupApi apiInstance = new EggGroupApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.eggGroupRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EggGroupApi#eggGroupRead");
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

