# ItemCategoryAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemCategoryAPI_itemCategoryList**](ItemCategoryAPI.md#ItemCategoryAPI_itemCategoryList) | **GET** /api/v2/item-category/ | 
[**ItemCategoryAPI_itemCategoryRead**](ItemCategoryAPI.md#ItemCategoryAPI_itemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 


# **ItemCategoryAPI_itemCategoryList**
```c
char* ItemCategoryAPI_itemCategoryList(apiClient_t *apiClient, int limit, int offset);
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

# **ItemCategoryAPI_itemCategoryRead**
```c
char* ItemCategoryAPI_itemCategoryRead(apiClient_t *apiClient, int id);
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

