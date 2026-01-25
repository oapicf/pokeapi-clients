# GenderApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**genderList**](GenderApi.md#genderlist) | **GET** /api/v2/gender/ |  |
| [**genderRead**](GenderApi.md#genderread) | **GET** /api/v2/gender/{id}/ |  |



## genderList

> string genderList(limit, offset)



### Example

```ts
import {
  Configuration,
  GenderApi,
} from '';
import type { GenderListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new GenderApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies GenderListRequest;

  try {
    const data = await api.genderList(body);
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


## genderRead

> string genderRead(id)



### Example

```ts
import {
  Configuration,
  GenderApi,
} from '';
import type { GenderReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new GenderApi();

  const body = {
    // number
    id: 56,
  } satisfies GenderReadRequest;

  try {
    const data = await api.genderRead(body);
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

