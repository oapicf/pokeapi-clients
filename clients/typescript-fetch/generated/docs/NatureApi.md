# NatureApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**natureList**](NatureApi.md#naturelist) | **GET** /api/v2/nature/ |  |
| [**natureRead**](NatureApi.md#natureread) | **GET** /api/v2/nature/{id}/ |  |



## natureList

> string natureList(limit, offset)



### Example

```ts
import {
  Configuration,
  NatureApi,
} from '';
import type { NatureListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new NatureApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies NatureListRequest;

  try {
    const data = await api.natureList(body);
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


## natureRead

> string natureRead(id)



### Example

```ts
import {
  Configuration,
  NatureApi,
} from '';
import type { NatureReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new NatureApi();

  const body = {
    // number
    id: 56,
  } satisfies NatureReadRequest;

  try {
    const data = await api.natureRead(body);
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

