# .TypeApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**typeList**](TypeApi.md#typeList) | **GET** /api/v2/type/ | 
[**typeRead**](TypeApi.md#typeRead) | **GET** /api/v2/type/{id}/ | 


# **typeList**
> typeList()


### Example


```typescript
import { createConfiguration, TypeApi } from '';
import type { TypeApiTypeListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TypeApi(configuration);

const request: TypeApiTypeListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.typeList(request);
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

# **typeRead**
> typeRead()


### Example


```typescript
import { createConfiguration, TypeApi } from '';
import type { TypeApiTypeReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TypeApi(configuration);

const request: TypeApiTypeReadRequest = {
  
  id: 1,
};

const data = await apiInstance.typeRead(request);
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


