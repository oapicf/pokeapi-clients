# PokemonHabitatAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonHabitatAPI_pokemonHabitatList**](PokemonHabitatAPI.md#PokemonHabitatAPI_pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | 
[**PokemonHabitatAPI_pokemonHabitatRead**](PokemonHabitatAPI.md#PokemonHabitatAPI_pokemonHabitatRead) | **GET** /api/v2/pokemon-habitat/{id}/ | 


# **PokemonHabitatAPI_pokemonHabitatList**
```c
char* PokemonHabitatAPI_pokemonHabitatList(apiClient_t *apiClient, int *limit, int *offset);
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

# **PokemonHabitatAPI_pokemonHabitatRead**
```c
char* PokemonHabitatAPI_pokemonHabitatRead(apiClient_t *apiClient, int *id);
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

