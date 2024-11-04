# .PokemonShapeApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonShapeList**](PokemonShapeApi.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | 
[**pokemonShapeRead**](PokemonShapeApi.md#pokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ | 


# **pokemonShapeList**
> pokemonShapeList()


### Example


```typescript
import { createConfiguration, PokemonShapeApi } from '';
import type { PokemonShapeApiPokemonShapeListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonShapeApi(configuration);

const request: PokemonShapeApiPokemonShapeListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.pokemonShapeList(request);
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

# **pokemonShapeRead**
> pokemonShapeRead()


### Example


```typescript
import { createConfiguration, PokemonShapeApi } from '';
import type { PokemonShapeApiPokemonShapeReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonShapeApi(configuration);

const request: PokemonShapeApiPokemonShapeReadRequest = {
  
  id: 1,
};

const data = await apiInstance.pokemonShapeRead(request);
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


