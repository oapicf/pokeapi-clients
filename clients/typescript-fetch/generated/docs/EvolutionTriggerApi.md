# EvolutionTriggerApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**evolutionTriggerList**](EvolutionTriggerApi.md#evolutiontriggerlist) | **GET** /api/v2/evolution-trigger/ |  |
| [**evolutionTriggerRead**](EvolutionTriggerApi.md#evolutiontriggerread) | **GET** /api/v2/evolution-trigger/{id}/ |  |



## evolutionTriggerList

> string evolutionTriggerList(limit, offset)



### Example

```ts
import {
  Configuration,
  EvolutionTriggerApi,
} from '';
import type { EvolutionTriggerListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionTriggerApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies EvolutionTriggerListRequest;

  try {
    const data = await api.evolutionTriggerList(body);
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


## evolutionTriggerRead

> string evolutionTriggerRead(id)



### Example

```ts
import {
  Configuration,
  EvolutionTriggerApi,
} from '';
import type { EvolutionTriggerReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionTriggerApi();

  const body = {
    // number
    id: 56,
  } satisfies EvolutionTriggerReadRequest;

  try {
    const data = await api.evolutionTriggerRead(body);
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

