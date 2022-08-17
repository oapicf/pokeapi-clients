# MoveCategoryAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveCategoryAPI_moveCategoryList**](MoveCategoryAPI.md#MoveCategoryAPI_moveCategoryList) | **GET** /api/v2/move-category/ | 
[**MoveCategoryAPI_moveCategoryRead**](MoveCategoryAPI.md#MoveCategoryAPI_moveCategoryRead) | **GET** /api/v2/move-category/{id}/ | 


# **MoveCategoryAPI_moveCategoryList**
```c
char* MoveCategoryAPI_moveCategoryList(apiClient_t *apiClient, int limit, int offset);
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

# **MoveCategoryAPI_moveCategoryRead**
```c
char* MoveCategoryAPI_moveCategoryRead(apiClient_t *apiClient, int id);
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

