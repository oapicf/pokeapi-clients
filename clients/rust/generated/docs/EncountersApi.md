# \EncountersApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounter_condition_list**](EncountersApi.md#encounter_condition_list) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**encounter_condition_retrieve**](EncountersApi.md#encounter_condition_retrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounter_condition_value_list**](EncountersApi.md#encounter_condition_value_list) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounter_condition_value_retrieve**](EncountersApi.md#encounter_condition_value_retrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounter_method_list**](EncountersApi.md#encounter_method_list) | **GET** /api/v2/encounter-method/ | List encounter methods
[**encounter_method_retrieve**](EncountersApi.md#encounter_method_retrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
[**pokemon_encounters_retrieve**](EncountersApi.md#pokemon_encounters_retrieve) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter



## encounter_condition_list

> models::PaginatedEncounterConditionSummaryList encounter_condition_list(limit, offset, q)
List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## encounter_condition_retrieve

> models::EncounterConditionDetail encounter_condition_retrieve(id)
Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::EncounterConditionDetail**](EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## encounter_condition_value_list

> models::PaginatedEncounterConditionValueSummaryList encounter_condition_value_list(limit, offset, q)
List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## encounter_condition_value_retrieve

> models::EncounterConditionValueDetail encounter_condition_value_retrieve(id)
Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::EncounterConditionValueDetail**](EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## encounter_method_list

> models::PaginatedEncounterMethodSummaryList encounter_method_list(limit, offset, q)
List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## encounter_method_retrieve

> models::EncounterMethodDetail encounter_method_retrieve(id)
Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::EncounterMethodDetail**](EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## pokemon_encounters_retrieve

> Vec<models::PokemonEncountersRetrieve200ResponseInner> pokemon_encounters_retrieve(pokemon_id)
Get pokemon encounter

Handles Pokemon Encounters as a sub-resource.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**pokemon_id** | **String** |  | [required] |

### Return type

[**Vec<models::PokemonEncountersRetrieve200ResponseInner>**](pokemon_encounters_retrieve_200_response_inner.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

