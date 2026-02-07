# EncountersApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**encounterConditionList**](EncountersApi.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | List encounter conditions |
| [**encounterConditionRetrieve**](EncountersApi.md#encounterConditionRetrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition |
| [**encounterConditionValueList**](EncountersApi.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values |
| [**encounterConditionValueRetrieve**](EncountersApi.md#encounterConditionValueRetrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value |
| [**encounterMethodList**](EncountersApi.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | List encounter methods |
| [**encounterMethodRetrieve**](EncountersApi.md#encounterMethodRetrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method |
| [**pokemonEncountersRetrieve**](EncountersApi.md#pokemonEncountersRetrieve) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter |


<a name="encounterConditionList"></a>
# **encounterConditionList**
> PaginatedEncounterConditionSummaryList encounterConditionList(limit, offset, q)

List encounter conditions

    Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedEncounterConditionSummaryList**](../Models/PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="encounterConditionRetrieve"></a>
# **encounterConditionRetrieve**
> EncounterConditionDetail encounterConditionRetrieve(id)

Get encounter condition

    Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**EncounterConditionDetail**](../Models/EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="encounterConditionValueList"></a>
# **encounterConditionValueList**
> PaginatedEncounterConditionValueSummaryList encounterConditionValueList(limit, offset, q)

List encounter condition values

    Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedEncounterConditionValueSummaryList**](../Models/PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="encounterConditionValueRetrieve"></a>
# **encounterConditionValueRetrieve**
> EncounterConditionValueDetail encounterConditionValueRetrieve(id)

Get encounter condition value

    Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**EncounterConditionValueDetail**](../Models/EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="encounterMethodList"></a>
# **encounterMethodList**
> PaginatedEncounterMethodSummaryList encounterMethodList(limit, offset, q)

List encounter methods

    Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedEncounterMethodSummaryList**](../Models/PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="encounterMethodRetrieve"></a>
# **encounterMethodRetrieve**
> EncounterMethodDetail encounterMethodRetrieve(id)

Get encounter method

    Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**EncounterMethodDetail**](../Models/EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonEncountersRetrieve"></a>
# **pokemonEncountersRetrieve**
> List pokemonEncountersRetrieve(pokemon\_id)

Get pokemon encounter

    Handles Pokemon Encounters as a sub-resource.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pokemon\_id** | **String**|  | [default to null] |

### Return type

[**List**](../Models/pokemon_encounters_retrieve_200_response_inner.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

