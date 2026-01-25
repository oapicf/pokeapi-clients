# .PokedexApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokedexList**](PokedexApi.md#pokedexList) | **GET** /api/v2/pokedex/ | 
[**pokedexRead**](PokedexApi.md#pokedexRead) | **GET** /api/v2/pokedex/{id}/ | 


# **pokedexList**
> pokedexList()


### Example


```typescript
import { createConfiguration, PokedexApi } from '';
import type { PokedexApiPokedexListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokedexApi(configuration);

const request: PokedexApiPokedexListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.pokedexList(request);
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

# **pokedexRead**
> pokedexRead()


### Example


```typescript
import { createConfiguration, PokedexApi } from '';
import type { PokedexApiPokedexReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokedexApi(configuration);

const request: PokedexApiPokedexReadRequest = {
  
  id: 1,
};

const data = await apiInstance.pokedexRead(request);
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


