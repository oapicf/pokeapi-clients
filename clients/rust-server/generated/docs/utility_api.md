# utility_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
**language_list**](utility_api.md#language_list) | **GET** /api/v2/language/ | List languages
**meta_retrieve**](utility_api.md#meta_retrieve) | **GET** /api/v2/meta/ | Get API metadata
**language_retrieve**](utility_api.md#language_retrieve) | **GET** /api/v2/language/{id}/ | Get language


# **language_list**
> models::PaginatedLanguageSummaryList language_list(optional)
List languages

Languages for translations of API resource information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **i32**| Number of results to return per page. | 
 **offset** | **i32**| The initial index from which to return the results. | 
 **q** | **String**| > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  | 

### Return type

[**models::PaginatedLanguageSummaryList**](PaginatedLanguageSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **meta_retrieve**
> models::PokeapiMetaResponse meta_retrieve()
Get API metadata

Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**models::PokeapiMetaResponse**](PokeapiMetaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **language_retrieve**
> models::LanguageDetail language_retrieve(id)
Get language

Languages for translations of API resource information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**models::LanguageDetail**](LanguageDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

