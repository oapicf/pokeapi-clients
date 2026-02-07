# GamesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**generationList**](GamesApi.md#generationList) | **GET** /api/v2/generation/ | List genrations |
| [**generationRetrieve**](GamesApi.md#generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration |
| [**pokedexList**](GamesApi.md#pokedexList) | **GET** /api/v2/pokedex/ | List pokedex |
| [**pokedexRetrieve**](GamesApi.md#pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex |
| [**versionGroupList**](GamesApi.md#versionGroupList) | **GET** /api/v2/version-group/ | List version groups |
| [**versionGroupRetrieve**](GamesApi.md#versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group |
| [**versionList**](GamesApi.md#versionList) | **GET** /api/v2/version/ | List versions |
| [**versionRetrieve**](GamesApi.md#versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version |


<a id="generationList"></a>
# **generationList**
> PaginatedGenerationSummaryList generationList(limit, offset, q)

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GamesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedGenerationSummaryList = apiInstance.generationList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GamesApi#generationList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GamesApi#generationList")
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

[**PaginatedGenerationSummaryList**](PaginatedGenerationSummaryList.md)

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

<a id="generationRetrieve"></a>
# **generationRetrieve**
> GenerationDetail generationRetrieve(id)

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GamesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : GenerationDetail = apiInstance.generationRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GamesApi#generationRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GamesApi#generationRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**GenerationDetail**](GenerationDetail.md)

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

<a id="pokedexList"></a>
# **pokedexList**
> PaginatedPokedexSummaryList pokedexList(limit, offset, q)

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GamesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedPokedexSummaryList = apiInstance.pokedexList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GamesApi#pokedexList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GamesApi#pokedexList")
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

[**PaginatedPokedexSummaryList**](PaginatedPokedexSummaryList.md)

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

<a id="pokedexRetrieve"></a>
# **pokedexRetrieve**
> PokedexDetail pokedexRetrieve(id)

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GamesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : PokedexDetail = apiInstance.pokedexRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GamesApi#pokedexRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GamesApi#pokedexRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**PokedexDetail**](PokedexDetail.md)

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

<a id="versionGroupList"></a>
# **versionGroupList**
> PaginatedVersionGroupSummaryList versionGroupList(limit, offset, q)

List version groups

Version groups categorize highly similar versions of the games.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GamesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedVersionGroupSummaryList = apiInstance.versionGroupList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GamesApi#versionGroupList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GamesApi#versionGroupList")
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

[**PaginatedVersionGroupSummaryList**](PaginatedVersionGroupSummaryList.md)

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

<a id="versionGroupRetrieve"></a>
# **versionGroupRetrieve**
> VersionGroupDetail versionGroupRetrieve(id)

Get version group

Version groups categorize highly similar versions of the games.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GamesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : VersionGroupDetail = apiInstance.versionGroupRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GamesApi#versionGroupRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GamesApi#versionGroupRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**VersionGroupDetail**](VersionGroupDetail.md)

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

<a id="versionList"></a>
# **versionList**
> PaginatedVersionSummaryList versionList(limit, offset, q)

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GamesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedVersionSummaryList = apiInstance.versionList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GamesApi#versionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GamesApi#versionList")
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

[**PaginatedVersionSummaryList**](PaginatedVersionSummaryList.md)

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

<a id="versionRetrieve"></a>
# **versionRetrieve**
> VersionDetail versionRetrieve(id)

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GamesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : VersionDetail = apiInstance.versionRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GamesApi#versionRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GamesApi#versionRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**VersionDetail**](VersionDetail.md)

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

