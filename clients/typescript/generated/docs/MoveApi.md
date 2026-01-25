# .MoveApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveList**](MoveApi.md#moveList) | **GET** /api/v2/move/ | 
[**moveRead**](MoveApi.md#moveRead) | **GET** /api/v2/move/{id}/ | 


# **moveList**
> moveList()


### Example


```typescript
import { createConfiguration, MoveApi } from '';
import type { MoveApiMoveListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveApi(configuration);

const request: MoveApiMoveListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.moveList(request);
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

# **moveRead**
> moveRead()


### Example


```typescript
import { createConfiguration, MoveApi } from '';
import type { MoveApiMoveReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveApi(configuration);

const request: MoveApiMoveReadRequest = {
  
  id: 1,
};

const data = await apiInstance.moveRead(request);
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


