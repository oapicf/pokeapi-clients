# ItemApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemList**](ItemApi.md#itemList) | **GET** /api/v2/item/ | 
[**itemRead**](ItemApi.md#itemRead) | **GET** /api/v2/item/{id}/ | 



## itemList

> String itemList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.itemList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemList");
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


## itemRead

> String itemRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.itemRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemRead");
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

