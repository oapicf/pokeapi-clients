# MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**moveBattleStyleList**](#movebattlestylelist) | **GET** /api/v2/move-battle-style/ | |
|[**moveBattleStyleRead**](#movebattlestyleread) | **GET** /api/v2/move-battle-style/{id}/ | |

# **moveBattleStyleList**
> string moveBattleStyleList()


### Example

```typescript
import {
    MoveBattleStyleApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new MoveBattleStyleApi(configuration);

let limit: number; // (optional) (default to undefined)
let offset: number; // (optional) (default to undefined)

const { status, data } = await apiInstance.moveBattleStyleList(
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

# **moveBattleStyleRead**
> string moveBattleStyleRead()


### Example

```typescript
import {
    MoveBattleStyleApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new MoveBattleStyleApi(configuration);

let id: number; // (default to undefined)

const { status, data } = await apiInstance.moveBattleStyleRead(
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

