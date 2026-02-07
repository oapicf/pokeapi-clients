# LocationApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationAreaList**](LocationApi.md#locationAreaList) | **GET** /api/v2/location-area/ | List location areas
[**locationAreaListWithHttpInfo**](LocationApi.md#locationAreaListWithHttpInfo) | **GET** /api/v2/location-area/ | List location areas
[**locationAreaRetrieve**](LocationApi.md#locationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**locationAreaRetrieveWithHttpInfo**](LocationApi.md#locationAreaRetrieveWithHttpInfo) | **GET** /api/v2/location-area/{id}/ | Get location area
[**locationList**](LocationApi.md#locationList) | **GET** /api/v2/location/ | List locations
[**locationListWithHttpInfo**](LocationApi.md#locationListWithHttpInfo) | **GET** /api/v2/location/ | List locations
[**locationRetrieve**](LocationApi.md#locationRetrieve) | **GET** /api/v2/location/{id}/ | Get location
[**locationRetrieveWithHttpInfo**](LocationApi.md#locationRetrieveWithHttpInfo) | **GET** /api/v2/location/{id}/ | Get location
[**palParkAreaList**](LocationApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**palParkAreaListWithHttpInfo**](LocationApi.md#palParkAreaListWithHttpInfo) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**palParkAreaRetrieve**](LocationApi.md#palParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**palParkAreaRetrieveWithHttpInfo**](LocationApi.md#palParkAreaRetrieveWithHttpInfo) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**regionList**](LocationApi.md#regionList) | **GET** /api/v2/region/ | List regions
[**regionListWithHttpInfo**](LocationApi.md#regionListWithHttpInfo) | **GET** /api/v2/region/ | List regions
[**regionRetrieve**](LocationApi.md#regionRetrieve) | **GET** /api/v2/region/{id}/ | Get region
[**regionRetrieveWithHttpInfo**](LocationApi.md#regionRetrieveWithHttpInfo) | **GET** /api/v2/region/{id}/ | Get region



## locationAreaList

> locationAreaList(locationAreaListRequest): ApiRequest[PaginatedLocationAreaSummaryList]

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

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
    val apiInstance = LocationApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.
    
    val request = apiInstance.locationAreaList(limit, offset)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LocationApi#locationAreaList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LocationApi#locationAreaList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| Number of results to return per page. | [optional]
 **offset** | **Int**| The initial index from which to return the results. | [optional]

### Return type

ApiRequest[[**PaginatedLocationAreaSummaryList**](PaginatedLocationAreaSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## locationAreaRetrieve

> locationAreaRetrieve(locationAreaRetrieveRequest): ApiRequest[LocationAreaDetail]

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

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
    val apiInstance = LocationApi("https://pokeapi.co")
    val id: Int = 56 // Int | A unique integer value identifying this location area.
    
    val request = apiInstance.locationAreaRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LocationApi#locationAreaRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LocationApi#locationAreaRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Int**| A unique integer value identifying this location area. |

### Return type

ApiRequest[[**LocationAreaDetail**](LocationAreaDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## locationList

> locationList(locationListRequest): ApiRequest[PaginatedLocationSummaryList]

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

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
    val apiInstance = LocationApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.locationList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LocationApi#locationList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LocationApi#locationList")
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

ApiRequest[[**PaginatedLocationSummaryList**](PaginatedLocationSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## locationRetrieve

> locationRetrieve(locationRetrieveRequest): ApiRequest[LocationDetail]

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

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
    val apiInstance = LocationApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.locationRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LocationApi#locationRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LocationApi#locationRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**LocationDetail**](LocationDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## palParkAreaList

> palParkAreaList(palParkAreaListRequest): ApiRequest[PaginatedPalParkAreaSummaryList]

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

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
    val apiInstance = LocationApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.palParkAreaList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LocationApi#palParkAreaList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LocationApi#palParkAreaList")
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

ApiRequest[[**PaginatedPalParkAreaSummaryList**](PaginatedPalParkAreaSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## palParkAreaRetrieve

> palParkAreaRetrieve(palParkAreaRetrieveRequest): ApiRequest[PalParkAreaDetail]

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

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
    val apiInstance = LocationApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.palParkAreaRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LocationApi#palParkAreaRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LocationApi#palParkAreaRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**PalParkAreaDetail**](PalParkAreaDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## regionList

> regionList(regionListRequest): ApiRequest[PaginatedRegionSummaryList]

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

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
    val apiInstance = LocationApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.regionList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LocationApi#regionList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LocationApi#regionList")
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

ApiRequest[[**PaginatedRegionSummaryList**](PaginatedRegionSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## regionRetrieve

> regionRetrieve(regionRetrieveRequest): ApiRequest[RegionDetail]

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

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
    val apiInstance = LocationApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.regionRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling LocationApi#regionRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling LocationApi#regionRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**RegionDetail**](RegionDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

