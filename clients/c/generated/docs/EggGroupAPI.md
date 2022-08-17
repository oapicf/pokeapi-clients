# EggGroupAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EggGroupAPI_eggGroupList**](EggGroupAPI.md#EggGroupAPI_eggGroupList) | **GET** /api/v2/egg-group/ | 
[**EggGroupAPI_eggGroupRead**](EggGroupAPI.md#EggGroupAPI_eggGroupRead) | **GET** /api/v2/egg-group/{id}/ | 


# **EggGroupAPI_eggGroupList**
```c
char* EggGroupAPI_eggGroupList(apiClient_t *apiClient, int limit, int offset);
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

# **EggGroupAPI_eggGroupRead**
```c
char* EggGroupAPI_eggGroupRead(apiClient_t *apiClient, int id);
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

