# PokemonApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pokemonList**](PokemonApi.md#pokemonList) | **GET** /api/v2/pokemon/ |  |
| [**pokemonRead**](PokemonApi.md#pokemonRead) | **GET** /api/v2/pokemon/{id}/ |  |


<a name="pokemonList"></a>
# **pokemonList**
> String pokemonList(limit, offset)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] [default to null] |
| **offset** | **Integer**|  | [optional] [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

<a name="pokemonRead"></a>
# **pokemonRead**
> String pokemonRead(id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

