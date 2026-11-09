# UtilityApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**languageList**](UtilityApi.md#languageList) | **GET** /api/v2/language/ | List languages |
| [**languageRetrieve**](UtilityApi.md#languageRetrieve) | **GET** /api/v2/language/{id}/ | Get language |
| [**metaRetrieve**](UtilityApi.md#metaRetrieve) | **GET** /api/v2/meta/ | Get API metadata |


<a name="languageList"></a>
# **languageList**
> PaginatedLanguageSummaryList languageList(limit, offset, q)

List languages

    Languages for translations of API resource information.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedLanguageSummaryList**](../Models/PaginatedLanguageSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="languageRetrieve"></a>
# **languageRetrieve**
> LanguageDetail languageRetrieve(id)

Get language

    Languages for translations of API resource information.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**LanguageDetail**](../Models/LanguageDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="metaRetrieve"></a>
# **metaRetrieve**
> PokeapiMetaResponse metaRetrieve()

Get API metadata

    Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).

### Parameters
This endpoint does not need any parameter.

### Return type

[**PokeapiMetaResponse**](../Models/PokeapiMetaResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

