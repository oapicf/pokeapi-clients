# MoveCategoryApi

All URIs are relative to *https://pokeapi.co*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**moveCategoryList**](#movecategorylist) | **GET** /api/v2/move-category/ | |
|[**moveCategoryRead**](#movecategoryread) | **GET** /api/v2/move-category/{id}/ | |

# **moveCategoryList**
> string moveCategoryList()


### Example

```typescript
import {
    MoveCategoryApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new MoveCategoryApi(configuration);

let limit: number; // (optional) (default to undefined)
let offset: number; // (optional) (default to undefined)

const { status, data } = await apiInstance.moveCategoryList(
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

# **moveCategoryRead**
> string moveCategoryRead()


### Example

```typescript
import {
    MoveCategoryApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new MoveCategoryApi(configuration);

let id: number; // (default to undefined)

const { status, data } = await apiInstance.moveCategoryRead(
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

