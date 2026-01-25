# GrowthRateApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**growthRateList**](GrowthRateApi.md#growthratelist) | **GET** /api/v2/growth-rate/ |  |
| [**growthRateRead**](GrowthRateApi.md#growthrateread) | **GET** /api/v2/growth-rate/{id}/ |  |



## growthRateList

> string growthRateList(limit, offset)



### Example

```ts
import {
  Configuration,
  GrowthRateApi,
} from '';
import type { GrowthRateListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new GrowthRateApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies GrowthRateListRequest;

  try {
    const data = await api.growthRateList(body);
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


## growthRateRead

> string growthRateRead(id)



### Example

```ts
import {
  Configuration,
  GrowthRateApi,
} from '';
import type { GrowthRateReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new GrowthRateApi();

  const body = {
    // number
    id: 56,
  } satisfies GrowthRateReadRequest;

  try {
    const data = await api.growthRateRead(body);
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

