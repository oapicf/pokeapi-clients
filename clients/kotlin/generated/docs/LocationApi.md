# LocationApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**locationAreaList**](LocationApi.md#locationAreaList) | **GET** /api/v2/location-area/ | List location areas |
| [**locationAreaRetrieve**](LocationApi.md#locationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area |
| [**locationList**](LocationApi.md#locationList) | **GET** /api/v2/location/ | List locations |
| [**locationRetrieve**](LocationApi.md#locationRetrieve) | **GET** /api/v2/location/{id}/ | Get location |
| [**palParkAreaList**](LocationApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas |
| [**palParkAreaRetrieve**](LocationApi.md#palParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area |
| [**regionList**](LocationApi.md#regionList) | **GET** /api/v2/region/ | List regions |
| [**regionRetrieve**](LocationApi.md#regionRetrieve) | **GET** /api/v2/region/{id}/ | Get region |


<a id="locationAreaList"></a>
# **locationAreaList**
> PaginatedLocationAreaSummaryList locationAreaList(limit, offset)

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
try {
    val result : PaginatedLocationAreaSummaryList = apiInstance.locationAreaList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#locationAreaList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#locationAreaList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |

### Return type

[**PaginatedLocationAreaSummaryList**](PaginatedLocationAreaSummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="locationAreaRetrieve"></a>
# **locationAreaRetrieve**
> LocationAreaDetail locationAreaRetrieve(id)

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this location area.
try {
    val result : LocationAreaDetail = apiInstance.locationAreaRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#locationAreaRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#locationAreaRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| A unique integer value identifying this location area. | |

### Return type

[**LocationAreaDetail**](LocationAreaDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="locationList"></a>
# **locationList**
> PaginatedLocationSummaryList locationList(limit, offset, q)

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedLocationSummaryList = apiInstance.locationList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#locationList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#locationList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedLocationSummaryList**](PaginatedLocationSummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="locationRetrieve"></a>
# **locationRetrieve**
> LocationDetail locationRetrieve(id)

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : LocationDetail = apiInstance.locationRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#locationRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#locationRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**LocationDetail**](LocationDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="palParkAreaList"></a>
# **palParkAreaList**
> PaginatedPalParkAreaSummaryList palParkAreaList(limit, offset, q)

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedPalParkAreaSummaryList = apiInstance.palParkAreaList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#palParkAreaList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#palParkAreaList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPalParkAreaSummaryList**](PaginatedPalParkAreaSummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="palParkAreaRetrieve"></a>
# **palParkAreaRetrieve**
> PalParkAreaDetail palParkAreaRetrieve(id)

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : PalParkAreaDetail = apiInstance.palParkAreaRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#palParkAreaRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#palParkAreaRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**PalParkAreaDetail**](PalParkAreaDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="regionList"></a>
# **regionList**
> PaginatedRegionSummaryList regionList(limit, offset, q)

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedRegionSummaryList = apiInstance.regionList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#regionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#regionList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedRegionSummaryList**](PaginatedRegionSummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="regionRetrieve"></a>
# **regionRetrieve**
> RegionDetail regionRetrieve(id)

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : RegionDetail = apiInstance.regionRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#regionRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#regionRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**RegionDetail**](RegionDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

