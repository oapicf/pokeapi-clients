# .EggGroupApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eggGroupList**](EggGroupApi.md#eggGroupList) | **GET** /api/v2/egg-group/ | 
[**eggGroupRead**](EggGroupApi.md#eggGroupRead) | **GET** /api/v2/egg-group/{id}/ | 


# **eggGroupList**
> eggGroupList()


### Example


```typescript
import { createConfiguration, EggGroupApi } from '';
import type { EggGroupApiEggGroupListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EggGroupApi(configuration);

const request: EggGroupApiEggGroupListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.eggGroupList(request);
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

# **eggGroupRead**
> eggGroupRead()


### Example


```typescript
import { createConfiguration, EggGroupApi } from '';
import type { EggGroupApiEggGroupReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EggGroupApi(configuration);

const request: EggGroupApiEggGroupReadRequest = {
  
  id: 1,
};

const data = await apiInstance.eggGroupRead(request);
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


