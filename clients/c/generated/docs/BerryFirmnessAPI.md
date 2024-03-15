# BerryFirmnessAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BerryFirmnessAPI_berryFirmnessList**](BerryFirmnessAPI.md#BerryFirmnessAPI_berryFirmnessList) | **GET** /api/v2/berry-firmness/ | 
[**BerryFirmnessAPI_berryFirmnessRead**](BerryFirmnessAPI.md#BerryFirmnessAPI_berryFirmnessRead) | **GET** /api/v2/berry-firmness/{id}/ | 


# **BerryFirmnessAPI_berryFirmnessList**
```c
char* BerryFirmnessAPI_berryFirmnessList(apiClient_t *apiClient, int *limit, int *offset);
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

# **BerryFirmnessAPI_berryFirmnessRead**
```c
char* BerryFirmnessAPI_berryFirmnessRead(apiClient_t *apiClient, int *id);
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

