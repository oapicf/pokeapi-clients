# .EncounterConditionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](EncounterConditionApi.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | 
[**encounterConditionRead**](EncounterConditionApi.md#encounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ | 


# **encounterConditionList**
> encounterConditionList()


### Example


```typescript
import { createConfiguration, EncounterConditionApi } from '';
import type { EncounterConditionApiEncounterConditionListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EncounterConditionApi(configuration);

const request: EncounterConditionApiEncounterConditionListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.encounterConditionList(request);
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

# **encounterConditionRead**
> encounterConditionRead()


### Example


```typescript
import { createConfiguration, EncounterConditionApi } from '';
import type { EncounterConditionApiEncounterConditionReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EncounterConditionApi(configuration);

const request: EncounterConditionApiEncounterConditionReadRequest = {
  
  id: 1,
};

const data = await apiInstance.encounterConditionRead(request);
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


