# .MoveDamageClassApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveDamageClassList**](MoveDamageClassApi.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | 
[**moveDamageClassRead**](MoveDamageClassApi.md#moveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ | 


# **moveDamageClassList**
> moveDamageClassList()


### Example


```typescript
import { createConfiguration, MoveDamageClassApi } from '';
import type { MoveDamageClassApiMoveDamageClassListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveDamageClassApi(configuration);

const request: MoveDamageClassApiMoveDamageClassListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.moveDamageClassList(request);
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

# **moveDamageClassRead**
> moveDamageClassRead()


### Example


```typescript
import { createConfiguration, MoveDamageClassApi } from '';
import type { MoveDamageClassApiMoveDamageClassReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MoveDamageClassApi(configuration);

const request: MoveDamageClassApiMoveDamageClassReadRequest = {
  
  id: 1,
};

const data = await apiInstance.moveDamageClassRead(request);
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


