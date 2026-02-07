# GAMES_API

All URIs are relative to *https://pokeapi.co*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**generation_list**](GAMES_API.md#generation_list) | **Get** /api/v2/generation/ | List genrations
[**generation_retrieve**](GAMES_API.md#generation_retrieve) | **Get** /api/v2/generation/{id}/ | Get genration
[**pokedex_list**](GAMES_API.md#pokedex_list) | **Get** /api/v2/pokedex/ | List pokedex
[**pokedex_retrieve**](GAMES_API.md#pokedex_retrieve) | **Get** /api/v2/pokedex/{id}/ | Get pokedex
[**version_group_list**](GAMES_API.md#version_group_list) | **Get** /api/v2/version-group/ | List version groups
[**version_group_retrieve**](GAMES_API.md#version_group_retrieve) | **Get** /api/v2/version-group/{id}/ | Get version group
[**version_list**](GAMES_API.md#version_list) | **Get** /api/v2/version/ | List versions
[**version_retrieve**](GAMES_API.md#version_retrieve) | **Get** /api/v2/version/{id}/ | Get version


# **generation_list**
> generation_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_GENERATION_SUMMARY_LIST


List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_GENERATION_SUMMARY_LIST**](PaginatedGenerationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generation_retrieve**
> generation_retrieve (id: STRING_32 ): detachable GENERATION_DETAIL


Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**GENERATION_DETAIL**](GenerationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokedex_list**
> pokedex_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_POKEDEX_SUMMARY_LIST


List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_POKEDEX_SUMMARY_LIST**](PaginatedPokedexSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokedex_retrieve**
> pokedex_retrieve (id: STRING_32 ): detachable POKEDEX_DETAIL


Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**POKEDEX_DETAIL**](PokedexDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version_group_list**
> version_group_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_VERSION_GROUP_SUMMARY_LIST


List version groups

Version groups categorize highly similar versions of the games.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_VERSION_GROUP_SUMMARY_LIST**](PaginatedVersionGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version_group_retrieve**
> version_group_retrieve (id: STRING_32 ): detachable VERSION_GROUP_DETAIL


Get version group

Version groups categorize highly similar versions of the games.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**VERSION_GROUP_DETAIL**](VersionGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version_list**
> version_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_VERSION_SUMMARY_LIST


List versions

Versions of the games, e.g., Red, Blue or Yellow.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_VERSION_SUMMARY_LIST**](PaginatedVersionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **version_retrieve**
> version_retrieve (id: STRING_32 ): detachable VERSION_DETAIL


Get version

Versions of the games, e.g., Red, Blue or Yellow.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**VERSION_DETAIL**](VersionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

