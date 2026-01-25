# ItemAttributeApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemAttributeList**](ItemAttributeApi.md#itemattributelist) | **GET** /api/v2/item-attribute/ |  |
| [**itemAttributeRead**](ItemAttributeApi.md#itemattributeread) | **GET** /api/v2/item-attribute/{id}/ |  |



## itemAttributeList

> string itemAttributeList(limit, offset)



### Example

```ts
import {
  Configuration,
  ItemAttributeApi,
} from '';
import type { ItemAttributeListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemAttributeApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies ItemAttributeListRequest;

  try {
    const data = await api.itemAttributeList(body);
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


## itemAttributeRead

> string itemAttributeRead(id)



### Example

```ts
import {
  Configuration,
  ItemAttributeApi,
} from '';
import type { ItemAttributeReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemAttributeApi();

  const body = {
    // number
    id: 56,
  } satisfies ItemAttributeReadRequest;

  try {
    const data = await api.itemAttributeRead(body);
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

