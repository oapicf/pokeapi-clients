# .LocationAreaApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationAreaList**](LocationAreaApi.md#locationAreaList) | **GET** /api/v2/location-area/ | 
[**locationAreaRead**](LocationAreaApi.md#locationAreaRead) | **GET** /api/v2/location-area/{id}/ | 


# **locationAreaList**
> locationAreaList()


### Example


```typescript
import { createConfiguration, LocationAreaApi } from '';
import type { LocationAreaApiLocationAreaListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LocationAreaApi(configuration);

const request: LocationAreaApiLocationAreaListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.locationAreaList(request);
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

# **locationAreaRead**
> locationAreaRead()


### Example


```typescript
import { createConfiguration, LocationAreaApi } from '';
import type { LocationAreaApiLocationAreaReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LocationAreaApi(configuration);

const request: LocationAreaApiLocationAreaReadRequest = {
  
  id: 1,
};

const data = await apiInstance.locationAreaRead(request);
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


