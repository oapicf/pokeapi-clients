# BerryFlavorApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**berryFlavorList**](BerryFlavorApi.md#berryflavorlist) | **GET** /api/v2/berry-flavor/ |  |
| [**berryFlavorRead**](BerryFlavorApi.md#berryflavorread) | **GET** /api/v2/berry-flavor/{id}/ |  |



## berryFlavorList

> string berryFlavorList(limit, offset)



### Example

```ts
import {
  Configuration,
  BerryFlavorApi,
} from '';
import type { BerryFlavorListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new BerryFlavorApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies BerryFlavorListRequest;

  try {
    const data = await api.berryFlavorList(body);
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


## berryFlavorRead

> string berryFlavorRead(id)



### Example

```ts
import {
  Configuration,
  BerryFlavorApi,
} from '';
import type { BerryFlavorReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new BerryFlavorApi();

  const body = {
    // number
    id: 56,
  } satisfies BerryFlavorReadRequest;

  try {
    const data = await api.berryFlavorRead(body);
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

