# .PalParkAreaApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**palParkAreaList**](PalParkAreaApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | 
[**palParkAreaRead**](PalParkAreaApi.md#palParkAreaRead) | **GET** /api/v2/pal-park-area/{id}/ | 


# **palParkAreaList**
> palParkAreaList()


### Example


```typescript
import { createConfiguration, PalParkAreaApi } from '';
import type { PalParkAreaApiPalParkAreaListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PalParkAreaApi(configuration);

const request: PalParkAreaApiPalParkAreaListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.palParkAreaList(request);
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

# **palParkAreaRead**
> palParkAreaRead()


### Example


```typescript
import { createConfiguration, PalParkAreaApi } from '';
import type { PalParkAreaApiPalParkAreaReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PalParkAreaApi(configuration);

const request: PalParkAreaApiPalParkAreaReadRequest = {
  
  id: 1,
};

const data = await apiInstance.palParkAreaRead(request);
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


