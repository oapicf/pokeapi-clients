# ContestEffectApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contestEffectList**](ContestEffectApi.md#contesteffectlist) | **GET** /api/v2/contest-effect/ |  |
| [**contestEffectRead**](ContestEffectApi.md#contesteffectread) | **GET** /api/v2/contest-effect/{id}/ |  |



## contestEffectList

> string contestEffectList(limit, offset)



### Example

```ts
import {
  Configuration,
  ContestEffectApi,
} from '';
import type { ContestEffectListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ContestEffectApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies ContestEffectListRequest;

  try {
    const data = await api.contestEffectList(body);
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


## contestEffectRead

> string contestEffectRead(id)



### Example

```ts
import {
  Configuration,
  ContestEffectApi,
} from '';
import type { ContestEffectReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ContestEffectApi();

  const body = {
    // number
    id: 56,
  } satisfies ContestEffectReadRequest;

  try {
    const data = await api.contestEffectRead(body);
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

