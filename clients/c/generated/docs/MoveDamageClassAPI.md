# MoveDamageClassAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveDamageClassAPI_moveDamageClassList**](MoveDamageClassAPI.md#MoveDamageClassAPI_moveDamageClassList) | **GET** /api/v2/move-damage-class/ | 
[**MoveDamageClassAPI_moveDamageClassRead**](MoveDamageClassAPI.md#MoveDamageClassAPI_moveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ | 


# **MoveDamageClassAPI_moveDamageClassList**
```c
char* MoveDamageClassAPI_moveDamageClassList(apiClient_t *apiClient, int limit, int offset);
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

# **MoveDamageClassAPI_moveDamageClassRead**
```c
char* MoveDamageClassAPI_moveDamageClassRead(apiClient_t *apiClient, int id);
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

