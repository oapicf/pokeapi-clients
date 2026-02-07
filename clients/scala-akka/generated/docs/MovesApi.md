# MovesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](MovesApi.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**moveAilmentListWithHttpInfo**](MovesApi.md#moveAilmentListWithHttpInfo) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**moveAilmentRetrieve**](MovesApi.md#moveAilmentRetrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**moveAilmentRetrieveWithHttpInfo**](MovesApi.md#moveAilmentRetrieveWithHttpInfo) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**moveBattleStyleList**](MovesApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**moveBattleStyleListWithHttpInfo**](MovesApi.md#moveBattleStyleListWithHttpInfo) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**moveBattleStyleRetrieve**](MovesApi.md#moveBattleStyleRetrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**moveBattleStyleRetrieveWithHttpInfo**](MovesApi.md#moveBattleStyleRetrieveWithHttpInfo) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**moveCategoryList**](MovesApi.md#moveCategoryList) | **GET** /api/v2/move-category/ | List move meta categories
[**moveCategoryListWithHttpInfo**](MovesApi.md#moveCategoryListWithHttpInfo) | **GET** /api/v2/move-category/ | List move meta categories
[**moveCategoryRetrieve**](MovesApi.md#moveCategoryRetrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**moveCategoryRetrieveWithHttpInfo**](MovesApi.md#moveCategoryRetrieveWithHttpInfo) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**moveLearnMethodList**](MovesApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**moveLearnMethodListWithHttpInfo**](MovesApi.md#moveLearnMethodListWithHttpInfo) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**moveLearnMethodRetrieve**](MovesApi.md#moveLearnMethodRetrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**moveLearnMethodRetrieveWithHttpInfo**](MovesApi.md#moveLearnMethodRetrieveWithHttpInfo) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**moveList**](MovesApi.md#moveList) | **GET** /api/v2/move/ | List moves
[**moveListWithHttpInfo**](MovesApi.md#moveListWithHttpInfo) | **GET** /api/v2/move/ | List moves
[**moveRetrieve**](MovesApi.md#moveRetrieve) | **GET** /api/v2/move/{id}/ | Get move
[**moveRetrieveWithHttpInfo**](MovesApi.md#moveRetrieveWithHttpInfo) | **GET** /api/v2/move/{id}/ | Get move
[**moveTargetList**](MovesApi.md#moveTargetList) | **GET** /api/v2/move-target/ | List move targets
[**moveTargetListWithHttpInfo**](MovesApi.md#moveTargetListWithHttpInfo) | **GET** /api/v2/move-target/ | List move targets
[**moveTargetRetrieve**](MovesApi.md#moveTargetRetrieve) | **GET** /api/v2/move-target/{id}/ | Get move target
[**moveTargetRetrieveWithHttpInfo**](MovesApi.md#moveTargetRetrieveWithHttpInfo) | **GET** /api/v2/move-target/{id}/ | Get move target



## moveAilmentList

> moveAilmentList(moveAilmentListRequest): ApiRequest[PaginatedMoveMetaAilmentSummaryList]

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.moveAilmentList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveAilmentList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveAilmentList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| Number of results to return per page. | [optional]
 **offset** | **Int**| The initial index from which to return the results. | [optional]
 **`q`** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

ApiRequest[[**PaginatedMoveMetaAilmentSummaryList**](PaginatedMoveMetaAilmentSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveAilmentRetrieve

> moveAilmentRetrieve(moveAilmentRetrieveRequest): ApiRequest[MoveMetaAilmentDetail]

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.moveAilmentRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveAilmentRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveAilmentRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**MoveMetaAilmentDetail**](MoveMetaAilmentDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveBattleStyleList

> moveBattleStyleList(moveBattleStyleListRequest): ApiRequest[PaginatedMoveBattleStyleSummaryList]

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.moveBattleStyleList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveBattleStyleList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveBattleStyleList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| Number of results to return per page. | [optional]
 **offset** | **Int**| The initial index from which to return the results. | [optional]
 **`q`** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

ApiRequest[[**PaginatedMoveBattleStyleSummaryList**](PaginatedMoveBattleStyleSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveBattleStyleRetrieve

> moveBattleStyleRetrieve(moveBattleStyleRetrieveRequest): ApiRequest[MoveBattleStyleDetail]

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.moveBattleStyleRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveBattleStyleRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveBattleStyleRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**MoveBattleStyleDetail**](MoveBattleStyleDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveCategoryList

> moveCategoryList(moveCategoryListRequest): ApiRequest[PaginatedMoveMetaCategorySummaryList]

List move meta categories

Very general categories that loosely group move effects.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.moveCategoryList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveCategoryList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveCategoryList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| Number of results to return per page. | [optional]
 **offset** | **Int**| The initial index from which to return the results. | [optional]
 **`q`** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

ApiRequest[[**PaginatedMoveMetaCategorySummaryList**](PaginatedMoveMetaCategorySummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveCategoryRetrieve

> moveCategoryRetrieve(moveCategoryRetrieveRequest): ApiRequest[MoveMetaCategoryDetail]

Get move meta category

Very general categories that loosely group move effects.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.moveCategoryRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveCategoryRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveCategoryRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**MoveMetaCategoryDetail**](MoveMetaCategoryDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveLearnMethodList

> moveLearnMethodList(moveLearnMethodListRequest): ApiRequest[PaginatedMoveLearnMethodSummaryList]

List move learn methods

Methods by which Pokémon can learn moves.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.moveLearnMethodList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveLearnMethodList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveLearnMethodList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| Number of results to return per page. | [optional]
 **offset** | **Int**| The initial index from which to return the results. | [optional]
 **`q`** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

ApiRequest[[**PaginatedMoveLearnMethodSummaryList**](PaginatedMoveLearnMethodSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveLearnMethodRetrieve

> moveLearnMethodRetrieve(moveLearnMethodRetrieveRequest): ApiRequest[MoveLearnMethodDetail]

Get move learn method

Methods by which Pokémon can learn moves.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.moveLearnMethodRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveLearnMethodRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveLearnMethodRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**MoveLearnMethodDetail**](MoveLearnMethodDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveList

> moveList(moveListRequest): ApiRequest[PaginatedMoveSummaryList]

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.moveList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| Number of results to return per page. | [optional]
 **offset** | **Int**| The initial index from which to return the results. | [optional]
 **`q`** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

ApiRequest[[**PaginatedMoveSummaryList**](PaginatedMoveSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveRetrieve

> moveRetrieve(moveRetrieveRequest): ApiRequest[MoveDetail]

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.moveRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**MoveDetail**](MoveDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveTargetList

> moveTargetList(moveTargetListRequest): ApiRequest[PaginatedMoveTargetSummaryList]

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.moveTargetList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveTargetList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveTargetList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| Number of results to return per page. | [optional]
 **offset** | **Int**| The initial index from which to return the results. | [optional]
 **`q`** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

ApiRequest[[**PaginatedMoveTargetSummaryList**](PaginatedMoveTargetSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## moveTargetRetrieve

> moveTargetRetrieve(moveTargetRetrieveRequest): ApiRequest[MoveTargetDetail]

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP basic authorization: basicAuth
    implicit val basicAuth: BasicCredentials = BasicCredentials("YOUR USERNAME", "YOUR PASSWORD")

    // Configure API key authorization: cookieAuth
    implicit val cookieAuth: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = MovesApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.moveTargetRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MovesApi#moveTargetRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MovesApi#moveTargetRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**MoveTargetDetail**](MoveTargetDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

