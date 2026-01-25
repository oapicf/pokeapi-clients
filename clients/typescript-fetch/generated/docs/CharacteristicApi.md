# CharacteristicApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**characteristicList**](CharacteristicApi.md#characteristiclist) | **GET** /api/v2/characteristic/ |  |
| [**characteristicRead**](CharacteristicApi.md#characteristicread) | **GET** /api/v2/characteristic/{id}/ |  |



## characteristicList

> string characteristicList(limit, offset)



### Example

```ts
import {
  Configuration,
  CharacteristicApi,
} from '';
import type { CharacteristicListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new CharacteristicApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies CharacteristicListRequest;

  try {
    const data = await api.characteristicList(body);
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


## characteristicRead

> string characteristicRead(id)



### Example

```ts
import {
  Configuration,
  CharacteristicApi,
} from '';
import type { CharacteristicReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new CharacteristicApi();

  const body = {
    // number
    id: 56,
  } satisfies CharacteristicReadRequest;

  try {
    const data = await api.characteristicRead(body);
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

