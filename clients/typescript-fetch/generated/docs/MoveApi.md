# MoveApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveList**](MoveApi.md#movelist) | **GET** /api/v2/move/ |  |
| [**moveRead**](MoveApi.md#moveread) | **GET** /api/v2/move/{id}/ |  |



## moveList

> string moveList(limit, offset)



### Example

```ts
import {
  Configuration,
  MoveApi,
} from '';
import type { MoveListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies MoveListRequest;

  try {
    const data = await api.moveList(body);
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


## moveRead

> string moveRead(id)



### Example

```ts
import {
  Configuration,
  MoveApi,
} from '';
import type { MoveReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveApi();

  const body = {
    // number
    id: 56,
  } satisfies MoveReadRequest;

  try {
    const data = await api.moveRead(body);
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

