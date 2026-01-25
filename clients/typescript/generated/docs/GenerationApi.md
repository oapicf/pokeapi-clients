# .GenerationApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](GenerationApi.md#generationList) | **GET** /api/v2/generation/ | 
[**generationRead**](GenerationApi.md#generationRead) | **GET** /api/v2/generation/{id}/ | 


# **generationList**
> generationList()


### Example


```typescript
import { createConfiguration, GenerationApi } from '';
import type { GenerationApiGenerationListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GenerationApi(configuration);

const request: GenerationApiGenerationListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.generationList(request);
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

# **generationRead**
> generationRead()


### Example


```typescript
import { createConfiguration, GenerationApi } from '';
import type { GenerationApiGenerationReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GenerationApi(configuration);

const request: GenerationApiGenerationReadRequest = {
  
  id: 1,
};

const data = await apiInstance.generationRead(request);
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


