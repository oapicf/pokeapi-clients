# ItemFlingEffectApi

All URIs are relative to *https://pokeapi.co*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**itemFlingEffectList**](#itemflingeffectlist) | **GET** /api/v2/item-fling-effect/ | |
|[**itemFlingEffectRead**](#itemflingeffectread) | **GET** /api/v2/item-fling-effect/{id}/ | |

# **itemFlingEffectList**
> string itemFlingEffectList()


### Example

```typescript
import {
    ItemFlingEffectApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ItemFlingEffectApi(configuration);

let limit: number; // (optional) (default to undefined)
let offset: number; // (optional) (default to undefined)

const { status, data } = await apiInstance.itemFlingEffectList(
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

# **itemFlingEffectRead**
> string itemFlingEffectRead()


### Example

```typescript
import {
    ItemFlingEffectApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ItemFlingEffectApi(configuration);

let id: number; // (default to undefined)

const { status, data } = await apiInstance.itemFlingEffectRead(
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

