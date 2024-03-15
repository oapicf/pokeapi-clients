# MoveBattleStyleAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveBattleStyleAPI_moveBattleStyleList**](MoveBattleStyleAPI.md#MoveBattleStyleAPI_moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | 
[**MoveBattleStyleAPI_moveBattleStyleRead**](MoveBattleStyleAPI.md#MoveBattleStyleAPI_moveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 


# **MoveBattleStyleAPI_moveBattleStyleList**
```c
char* MoveBattleStyleAPI_moveBattleStyleList(apiClient_t *apiClient, int *limit, int *offset);
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

# **MoveBattleStyleAPI_moveBattleStyleRead**
```c
char* MoveBattleStyleAPI_moveBattleStyleRead(apiClient_t *apiClient, int *id);
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

