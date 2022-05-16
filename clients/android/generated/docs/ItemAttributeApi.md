# ItemAttributeApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemAttributeList**](ItemAttributeApi.md#itemAttributeList) | **GET** /api/v2/item-attribute/ | 
[**itemAttributeRead**](ItemAttributeApi.md#itemAttributeRead) | **GET** /api/v2/item-attribute/{id}/ | 



## itemAttributeList

> String itemAttributeList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemAttributeApi;

ItemAttributeApi apiInstance = new ItemAttributeApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.itemAttributeList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAttributeApi#itemAttributeList");
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


## itemAttributeRead

> String itemAttributeRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemAttributeApi;

ItemAttributeApi apiInstance = new ItemAttributeApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.itemAttributeRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemAttributeApi#itemAttributeRead");
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

