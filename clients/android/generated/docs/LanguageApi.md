# LanguageApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageList**](LanguageApi.md#languageList) | **GET** /api/v2/language/ | 
[**languageRead**](LanguageApi.md#languageRead) | **GET** /api/v2/language/{id}/ | 



## languageList

> String languageList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.LanguageApi;

LanguageApi apiInstance = new LanguageApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.languageList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageApi#languageList");
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


## languageRead

> String languageRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.LanguageApi;

LanguageApi apiInstance = new LanguageApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.languageRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageApi#languageRead");
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

