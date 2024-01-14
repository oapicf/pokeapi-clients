# EncounterConditionAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncounterConditionAPI_encounterConditionList**](EncounterConditionAPI.md#EncounterConditionAPI_encounterConditionList) | **GET** /api/v2/encounter-condition/ | 
[**EncounterConditionAPI_encounterConditionRead**](EncounterConditionAPI.md#EncounterConditionAPI_encounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ | 


# **EncounterConditionAPI_encounterConditionList**
```c
char* EncounterConditionAPI_encounterConditionList(apiClient_t *apiClient, int limit, int offset);
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

# **EncounterConditionAPI_encounterConditionRead**
```c
char* EncounterConditionAPI_encounterConditionRead(apiClient_t *apiClient, int id);
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

