# .ContestTypeApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestTypeList**](ContestTypeApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | 
[**contestTypeRead**](ContestTypeApi.md#contestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 


# **contestTypeList**
> contestTypeList()


### Example


```typescript
import { createConfiguration, ContestTypeApi } from '';
import type { ContestTypeApiContestTypeListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ContestTypeApi(configuration);

const request: ContestTypeApiContestTypeListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.contestTypeList(request);
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

# **contestTypeRead**
> contestTypeRead()


### Example


```typescript
import { createConfiguration, ContestTypeApi } from '';
import type { ContestTypeApiContestTypeReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ContestTypeApi(configuration);

const request: ContestTypeApiContestTypeReadRequest = {
  
  id: 1,
};

const data = await apiInstance.contestTypeRead(request);
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


