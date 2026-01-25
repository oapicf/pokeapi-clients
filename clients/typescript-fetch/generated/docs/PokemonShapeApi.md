# PokemonShapeApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokemonShapeList**](PokemonShapeApi.md#pokemonshapelist) | **GET** /api/v2/pokemon-shape/ |  |
| [**pokemonShapeRead**](PokemonShapeApi.md#pokemonshaperead) | **GET** /api/v2/pokemon-shape/{id}/ |  |



## pokemonShapeList

> string pokemonShapeList(limit, offset)



### Example

```ts
import {
  Configuration,
  PokemonShapeApi,
} from '';
import type { PokemonShapeListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonShapeApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies PokemonShapeListRequest;

  try {
    const data = await api.pokemonShapeList(body);
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


## pokemonShapeRead

> string pokemonShapeRead(id)



### Example

```ts
import {
  Configuration,
  PokemonShapeApi,
} from '';
import type { PokemonShapeReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonShapeApi();

  const body = {
    // number
    id: 56,
  } satisfies PokemonShapeReadRequest;

  try {
    const data = await api.pokemonShapeRead(body);
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

