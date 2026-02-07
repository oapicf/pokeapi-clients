# UtilityApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**languageList**](UtilityApi.md#languagelist) | **GET** /api/v2/language/ | List languages |
| [**languageRetrieve**](UtilityApi.md#languageretrieve) | **GET** /api/v2/language/{id}/ | Get language |



## languageList

> PaginatedLanguageSummaryList languageList(limit, offset, q)

List languages

Languages for translations of API resource information.

### Example

```ts
import {
  Configuration,
  UtilityApi,
} from '';
import type { LanguageListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new UtilityApi(config);

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
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
| **limit** | `number` | Number of results to return per page. | [Optional] [Defaults to `undefined`] |
| **offset** | `number` | The initial index from which to return the results. | [Optional] [Defaults to `undefined`] |
| **q** | `string` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [Optional] [Defaults to `undefined`] |

### Return type

[**PaginatedLanguageSummaryList**](PaginatedLanguageSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## languageRetrieve

> LanguageDetail languageRetrieve(id)

Get language

Languages for translations of API resource information.

### Example

```ts
import {
  Configuration,
  UtilityApi,
} from '';
import type { LanguageRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: basicAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
    // To configure API key authorization: cookieAuth
    apiKey: "YOUR API KEY",
  });
  const api = new UtilityApi(config);

  const body = {
    // string | This parameter can be a string or an integer.
    id: id_example,
  } satisfies LanguageRetrieveRequest;

  try {
    const data = await api.languageRetrieve(body);
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
| **id** | `string` | This parameter can be a string or an integer. | [Defaults to `undefined`] |

### Return type

[**LanguageDetail**](LanguageDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

