# EvolutionTriggerAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EvolutionTriggerAPI_evolutionTriggerList**](EvolutionTriggerAPI.md#EvolutionTriggerAPI_evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | 
[**EvolutionTriggerAPI_evolutionTriggerRead**](EvolutionTriggerAPI.md#EvolutionTriggerAPI_evolutionTriggerRead) | **GET** /api/v2/evolution-trigger/{id}/ | 


# **EvolutionTriggerAPI_evolutionTriggerList**
```c
char* EvolutionTriggerAPI_evolutionTriggerList(apiClient_t *apiClient, int limit, int offset);
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

# **EvolutionTriggerAPI_evolutionTriggerRead**
```c
char* EvolutionTriggerAPI_evolutionTriggerRead(apiClient_t *apiClient, int id);
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

