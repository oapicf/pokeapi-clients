# UtilityAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UtilityAPI_languageList**](UtilityAPI.md#UtilityAPI_languageList) | **GET** /api/v2/language/ | List languages
[**UtilityAPI_languageRetrieve**](UtilityAPI.md#UtilityAPI_languageRetrieve) | **GET** /api/v2/language/{id}/ | Get language


# **UtilityAPI_languageList**
```c
// List languages
//
// Languages for translations of API resource information.
//
paginated_language_summary_list_t* UtilityAPI_languageList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_language_summary_list_t](paginated_language_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UtilityAPI_languageRetrieve**
```c
// Get language
//
// Languages for translations of API resource information.
//
language_detail_t* UtilityAPI_languageRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[language_detail_t](language_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

