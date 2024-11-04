# .ItemAttributeApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemAttributeList**](ItemAttributeApi.md#itemAttributeList) | **GET** /api/v2/item-attribute/ | 
[**itemAttributeRead**](ItemAttributeApi.md#itemAttributeRead) | **GET** /api/v2/item-attribute/{id}/ | 


# **itemAttributeList**
> itemAttributeList()


### Example


```typescript
import { createConfiguration, ItemAttributeApi } from '';
import type { ItemAttributeApiItemAttributeListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ItemAttributeApi(configuration);

const request: ItemAttributeApiItemAttributeListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.itemAttributeList(request);
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

# **itemAttributeRead**
> itemAttributeRead()


### Example


```typescript
import { createConfiguration, ItemAttributeApi } from '';
import type { ItemAttributeApiItemAttributeReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ItemAttributeApi(configuration);

const request: ItemAttributeApiItemAttributeReadRequest = {
  
  id: 1,
};

const data = await apiInstance.itemAttributeRead(request);
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


