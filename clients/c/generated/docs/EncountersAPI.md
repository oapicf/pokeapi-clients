# EncountersAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncountersAPI_encounterConditionList**](EncountersAPI.md#EncountersAPI_encounterConditionList) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**EncountersAPI_encounterConditionRetrieve**](EncountersAPI.md#EncountersAPI_encounterConditionRetrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**EncountersAPI_encounterConditionValueList**](EncountersAPI.md#EncountersAPI_encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**EncountersAPI_encounterConditionValueRetrieve**](EncountersAPI.md#EncountersAPI_encounterConditionValueRetrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**EncountersAPI_encounterMethodList**](EncountersAPI.md#EncountersAPI_encounterMethodList) | **GET** /api/v2/encounter-method/ | List encounter methods
[**EncountersAPI_encounterMethodRetrieve**](EncountersAPI.md#EncountersAPI_encounterMethodRetrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method


# **EncountersAPI_encounterConditionList**
```c
// List encounter conditions
//
// Conditions which affect what pokemon might appear in the wild, e.g., day or night.
//
paginated_encounter_condition_summary_list_t* EncountersAPI_encounterConditionList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_encounter_condition_summary_list_t](paginated_encounter_condition_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EncountersAPI_encounterConditionRetrieve**
```c
// Get encounter condition
//
// Conditions which affect what pokemon might appear in the wild, e.g., day or night.
//
encounter_condition_detail_t* EncountersAPI_encounterConditionRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[encounter_condition_detail_t](encounter_condition_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EncountersAPI_encounterConditionValueList**
```c
// List encounter condition values
//
// Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
//
paginated_encounter_condition_value_summary_list_t* EncountersAPI_encounterConditionValueList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_encounter_condition_value_summary_list_t](paginated_encounter_condition_value_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EncountersAPI_encounterConditionValueRetrieve**
```c
// Get encounter condition value
//
// Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
//
encounter_condition_value_detail_t* EncountersAPI_encounterConditionValueRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[encounter_condition_value_detail_t](encounter_condition_value_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EncountersAPI_encounterMethodList**
```c
// List encounter methods
//
// Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
//
paginated_encounter_method_summary_list_t* EncountersAPI_encounterMethodList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_encounter_method_summary_list_t](paginated_encounter_method_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EncountersAPI_encounterMethodRetrieve**
```c
// Get encounter method
//
// Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
//
encounter_method_detail_t* EncountersAPI_encounterMethodRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[encounter_method_detail_t](encounter_method_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

