# .ContestEffectApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestEffectList**](ContestEffectApi.md#contestEffectList) | **GET** /api/v2/contest-effect/ | 
[**contestEffectRead**](ContestEffectApi.md#contestEffectRead) | **GET** /api/v2/contest-effect/{id}/ | 


# **contestEffectList**
> contestEffectList()


### Example


```typescript
import { createConfiguration, ContestEffectApi } from '';
import type { ContestEffectApiContestEffectListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ContestEffectApi(configuration);

const request: ContestEffectApiContestEffectListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.contestEffectList(request);
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

# **contestEffectRead**
> contestEffectRead()


### Example


```typescript
import { createConfiguration, ContestEffectApi } from '';
import type { ContestEffectApiContestEffectReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ContestEffectApi(configuration);

const request: ContestEffectApiContestEffectReadRequest = {
  
  id: 1,
};

const data = await apiInstance.contestEffectRead(request);
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


