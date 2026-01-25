# GenerationApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generationList**](GenerationApi.md#generationlist) | **GET** /api/v2/generation/ |  |
| [**generationRead**](GenerationApi.md#generationread) | **GET** /api/v2/generation/{id}/ |  |



## generationList

> string generationList(limit, offset)



### Example

```ts
import {
  Configuration,
  GenerationApi,
} from '';
import type { GenerationListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new GenerationApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies GenerationListRequest;

  try {
    const data = await api.generationList(body);
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


## generationRead

> string generationRead(id)



### Example

```ts
import {
  Configuration,
  GenerationApi,
} from '';
import type { GenerationReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new GenerationApi();

  const body = {
    // number
    id: 56,
  } satisfies GenerationReadRequest;

  try {
    const data = await api.generationRead(body);
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

