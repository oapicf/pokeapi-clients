# StatApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statList**](StatApi.md#statlist) | **GET** /api/v2/stat/ |  |
| [**statRead**](StatApi.md#statread) | **GET** /api/v2/stat/{id}/ |  |



## statList

> string statList(limit, offset)



### Example

```ts
import {
  Configuration,
  StatApi,
} from '';
import type { StatListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new StatApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies StatListRequest;

  try {
    const data = await api.statList(body);
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


## statRead

> string statRead(id)



### Example

```ts
import {
  Configuration,
  StatApi,
} from '';
import type { StatReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new StatApi();

  const body = {
    // number
    id: 56,
  } satisfies StatReadRequest;

  try {
    const data = await api.statRead(body);
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

