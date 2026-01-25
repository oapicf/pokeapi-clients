# .PokemonHabitatApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonHabitatList**](PokemonHabitatApi.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | 
[**pokemonHabitatRead**](PokemonHabitatApi.md#pokemonHabitatRead) | **GET** /api/v2/pokemon-habitat/{id}/ | 


# **pokemonHabitatList**
> pokemonHabitatList()


### Example


```typescript
import { createConfiguration, PokemonHabitatApi } from '';
import type { PokemonHabitatApiPokemonHabitatListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonHabitatApi(configuration);

const request: PokemonHabitatApiPokemonHabitatListRequest = {
  
  limit: 1,
  
  offset: 1,
};

const data = await apiInstance.pokemonHabitatList(request);
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

# **pokemonHabitatRead**
> pokemonHabitatRead()


### Example


```typescript
import { createConfiguration, PokemonHabitatApi } from '';
import type { PokemonHabitatApiPokemonHabitatReadRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonHabitatApi(configuration);

const request: PokemonHabitatApiPokemonHabitatReadRequest = {
  
  id: 1,
};

const data = await apiInstance.pokemonHabitatRead(request);
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


