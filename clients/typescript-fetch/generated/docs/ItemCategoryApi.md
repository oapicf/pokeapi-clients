# ItemCategoryApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemCategoryList**](ItemCategoryApi.md#itemcategorylist) | **GET** /api/v2/item-category/ |  |
| [**itemCategoryRead**](ItemCategoryApi.md#itemcategoryread) | **GET** /api/v2/item-category/{id}/ |  |



## itemCategoryList

> string itemCategoryList(limit, offset)



### Example

```ts
import {
  Configuration,
  ItemCategoryApi,
} from '';
import type { ItemCategoryListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemCategoryApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies ItemCategoryListRequest;

  try {
    const data = await api.itemCategoryList(body);
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


## itemCategoryRead

> string itemCategoryRead(id)



### Example

```ts
import {
  Configuration,
  ItemCategoryApi,
} from '';
import type { ItemCategoryReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ItemCategoryApi();

  const body = {
    // number
    id: 56,
  } satisfies ItemCategoryReadRequest;

  try {
    const data = await api.itemCategoryRead(body);
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

