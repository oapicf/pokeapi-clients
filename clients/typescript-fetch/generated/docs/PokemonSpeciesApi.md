# PokemonSpeciesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokemonSpeciesList**](PokemonSpeciesApi.md#pokemonspecieslist) | **GET** /api/v2/pokemon-species/ |  |
| [**pokemonSpeciesRead**](PokemonSpeciesApi.md#pokemonspeciesread) | **GET** /api/v2/pokemon-species/{id}/ |  |



## pokemonSpeciesList

> string pokemonSpeciesList(limit, offset)



### Example

```ts
import {
  Configuration,
  PokemonSpeciesApi,
} from '';
import type { PokemonSpeciesListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonSpeciesApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies PokemonSpeciesListRequest;

  try {
    const data = await api.pokemonSpeciesList(body);
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


## pokemonSpeciesRead

> string pokemonSpeciesRead(id)



### Example

```ts
import {
  Configuration,
  PokemonSpeciesApi,
} from '';
import type { PokemonSpeciesReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonSpeciesApi();

  const body = {
    // number
    id: 56,
  } satisfies PokemonSpeciesReadRequest;

  try {
    const data = await api.pokemonSpeciesRead(body);
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

