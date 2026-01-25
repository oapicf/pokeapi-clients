# .MoveTargetApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveTargetList**](MoveTargetApi.md#moveTargetList) | **GET** /api/v2/move-target/ | 
[**moveTargetRead**](MoveTargetApi.md#moveTargetRead) | **GET** /api/v2/move-target/{id}/ | 


# **moveTargetList**
> moveTargetList()


### Example


```typescript
import { createConfiguration, MoveTargetApi } from '';
import type { MoveTargetApiMoveTargetListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveTargetApi(configuration);

const request: MoveTargetApiMoveTargetListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.moveTargetList(request);
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

# **moveTargetRead**
> moveTargetRead()


### Example


```typescript
import { createConfiguration, MoveTargetApi } from '';
import type { MoveTargetApiMoveTargetReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveTargetApi(configuration);

const request: MoveTargetApiMoveTargetReadRequest = {
  
  id: 1,
};

const data = await apiInstance.moveTargetRead(request);
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


