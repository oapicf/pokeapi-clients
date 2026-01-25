# .CharacteristicApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**characteristicList**](CharacteristicApi.md#characteristicList) | **GET** /api/v2/characteristic/ | 
[**characteristicRead**](CharacteristicApi.md#characteristicRead) | **GET** /api/v2/characteristic/{id}/ | 


# **characteristicList**
> characteristicList()


### Example


```typescript
import { createConfiguration, CharacteristicApi } from '';
import type { CharacteristicApiCharacteristicListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CharacteristicApi(configuration);

const request: CharacteristicApiCharacteristicListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.characteristicList(request);
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

# **characteristicRead**
> characteristicRead()


### Example


```typescript
import { createConfiguration, CharacteristicApi } from '';
import type { CharacteristicApiCharacteristicReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CharacteristicApi(configuration);

const request: CharacteristicApiCharacteristicReadRequest = {
  
  id: 1,
};

const data = await apiInstance.characteristicRead(request);
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


