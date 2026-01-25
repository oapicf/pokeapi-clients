# .RegionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**regionList**](RegionApi.md#regionList) | **GET** /api/v2/region/ | 
[**regionRead**](RegionApi.md#regionRead) | **GET** /api/v2/region/{id}/ | 


# **regionList**
> regionList()


### Example


```typescript
import { createConfiguration, RegionApi } from '';
import type { RegionApiRegionListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new RegionApi(configuration);

const request: RegionApiRegionListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.regionList(request);
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

# **regionRead**
> regionRead()


### Example


```typescript
import { createConfiguration, RegionApi } from '';
import type { RegionApiRegionReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new RegionApi(configuration);

const request: RegionApiRegionReadRequest = {
  
  id: 1,
};

const data = await apiInstance.regionRead(request);
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


