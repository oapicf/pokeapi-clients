# .EvolutionTriggerApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionTriggerList**](EvolutionTriggerApi.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | 
[**evolutionTriggerRead**](EvolutionTriggerApi.md#evolutionTriggerRead) | **GET** /api/v2/evolution-trigger/{id}/ | 


# **evolutionTriggerList**
> evolutionTriggerList()


### Example


```typescript
import { createConfiguration, EvolutionTriggerApi } from '';
import type { EvolutionTriggerApiEvolutionTriggerListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EvolutionTriggerApi(configuration);

const request: EvolutionTriggerApiEvolutionTriggerListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.evolutionTriggerList(request);
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

# **evolutionTriggerRead**
> evolutionTriggerRead()


### Example


```typescript
import { createConfiguration, EvolutionTriggerApi } from '';
import type { EvolutionTriggerApiEvolutionTriggerReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EvolutionTriggerApi(configuration);

const request: EvolutionTriggerApiEvolutionTriggerReadRequest = {
  
  id: 1,
};

const data = await apiInstance.evolutionTriggerRead(request);
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


