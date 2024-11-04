# .EvolutionChainApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](EvolutionChainApi.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | 
[**evolutionChainRead**](EvolutionChainApi.md#evolutionChainRead) | **GET** /api/v2/evolution-chain/{id}/ | 


# **evolutionChainList**
> evolutionChainList()


### Example


```typescript
import { createConfiguration, EvolutionChainApi } from '';
import type { EvolutionChainApiEvolutionChainListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EvolutionChainApi(configuration);

const request: EvolutionChainApiEvolutionChainListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.evolutionChainList(request);
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

# **evolutionChainRead**
> evolutionChainRead()


### Example


```typescript
import { createConfiguration, EvolutionChainApi } from '';
import type { EvolutionChainApiEvolutionChainReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EvolutionChainApi(configuration);

const request: EvolutionChainApiEvolutionChainReadRequest = {
  
  id: 1,
};

const data = await apiInstance.evolutionChainRead(request);
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


