# .BerryApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryList**](BerryApi.md#berryList) | **GET** /api/v2/berry/ | 
[**berryRead**](BerryApi.md#berryRead) | **GET** /api/v2/berry/{id}/ | 


# **berryList**
> berryList()


### Example


```typescript
import { createConfiguration, BerryApi } from '';
import type { BerryApiBerryListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BerryApi(configuration);

const request: BerryApiBerryListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.berryList(request);
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

# **berryRead**
> berryRead()


### Example


```typescript
import { createConfiguration, BerryApi } from '';
import type { BerryApiBerryReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BerryApi(configuration);

const request: BerryApiBerryReadRequest = {
  
  id: 1,
};

const data = await apiInstance.berryRead(request);
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


