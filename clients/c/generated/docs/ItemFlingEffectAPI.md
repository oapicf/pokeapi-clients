# ItemFlingEffectAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemFlingEffectAPI_itemFlingEffectList**](ItemFlingEffectAPI.md#ItemFlingEffectAPI_itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | 
[**ItemFlingEffectAPI_itemFlingEffectRead**](ItemFlingEffectAPI.md#ItemFlingEffectAPI_itemFlingEffectRead) | **GET** /api/v2/item-fling-effect/{id}/ | 


# **ItemFlingEffectAPI_itemFlingEffectList**
```c
char* ItemFlingEffectAPI_itemFlingEffectList(apiClient_t *apiClient, int limit, int offset);
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

# **ItemFlingEffectAPI_itemFlingEffectRead**
```c
char* ItemFlingEffectAPI_itemFlingEffectRead(apiClient_t *apiClient, int id);
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

