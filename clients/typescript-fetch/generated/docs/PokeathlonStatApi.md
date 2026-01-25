# PokeathlonStatApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokeathlonStatList**](PokeathlonStatApi.md#pokeathlonstatlist) | **GET** /api/v2/pokeathlon-stat/ |  |
| [**pokeathlonStatRead**](PokeathlonStatApi.md#pokeathlonstatread) | **GET** /api/v2/pokeathlon-stat/{id}/ |  |



## pokeathlonStatList

> string pokeathlonStatList(limit, offset)



### Example

```ts
import {
  Configuration,
  PokeathlonStatApi,
} from '';
import type { PokeathlonStatListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokeathlonStatApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies PokeathlonStatListRequest;

  try {
    const data = await api.pokeathlonStatList(body);
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


## pokeathlonStatRead

> string pokeathlonStatRead(id)



### Example

```ts
import {
  Configuration,
  PokeathlonStatApi,
} from '';
import type { PokeathlonStatReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokeathlonStatApi();

  const body = {
    // number
    id: 56,
  } satisfies PokeathlonStatReadRequest;

  try {
    const data = await api.pokeathlonStatRead(body);
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

