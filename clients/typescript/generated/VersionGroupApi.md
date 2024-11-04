# .VersionGroupApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionGroupList**](VersionGroupApi.md#versionGroupList) | **GET** /api/v2/version-group/ | 
[**versionGroupRead**](VersionGroupApi.md#versionGroupRead) | **GET** /api/v2/version-group/{id}/ | 


# **versionGroupList**
> versionGroupList()


### Example


```typescript
import { createConfiguration, VersionGroupApi } from '';
import type { VersionGroupApiVersionGroupListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VersionGroupApi(configuration);

const request: VersionGroupApiVersionGroupListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.versionGroupList(request);
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

# **versionGroupRead**
> versionGroupRead()


### Example


```typescript
import { createConfiguration, VersionGroupApi } from '';
import type { VersionGroupApiVersionGroupReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VersionGroupApi(configuration);

const request: VersionGroupApiVersionGroupReadRequest = {
  
  id: 1,
};

const data = await apiInstance.versionGroupRead(request);
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


