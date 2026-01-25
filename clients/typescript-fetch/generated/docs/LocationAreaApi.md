# LocationAreaApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**locationAreaList**](LocationAreaApi.md#locationarealist) | **GET** /api/v2/location-area/ |  |
| [**locationAreaRead**](LocationAreaApi.md#locationarearead) | **GET** /api/v2/location-area/{id}/ |  |



## locationAreaList

> string locationAreaList(limit, offset)



### Example

```ts
import {
  Configuration,
  LocationAreaApi,
} from '';
import type { LocationAreaListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new LocationAreaApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies LocationAreaListRequest;

  try {
    const data = await api.locationAreaList(body);
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


## locationAreaRead

> string locationAreaRead(id)



### Example

```ts
import {
  Configuration,
  LocationAreaApi,
} from '';
import type { LocationAreaReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new LocationAreaApi();

  const body = {
    // number
    id: 56,
  } satisfies LocationAreaReadRequest;

  try {
    const data = await api.locationAreaRead(body);
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

