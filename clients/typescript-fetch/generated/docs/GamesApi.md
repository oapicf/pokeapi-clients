# GamesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generationList**](GamesApi.md#generationlist) | **GET** /api/v2/generation/ | List genrations |
| [**generationRetrieve**](GamesApi.md#generationretrieve) | **GET** /api/v2/generation/{id}/ | Get genration |
| [**pokedexList**](GamesApi.md#pokedexlist) | **GET** /api/v2/pokedex/ | List pokedex |
| [**pokedexRetrieve**](GamesApi.md#pokedexretrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex |
| [**versionGroupList**](GamesApi.md#versiongrouplist) | **GET** /api/v2/version-group/ | List version groups |
| [**versionGroupRetrieve**](GamesApi.md#versiongroupretrieve) | **GET** /api/v2/version-group/{id}/ | Get version group |
| [**versionList**](GamesApi.md#versionlist) | **GET** /api/v2/version/ | List versions |
| [**versionRetrieve**](GamesApi.md#versionretrieve) | **GET** /api/v2/version/{id}/ | Get version |



## generationList

> PaginatedGenerationSummaryList generationList(limit, offset, q)

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example

```ts
import {
  Configuration,
  GamesApi,
} from '';
import type { GenerationListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new GamesApi(config);

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies GenerationListRequest;

  try {
    const data = await api.generationList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | Number of results to return per page. | [Optional] [Defaults to `undefined`] |
| **offset** | `number` | The initial index from which to return the results. | [Optional] [Defaults to `undefined`] |
| **q** | `string` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [Optional] [Defaults to `undefined`] |

### Return type

[**PaginatedGenerationSummaryList**](PaginatedGenerationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## generationRetrieve

> GenerationDetail generationRetrieve(id)

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example

```ts
import {
  Configuration,
  GamesApi,
} from '';
import type { GenerationRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new GamesApi(config);

  const body = {
    // string | This parameter can be a string or an integer.
    id: id_example,
  } satisfies GenerationRetrieveRequest;

  try {
    const data = await api.generationRetrieve(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `string` | This parameter can be a string or an integer. | [Defaults to `undefined`] |

### Return type

[**GenerationDetail**](GenerationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pokedexList

> PaginatedPokedexSummaryList pokedexList(limit, offset, q)

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example

```ts
import {
  Configuration,
  GamesApi,
} from '';
import type { PokedexListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new GamesApi(config);

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies PokedexListRequest;

  try {
    const data = await api.pokedexList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | Number of results to return per page. | [Optional] [Defaults to `undefined`] |
| **offset** | `number` | The initial index from which to return the results. | [Optional] [Defaults to `undefined`] |
| **q** | `string` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [Optional] [Defaults to `undefined`] |

### Return type

[**PaginatedPokedexSummaryList**](PaginatedPokedexSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pokedexRetrieve

> PokedexDetail pokedexRetrieve(id)

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example

```ts
import {
  Configuration,
  GamesApi,
} from '';
import type { PokedexRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new GamesApi(config);

  const body = {
    // string | This parameter can be a string or an integer.
    id: id_example,
  } satisfies PokedexRetrieveRequest;

  try {
    const data = await api.pokedexRetrieve(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `string` | This parameter can be a string or an integer. | [Defaults to `undefined`] |

### Return type

[**PokedexDetail**](PokedexDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## versionGroupList

> PaginatedVersionGroupSummaryList versionGroupList(limit, offset, q)

List version groups

Version groups categorize highly similar versions of the games.

### Example

```ts
import {
  Configuration,
  GamesApi,
} from '';
import type { VersionGroupListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new GamesApi(config);

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies VersionGroupListRequest;

  try {
    const data = await api.versionGroupList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | Number of results to return per page. | [Optional] [Defaults to `undefined`] |
| **offset** | `number` | The initial index from which to return the results. | [Optional] [Defaults to `undefined`] |
| **q** | `string` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [Optional] [Defaults to `undefined`] |

### Return type

[**PaginatedVersionGroupSummaryList**](PaginatedVersionGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## versionGroupRetrieve

> VersionGroupDetail versionGroupRetrieve(id)

Get version group

Version groups categorize highly similar versions of the games.

### Example

```ts
import {
  Configuration,
  GamesApi,
} from '';
import type { VersionGroupRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new GamesApi(config);

  const body = {
    // string | This parameter can be a string or an integer.
    id: id_example,
  } satisfies VersionGroupRetrieveRequest;

  try {
    const data = await api.versionGroupRetrieve(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `string` | This parameter can be a string or an integer. | [Defaults to `undefined`] |

### Return type

[**VersionGroupDetail**](VersionGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## versionList

> PaginatedVersionSummaryList versionList(limit, offset, q)

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Example

```ts
import {
  Configuration,
  GamesApi,
} from '';
import type { VersionListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new GamesApi(config);

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies VersionListRequest;

  try {
    const data = await api.versionList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | Number of results to return per page. | [Optional] [Defaults to `undefined`] |
| **offset** | `number` | The initial index from which to return the results. | [Optional] [Defaults to `undefined`] |
| **q** | `string` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [Optional] [Defaults to `undefined`] |

### Return type

[**PaginatedVersionSummaryList**](PaginatedVersionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## versionRetrieve

> VersionDetail versionRetrieve(id)

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Example

```ts
import {
  Configuration,
  GamesApi,
} from '';
import type { VersionRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new GamesApi(config);

  const body = {
    // string | This parameter can be a string or an integer.
    id: id_example,
  } satisfies VersionRetrieveRequest;

  try {
    const data = await api.versionRetrieve(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `string` | This parameter can be a string or an integer. | [Defaults to `undefined`] |

### Return type

[**VersionDetail**](VersionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

