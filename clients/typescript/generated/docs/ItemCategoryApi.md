# .ItemCategoryApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemCategoryList**](ItemCategoryApi.md#itemCategoryList) | **GET** /api/v2/item-category/ | 
[**itemCategoryRead**](ItemCategoryApi.md#itemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 


# **itemCategoryList**
> itemCategoryList()


### Example


```typescript
import { createConfiguration, ItemCategoryApi } from '';
import type { ItemCategoryApiItemCategoryListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ItemCategoryApi(configuration);

const request: ItemCategoryApiItemCategoryListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.itemCategoryList(request);
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

# **itemCategoryRead**
> itemCategoryRead()


### Example


```typescript
import { createConfiguration, ItemCategoryApi } from '';
import type { ItemCategoryApiItemCategoryReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ItemCategoryApi(configuration);

const request: ItemCategoryApiItemCategoryReadRequest = {
  
  id: 1,
};

const data = await apiInstance.itemCategoryRead(request);
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


