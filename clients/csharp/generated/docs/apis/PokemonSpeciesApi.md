# Org.OpenAPITools.Api.PokemonSpeciesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**PokemonSpeciesList**](PokemonSpeciesApi.md#pokemonspecieslist) | **GET** /api/v2/pokemon-species/ |  |
| [**PokemonSpeciesRead**](PokemonSpeciesApi.md#pokemonspeciesread) | **GET** /api/v2/pokemon-species/{id}/ |  |

<a id="pokemonspecieslist"></a>
# **PokemonSpeciesList**
> string PokemonSpeciesList (int limit = null, int offset = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** |  | [optional]  |
| **offset** | **int** |  | [optional]  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="pokemonspeciesread"></a>
# **PokemonSpeciesRead**
> string PokemonSpeciesRead (int id)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **int** |  |  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

