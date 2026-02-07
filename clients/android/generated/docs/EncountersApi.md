# EncountersApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](EncountersApi.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**encounterConditionRetrieve**](EncountersApi.md#encounterConditionRetrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounterConditionValueList**](EncountersApi.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounterConditionValueRetrieve**](EncountersApi.md#encounterConditionValueRetrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounterMethodList**](EncountersApi.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | List encounter methods
[**encounterMethodRetrieve**](EncountersApi.md#encounterMethodRetrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
[**pokemonEncountersRetrieve**](EncountersApi.md#pokemonEncountersRetrieve) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter



## encounterConditionList

> PaginatedEncounterConditionSummaryList encounterConditionList(limit, offset, q)

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example

```java
// Import classes:
//import org.openapitools.client.api.EncountersApi;

EncountersApi apiInstance = new EncountersApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedEncounterConditionSummaryList result = apiInstance.encounterConditionList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncountersApi#encounterConditionList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounterConditionRetrieve

> EncounterConditionDetail encounterConditionRetrieve(id)

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example

```java
// Import classes:
//import org.openapitools.client.api.EncountersApi;

EncountersApi apiInstance = new EncountersApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    EncounterConditionDetail result = apiInstance.encounterConditionRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncountersApi#encounterConditionRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**EncounterConditionDetail**](EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounterConditionValueList

> PaginatedEncounterConditionValueSummaryList encounterConditionValueList(limit, offset, q)

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example

```java
// Import classes:
//import org.openapitools.client.api.EncountersApi;

EncountersApi apiInstance = new EncountersApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedEncounterConditionValueSummaryList result = apiInstance.encounterConditionValueList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncountersApi#encounterConditionValueList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounterConditionValueRetrieve

> EncounterConditionValueDetail encounterConditionValueRetrieve(id)

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example

```java
// Import classes:
//import org.openapitools.client.api.EncountersApi;

EncountersApi apiInstance = new EncountersApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    EncounterConditionValueDetail result = apiInstance.encounterConditionValueRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncountersApi#encounterConditionValueRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**EncounterConditionValueDetail**](EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounterMethodList

> PaginatedEncounterMethodSummaryList encounterMethodList(limit, offset, q)

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example

```java
// Import classes:
//import org.openapitools.client.api.EncountersApi;

EncountersApi apiInstance = new EncountersApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedEncounterMethodSummaryList result = apiInstance.encounterMethodList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncountersApi#encounterMethodList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounterMethodRetrieve

> EncounterMethodDetail encounterMethodRetrieve(id)

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example

```java
// Import classes:
//import org.openapitools.client.api.EncountersApi;

EncountersApi apiInstance = new EncountersApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    EncounterMethodDetail result = apiInstance.encounterMethodRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncountersApi#encounterMethodRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**EncounterMethodDetail**](EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemonEncountersRetrieve

> List&lt;PokemonEncountersRetrieve200ResponseInner&gt; pokemonEncountersRetrieve(pokemonId)

Get pokemon encounter

Handles Pokemon Encounters as a sub-resource.

### Example

```java
// Import classes:
//import org.openapitools.client.api.EncountersApi;

EncountersApi apiInstance = new EncountersApi();
String pokemonId = null; // String | 
try {
    List<PokemonEncountersRetrieve200ResponseInner> result = apiInstance.pokemonEncountersRetrieve(pokemonId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EncountersApi#pokemonEncountersRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pokemonId** | **String**|  | [default to null]

### Return type

[**List&lt;PokemonEncountersRetrieve200ResponseInner&gt;**](PokemonEncountersRetrieve200ResponseInner.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

