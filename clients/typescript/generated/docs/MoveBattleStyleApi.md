# .MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveBattleStyleList**](MoveBattleStyleApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | 
[**moveBattleStyleRead**](MoveBattleStyleApi.md#moveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 


# **moveBattleStyleList**
> moveBattleStyleList()


### Example


```typescript
import { createConfiguration, MoveBattleStyleApi } from '';
import type { MoveBattleStyleApiMoveBattleStyleListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveBattleStyleApi(configuration);

const request: MoveBattleStyleApiMoveBattleStyleListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.moveBattleStyleList(request);
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

# **moveBattleStyleRead**
> moveBattleStyleRead()


### Example


```typescript
import { createConfiguration, MoveBattleStyleApi } from '';
import type { MoveBattleStyleApiMoveBattleStyleReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveBattleStyleApi(configuration);

const request: MoveBattleStyleApiMoveBattleStyleReadRequest = {
  
  id: 1,
};

const data = await apiInstance.moveBattleStyleRead(request);
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


