# ItemApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemList**](ItemApi.md#itemlist) | **GET** /api/v2/item/ |  |
| [**itemRead**](ItemApi.md#itemread) | **GET** /api/v2/item/{id}/ |  |



## itemList

> string itemList(limit, offset)



### Example

```ts
import {
  Configuration,
  ItemApi,
} from '';
import type { ItemListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies ItemListRequest;

  try {
    const data = await api.itemList(body);
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


## itemRead

> string itemRead(id)



### Example

```ts
import {
  Configuration,
  ItemApi,
} from '';
import type { ItemReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemApi();

  const body = {
    // number
    id: 56,
  } satisfies ItemReadRequest;

  try {
    const data = await api.itemRead(body);
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

