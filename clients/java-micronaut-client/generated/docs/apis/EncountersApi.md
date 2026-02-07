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


## Creating EncountersApi

To initiate an instance of `EncountersApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.EncountersApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(EncountersApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    EncountersApi encountersApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="encounterConditionList"></a>
# **encounterConditionList**
```java
Mono<PaginatedEncounterConditionSummaryList> EncountersApi.encounterConditionList(limitoffsetq)
```

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="encounterConditionRetrieve"></a>
# **encounterConditionRetrieve**
```java
Mono<EncounterConditionDetail> EncountersApi.encounterConditionRetrieve(id)
```

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**EncounterConditionDetail**](EncounterConditionDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="encounterConditionValueList"></a>
# **encounterConditionValueList**
```java
Mono<PaginatedEncounterConditionValueSummaryList> EncountersApi.encounterConditionValueList(limitoffsetq)
```

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="encounterConditionValueRetrieve"></a>
# **encounterConditionValueRetrieve**
```java
Mono<EncounterConditionValueDetail> EncountersApi.encounterConditionValueRetrieve(id)
```

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**EncounterConditionValueDetail**](EncounterConditionValueDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="encounterMethodList"></a>
# **encounterMethodList**
```java
Mono<PaginatedEncounterMethodSummaryList> EncountersApi.encounterMethodList(limitoffsetq)
```

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="encounterMethodRetrieve"></a>
# **encounterMethodRetrieve**
```java
Mono<EncounterMethodDetail> EncountersApi.encounterMethodRetrieve(id)
```

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**EncounterMethodDetail**](EncounterMethodDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonEncountersRetrieve"></a>
# **pokemonEncountersRetrieve**
```java
Mono<List<PokemonEncountersRetrieve200ResponseInner>> EncountersApi.pokemonEncountersRetrieve(pokemonId)
```

Get pokemon encounter

Handles Pokemon Encounters as a sub-resource.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pokemonId** | `String`|  | |


### Return type
[**List&lt;PokemonEncountersRetrieve200ResponseInner&gt;**](PokemonEncountersRetrieve200ResponseInner.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

