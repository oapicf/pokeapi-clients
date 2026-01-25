# .SuperContestEffectApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**superContestEffectList**](SuperContestEffectApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
[**superContestEffectRead**](SuperContestEffectApi.md#superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 


# **superContestEffectList**
> superContestEffectList()


### Example


```typescript
import { createConfiguration, SuperContestEffectApi } from '';
import type { SuperContestEffectApiSuperContestEffectListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SuperContestEffectApi(configuration);

const request: SuperContestEffectApiSuperContestEffectListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.superContestEffectList(request);
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

# **superContestEffectRead**
> superContestEffectRead()


### Example


```typescript
import { createConfiguration, SuperContestEffectApi } from '';
import type { SuperContestEffectApiSuperContestEffectReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new SuperContestEffectApi(configuration);

const request: SuperContestEffectApiSuperContestEffectReadRequest = {
  
  id: 1,
};

const data = await apiInstance.superContestEffectRead(request);
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


