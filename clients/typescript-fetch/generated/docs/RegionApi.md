# RegionApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**regionList**](RegionApi.md#regionlist) | **GET** /api/v2/region/ |  |
| [**regionRead**](RegionApi.md#regionread) | **GET** /api/v2/region/{id}/ |  |



## regionList

> string regionList(limit, offset)



### Example

```ts
import {
  Configuration,
  RegionApi,
} from '';
import type { RegionListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new RegionApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies RegionListRequest;

  try {
    const data = await api.regionList(body);
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


## regionRead

> string regionRead(id)



### Example

```ts
import {
  Configuration,
  RegionApi,
} from '';
import type { RegionReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new RegionApi();

  const body = {
    // number
    id: 56,
  } satisfies RegionReadRequest;

  try {
    const data = await api.regionRead(body);
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

