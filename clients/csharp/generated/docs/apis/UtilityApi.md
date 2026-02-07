# Org.OpenAPITools.Api.UtilityApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**LanguageList**](UtilityApi.md#languagelist) | **GET** /api/v2/language/ | List languages |
| [**LanguageRetrieve**](UtilityApi.md#languageretrieve) | **GET** /api/v2/language/{id}/ | Get language |

<a id="languagelist"></a>
# **LanguageList**
> PaginatedLanguageSummaryList LanguageList (int limit = null, int offset = null, string q = null)

List languages

Languages for translations of API resource information.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedLanguageSummaryList**](PaginatedLanguageSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="languageretrieve"></a>
# **LanguageRetrieve**
> LanguageDetail LanguageRetrieve (string id)

Get language

Languages for translations of API resource information.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**LanguageDetail**](LanguageDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

