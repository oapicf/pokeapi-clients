# LocationApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**locationList**](LocationApi.md#locationlist) | **GET** /api/v2/location/ |  |
| [**locationRead**](LocationApi.md#locationread) | **GET** /api/v2/location/{id}/ |  |



## locationList

> string locationList(limit, offset)



### Example

```ts
import {
  Configuration,
  LocationApi,
} from '';
import type { LocationListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new LocationApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies LocationListRequest;

  try {
    const data = await api.locationList(body);
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


## locationRead

> string locationRead(id)



### Example

```ts
import {
  Configuration,
  LocationApi,
} from '';
import type { LocationReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new LocationApi();

  const body = {
    // number
    id: 56,
  } satisfies LocationReadRequest;

  try {
    const data = await api.locationRead(body);
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

