# MoveLearnMethodAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveLearnMethodAPI_moveLearnMethodList**](MoveLearnMethodAPI.md#MoveLearnMethodAPI_moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | 
[**MoveLearnMethodAPI_moveLearnMethodRead**](MoveLearnMethodAPI.md#MoveLearnMethodAPI_moveLearnMethodRead) | **GET** /api/v2/move-learn-method/{id}/ | 


# **MoveLearnMethodAPI_moveLearnMethodList**
```c
char* MoveLearnMethodAPI_moveLearnMethodList(apiClient_t *apiClient, int *limit, int *offset);
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

# **MoveLearnMethodAPI_moveLearnMethodRead**
```c
char* MoveLearnMethodAPI_moveLearnMethodRead(apiClient_t *apiClient, int *id);
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

