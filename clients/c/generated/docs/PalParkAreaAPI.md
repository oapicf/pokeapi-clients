# PalParkAreaAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PalParkAreaAPI_palParkAreaList**](PalParkAreaAPI.md#PalParkAreaAPI_palParkAreaList) | **GET** /api/v2/pal-park-area/ | 
[**PalParkAreaAPI_palParkAreaRead**](PalParkAreaAPI.md#PalParkAreaAPI_palParkAreaRead) | **GET** /api/v2/pal-park-area/{id}/ | 


# **PalParkAreaAPI_palParkAreaList**
```c
char* PalParkAreaAPI_palParkAreaList(apiClient_t *apiClient, int limit, int offset);
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

# **PalParkAreaAPI_palParkAreaRead**
```c
char* PalParkAreaAPI_palParkAreaRead(apiClient_t *apiClient, int id);
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

