# ItemFlingEffectApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemFlingEffectList**](ItemFlingEffectApi.md#itemflingeffectlist) | **GET** /api/v2/item-fling-effect/ |  |
| [**itemFlingEffectRead**](ItemFlingEffectApi.md#itemflingeffectread) | **GET** /api/v2/item-fling-effect/{id}/ |  |



## itemFlingEffectList

> string itemFlingEffectList(limit, offset)



### Example

```ts
import {
  Configuration,
  ItemFlingEffectApi,
} from '';
import type { ItemFlingEffectListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemFlingEffectApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies ItemFlingEffectListRequest;

  try {
    const data = await api.itemFlingEffectList(body);
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


## itemFlingEffectRead

> string itemFlingEffectRead(id)



### Example

```ts
import {
  Configuration,
  ItemFlingEffectApi,
} from '';
import type { ItemFlingEffectReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemFlingEffectApi();

  const body = {
    // number
    id: 56,
  } satisfies ItemFlingEffectReadRequest;

  try {
    const data = await api.itemFlingEffectRead(body);
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

