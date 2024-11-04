# .ItemPocketApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemPocketList**](ItemPocketApi.md#itemPocketList) | **GET** /api/v2/item-pocket/ | 
[**itemPocketRead**](ItemPocketApi.md#itemPocketRead) | **GET** /api/v2/item-pocket/{id}/ | 


# **itemPocketList**
> itemPocketList()


### Example


```typescript
import { createConfiguration, ItemPocketApi } from '';
import type { ItemPocketApiItemPocketListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ItemPocketApi(configuration);

const request: ItemPocketApiItemPocketListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.itemPocketList(request);
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

# **itemPocketRead**
> itemPocketRead()


### Example


```typescript
import { createConfiguration, ItemPocketApi } from '';
import type { ItemPocketApiItemPocketReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ItemPocketApi(configuration);

const request: ItemPocketApiItemPocketReadRequest = {
  
  id: 1,
};

const data = await apiInstance.itemPocketRead(request);
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


