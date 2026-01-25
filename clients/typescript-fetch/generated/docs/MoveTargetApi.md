# MoveTargetApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveTargetList**](MoveTargetApi.md#movetargetlist) | **GET** /api/v2/move-target/ |  |
| [**moveTargetRead**](MoveTargetApi.md#movetargetread) | **GET** /api/v2/move-target/{id}/ |  |



## moveTargetList

> string moveTargetList(limit, offset)



### Example

```ts
import {
  Configuration,
  MoveTargetApi,
} from '';
import type { MoveTargetListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveTargetApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies MoveTargetListRequest;

  try {
    const data = await api.moveTargetList(body);
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


## moveTargetRead

> string moveTargetRead(id)



### Example

```ts
import {
  Configuration,
  MoveTargetApi,
} from '';
import type { MoveTargetReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveTargetApi();

  const body = {
    // number
    id: 56,
  } satisfies MoveTargetReadRequest;

  try {
    const data = await api.moveTargetRead(body);
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

