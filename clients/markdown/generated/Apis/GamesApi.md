# GamesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generationList**](GamesApi.md#generationList) | **GET** /api/v2/generation/ | List genrations |
| [**generationRetrieve**](GamesApi.md#generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration |
| [**pokedexList**](GamesApi.md#pokedexList) | **GET** /api/v2/pokedex/ | List pokedex |
| [**pokedexRetrieve**](GamesApi.md#pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex |
| [**versionGroupList**](GamesApi.md#versionGroupList) | **GET** /api/v2/version-group/ | List version groups |
| [**versionGroupRetrieve**](GamesApi.md#versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group |
| [**versionList**](GamesApi.md#versionList) | **GET** /api/v2/version/ | List versions |
| [**versionRetrieve**](GamesApi.md#versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version |


<a name="generationList"></a>
# **generationList**
> PaginatedGenerationSummaryList generationList(limit, offset, q)

List genrations

    A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedGenerationSummaryList**](../Models/PaginatedGenerationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="generationRetrieve"></a>
# **generationRetrieve**
> GenerationDetail generationRetrieve(id)

Get genration

    A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**GenerationDetail**](../Models/GenerationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokedexList"></a>
# **pokedexList**
> PaginatedPokedexSummaryList pokedexList(limit, offset, q)

List pokedex

    A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedPokedexSummaryList**](../Models/PaginatedPokedexSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokedexRetrieve"></a>
# **pokedexRetrieve**
> PokedexDetail pokedexRetrieve(id)

Get pokedex

    A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**PokedexDetail**](../Models/PokedexDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="versionGroupList"></a>
# **versionGroupList**
> PaginatedVersionGroupSummaryList versionGroupList(limit, offset, q)

List version groups

    Version groups categorize highly similar versions of the games.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedVersionGroupSummaryList**](../Models/PaginatedVersionGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="versionGroupRetrieve"></a>
# **versionGroupRetrieve**
> VersionGroupDetail versionGroupRetrieve(id)

Get version group

    Version groups categorize highly similar versions of the games.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**VersionGroupDetail**](../Models/VersionGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="versionList"></a>
# **versionList**
> PaginatedVersionSummaryList versionList(limit, offset, q)

List versions

    Versions of the games, e.g., Red, Blue or Yellow.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedVersionSummaryList**](../Models/PaginatedVersionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="versionRetrieve"></a>
# **versionRetrieve**
> VersionDetail versionRetrieve(id)

Get version

    Versions of the games, e.g., Red, Blue or Yellow.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**VersionDetail**](../Models/VersionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

