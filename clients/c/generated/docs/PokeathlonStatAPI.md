# PokeathlonStatAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokeathlonStatAPI_pokeathlonStatList**](PokeathlonStatAPI.md#PokeathlonStatAPI_pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | 
[**PokeathlonStatAPI_pokeathlonStatRead**](PokeathlonStatAPI.md#PokeathlonStatAPI_pokeathlonStatRead) | **GET** /api/v2/pokeathlon-stat/{id}/ | 


# **PokeathlonStatAPI_pokeathlonStatList**
```c
char* PokeathlonStatAPI_pokeathlonStatList(apiClient_t *apiClient, int limit, int offset);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int** |  | [optional] 
**offset** | **int** |  | [optional] 

### Return type

char*



### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PokeathlonStatAPI_pokeathlonStatRead**
```c
char* PokeathlonStatAPI_pokeathlonStatRead(apiClient_t *apiClient, int id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **int** |  | 

### Return type

char*



### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

