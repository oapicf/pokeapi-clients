# BerryApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**berryList**](BerryApi.md#berrylist) | **GET** /api/v2/berry/ |  |
| [**berryRead**](BerryApi.md#berryread) | **GET** /api/v2/berry/{id}/ |  |



## berryList

> string berryList(limit, offset)



### Example

```ts
import {
  Configuration,
  BerryApi,
} from '';
import type { BerryListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new BerryApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies BerryListRequest;

  try {
    const data = await api.berryList(body);
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


## berryRead

> string berryRead(id)



### Example

```ts
import {
  Configuration,
  BerryApi,
} from '';
import type { BerryReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new BerryApi();

  const body = {
    // number
    id: 56,
  } satisfies BerryReadRequest;

  try {
    const data = await api.berryRead(body);
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

