# UTILITY_API

All URIs are relative to *https://pokeapi.co*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**language_list**](UTILITY_API.md#language_list) | **Get** /api/v2/language/ | List languages
[**language_retrieve**](UTILITY_API.md#language_retrieve) | **Get** /api/v2/language/{id}/ | Get language
[**meta_retrieve**](UTILITY_API.md#meta_retrieve) | **Get** /api/v2/meta/ | Get API metadata


# **language_list**
> language_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_LANGUAGE_SUMMARY_LIST


List languages

Languages for translations of API resource information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_LANGUAGE_SUMMARY_LIST**](PaginatedLanguageSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **language_retrieve**
> language_retrieve (id: STRING_32 ): detachable LANGUAGE_DETAIL


Get language

Languages for translations of API resource information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**LANGUAGE_DETAIL**](LanguageDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **meta_retrieve**
> meta_retrieve : detachable POKEAPI_META_RESPONSE


Get API metadata

Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).


### Parameters
This endpoint does not need any parameter.

### Return type

[**POKEAPI_META_RESPONSE**](PokeapiMetaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

