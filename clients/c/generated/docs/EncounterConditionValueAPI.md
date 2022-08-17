# EncounterConditionValueAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncounterConditionValueAPI_encounterConditionValueList**](EncounterConditionValueAPI.md#EncounterConditionValueAPI_encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | 
[**EncounterConditionValueAPI_encounterConditionValueRead**](EncounterConditionValueAPI.md#EncounterConditionValueAPI_encounterConditionValueRead) | **GET** /api/v2/encounter-condition-value/{id}/ | 


# **EncounterConditionValueAPI_encounterConditionValueList**
```c
char* EncounterConditionValueAPI_encounterConditionValueList(apiClient_t *apiClient, int limit, int offset);
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

# **EncounterConditionValueAPI_encounterConditionValueRead**
```c
char* EncounterConditionValueAPI_encounterConditionValueRead(apiClient_t *apiClient, int id);
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

