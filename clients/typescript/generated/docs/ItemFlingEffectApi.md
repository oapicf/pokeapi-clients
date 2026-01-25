# .ItemFlingEffectApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemFlingEffectList**](ItemFlingEffectApi.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | 
[**itemFlingEffectRead**](ItemFlingEffectApi.md#itemFlingEffectRead) | **GET** /api/v2/item-fling-effect/{id}/ | 


# **itemFlingEffectList**
> itemFlingEffectList()


### Example


```typescript
import { createConfiguration, ItemFlingEffectApi } from '';
import type { ItemFlingEffectApiItemFlingEffectListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ItemFlingEffectApi(configuration);

const request: ItemFlingEffectApiItemFlingEffectListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.itemFlingEffectList(request);
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

# **itemFlingEffectRead**
> itemFlingEffectRead()


### Example


```typescript
import { createConfiguration, ItemFlingEffectApi } from '';
import type { ItemFlingEffectApiItemFlingEffectReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ItemFlingEffectApi(configuration);

const request: ItemFlingEffectApiItemFlingEffectReadRequest = {
  
  id: 1,
};

const data = await apiInstance.itemFlingEffectRead(request);
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


