# LanguageApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**languageList**](LanguageApi.md#languagelist) | **GET** /api/v2/language/ |  |
| [**languageRead**](LanguageApi.md#languageread) | **GET** /api/v2/language/{id}/ |  |



## languageList

> string languageList(limit, offset)



### Example

```ts
import {
  Configuration,
  LanguageApi,
} from '';
import type { LanguageListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new LanguageApi();

  const body = {
    // number (optional)
    limit: 56,
    // number (optional)
    offset: 56,
  } satisfies LanguageListRequest;

  try {
    const data = await api.languageList(body);
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


## languageRead

> string languageRead(id)



### Example

```ts
import {
  Configuration,
  LanguageApi,
} from '';
import type { LanguageReadRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new LanguageApi();

  const body = {
    // number
    id: 56,
  } satisfies LanguageReadRequest;

  try {
    const data = await api.languageRead(body);
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

