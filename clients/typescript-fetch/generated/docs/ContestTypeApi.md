# ContestTypeApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contestTypeList**](ContestTypeApi.md#contesttypelist) | **GET** /api/v2/contest-type/ |  |
| [**contestTypeRead**](ContestTypeApi.md#contesttyperead) | **GET** /api/v2/contest-type/{id}/ |  |



## contestTypeList

> string contestTypeList(limit, offset)



### Example

```ts
import {
  Configuration,
  ContestTypeApi,
} from '';
import type { ContestTypeListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ContestTypeApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies ContestTypeListRequest;

  try {
    const data = await api.contestTypeList(body);
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


## contestTypeRead

> string contestTypeRead(id)



### Example

```ts
import {
  Configuration,
  ContestTypeApi,
} from '';
import type { ContestTypeReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new ContestTypeApi();

  const body = {
    // number
    id: 56,
  } satisfies ContestTypeReadRequest;

  try {
    const data = await api.contestTypeRead(body);
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

