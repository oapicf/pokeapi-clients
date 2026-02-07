# UtilityApi

All URIs are relative to *https://pokeapi.co*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**languageList**](#languagelist) | **GET** /api/v2/language/ | List languages|
|[**languageRetrieve**](#languageretrieve) | **GET** /api/v2/language/{id}/ | Get language|

# **languageList**
> PaginatedLanguageSummaryList languageList()

Languages for translations of API resource information.

### Example

```typescript
import {
    UtilityApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UtilityApi(configuration);

let limit: number; //Number of results to return per page. (optional) (default to undefined)
let offset: number; //The initial index from which to return the results. (optional) (default to undefined)
let q: string; //> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional) (default to undefined)

const { status, data } = await apiInstance.languageList(
    limit,
    offset,
    q
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined|
| **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined|
| **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined|


### Return type

**PaginatedLanguageSummaryList**

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **languageRetrieve**
> LanguageDetail languageRetrieve()

Languages for translations of API resource information.

### Example

```typescript
import {
    UtilityApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UtilityApi(configuration);

let id: string; //This parameter can be a string or an integer. (default to undefined)

const { status, data } = await apiInstance.languageRetrieve(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined|


### Return type

**LanguageDetail**

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

