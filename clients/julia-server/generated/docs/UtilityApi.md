# UtilityApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**language_list**](UtilityApi.md#language_list) | **GET** /api/v2/language/ | List languages
[**language_retrieve**](UtilityApi.md#language_retrieve) | **GET** /api/v2/language/{id}/ | Get language
[**meta_retrieve**](UtilityApi.md#meta_retrieve) | **GET** /api/v2/meta/ | Get API metadata


# **language_list**
> `language_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedLanguageSummaryList`

List languages

Languages for translations of API resource information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedLanguageSummaryList`**](PaginatedLanguageSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **language_retrieve**
> `language_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `LanguageDetail`

Get language

Languages for translations of API resource information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`LanguageDetail`**](LanguageDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **meta_retrieve**
> `meta_retrieve`(req::`HTTP.Request`;) -> `PokeapiMetaResponse`

Get API metadata

Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**`PokeapiMetaResponse`**](PokeapiMetaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

