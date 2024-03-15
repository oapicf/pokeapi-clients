# CharacteristicAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CharacteristicAPI_characteristicList**](CharacteristicAPI.md#CharacteristicAPI_characteristicList) | **GET** /api/v2/characteristic/ | 
[**CharacteristicAPI_characteristicRead**](CharacteristicAPI.md#CharacteristicAPI_characteristicRead) | **GET** /api/v2/characteristic/{id}/ | 


# **CharacteristicAPI_characteristicList**
```c
char* CharacteristicAPI_characteristicList(apiClient_t *apiClient, int *limit, int *offset);
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

# **CharacteristicAPI_characteristicRead**
```c
char* CharacteristicAPI_characteristicRead(apiClient_t *apiClient, int *id);
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

