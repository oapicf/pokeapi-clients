# PokemonShapeAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonShapeAPI_pokemonShapeList**](PokemonShapeAPI.md#PokemonShapeAPI_pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | 
[**PokemonShapeAPI_pokemonShapeRead**](PokemonShapeAPI.md#PokemonShapeAPI_pokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ | 


# **PokemonShapeAPI_pokemonShapeList**
```c
char* PokemonShapeAPI_pokemonShapeList(apiClient_t *apiClient, int limit, int offset);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** |  | [optional] 
**offset** | **int \*** |  | [optional] 

### Return type

char*



### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PokemonShapeAPI_pokemonShapeRead**
```c
char* PokemonShapeAPI_pokemonShapeRead(apiClient_t *apiClient, int id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **int \*** |  | 

### Return type

char*



### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

