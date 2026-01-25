# PokemonFormApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokemonFormList**](PokemonFormApi.md#pokemonformlist) | **GET** /api/v2/pokemon-form/ |  |
| [**pokemonFormRead**](PokemonFormApi.md#pokemonformread) | **GET** /api/v2/pokemon-form/{id}/ |  |



## pokemonFormList

> string pokemonFormList(limit, offset)



### Example

```ts
import {
  Configuration,
  PokemonFormApi,
} from '';
import type { PokemonFormListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonFormApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies PokemonFormListRequest;

  try {
    const data = await api.pokemonFormList(body);
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


## pokemonFormRead

> string pokemonFormRead(id)



### Example

```ts
import {
  Configuration,
  PokemonFormApi,
} from '';
import type { PokemonFormReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonFormApi();

  const body = {
    // number
    id: 56,
  } satisfies PokemonFormReadRequest;

  try {
    const data = await api.pokemonFormRead(body);
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

