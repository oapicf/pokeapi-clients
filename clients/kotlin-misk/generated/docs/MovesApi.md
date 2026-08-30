# MovesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](MovesApi.md#moveAilmentList) | **Get** /api/v2/move-ailment/ | List move meta ailments
[**moveAilmentRetrieve**](MovesApi.md#moveAilmentRetrieve) | **Get** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**moveBattleStyleList**](MovesApi.md#moveBattleStyleList) | **Get** /api/v2/move-battle-style/ | List move battle styles
[**moveBattleStyleRetrieve**](MovesApi.md#moveBattleStyleRetrieve) | **Get** /api/v2/move-battle-style/{id}/ | Get move battle style
[**moveCategoryList**](MovesApi.md#moveCategoryList) | **Get** /api/v2/move-category/ | List move meta categories
[**moveCategoryRetrieve**](MovesApi.md#moveCategoryRetrieve) | **Get** /api/v2/move-category/{id}/ | Get move meta category
[**moveLearnMethodList**](MovesApi.md#moveLearnMethodList) | **Get** /api/v2/move-learn-method/ | List move learn methods
[**moveLearnMethodRetrieve**](MovesApi.md#moveLearnMethodRetrieve) | **Get** /api/v2/move-learn-method/{id}/ | Get move learn method
[**moveList**](MovesApi.md#moveList) | **Get** /api/v2/move/ | List moves
[**moveRetrieve**](MovesApi.md#moveRetrieve) | **Get** /api/v2/move/{id}/ | Get move
[**moveTargetList**](MovesApi.md#moveTargetList) | **Get** /api/v2/move-target/ | List move targets
[**moveTargetRetrieve**](MovesApi.md#moveTargetRetrieve) | **Get** /api/v2/move-target/{id}/ | Get move target


<a name="moveAilmentList"></a>
# **moveAilmentList**
> PaginatedMoveMetaAilmentSummaryList moveAilmentList(limit, offset, q)

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedMoveMetaAilmentSummaryList = apiInstance.moveAilmentList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveAilmentList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveAilmentList")
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

[**PaginatedMoveMetaAilmentSummaryList**](PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveAilmentRetrieve"></a>
# **moveAilmentRetrieve**
> MoveMetaAilmentDetail moveAilmentRetrieve(id)

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : MoveMetaAilmentDetail = apiInstance.moveAilmentRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveAilmentRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveAilmentRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**MoveMetaAilmentDetail**](MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveBattleStyleList"></a>
# **moveBattleStyleList**
> PaginatedMoveBattleStyleSummaryList moveBattleStyleList(limit, offset, q)

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedMoveBattleStyleSummaryList = apiInstance.moveBattleStyleList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveBattleStyleList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveBattleStyleList")
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

[**PaginatedMoveBattleStyleSummaryList**](PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveBattleStyleRetrieve"></a>
# **moveBattleStyleRetrieve**
> MoveBattleStyleDetail moveBattleStyleRetrieve(id)

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : MoveBattleStyleDetail = apiInstance.moveBattleStyleRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveBattleStyleRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveBattleStyleRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**MoveBattleStyleDetail**](MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveCategoryList"></a>
# **moveCategoryList**
> PaginatedMoveMetaCategorySummaryList moveCategoryList(limit, offset, q)

List move meta categories

Very general categories that loosely group move effects.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedMoveMetaCategorySummaryList = apiInstance.moveCategoryList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveCategoryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveCategoryList")
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

[**PaginatedMoveMetaCategorySummaryList**](PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveCategoryRetrieve"></a>
# **moveCategoryRetrieve**
> MoveMetaCategoryDetail moveCategoryRetrieve(id)

Get move meta category

Very general categories that loosely group move effects.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : MoveMetaCategoryDetail = apiInstance.moveCategoryRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveCategoryRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveCategoryRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**MoveMetaCategoryDetail**](MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveLearnMethodList"></a>
# **moveLearnMethodList**
> PaginatedMoveLearnMethodSummaryList moveLearnMethodList(limit, offset, q)

List move learn methods

Methods by which Pokémon can learn moves.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedMoveLearnMethodSummaryList = apiInstance.moveLearnMethodList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveLearnMethodList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveLearnMethodList")
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

[**PaginatedMoveLearnMethodSummaryList**](PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveLearnMethodRetrieve"></a>
# **moveLearnMethodRetrieve**
> MoveLearnMethodDetail moveLearnMethodRetrieve(id)

Get move learn method

Methods by which Pokémon can learn moves.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : MoveLearnMethodDetail = apiInstance.moveLearnMethodRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveLearnMethodRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveLearnMethodRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**MoveLearnMethodDetail**](MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveList"></a>
# **moveList**
> PaginatedMoveSummaryList moveList(limit, offset, q)

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedMoveSummaryList = apiInstance.moveList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveList")
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

[**PaginatedMoveSummaryList**](PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveRetrieve"></a>
# **moveRetrieve**
> MoveDetail moveRetrieve(id)

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : MoveDetail = apiInstance.moveRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**MoveDetail**](MoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveTargetList"></a>
# **moveTargetList**
> PaginatedMoveTargetSummaryList moveTargetList(limit, offset, q)

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedMoveTargetSummaryList = apiInstance.moveTargetList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveTargetList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveTargetList")
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

[**PaginatedMoveTargetSummaryList**](PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveTargetRetrieve"></a>
# **moveTargetRetrieve**
> MoveTargetDetail moveTargetRetrieve(id)

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MovesApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : MoveTargetDetail = apiInstance.moveTargetRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MovesApi#moveTargetRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MovesApi#moveTargetRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**MoveTargetDetail**](MoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

