# .AbilityApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abilityList**](AbilityApi.md#abilityList) | **GET** /api/v2/ability/ | 
[**abilityRead**](AbilityApi.md#abilityRead) | **GET** /api/v2/ability/{id}/ | 


# **abilityList**
> abilityList()


### Example


```typescript
import { createConfiguration, AbilityApi } from '';
import type { AbilityApiAbilityListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AbilityApi(configuration);

const request: AbilityApiAbilityListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.abilityList(request);
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

# **abilityRead**
> abilityRead()


### Example


```typescript
import { createConfiguration, AbilityApi } from '';
import type { AbilityApiAbilityReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AbilityApi(configuration);

const request: AbilityApiAbilityReadRequest = {
  
  id: 1,
};

const data = await apiInstance.abilityRead(request);
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


