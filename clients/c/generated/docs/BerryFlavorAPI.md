# BerryFlavorAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BerryFlavorAPI_berryFlavorList**](BerryFlavorAPI.md#BerryFlavorAPI_berryFlavorList) | **GET** /api/v2/berry-flavor/ | 
[**BerryFlavorAPI_berryFlavorRead**](BerryFlavorAPI.md#BerryFlavorAPI_berryFlavorRead) | **GET** /api/v2/berry-flavor/{id}/ | 


# **BerryFlavorAPI_berryFlavorList**
```c
char* BerryFlavorAPI_berryFlavorList(apiClient_t *apiClient, int *limit, int *offset);
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

# **BerryFlavorAPI_berryFlavorRead**
```c
char* BerryFlavorAPI_berryFlavorRead(apiClient_t *apiClient, int *id);
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

