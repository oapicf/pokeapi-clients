# BerryFirmnessApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**berryFirmnessList**](BerryFirmnessApi.md#berryfirmnesslist) | **GET** /api/v2/berry-firmness/ |  |
| [**berryFirmnessRead**](BerryFirmnessApi.md#berryfirmnessread) | **GET** /api/v2/berry-firmness/{id}/ |  |



## berryFirmnessList

> string berryFirmnessList(limit, offset)



### Example

```ts
import {
  Configuration,
  BerryFirmnessApi,
} from '';
import type { BerryFirmnessListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new BerryFirmnessApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies BerryFirmnessListRequest;

  try {
    const data = await api.berryFirmnessList(body);
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


## berryFirmnessRead

> string berryFirmnessRead(id)



### Example

```ts
import {
  Configuration,
  BerryFirmnessApi,
} from '';
import type { BerryFirmnessReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new BerryFirmnessApi();

  const body = {
    // number
    id: 56,
  } satisfies BerryFirmnessReadRequest;

  try {
    const data = await api.berryFirmnessRead(body);
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

