# .VersionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionList**](VersionApi.md#versionList) | **GET** /api/v2/version/ | 
[**versionRead**](VersionApi.md#versionRead) | **GET** /api/v2/version/{id}/ | 


# **versionList**
> versionList()


### Example


```typescript
import { createConfiguration, VersionApi } from '';
import type { VersionApiVersionListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VersionApi(configuration);

const request: VersionApiVersionListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.versionList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] |  | (optional) defaults to undefined
 **offset** | [**number**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **versionRead**
> versionRead()


### Example


```typescript
import { createConfiguration, VersionApi } from '';
import type { VersionApiVersionReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VersionApi(configuration);

const request: VersionApiVersionReadRequest = {
  
  id: 1,
};

const data = await apiInstance.versionRead(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**number**] |  | defaults to undefined


### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


