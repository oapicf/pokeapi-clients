# EncountersApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounter_condition_list**](EncountersApi.md#encounter_condition_list) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**encounter_condition_retrieve**](EncountersApi.md#encounter_condition_retrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounter_condition_value_list**](EncountersApi.md#encounter_condition_value_list) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounter_condition_value_retrieve**](EncountersApi.md#encounter_condition_value_retrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounter_method_list**](EncountersApi.md#encounter_method_list) | **GET** /api/v2/encounter-method/ | List encounter methods
[**encounter_method_retrieve**](EncountersApi.md#encounter_method_retrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method


# **encounter_condition_list**
> `encounter_condition_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedEncounterConditionSummaryList`

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedEncounterConditionSummaryList`**](PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_condition_retrieve**
> `encounter_condition_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `EncounterConditionDetail`

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`EncounterConditionDetail`**](EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_condition_value_list**
> `encounter_condition_value_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedEncounterConditionValueSummaryList`

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedEncounterConditionValueSummaryList`**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_condition_value_retrieve**
> `encounter_condition_value_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `EncounterConditionValueDetail`

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`EncounterConditionValueDetail`**](EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_method_list**
> `encounter_method_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedEncounterMethodSummaryList`

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedEncounterMethodSummaryList`**](PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_method_retrieve**
> `encounter_method_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `EncounterMethodDetail`

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`EncounterMethodDetail`**](EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

