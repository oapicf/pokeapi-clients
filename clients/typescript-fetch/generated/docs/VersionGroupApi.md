# VersionGroupApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**versionGroupList**](VersionGroupApi.md#versiongrouplist) | **GET** /api/v2/version-group/ |  |
| [**versionGroupRead**](VersionGroupApi.md#versiongroupread) | **GET** /api/v2/version-group/{id}/ |  |



## versionGroupList

> string versionGroupList(limit, offset)



### Example

```ts
import {
  Configuration,
  VersionGroupApi,
} from '';
import type { VersionGroupListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new VersionGroupApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies VersionGroupListRequest;

  try {
    const data = await api.versionGroupList(body);
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


## versionGroupRead

> string versionGroupRead(id)



### Example

```ts
import {
  Configuration,
  VersionGroupApi,
} from '';
import type { VersionGroupReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new VersionGroupApi();

  const body = {
    // number
    id: 56,
  } satisfies VersionGroupReadRequest;

  try {
    const data = await api.versionGroupRead(body);
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

