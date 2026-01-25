# AbilityApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**abilityList**](AbilityApi.md#abilitylist) | **GET** /api/v2/ability/ |  |
| [**abilityRead**](AbilityApi.md#abilityread) | **GET** /api/v2/ability/{id}/ |  |



## abilityList

> string abilityList(limit, offset)



### Example

```ts
import {
  Configuration,
  AbilityApi,
} from '';
import type { AbilityListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new AbilityApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies AbilityListRequest;

  try {
    const data = await api.abilityList(body);
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


## abilityRead

> string abilityRead(id)



### Example

```ts
import {
  Configuration,
  AbilityApi,
} from '';
import type { AbilityReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new AbilityApi();

  const body = {
    // number
    id: 56,
  } satisfies AbilityReadRequest;

  try {
    const data = await api.abilityRead(body);
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

