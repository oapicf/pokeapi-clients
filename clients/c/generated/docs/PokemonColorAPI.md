# PokemonColorAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonColorAPI_pokemonColorList**](PokemonColorAPI.md#PokemonColorAPI_pokemonColorList) | **GET** /api/v2/pokemon-color/ | 
[**PokemonColorAPI_pokemonColorRead**](PokemonColorAPI.md#PokemonColorAPI_pokemonColorRead) | **GET** /api/v2/pokemon-color/{id}/ | 


# **PokemonColorAPI_pokemonColorList**
```c
char* PokemonColorAPI_pokemonColorList(apiClient_t *apiClient, int *limit, int *offset);
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

# **PokemonColorAPI_pokemonColorRead**
```c
char* PokemonColorAPI_pokemonColorRead(apiClient_t *apiClient, int *id);
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

