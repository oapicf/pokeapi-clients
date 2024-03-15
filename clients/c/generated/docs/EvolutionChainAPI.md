# EvolutionChainAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EvolutionChainAPI_evolutionChainList**](EvolutionChainAPI.md#EvolutionChainAPI_evolutionChainList) | **GET** /api/v2/evolution-chain/ | 
[**EvolutionChainAPI_evolutionChainRead**](EvolutionChainAPI.md#EvolutionChainAPI_evolutionChainRead) | **GET** /api/v2/evolution-chain/{id}/ | 


# **EvolutionChainAPI_evolutionChainList**
```c
char* EvolutionChainAPI_evolutionChainList(apiClient_t *apiClient, int *limit, int *offset);
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

# **EvolutionChainAPI_evolutionChainRead**
```c
char* EvolutionChainAPI_evolutionChainRead(apiClient_t *apiClient, int *id);
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

