# EncounterConditionValueApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**encounterConditionValueList**](EncounterConditionValueApi.md#encounterconditionvaluelist) | **GET** /api/v2/encounter-condition-value/ |  |
| [**encounterConditionValueRead**](EncounterConditionValueApi.md#encounterconditionvalueread) | **GET** /api/v2/encounter-condition-value/{id}/ |  |



## encounterConditionValueList

> string encounterConditionValueList(limit, offset)



### Example

```ts
import {
  Configuration,
  EncounterConditionValueApi,
} from '';
import type { EncounterConditionValueListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncounterConditionValueApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies EncounterConditionValueListRequest;

  try {
    const data = await api.encounterConditionValueList(body);
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


## encounterConditionValueRead

> string encounterConditionValueRead(id)



### Example

```ts
import {
  Configuration,
  EncounterConditionValueApi,
} from '';
import type { EncounterConditionValueReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncounterConditionValueApi();

  const body = {
    // number
    id: 56,
  } satisfies EncounterConditionValueReadRequest;

  try {
    const data = await api.encounterConditionValueRead(body);
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

