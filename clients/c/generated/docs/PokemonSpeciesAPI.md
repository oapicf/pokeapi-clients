# PokemonSpeciesAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonSpeciesAPI_pokemonSpeciesList**](PokemonSpeciesAPI.md#PokemonSpeciesAPI_pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | 
[**PokemonSpeciesAPI_pokemonSpeciesRead**](PokemonSpeciesAPI.md#PokemonSpeciesAPI_pokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ | 


# **PokemonSpeciesAPI_pokemonSpeciesList**
```c
char* PokemonSpeciesAPI_pokemonSpeciesList(apiClient_t *apiClient, int limit, int offset);
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

# **PokemonSpeciesAPI_pokemonSpeciesRead**
```c
char* PokemonSpeciesAPI_pokemonSpeciesRead(apiClient_t *apiClient, int id);
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

