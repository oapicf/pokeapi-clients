# MoveAilmentAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveAilmentAPI_moveAilmentList**](MoveAilmentAPI.md#MoveAilmentAPI_moveAilmentList) | **GET** /api/v2/move-ailment/ | 
[**MoveAilmentAPI_moveAilmentRead**](MoveAilmentAPI.md#MoveAilmentAPI_moveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ | 


# **MoveAilmentAPI_moveAilmentList**
```c
char* MoveAilmentAPI_moveAilmentList(apiClient_t *apiClient, int limit, int offset);
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

# **MoveAilmentAPI_moveAilmentRead**
```c
char* MoveAilmentAPI_moveAilmentRead(apiClient_t *apiClient, int id);
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

