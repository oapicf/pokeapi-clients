# .GenderApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genderList**](GenderApi.md#genderList) | **GET** /api/v2/gender/ | 
[**genderRead**](GenderApi.md#genderRead) | **GET** /api/v2/gender/{id}/ | 


# **genderList**
> genderList()


### Example


```typescript
import { createConfiguration, GenderApi } from '';
import type { GenderApiGenderListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GenderApi(configuration);

const request: GenderApiGenderListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.genderList(request);
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

# **genderRead**
> genderRead()


### Example


```typescript
import { createConfiguration, GenderApi } from '';
import type { GenderApiGenderReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GenderApi(configuration);

const request: GenderApiGenderReadRequest = {
  
  id: 1,
};

const data = await apiInstance.genderRead(request);
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


