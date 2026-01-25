# PokemonApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokemonList**](PokemonApi.md#pokemonlist) | **GET** /api/v2/pokemon/ |  |
| [**pokemonRead**](PokemonApi.md#pokemonread) | **GET** /api/v2/pokemon/{id}/ |  |



## pokemonList

> string pokemonList(limit, offset)



### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies PokemonListRequest;

  try {
    const data = await api.pokemonList(body);
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


## pokemonRead

> string pokemonRead(id)



### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number
    id: 56,
  } satisfies PokemonReadRequest;

  try {
    const data = await api.pokemonRead(body);
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

