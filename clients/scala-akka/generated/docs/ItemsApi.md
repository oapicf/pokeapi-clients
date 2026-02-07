# ItemsApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemAttributeList**](ItemsApi.md#itemAttributeList) | **GET** /api/v2/item-attribute/ | List item attributes
[**itemAttributeListWithHttpInfo**](ItemsApi.md#itemAttributeListWithHttpInfo) | **GET** /api/v2/item-attribute/ | List item attributes
[**itemAttributeRetrieve**](ItemsApi.md#itemAttributeRetrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**itemAttributeRetrieveWithHttpInfo**](ItemsApi.md#itemAttributeRetrieveWithHttpInfo) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**itemCategoryList**](ItemsApi.md#itemCategoryList) | **GET** /api/v2/item-category/ | List item categories
[**itemCategoryListWithHttpInfo**](ItemsApi.md#itemCategoryListWithHttpInfo) | **GET** /api/v2/item-category/ | List item categories
[**itemCategoryRetrieve**](ItemsApi.md#itemCategoryRetrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**itemCategoryRetrieveWithHttpInfo**](ItemsApi.md#itemCategoryRetrieveWithHttpInfo) | **GET** /api/v2/item-category/{id}/ | Get item category
[**itemFlingEffectList**](ItemsApi.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**itemFlingEffectListWithHttpInfo**](ItemsApi.md#itemFlingEffectListWithHttpInfo) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**itemFlingEffectRetrieve**](ItemsApi.md#itemFlingEffectRetrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**itemFlingEffectRetrieveWithHttpInfo**](ItemsApi.md#itemFlingEffectRetrieveWithHttpInfo) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**itemList**](ItemsApi.md#itemList) | **GET** /api/v2/item/ | List items
[**itemListWithHttpInfo**](ItemsApi.md#itemListWithHttpInfo) | **GET** /api/v2/item/ | List items
[**itemPocketList**](ItemsApi.md#itemPocketList) | **GET** /api/v2/item-pocket/ | List item pockets
[**itemPocketListWithHttpInfo**](ItemsApi.md#itemPocketListWithHttpInfo) | **GET** /api/v2/item-pocket/ | List item pockets
[**itemPocketRetrieve**](ItemsApi.md#itemPocketRetrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**itemPocketRetrieveWithHttpInfo**](ItemsApi.md#itemPocketRetrieveWithHttpInfo) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**itemRetrieve**](ItemsApi.md#itemRetrieve) | **GET** /api/v2/item/{id}/ | Get item
[**itemRetrieveWithHttpInfo**](ItemsApi.md#itemRetrieveWithHttpInfo) | **GET** /api/v2/item/{id}/ | Get item



## itemAttributeList

> itemAttributeList(itemAttributeListRequest): ApiRequest[PaginatedItemAttributeSummaryList]

List item attributes

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.itemAttributeList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemAttributeList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemAttributeList")
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

ApiRequest[[**PaginatedItemAttributeSummaryList**](PaginatedItemAttributeSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## itemAttributeRetrieve

> itemAttributeRetrieve(itemAttributeRetrieveRequest): ApiRequest[ItemAttributeDetail]

Get item attribute

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.itemAttributeRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemAttributeRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemAttributeRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**ItemAttributeDetail**](ItemAttributeDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## itemCategoryList

> itemCategoryList(itemCategoryListRequest): ApiRequest[PaginatedItemCategorySummaryList]

List item categories

Item categories determine where items will be placed in the players bag.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.itemCategoryList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemCategoryList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemCategoryList")
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

ApiRequest[[**PaginatedItemCategorySummaryList**](PaginatedItemCategorySummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## itemCategoryRetrieve

> itemCategoryRetrieve(itemCategoryRetrieveRequest): ApiRequest[ItemCategoryDetail]

Get item category

Item categories determine where items will be placed in the players bag.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.itemCategoryRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemCategoryRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemCategoryRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**ItemCategoryDetail**](ItemCategoryDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## itemFlingEffectList

> itemFlingEffectList(itemFlingEffectListRequest): ApiRequest[PaginatedItemFlingEffectSummaryList]

List item fling effects

The various effects of the move\&quot;Fling\&quot; when used with different items.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.itemFlingEffectList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemFlingEffectList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemFlingEffectList")
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

ApiRequest[[**PaginatedItemFlingEffectSummaryList**](PaginatedItemFlingEffectSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## itemFlingEffectRetrieve

> itemFlingEffectRetrieve(itemFlingEffectRetrieveRequest): ApiRequest[ItemFlingEffectDetail]

Get item fling effect

The various effects of the move\&quot;Fling\&quot; when used with different items.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.itemFlingEffectRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemFlingEffectRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemFlingEffectRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**ItemFlingEffectDetail**](ItemFlingEffectDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## itemList

> itemList(itemListRequest): ApiRequest[PaginatedItemSummaryList]

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.itemList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemList")
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

ApiRequest[[**PaginatedItemSummaryList**](PaginatedItemSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## itemPocketList

> itemPocketList(itemPocketListRequest): ApiRequest[PaginatedItemPocketSummaryList]

List item pockets

Pockets within the players bag used for storing items by category.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val limit: Int = 56 // Int | Number of results to return per page.

    val offset: Int = 56 // Int | The initial index from which to return the results.

    val `q`: String = `q`_example // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    
    val request = apiInstance.itemPocketList(limit, offset, `q`)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemPocketList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemPocketList")
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

ApiRequest[[**PaginatedItemPocketSummaryList**](PaginatedItemPocketSummaryList.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## itemPocketRetrieve

> itemPocketRetrieve(itemPocketRetrieveRequest): ApiRequest[ItemPocketDetail]

Get item pocket

Pockets within the players bag used for storing items by category.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.itemPocketRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemPocketRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemPocketRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**ItemPocketDetail**](ItemPocketDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## itemRetrieve

> itemRetrieve(itemRetrieveRequest): ApiRequest[ItemDetail]

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

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
    val apiInstance = ItemsApi("https://pokeapi.co")
    val id: String = id_example // String | This parameter can be a string or an integer.
    
    val request = apiInstance.itemRetrieve(id)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ItemsApi#itemRetrieve")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ItemsApi#itemRetrieve")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. |

### Return type

ApiRequest[[**ItemDetail**](ItemDetail.md)]


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

