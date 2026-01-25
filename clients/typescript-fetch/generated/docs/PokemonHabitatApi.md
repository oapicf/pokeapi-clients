# PokemonHabitatApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokemonHabitatList**](PokemonHabitatApi.md#pokemonhabitatlist) | **GET** /api/v2/pokemon-habitat/ |  |
| [**pokemonHabitatRead**](PokemonHabitatApi.md#pokemonhabitatread) | **GET** /api/v2/pokemon-habitat/{id}/ |  |



## pokemonHabitatList

> string pokemonHabitatList(limit, offset)



### Example

```ts
import {
  Configuration,
  PokemonHabitatApi,
} from '';
import type { PokemonHabitatListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonHabitatApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies PokemonHabitatListRequest;

  try {
    const data = await api.pokemonHabitatList(body);
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


## pokemonHabitatRead

> string pokemonHabitatRead(id)



### Example

```ts
import {
  Configuration,
  PokemonHabitatApi,
} from '';
import type { PokemonHabitatReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonHabitatApi();

  const body = {
    // number
    id: 56,
  } satisfies PokemonHabitatReadRequest;

  try {
    const data = await api.pokemonHabitatRead(body);
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

