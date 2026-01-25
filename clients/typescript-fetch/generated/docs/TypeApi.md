# TypeApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**typeList**](TypeApi.md#typelist) | **GET** /api/v2/type/ |  |
| [**typeRead**](TypeApi.md#typeread) | **GET** /api/v2/type/{id}/ |  |



## typeList

> string typeList(limit, offset)



### Example

```ts
import {
  Configuration,
  TypeApi,
} from '';
import type { TypeListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new TypeApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies TypeListRequest;

  try {
    const data = await api.typeList(body);
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


## typeRead

> string typeRead(id)



### Example

```ts
import {
  Configuration,
  TypeApi,
} from '';
import type { TypeReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new TypeApi();

  const body = {
    // number
    id: 56,
  } satisfies TypeReadRequest;

  try {
    const data = await api.typeRead(body);
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

