# EvolutionChainApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**evolutionChainList**](EvolutionChainApi.md#evolutionchainlist) | **GET** /api/v2/evolution-chain/ |  |
| [**evolutionChainRead**](EvolutionChainApi.md#evolutionchainread) | **GET** /api/v2/evolution-chain/{id}/ |  |



## evolutionChainList

> string evolutionChainList(limit, offset)



### Example

```ts
import {
  Configuration,
  EvolutionChainApi,
} from '';
import type { EvolutionChainListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionChainApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies EvolutionChainListRequest;

  try {
    const data = await api.evolutionChainList(body);
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


## evolutionChainRead

> string evolutionChainRead(id)



### Example

```ts
import {
  Configuration,
  EvolutionChainApi,
} from '';
import type { EvolutionChainReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionChainApi();

  const body = {
    // number
    id: 56,
  } satisfies EvolutionChainReadRequest;

  try {
    const data = await api.evolutionChainRead(body);
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

