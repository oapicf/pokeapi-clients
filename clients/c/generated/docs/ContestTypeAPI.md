# ContestTypeAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ContestTypeAPI_contestTypeList**](ContestTypeAPI.md#ContestTypeAPI_contestTypeList) | **GET** /api/v2/contest-type/ | 
[**ContestTypeAPI_contestTypeRead**](ContestTypeAPI.md#ContestTypeAPI_contestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 


# **ContestTypeAPI_contestTypeList**
```c
char* ContestTypeAPI_contestTypeList(apiClient_t *apiClient, int limit, int offset);
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

# **ContestTypeAPI_contestTypeRead**
```c
char* ContestTypeAPI_contestTypeRead(apiClient_t *apiClient, int id);
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

