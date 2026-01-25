# EggGroupApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eggGroupList**](EggGroupApi.md#egggrouplist) | **GET** /api/v2/egg-group/ |  |
| [**eggGroupRead**](EggGroupApi.md#egggroupread) | **GET** /api/v2/egg-group/{id}/ |  |



## eggGroupList

> string eggGroupList(limit, offset)



### Example

```ts
import {
  Configuration,
  EggGroupApi,
} from '';
import type { EggGroupListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EggGroupApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies EggGroupListRequest;

  try {
    const data = await api.eggGroupList(body);
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


## eggGroupRead

> string eggGroupRead(id)



### Example

```ts
import {
  Configuration,
  EggGroupApi,
} from '';
import type { EggGroupReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EggGroupApi();

  const body = {
    // number
    id: 56,
  } satisfies EggGroupReadRequest;

  try {
    const data = await api.eggGroupRead(body);
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

