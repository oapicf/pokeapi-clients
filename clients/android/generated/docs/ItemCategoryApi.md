# ItemCategoryApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemCategoryList**](ItemCategoryApi.md#itemCategoryList) | **GET** /api/v2/item-category/ | 
[**itemCategoryRead**](ItemCategoryApi.md#itemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 



## itemCategoryList

> String itemCategoryList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.itemCategoryList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryList");
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


## itemCategoryRead

> String itemCategoryRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.itemCategoryRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryRead");
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

