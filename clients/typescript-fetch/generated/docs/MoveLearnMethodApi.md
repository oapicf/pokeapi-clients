# MoveLearnMethodApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveLearnMethodList**](MoveLearnMethodApi.md#movelearnmethodlist) | **GET** /api/v2/move-learn-method/ |  |
| [**moveLearnMethodRead**](MoveLearnMethodApi.md#movelearnmethodread) | **GET** /api/v2/move-learn-method/{id}/ |  |



## moveLearnMethodList

> string moveLearnMethodList(limit, offset)



### Example

```ts
import {
  Configuration,
  MoveLearnMethodApi,
} from '';
import type { MoveLearnMethodListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveLearnMethodApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies MoveLearnMethodListRequest;

  try {
    const data = await api.moveLearnMethodList(body);
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


## moveLearnMethodRead

> string moveLearnMethodRead(id)



### Example

```ts
import {
  Configuration,
  MoveLearnMethodApi,
} from '';
import type { MoveLearnMethodReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MoveLearnMethodApi();

  const body = {
    // number
    id: 56,
  } satisfies MoveLearnMethodReadRequest;

  try {
    const data = await api.moveLearnMethodRead(body);
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

