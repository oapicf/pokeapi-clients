# ItemPocketApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemPocketList**](ItemPocketApi.md#itempocketlist) | **GET** /api/v2/item-pocket/ |  |
| [**itemPocketRead**](ItemPocketApi.md#itempocketread) | **GET** /api/v2/item-pocket/{id}/ |  |



## itemPocketList

> string itemPocketList(limit, offset)



### Example

```ts
import {
  Configuration,
  ItemPocketApi,
} from '';
import type { ItemPocketListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemPocketApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies ItemPocketListRequest;

  try {
    const data = await api.itemPocketList(body);
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


## itemPocketRead

> string itemPocketRead(id)



### Example

```ts
import {
  Configuration,
  ItemPocketApi,
} from '';
import type { ItemPocketReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemPocketApi();

  const body = {
    // number
    id: 56,
  } satisfies ItemPocketReadRequest;

  try {
    const data = await api.itemPocketRead(body);
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

