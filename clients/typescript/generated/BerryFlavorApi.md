# .BerryFlavorApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFlavorList**](BerryFlavorApi.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | 
[**berryFlavorRead**](BerryFlavorApi.md#berryFlavorRead) | **GET** /api/v2/berry-flavor/{id}/ | 


# **berryFlavorList**
> berryFlavorList()


### Example


```typescript
import { createConfiguration, BerryFlavorApi } from '';
import type { BerryFlavorApiBerryFlavorListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BerryFlavorApi(configuration);

const request: BerryFlavorApiBerryFlavorListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.berryFlavorList(request);
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

# **berryFlavorRead**
> berryFlavorRead()


### Example


```typescript
import { createConfiguration, BerryFlavorApi } from '';
import type { BerryFlavorApiBerryFlavorReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BerryFlavorApi(configuration);

const request: BerryFlavorApiBerryFlavorReadRequest = {
  
  id: 1,
};

const data = await apiInstance.berryFlavorRead(request);
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


