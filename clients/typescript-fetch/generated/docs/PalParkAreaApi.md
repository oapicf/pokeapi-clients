# PalParkAreaApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**palParkAreaList**](PalParkAreaApi.md#palparkarealist) | **GET** /api/v2/pal-park-area/ |  |
| [**palParkAreaRead**](PalParkAreaApi.md#palparkarearead) | **GET** /api/v2/pal-park-area/{id}/ |  |



## palParkAreaList

> string palParkAreaList(limit, offset)



### Example

```ts
import {
  Configuration,
  PalParkAreaApi,
} from '';
import type { PalParkAreaListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PalParkAreaApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies PalParkAreaListRequest;

  try {
    const data = await api.palParkAreaList(body);
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


## palParkAreaRead

> string palParkAreaRead(id)



### Example

```ts
import {
  Configuration,
  PalParkAreaApi,
} from '';
import type { PalParkAreaReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PalParkAreaApi();

  const body = {
    // number
    id: 56,
  } satisfies PalParkAreaReadRequest;

  try {
    const data = await api.palParkAreaRead(body);
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

