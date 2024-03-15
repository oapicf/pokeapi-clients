# SuperContestEffectAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SuperContestEffectAPI_superContestEffectList**](SuperContestEffectAPI.md#SuperContestEffectAPI_superContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
[**SuperContestEffectAPI_superContestEffectRead**](SuperContestEffectAPI.md#SuperContestEffectAPI_superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 


# **SuperContestEffectAPI_superContestEffectList**
```c
char* SuperContestEffectAPI_superContestEffectList(apiClient_t *apiClient, int *limit, int *offset);
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

# **SuperContestEffectAPI_superContestEffectRead**
```c
char* SuperContestEffectAPI_superContestEffectRead(apiClient_t *apiClient, int *id);
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

