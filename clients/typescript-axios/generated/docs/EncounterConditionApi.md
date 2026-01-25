# EncounterConditionApi

All URIs are relative to *https://pokeapi.co*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**encounterConditionList**](#encounterconditionlist) | **GET** /api/v2/encounter-condition/ | |
|[**encounterConditionRead**](#encounterconditionread) | **GET** /api/v2/encounter-condition/{id}/ | |

# **encounterConditionList**
> string encounterConditionList()


### Example

```typescript
import {
    EncounterConditionApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new EncounterConditionApi(configuration);

let limit: number; // (optional) (default to undefined)
let offset: number; // (optional) (default to undefined)

const { status, data } = await apiInstance.encounterConditionList(
    limit,
    offset
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] |  | (optional) defaults to undefined|
| **offset** | [**number**] |  | (optional) defaults to undefined|


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounterConditionRead**
> string encounterConditionRead()


### Example

```typescript
import {
    EncounterConditionApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new EncounterConditionApi(configuration);

let id: number; // (default to undefined)

const { status, data } = await apiInstance.encounterConditionRead(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**number**] |  | defaults to undefined|


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

