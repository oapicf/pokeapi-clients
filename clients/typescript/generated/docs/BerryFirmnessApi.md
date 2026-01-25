# .BerryFirmnessApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](BerryFirmnessApi.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | 
[**berryFirmnessRead**](BerryFirmnessApi.md#berryFirmnessRead) | **GET** /api/v2/berry-firmness/{id}/ | 


# **berryFirmnessList**
> berryFirmnessList()


### Example


```typescript
import { createConfiguration, BerryFirmnessApi } from '';
import type { BerryFirmnessApiBerryFirmnessListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BerryFirmnessApi(configuration);

const request: BerryFirmnessApiBerryFirmnessListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.berryFirmnessList(request);
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

# **berryFirmnessRead**
> berryFirmnessRead()


### Example


```typescript
import { createConfiguration, BerryFirmnessApi } from '';
import type { BerryFirmnessApiBerryFirmnessReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BerryFirmnessApi(configuration);

const request: BerryFirmnessApiBerryFirmnessReadRequest = {
  
  id: 1,
};

const data = await apiInstance.berryFirmnessRead(request);
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


