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
> `encounter_condition_list`(_api::`EncountersApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedEncounterConditionSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `encounter_condition_list`(_api::`EncountersApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedEncounterConditionSummaryList` }, `OpenAPI.Clients.ApiResponse`

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EncountersApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedEncounterConditionSummaryList`**](PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **encounter_condition_retrieve**
> `encounter_condition_retrieve`(_api::`EncountersApi`, `id`::`String`; _mediaType=nothing) -> `EncounterConditionDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `encounter_condition_retrieve`(_api::`EncountersApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `EncounterConditionDetail` }, `OpenAPI.Clients.ApiResponse`

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EncountersApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`EncounterConditionDetail`**](EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **encounter_condition_value_list**
> `encounter_condition_value_list`(_api::`EncountersApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedEncounterConditionValueSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `encounter_condition_value_list`(_api::`EncountersApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedEncounterConditionValueSummaryList` }, `OpenAPI.Clients.ApiResponse`

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EncountersApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedEncounterConditionValueSummaryList`**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **encounter_condition_value_retrieve**
> `encounter_condition_value_retrieve`(_api::`EncountersApi`, `id`::`String`; _mediaType=nothing) -> `EncounterConditionValueDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `encounter_condition_value_retrieve`(_api::`EncountersApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `EncounterConditionValueDetail` }, `OpenAPI.Clients.ApiResponse`

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EncountersApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`EncounterConditionValueDetail`**](EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **encounter_method_list**
> `encounter_method_list`(_api::`EncountersApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedEncounterMethodSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `encounter_method_list`(_api::`EncountersApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedEncounterMethodSummaryList` }, `OpenAPI.Clients.ApiResponse`

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EncountersApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedEncounterMethodSummaryList`**](PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **encounter_method_retrieve**
> `encounter_method_retrieve`(_api::`EncountersApi`, `id`::`String`; _mediaType=nothing) -> `EncounterMethodDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `encounter_method_retrieve`(_api::`EncountersApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `EncounterMethodDetail` }, `OpenAPI.Clients.ApiResponse`

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EncountersApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`EncounterMethodDetail`**](EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

