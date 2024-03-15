# PokemonFormAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonFormAPI_pokemonFormList**](PokemonFormAPI.md#PokemonFormAPI_pokemonFormList) | **GET** /api/v2/pokemon-form/ | 
[**PokemonFormAPI_pokemonFormRead**](PokemonFormAPI.md#PokemonFormAPI_pokemonFormRead) | **GET** /api/v2/pokemon-form/{id}/ | 


# **PokemonFormAPI_pokemonFormList**
```c
char* PokemonFormAPI_pokemonFormList(apiClient_t *apiClient, int *limit, int *offset);
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

# **PokemonFormAPI_pokemonFormRead**
```c
char* PokemonFormAPI_pokemonFormRead(apiClient_t *apiClient, int *id);
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

