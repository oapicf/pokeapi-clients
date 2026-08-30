# GamesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generation_list**](GamesApi.md#generation_list) | **GET** /api/v2/generation/ | List genrations
[**generation_retrieve**](GamesApi.md#generation_retrieve) | **GET** /api/v2/generation/{id}/ | Get genration
[**pokedex_list**](GamesApi.md#pokedex_list) | **GET** /api/v2/pokedex/ | List pokedex
[**pokedex_retrieve**](GamesApi.md#pokedex_retrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
[**version_group_list**](GamesApi.md#version_group_list) | **GET** /api/v2/version-group/ | List version groups
[**version_group_retrieve**](GamesApi.md#version_group_retrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
[**version_list**](GamesApi.md#version_list) | **GET** /api/v2/version/ | List versions
[**version_retrieve**](GamesApi.md#version_retrieve) | **GET** /api/v2/version/{id}/ | Get version


# **generation_list**
> `generation_list`(_api::`GamesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedGenerationSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `generation_list`(_api::`GamesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedGenerationSummaryList` }, `OpenAPI.Clients.ApiResponse`

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`GamesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedGenerationSummaryList`**](PaginatedGenerationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generation_retrieve**
> `generation_retrieve`(_api::`GamesApi`, `id`::`String`; _mediaType=nothing) -> `GenerationDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `generation_retrieve`(_api::`GamesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `GenerationDetail` }, `OpenAPI.Clients.ApiResponse`

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`GamesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`GenerationDetail`**](GenerationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokedex_list**
> `pokedex_list`(_api::`GamesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedPokedexSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokedex_list`(_api::`GamesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedPokedexSummaryList` }, `OpenAPI.Clients.ApiResponse`

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`GamesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedPokedexSummaryList`**](PaginatedPokedexSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokedex_retrieve**
> `pokedex_retrieve`(_api::`GamesApi`, `id`::`String`; _mediaType=nothing) -> `PokedexDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokedex_retrieve`(_api::`GamesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `PokedexDetail` }, `OpenAPI.Clients.ApiResponse`

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`GamesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`PokedexDetail`**](PokedexDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **version_group_list**
> `version_group_list`(_api::`GamesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedVersionGroupSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `version_group_list`(_api::`GamesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedVersionGroupSummaryList` }, `OpenAPI.Clients.ApiResponse`

List version groups

Version groups categorize highly similar versions of the games.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`GamesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedVersionGroupSummaryList`**](PaginatedVersionGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **version_group_retrieve**
> `version_group_retrieve`(_api::`GamesApi`, `id`::`String`; _mediaType=nothing) -> `VersionGroupDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `version_group_retrieve`(_api::`GamesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `VersionGroupDetail` }, `OpenAPI.Clients.ApiResponse`

Get version group

Version groups categorize highly similar versions of the games.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`GamesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`VersionGroupDetail`**](VersionGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **version_list**
> `version_list`(_api::`GamesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedVersionSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `version_list`(_api::`GamesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedVersionSummaryList` }, `OpenAPI.Clients.ApiResponse`

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`GamesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedVersionSummaryList`**](PaginatedVersionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **version_retrieve**
> `version_retrieve`(_api::`GamesApi`, `id`::`String`; _mediaType=nothing) -> `VersionDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `version_retrieve`(_api::`GamesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `VersionDetail` }, `OpenAPI.Clients.ApiResponse`

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`GamesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`VersionDetail`**](VersionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

