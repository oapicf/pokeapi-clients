# .MoveDamageClassApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveDamageClassList**](MoveDamageClassApi.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | 
[**moveDamageClassRead**](MoveDamageClassApi.md#moveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ | 


# **moveDamageClassList**
> moveDamageClassList()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MoveDamageClassApi(configuration);

let body:.MoveDamageClassApiMoveDamageClassListRequest = {
  // number (optional)
  limit: 1,
  // number (optional)
  offset: 1,
};

apiInstance.moveDamageClassList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MoveDamageClassApi(configuration);

let body:.MoveDamageClassApiMoveDamageClassReadRequest = {
  // number
  id: 1,
};

apiInstance.moveDamageClassRead(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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


