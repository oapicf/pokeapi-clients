# EncountersApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](EncountersApi.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**encounterConditionListWithHttpInfo**](EncountersApi.md#encounterConditionListWithHttpInfo) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**encounterConditionRetrieve**](EncountersApi.md#encounterConditionRetrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounterConditionRetrieveWithHttpInfo**](EncountersApi.md#encounterConditionRetrieveWithHttpInfo) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**encounterConditionValueList**](EncountersApi.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounterConditionValueListWithHttpInfo**](EncountersApi.md#encounterConditionValueListWithHttpInfo) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**encounterConditionValueRetrieve**](EncountersApi.md#encounterConditionValueRetrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounterConditionValueRetrieveWithHttpInfo**](EncountersApi.md#encounterConditionValueRetrieveWithHttpInfo) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**encounterMethodList**](EncountersApi.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | List encounter methods
[**encounterMethodListWithHttpInfo**](EncountersApi.md#encounterMethodListWithHttpInfo) | **GET** /api/v2/encounter-method/ | List encounter methods
[**encounterMethodRetrieve**](EncountersApi.md#encounterMethodRetrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
[**encounterMethodRetrieveWithHttpInfo**](EncountersApi.md#encounterMethodRetrieveWithHttpInfo) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
[**pokemonEncountersRetrieve**](EncountersApi.md#pokemonEncountersRetrieve) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter
[**pokemonEncountersRetrieveWithHttpInfo**](EncountersApi.md#pokemonEncountersRetrieveWithHttpInfo) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter



## encounterConditionList

> encounterConditionList(encounterConditionListRequest): ApiRequest[PaginatedEncounterConditionSummaryList]

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

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
    val apiInstance = EncountersApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.encounterConditionList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling EncountersApi#encounterConditionList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling EncountersApi#encounterConditionList")
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

ApiRequest[[**PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## encounterConditionRetrieve

> encounterConditionRetrieve(encounterConditionRetrieveRequest): ApiRequest[EncounterConditionDetail]

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

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
    val apiInstance = EncountersApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.encounterConditionRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling EncountersApi#encounterConditionRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling EncountersApi#encounterConditionRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**EncounterConditionDetail**](EncounterConditionDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## encounterConditionValueList

> encounterConditionValueList(encounterConditionValueListRequest): ApiRequest[PaginatedEncounterConditionValueSummaryList]

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

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
    val apiInstance = EncountersApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.encounterConditionValueList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling EncountersApi#encounterConditionValueList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling EncountersApi#encounterConditionValueList")
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

ApiRequest[[**PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## encounterConditionValueRetrieve

> encounterConditionValueRetrieve(encounterConditionValueRetrieveRequest): ApiRequest[EncounterConditionValueDetail]

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

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
    val apiInstance = EncountersApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.encounterConditionValueRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling EncountersApi#encounterConditionValueRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling EncountersApi#encounterConditionValueRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**EncounterConditionValueDetail**](EncounterConditionValueDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## encounterMethodList

> encounterMethodList(encounterMethodListRequest): ApiRequest[PaginatedEncounterMethodSummaryList]

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

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
    val apiInstance = EncountersApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.encounterMethodList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling EncountersApi#encounterMethodList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling EncountersApi#encounterMethodList")
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

ApiRequest[[**PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## encounterMethodRetrieve

> encounterMethodRetrieve(encounterMethodRetrieveRequest): ApiRequest[EncounterMethodDetail]

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

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
    val apiInstance = EncountersApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.encounterMethodRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling EncountersApi#encounterMethodRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling EncountersApi#encounterMethodRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**EncounterMethodDetail**](EncounterMethodDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## pokemonEncountersRetrieve

> pokemonEncountersRetrieve(pokemonEncountersRetrieveRequest): ApiRequest[Seq[PokemonEncountersRetrieve200ResponseInner]]

Get pokemon encounter

Handles Pokemon Encounters as a sub-resource.

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
    val apiInstance = EncountersApi("https://pokeapi.co")
    val pokemonId: String = pokemonId_example // String | 
    
    val request = apiInstance.pokemonEncountersRetrieve(pokemonId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling EncountersApi#pokemonEncountersRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling EncountersApi#pokemonEncountersRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pokemonId** | **String**|  |

### Return type

ApiRequest[[**Seq[PokemonEncountersRetrieve200ResponseInner]**](PokemonEncountersRetrieve200ResponseInner.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

