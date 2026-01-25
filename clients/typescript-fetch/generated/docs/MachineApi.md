# MachineApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**machineList**](MachineApi.md#machinelist) | **GET** /api/v2/machine/ |  |
| [**machineRead**](MachineApi.md#machineread) | **GET** /api/v2/machine/{id}/ |  |



## machineList

> string machineList(limit, offset)



### Example

```ts
import {
  Configuration,
  MachineApi,
} from '';
import type { MachineListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MachineApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies MachineListRequest;

  try {
    const data = await api.machineList(body);
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


## machineRead

> string machineRead(id)



### Example

```ts
import {
  Configuration,
  MachineApi,
} from '';
import type { MachineReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new MachineApi();

  const body = {
    // number
    id: 56,
  } satisfies MachineReadRequest;

  try {
    const data = await api.machineRead(body);
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

