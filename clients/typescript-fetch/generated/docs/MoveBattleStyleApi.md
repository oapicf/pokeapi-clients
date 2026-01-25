# MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveBattleStyleList**](MoveBattleStyleApi.md#movebattlestylelist) | **GET** /api/v2/move-battle-style/ |  |
| [**moveBattleStyleRead**](MoveBattleStyleApi.md#movebattlestyleread) | **GET** /api/v2/move-battle-style/{id}/ |  |



## moveBattleStyleList

> string moveBattleStyleList(limit, offset)



### Example

```ts
import {
  Configuration,
  MoveBattleStyleApi,
} from '';
import type { MoveBattleStyleListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveBattleStyleApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies MoveBattleStyleListRequest;

  try {
    const data = await api.moveBattleStyleList(body);
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


## moveBattleStyleRead

> string moveBattleStyleRead(id)



### Example

```ts
import {
  Configuration,
  MoveBattleStyleApi,
} from '';
import type { MoveBattleStyleReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveBattleStyleApi();

  const body = {
    // number
    id: 56,
  } satisfies MoveBattleStyleReadRequest;

  try {
    const data = await api.moveBattleStyleRead(body);
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

