# .GamesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](GamesApi.md#generationList) | **GET** /api/v2/generation/ | List genrations
[**generationRetrieve**](GamesApi.md#generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration
[**pokedexList**](GamesApi.md#pokedexList) | **GET** /api/v2/pokedex/ | List pokedex
[**pokedexRetrieve**](GamesApi.md#pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
[**versionGroupList**](GamesApi.md#versionGroupList) | **GET** /api/v2/version-group/ | List version groups
[**versionGroupRetrieve**](GamesApi.md#versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
[**versionList**](GamesApi.md#versionList) | **GET** /api/v2/version/ | List versions
[**versionRetrieve**](GamesApi.md#versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version


# **generationList**
> PaginatedGenerationSummaryList generationList()

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example


```typescript
import { createConfiguration, GamesApi } from '';
import type { GamesApiGenerationListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GamesApi(configuration);

const request: GamesApiGenerationListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.generationList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedGenerationSummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generationRetrieve**
> GenerationDetail generationRetrieve()

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example


```typescript
import { createConfiguration, GamesApi } from '';
import type { GamesApiGenerationRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GamesApi(configuration);

const request: GamesApiGenerationRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.generationRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**GenerationDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pokedexList**
> PaginatedPokedexSummaryList pokedexList()

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example


```typescript
import { createConfiguration, GamesApi } from '';
import type { GamesApiPokedexListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GamesApi(configuration);

const request: GamesApiPokedexListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.pokedexList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedPokedexSummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pokedexRetrieve**
> PokedexDetail pokedexRetrieve()

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example


```typescript
import { createConfiguration, GamesApi } from '';
import type { GamesApiPokedexRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GamesApi(configuration);

const request: GamesApiPokedexRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.pokedexRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**PokedexDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **versionGroupList**
> PaginatedVersionGroupSummaryList versionGroupList()

Version groups categorize highly similar versions of the games.

### Example


```typescript
import { createConfiguration, GamesApi } from '';
import type { GamesApiVersionGroupListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GamesApi(configuration);

const request: GamesApiVersionGroupListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.versionGroupList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedVersionGroupSummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **versionGroupRetrieve**
> VersionGroupDetail versionGroupRetrieve()

Version groups categorize highly similar versions of the games.

### Example


```typescript
import { createConfiguration, GamesApi } from '';
import type { GamesApiVersionGroupRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GamesApi(configuration);

const request: GamesApiVersionGroupRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.versionGroupRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**VersionGroupDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **versionList**
> PaginatedVersionSummaryList versionList()

Versions of the games, e.g., Red, Blue or Yellow.

### Example


```typescript
import { createConfiguration, GamesApi } from '';
import type { GamesApiVersionListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GamesApi(configuration);

const request: GamesApiVersionListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.versionList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedVersionSummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **versionRetrieve**
> VersionDetail versionRetrieve()

Versions of the games, e.g., Red, Blue or Yellow.

### Example


```typescript
import { createConfiguration, GamesApi } from '';
import type { GamesApiVersionRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GamesApi(configuration);

const request: GamesApiVersionRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.versionRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**VersionDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


