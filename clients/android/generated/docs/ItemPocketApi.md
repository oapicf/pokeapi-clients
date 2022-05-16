# ItemPocketApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemPocketList**](ItemPocketApi.md#itemPocketList) | **GET** /api/v2/item-pocket/ | 
[**itemPocketRead**](ItemPocketApi.md#itemPocketRead) | **GET** /api/v2/item-pocket/{id}/ | 



## itemPocketList

> String itemPocketList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemPocketApi;

ItemPocketApi apiInstance = new ItemPocketApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.itemPocketList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemPocketApi#itemPocketList");
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


## itemPocketRead

> String itemPocketRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemPocketApi;

ItemPocketApi apiInstance = new ItemPocketApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.itemPocketRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemPocketApi#itemPocketRead");
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

