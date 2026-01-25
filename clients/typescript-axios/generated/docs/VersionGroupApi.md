# VersionGroupApi

All URIs are relative to *https://pokeapi.co*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**versionGroupList**](#versiongrouplist) | **GET** /api/v2/version-group/ | |
|[**versionGroupRead**](#versiongroupread) | **GET** /api/v2/version-group/{id}/ | |

# **versionGroupList**
> string versionGroupList()


### Example

```typescript
import {
    VersionGroupApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VersionGroupApi(configuration);

let limit: number; // (optional) (default to undefined)
let offset: number; // (optional) (default to undefined)

const { status, data } = await apiInstance.versionGroupList(
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

# **versionGroupRead**
> string versionGroupRead()


### Example

```typescript
import {
    VersionGroupApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VersionGroupApi(configuration);

let id: number; // (default to undefined)

const { status, data } = await apiInstance.versionGroupRead(
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

