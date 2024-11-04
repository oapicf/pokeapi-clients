# .MoveLearnMethodApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveLearnMethodList**](MoveLearnMethodApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | 
[**moveLearnMethodRead**](MoveLearnMethodApi.md#moveLearnMethodRead) | **GET** /api/v2/move-learn-method/{id}/ | 


# **moveLearnMethodList**
> moveLearnMethodList()


### Example


```typescript
import { createConfiguration, MoveLearnMethodApi } from '';
import type { MoveLearnMethodApiMoveLearnMethodListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveLearnMethodApi(configuration);

const request: MoveLearnMethodApiMoveLearnMethodListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.moveLearnMethodList(request);
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

# **moveLearnMethodRead**
> moveLearnMethodRead()


### Example


```typescript
import { createConfiguration, MoveLearnMethodApi } from '';
import type { MoveLearnMethodApiMoveLearnMethodReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveLearnMethodApi(configuration);

const request: MoveLearnMethodApiMoveLearnMethodReadRequest = {
  
  id: 1,
};

const data = await apiInstance.moveLearnMethodRead(request);
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


