# PokedexApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokedexList**](PokedexApi.md#pokedexlist) | **GET** /api/v2/pokedex/ |  |
| [**pokedexRead**](PokedexApi.md#pokedexread) | **GET** /api/v2/pokedex/{id}/ |  |



## pokedexList

> string pokedexList(limit, offset)



### Example

```ts
import {
  Configuration,
  PokedexApi,
} from '';
import type { PokedexListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokedexApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
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


## pokedexRead

> string pokedexRead(id)



### Example

```ts
import {
  Configuration,
  PokedexApi,
} from '';
import type { PokedexReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokedexApi();

  const body = {
    // number
    id: 56,
  } satisfies PokedexReadRequest;

  try {
    const data = await api.pokedexRead(body);
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

