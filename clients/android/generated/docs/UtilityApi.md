# UtilityApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageList**](UtilityApi.md#languageList) | **GET** /api/v2/language/ | List languages
[**languageRetrieve**](UtilityApi.md#languageRetrieve) | **GET** /api/v2/language/{id}/ | Get language



## languageList

> PaginatedLanguageSummaryList languageList(limit, offset, q)

List languages

Languages for translations of API resource information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UtilityApi;

UtilityApi apiInstance = new UtilityApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedLanguageSummaryList result = apiInstance.languageList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilityApi#languageList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedLanguageSummaryList**](PaginatedLanguageSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## languageRetrieve

> LanguageDetail languageRetrieve(id)

Get language

Languages for translations of API resource information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UtilityApi;

UtilityApi apiInstance = new UtilityApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    LanguageDetail result = apiInstance.languageRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilityApi#languageRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**LanguageDetail**](LanguageDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

