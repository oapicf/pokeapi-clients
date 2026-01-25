# PokemonColorApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokemonColorList**](PokemonColorApi.md#pokemoncolorlist) | **GET** /api/v2/pokemon-color/ |  |
| [**pokemonColorRead**](PokemonColorApi.md#pokemoncolorread) | **GET** /api/v2/pokemon-color/{id}/ |  |



## pokemonColorList

> string pokemonColorList(limit, offset)



### Example

```ts
import {
  Configuration,
  PokemonColorApi,
} from '';
import type { PokemonColorListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonColorApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies PokemonColorListRequest;

  try {
    const data = await api.pokemonColorList(body);
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
| **limit** | `number` |  | [Optional] [Defaults to `undefined`] |
| **offset** | `number` |  | [Optional] [Defaults to `undefined`] |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/plain`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## pokemonColorRead

> string pokemonColorRead(id)



### Example

```ts
import {
  Configuration,
  PokemonColorApi,
} from '';
import type { PokemonColorReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonColorApi();

  const body = {
    // number
    id: 56,
  } satisfies PokemonColorReadRequest;

  try {
    const data = await api.pokemonColorRead(body);
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
| **id** | `number` |  | [Defaults to `undefined`] |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/plain`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

