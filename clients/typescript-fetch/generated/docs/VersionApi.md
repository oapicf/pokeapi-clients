# VersionApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**versionList**](VersionApi.md#versionlist) | **GET** /api/v2/version/ |  |
| [**versionRead**](VersionApi.md#versionread) | **GET** /api/v2/version/{id}/ |  |



## versionList

> string versionList(limit, offset)



### Example

```ts
import {
  Configuration,
  VersionApi,
} from '';
import type { VersionListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new VersionApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies VersionListRequest;

  try {
    const data = await api.versionList(body);
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


## versionRead

> string versionRead(id)



### Example

```ts
import {
  Configuration,
  VersionApi,
} from '';
import type { VersionReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new VersionApi();

  const body = {
    // number
    id: 56,
  } satisfies VersionReadRequest;

  try {
    const data = await api.versionRead(body);
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

