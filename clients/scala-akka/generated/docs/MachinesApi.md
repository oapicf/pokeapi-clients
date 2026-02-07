# MachinesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](MachinesApi.md#machineList) | **GET** /api/v2/machine/ | List machines
[**machineListWithHttpInfo**](MachinesApi.md#machineListWithHttpInfo) | **GET** /api/v2/machine/ | List machines
[**machineRetrieve**](MachinesApi.md#machineRetrieve) | **GET** /api/v2/machine/{id}/ | Get machine
[**machineRetrieveWithHttpInfo**](MachinesApi.md#machineRetrieveWithHttpInfo) | **GET** /api/v2/machine/{id}/ | Get machine



## machineList

> machineList(machineListRequest): ApiRequest[PaginatedMachineSummaryList]

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

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
    val apiInstance = MachinesApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.machineList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MachinesApi#machineList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MachinesApi#machineList")
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

ApiRequest[[**PaginatedMachineSummaryList**](PaginatedMachineSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## machineRetrieve

> machineRetrieve(machineRetrieveRequest): ApiRequest[MachineDetail]

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

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
    val apiInstance = MachinesApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.machineRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling MachinesApi#machineRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling MachinesApi#machineRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**MachineDetail**](MachineDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

