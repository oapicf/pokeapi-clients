# EncounterMethodAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncounterMethodAPI_encounterMethodList**](EncounterMethodAPI.md#EncounterMethodAPI_encounterMethodList) | **GET** /api/v2/encounter-method/ | 
[**EncounterMethodAPI_encounterMethodRead**](EncounterMethodAPI.md#EncounterMethodAPI_encounterMethodRead) | **GET** /api/v2/encounter-method/{id}/ | 


# **EncounterMethodAPI_encounterMethodList**
```c
char* EncounterMethodAPI_encounterMethodList(apiClient_t *apiClient, int limit, int offset);
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

# **EncounterMethodAPI_encounterMethodRead**
```c
char* EncounterMethodAPI_encounterMethodRead(apiClient_t *apiClient, int id);
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

