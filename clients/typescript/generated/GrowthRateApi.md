# .GrowthRateApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**growthRateList**](GrowthRateApi.md#growthRateList) | **GET** /api/v2/growth-rate/ | 
[**growthRateRead**](GrowthRateApi.md#growthRateRead) | **GET** /api/v2/growth-rate/{id}/ | 


# **growthRateList**
> growthRateList()


### Example


```typescript
import { createConfiguration, GrowthRateApi } from '';
import type { GrowthRateApiGrowthRateListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GrowthRateApi(configuration);

const request: GrowthRateApiGrowthRateListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.growthRateList(request);
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

# **growthRateRead**
> growthRateRead()


### Example


```typescript
import { createConfiguration, GrowthRateApi } from '';
import type { GrowthRateApiGrowthRateReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GrowthRateApi(configuration);

const request: GrowthRateApiGrowthRateReadRequest = {
  
  id: 1,
};

const data = await apiInstance.growthRateRead(request);
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


