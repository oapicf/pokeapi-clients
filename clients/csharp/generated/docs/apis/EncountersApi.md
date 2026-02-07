# Org.OpenAPITools.Api.EncountersApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**EncounterConditionList**](EncountersApi.md#encounterconditionlist) | **GET** /api/v2/encounter-condition/ | List encounter conditions |
| [**EncounterConditionRetrieve**](EncountersApi.md#encounterconditionretrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition |
| [**EncounterConditionValueList**](EncountersApi.md#encounterconditionvaluelist) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values |
| [**EncounterConditionValueRetrieve**](EncountersApi.md#encounterconditionvalueretrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value |
| [**EncounterMethodList**](EncountersApi.md#encountermethodlist) | **GET** /api/v2/encounter-method/ | List encounter methods |
| [**EncounterMethodRetrieve**](EncountersApi.md#encountermethodretrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method |
| [**PokemonEncountersRetrieve**](EncountersApi.md#pokemonencountersretrieve) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter |

<a id="encounterconditionlist"></a>
# **EncounterConditionList**
> PaginatedEncounterConditionSummaryList EncounterConditionList (int limit = null, int offset = null, string q = null)

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="encounterconditionretrieve"></a>
# **EncounterConditionRetrieve**
> EncounterConditionDetail EncounterConditionRetrieve (string id)

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**EncounterConditionDetail**](EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="encounterconditionvaluelist"></a>
# **EncounterConditionValueList**
> PaginatedEncounterConditionValueSummaryList EncounterConditionValueList (int limit = null, int offset = null, string q = null)

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="encounterconditionvalueretrieve"></a>
# **EncounterConditionValueRetrieve**
> EncounterConditionValueDetail EncounterConditionValueRetrieve (string id)

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**EncounterConditionValueDetail**](EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="encountermethodlist"></a>
# **EncounterMethodList**
> PaginatedEncounterMethodSummaryList EncounterMethodList (int limit = null, int offset = null, string q = null)

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="encountermethodretrieve"></a>
# **EncounterMethodRetrieve**
> EncounterMethodDetail EncounterMethodRetrieve (string id)

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**EncounterMethodDetail**](EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="pokemonencountersretrieve"></a>
# **PokemonEncountersRetrieve**
> List&lt;PokemonEncountersRetrieve200ResponseInner&gt; PokemonEncountersRetrieve (string pokemonId)

Get pokemon encounter

Handles Pokemon Encounters as a sub-resource.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **pokemonId** | **string** |  |  |

### Return type

[**List&lt;PokemonEncountersRetrieve200ResponseInner&gt;**](PokemonEncountersRetrieve200ResponseInner.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

