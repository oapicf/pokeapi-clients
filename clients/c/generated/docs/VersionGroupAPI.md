# VersionGroupAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VersionGroupAPI_versionGroupList**](VersionGroupAPI.md#VersionGroupAPI_versionGroupList) | **GET** /api/v2/version-group/ | 
[**VersionGroupAPI_versionGroupRead**](VersionGroupAPI.md#VersionGroupAPI_versionGroupRead) | **GET** /api/v2/version-group/{id}/ | 


# **VersionGroupAPI_versionGroupList**
```c
char* VersionGroupAPI_versionGroupList(apiClient_t *apiClient, int *limit, int *offset);
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

# **VersionGroupAPI_versionGroupRead**
```c
char* VersionGroupAPI_versionGroupRead(apiClient_t *apiClient, int *id);
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

