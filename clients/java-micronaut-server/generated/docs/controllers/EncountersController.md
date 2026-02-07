# EncountersController

All URIs are relative to `""`

The controller class is defined in **[EncountersController.java](../../src/main/java/org/openapitools/controller/EncountersController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](#encounterConditionList) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**encounterConditionRetrieve**](#encounterConditionRetrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounterConditionValueList**](#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounterConditionValueRetrieve**](#encounterConditionValueRetrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounterMethodList**](#encounterMethodList) | **GET** /api/v2/encounter-method/ | List encounter methods
[**encounterMethodRetrieve**](#encounterMethodRetrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method

<a id="encounterConditionList"></a>
# **encounterConditionList**
```java
Mono<PaginatedEncounterConditionSummaryList> EncountersController.encounterConditionList(limitoffsetq)
```

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedEncounterConditionSummaryList**](../../docs/models/PaginatedEncounterConditionSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="encounterConditionRetrieve"></a>
# **encounterConditionRetrieve**
```java
Mono<EncounterConditionDetail> EncountersController.encounterConditionRetrieve(id)
```

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**EncounterConditionDetail**](../../docs/models/EncounterConditionDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="encounterConditionValueList"></a>
# **encounterConditionValueList**
```java
Mono<PaginatedEncounterConditionValueSummaryList> EncountersController.encounterConditionValueList(limitoffsetq)
```

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedEncounterConditionValueSummaryList**](../../docs/models/PaginatedEncounterConditionValueSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="encounterConditionValueRetrieve"></a>
# **encounterConditionValueRetrieve**
```java
Mono<EncounterConditionValueDetail> EncountersController.encounterConditionValueRetrieve(id)
```

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**EncounterConditionValueDetail**](../../docs/models/EncounterConditionValueDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="encounterMethodList"></a>
# **encounterMethodList**
```java
Mono<PaginatedEncounterMethodSummaryList> EncountersController.encounterMethodList(limitoffsetq)
```

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedEncounterMethodSummaryList**](../../docs/models/PaginatedEncounterMethodSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="encounterMethodRetrieve"></a>
# **encounterMethodRetrieve**
```java
Mono<EncounterMethodDetail> EncountersController.encounterMethodRetrieve(id)
```

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**EncounterMethodDetail**](../../docs/models/EncounterMethodDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

