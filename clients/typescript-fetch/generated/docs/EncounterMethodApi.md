# EncounterMethodApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**encounterMethodList**](EncounterMethodApi.md#encountermethodlist) | **GET** /api/v2/encounter-method/ |  |
| [**encounterMethodRead**](EncounterMethodApi.md#encountermethodread) | **GET** /api/v2/encounter-method/{id}/ |  |



## encounterMethodList

> string encounterMethodList(limit, offset)



### Example

```ts
import {
  Configuration,
  EncounterMethodApi,
} from '';
import type { EncounterMethodListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncounterMethodApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies EncounterMethodListRequest;

  try {
    const data = await api.encounterMethodList(body);
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


## encounterMethodRead

> string encounterMethodRead(id)



### Example

```ts
import {
  Configuration,
  EncounterMethodApi,
} from '';
import type { EncounterMethodReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncounterMethodApi();

  const body = {
    // number
    id: 56,
  } satisfies EncounterMethodReadRequest;

  try {
    const data = await api.encounterMethodRead(body);
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

