# .PokemonApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonList**](PokemonApi.md#pokemonList) | **GET** /api/v2/pokemon/ | 
[**pokemonRead**](PokemonApi.md#pokemonRead) | **GET** /api/v2/pokemon/{id}/ | 


# **pokemonList**
> pokemonList()


### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.pokemonList(request);
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

# **pokemonRead**
> pokemonRead()


### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonReadRequest = {
  
  id: 1,
};

const data = await apiInstance.pokemonRead(request);
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


