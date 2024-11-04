# .MoveAilmentApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](MoveAilmentApi.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | 
[**moveAilmentRead**](MoveAilmentApi.md#moveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ | 


# **moveAilmentList**
> moveAilmentList()


### Example


```typescript
import { createConfiguration, MoveAilmentApi } from '';
import type { MoveAilmentApiMoveAilmentListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveAilmentApi(configuration);

const request: MoveAilmentApiMoveAilmentListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.moveAilmentList(request);
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

# **moveAilmentRead**
> moveAilmentRead()


### Example


```typescript
import { createConfiguration, MoveAilmentApi } from '';
import type { MoveAilmentApiMoveAilmentReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveAilmentApi(configuration);

const request: MoveAilmentApiMoveAilmentReadRequest = {
  
  id: 1,
};

const data = await apiInstance.moveAilmentRead(request);
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


