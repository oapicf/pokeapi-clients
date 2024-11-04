# .EncounterMethodApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterMethodList**](EncounterMethodApi.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | 
[**encounterMethodRead**](EncounterMethodApi.md#encounterMethodRead) | **GET** /api/v2/encounter-method/{id}/ | 


# **encounterMethodList**
> encounterMethodList()


### Example


```typescript
import { createConfiguration, EncounterMethodApi } from '';
import type { EncounterMethodApiEncounterMethodListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EncounterMethodApi(configuration);

const request: EncounterMethodApiEncounterMethodListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.encounterMethodList(request);
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

# **encounterMethodRead**
> encounterMethodRead()


### Example


```typescript
import { createConfiguration, EncounterMethodApi } from '';
import type { EncounterMethodApiEncounterMethodReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EncounterMethodApi(configuration);

const request: EncounterMethodApiEncounterMethodReadRequest = {
  
  id: 1,
};

const data = await apiInstance.encounterMethodRead(request);
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


