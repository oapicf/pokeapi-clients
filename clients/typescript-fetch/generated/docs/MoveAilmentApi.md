# MoveAilmentApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveAilmentList**](MoveAilmentApi.md#moveailmentlist) | **GET** /api/v2/move-ailment/ |  |
| [**moveAilmentRead**](MoveAilmentApi.md#moveailmentread) | **GET** /api/v2/move-ailment/{id}/ |  |



## moveAilmentList

> string moveAilmentList(limit, offset)



### Example

```ts
import {
  Configuration,
  MoveAilmentApi,
} from '';
import type { MoveAilmentListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveAilmentApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies MoveAilmentListRequest;

  try {
    const data = await api.moveAilmentList(body);
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


## moveAilmentRead

> string moveAilmentRead(id)



### Example

```ts
import {
  Configuration,
  MoveAilmentApi,
} from '';
import type { MoveAilmentReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveAilmentApi();

  const body = {
    // number
    id: 56,
  } satisfies MoveAilmentReadRequest;

  try {
    const data = await api.moveAilmentRead(body);
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

