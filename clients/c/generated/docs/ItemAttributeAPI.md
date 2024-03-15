# ItemAttributeAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemAttributeAPI_itemAttributeList**](ItemAttributeAPI.md#ItemAttributeAPI_itemAttributeList) | **GET** /api/v2/item-attribute/ | 
[**ItemAttributeAPI_itemAttributeRead**](ItemAttributeAPI.md#ItemAttributeAPI_itemAttributeRead) | **GET** /api/v2/item-attribute/{id}/ | 


# **ItemAttributeAPI_itemAttributeList**
```c
char* ItemAttributeAPI_itemAttributeList(apiClient_t *apiClient, int *limit, int *offset);
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

# **ItemAttributeAPI_itemAttributeRead**
```c
char* ItemAttributeAPI_itemAttributeRead(apiClient_t *apiClient, int *id);
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

