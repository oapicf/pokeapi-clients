# .PokemonFormApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonFormList**](PokemonFormApi.md#pokemonFormList) | **GET** /api/v2/pokemon-form/ | 
[**pokemonFormRead**](PokemonFormApi.md#pokemonFormRead) | **GET** /api/v2/pokemon-form/{id}/ | 


# **pokemonFormList**
> pokemonFormList()


### Example


```typescript
import { createConfiguration, PokemonFormApi } from '';
import type { PokemonFormApiPokemonFormListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonFormApi(configuration);

const request: PokemonFormApiPokemonFormListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.pokemonFormList(request);
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

# **pokemonFormRead**
> pokemonFormRead()


### Example


```typescript
import { createConfiguration, PokemonFormApi } from '';
import type { PokemonFormApiPokemonFormReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonFormApi(configuration);

const request: PokemonFormApiPokemonFormReadRequest = {
  
  id: 1,
};

const data = await apiInstance.pokemonFormRead(request);
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


