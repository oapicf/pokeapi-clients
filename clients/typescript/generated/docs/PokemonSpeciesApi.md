# .PokemonSpeciesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonSpeciesList**](PokemonSpeciesApi.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | 
[**pokemonSpeciesRead**](PokemonSpeciesApi.md#pokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ | 


# **pokemonSpeciesList**
> pokemonSpeciesList()


### Example


```typescript
import { createConfiguration, PokemonSpeciesApi } from '';
import type { PokemonSpeciesApiPokemonSpeciesListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonSpeciesApi(configuration);

const request: PokemonSpeciesApiPokemonSpeciesListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.pokemonSpeciesList(request);
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

# **pokemonSpeciesRead**
> pokemonSpeciesRead()


### Example


```typescript
import { createConfiguration, PokemonSpeciesApi } from '';
import type { PokemonSpeciesApiPokemonSpeciesReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonSpeciesApi(configuration);

const request: PokemonSpeciesApiPokemonSpeciesReadRequest = {
  
  id: 1,
};

const data = await apiInstance.pokemonSpeciesRead(request);
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


