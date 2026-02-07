# ENCOUNTERS_API

All URIs are relative to *https://pokeapi.co*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**encounter_condition_list**](ENCOUNTERS_API.md#encounter_condition_list) | **Get** /api/v2/encounter-condition/ | List encounter conditions
[**encounter_condition_retrieve**](ENCOUNTERS_API.md#encounter_condition_retrieve) | **Get** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounter_condition_value_list**](ENCOUNTERS_API.md#encounter_condition_value_list) | **Get** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounter_condition_value_retrieve**](ENCOUNTERS_API.md#encounter_condition_value_retrieve) | **Get** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounter_method_list**](ENCOUNTERS_API.md#encounter_method_list) | **Get** /api/v2/encounter-method/ | List encounter methods
[**encounter_method_retrieve**](ENCOUNTERS_API.md#encounter_method_retrieve) | **Get** /api/v2/encounter-method/{id}/ | Get encounter method


# **encounter_condition_list**
> encounter_condition_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_ENCOUNTER_CONDITION_SUMMARY_LIST


List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_ENCOUNTER_CONDITION_SUMMARY_LIST**](PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_condition_retrieve**
> encounter_condition_retrieve (id: STRING_32 ): detachable ENCOUNTER_CONDITION_DETAIL


Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**ENCOUNTER_CONDITION_DETAIL**](EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_condition_value_list**
> encounter_condition_value_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_ENCOUNTER_CONDITION_VALUE_SUMMARY_LIST


List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_ENCOUNTER_CONDITION_VALUE_SUMMARY_LIST**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_condition_value_retrieve**
> encounter_condition_value_retrieve (id: STRING_32 ): detachable ENCOUNTER_CONDITION_VALUE_DETAIL


Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**ENCOUNTER_CONDITION_VALUE_DETAIL**](EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_method_list**
> encounter_method_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_ENCOUNTER_METHOD_SUMMARY_LIST


List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_ENCOUNTER_METHOD_SUMMARY_LIST**](PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_method_retrieve**
> encounter_method_retrieve (id: STRING_32 ): detachable ENCOUNTER_METHOD_DETAIL


Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**ENCOUNTER_METHOD_DETAIL**](EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

