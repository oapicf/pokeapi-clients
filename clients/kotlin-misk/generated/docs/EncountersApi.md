# EncountersApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](EncountersApi.md#encounterConditionList) | **Get** /api/v2/encounter-condition/ | List encounter conditions
[**encounterConditionRetrieve**](EncountersApi.md#encounterConditionRetrieve) | **Get** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounterConditionValueList**](EncountersApi.md#encounterConditionValueList) | **Get** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounterConditionValueRetrieve**](EncountersApi.md#encounterConditionValueRetrieve) | **Get** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounterMethodList**](EncountersApi.md#encounterMethodList) | **Get** /api/v2/encounter-method/ | List encounter methods
[**encounterMethodRetrieve**](EncountersApi.md#encounterMethodRetrieve) | **Get** /api/v2/encounter-method/{id}/ | Get encounter method


<a name="encounterConditionList"></a>
# **encounterConditionList**
> PaginatedEncounterConditionSummaryList encounterConditionList(limit, offset, q)

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = EncountersApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedEncounterConditionSummaryList = apiInstance.encounterConditionList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncountersApi#encounterConditionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncountersApi#encounterConditionList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="encounterConditionRetrieve"></a>
# **encounterConditionRetrieve**
> EncounterConditionDetail encounterConditionRetrieve(id)

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = EncountersApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : EncounterConditionDetail = apiInstance.encounterConditionRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncountersApi#encounterConditionRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncountersApi#encounterConditionRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**EncounterConditionDetail**](EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="encounterConditionValueList"></a>
# **encounterConditionValueList**
> PaginatedEncounterConditionValueSummaryList encounterConditionValueList(limit, offset, q)

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = EncountersApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedEncounterConditionValueSummaryList = apiInstance.encounterConditionValueList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncountersApi#encounterConditionValueList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncountersApi#encounterConditionValueList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="encounterConditionValueRetrieve"></a>
# **encounterConditionValueRetrieve**
> EncounterConditionValueDetail encounterConditionValueRetrieve(id)

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = EncountersApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : EncounterConditionValueDetail = apiInstance.encounterConditionValueRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncountersApi#encounterConditionValueRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncountersApi#encounterConditionValueRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**EncounterConditionValueDetail**](EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="encounterMethodList"></a>
# **encounterMethodList**
> PaginatedEncounterMethodSummaryList encounterMethodList(limit, offset, q)

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = EncountersApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedEncounterMethodSummaryList = apiInstance.encounterMethodList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncountersApi#encounterMethodList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncountersApi#encounterMethodList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="encounterMethodRetrieve"></a>
# **encounterMethodRetrieve**
> EncounterMethodDetail encounterMethodRetrieve(id)

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = EncountersApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : EncounterMethodDetail = apiInstance.encounterMethodRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncountersApi#encounterMethodRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncountersApi#encounterMethodRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**EncounterMethodDetail**](EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

