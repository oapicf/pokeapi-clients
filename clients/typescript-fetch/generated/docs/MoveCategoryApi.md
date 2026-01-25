# MoveCategoryApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveCategoryList**](MoveCategoryApi.md#movecategorylist) | **GET** /api/v2/move-category/ |  |
| [**moveCategoryRead**](MoveCategoryApi.md#movecategoryread) | **GET** /api/v2/move-category/{id}/ |  |



## moveCategoryList

> string moveCategoryList(limit, offset)



### Example

```ts
import {
  Configuration,
  MoveCategoryApi,
} from '';
import type { MoveCategoryListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveCategoryApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies MoveCategoryListRequest;

  try {
    const data = await api.moveCategoryList(body);
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


## moveCategoryRead

> string moveCategoryRead(id)



### Example

```ts
import {
  Configuration,
  MoveCategoryApi,
} from '';
import type { MoveCategoryReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveCategoryApi();

  const body = {
    // number
    id: 56,
  } satisfies MoveCategoryReadRequest;

  try {
    const data = await api.moveCategoryRead(body);
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

