# EncounterConditionApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**encounterConditionList**](EncounterConditionApi.md#encounterconditionlist) | **GET** /api/v2/encounter-condition/ |  |
| [**encounterConditionRead**](EncounterConditionApi.md#encounterconditionread) | **GET** /api/v2/encounter-condition/{id}/ |  |



## encounterConditionList

> string encounterConditionList(limit, offset)



### Example

```ts
import {
  Configuration,
  EncounterConditionApi,
} from '';
import type { EncounterConditionListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncounterConditionApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies EncounterConditionListRequest;

  try {
    const data = await api.encounterConditionList(body);
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


## encounterConditionRead

> string encounterConditionRead(id)



### Example

```ts
import {
  Configuration,
  EncounterConditionApi,
} from '';
import type { EncounterConditionReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncounterConditionApi();

  const body = {
    // number
    id: 56,
  } satisfies EncounterConditionReadRequest;

  try {
    const data = await api.encounterConditionRead(body);
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

