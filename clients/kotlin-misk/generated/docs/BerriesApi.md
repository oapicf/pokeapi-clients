# BerriesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](BerriesApi.md#berryFirmnessList) | **Get** /api/v2/berry-firmness/ | List berry firmness
[**berryFirmnessRetrieve**](BerriesApi.md#berryFirmnessRetrieve) | **Get** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**berryFlavorList**](BerriesApi.md#berryFlavorList) | **Get** /api/v2/berry-flavor/ | List berry flavors
[**berryFlavorRetrieve**](BerriesApi.md#berryFlavorRetrieve) | **Get** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**berryList**](BerriesApi.md#berryList) | **Get** /api/v2/berry/ | List berries
[**berryRetrieve**](BerriesApi.md#berryRetrieve) | **Get** /api/v2/berry/{id}/ | Get a berry


<a name="berryFirmnessList"></a>
# **berryFirmnessList**
> PaginatedBerryFirmnessSummaryList berryFirmnessList(limit, offset, q)

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BerriesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedBerryFirmnessSummaryList = apiInstance.berryFirmnessList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerriesApi#berryFirmnessList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerriesApi#berryFirmnessList")
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

[**PaginatedBerryFirmnessSummaryList**](PaginatedBerryFirmnessSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="berryFirmnessRetrieve"></a>
# **berryFirmnessRetrieve**
> BerryFirmnessDetail berryFirmnessRetrieve(id)

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BerriesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : BerryFirmnessDetail = apiInstance.berryFirmnessRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerriesApi#berryFirmnessRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerriesApi#berryFirmnessRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**BerryFirmnessDetail**](BerryFirmnessDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="berryFlavorList"></a>
# **berryFlavorList**
> PaginatedBerryFlavorSummaryList berryFlavorList(limit, offset, q)

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BerriesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedBerryFlavorSummaryList = apiInstance.berryFlavorList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerriesApi#berryFlavorList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerriesApi#berryFlavorList")
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

[**PaginatedBerryFlavorSummaryList**](PaginatedBerryFlavorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="berryFlavorRetrieve"></a>
# **berryFlavorRetrieve**
> BerryFlavorDetail berryFlavorRetrieve(id)

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BerriesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : BerryFlavorDetail = apiInstance.berryFlavorRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerriesApi#berryFlavorRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerriesApi#berryFlavorRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**BerryFlavorDetail**](BerryFlavorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="berryList"></a>
# **berryList**
> PaginatedBerrySummaryList berryList(limit, offset, q)

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BerriesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedBerrySummaryList = apiInstance.berryList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerriesApi#berryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerriesApi#berryList")
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

[**PaginatedBerrySummaryList**](PaginatedBerrySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="berryRetrieve"></a>
# **berryRetrieve**
> BerryDetail berryRetrieve(id)

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BerriesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : BerryDetail = apiInstance.berryRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerriesApi#berryRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerriesApi#berryRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**BerryDetail**](BerryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

