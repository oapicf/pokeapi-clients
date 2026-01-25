# MoveDamageClassApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveDamageClassList**](MoveDamageClassApi.md#movedamageclasslist) | **GET** /api/v2/move-damage-class/ |  |
| [**moveDamageClassRead**](MoveDamageClassApi.md#movedamageclassread) | **GET** /api/v2/move-damage-class/{id}/ |  |



## moveDamageClassList

> string moveDamageClassList(limit, offset)



### Example

```ts
import {
  Configuration,
  MoveDamageClassApi,
} from '';
import type { MoveDamageClassListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveDamageClassApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies MoveDamageClassListRequest;

  try {
    const data = await api.moveDamageClassList(body);
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


## moveDamageClassRead

> string moveDamageClassRead(id)



### Example

```ts
import {
  Configuration,
  MoveDamageClassApi,
} from '';
import type { MoveDamageClassReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveDamageClassApi();

  const body = {
    // number
    id: 56,
  } satisfies MoveDamageClassReadRequest;

  try {
    const data = await api.moveDamageClassRead(body);
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

