# MoveLearnMethodApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**moveLearnMethodList**](MoveLearnMethodApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ |  |
| [**moveLearnMethodRead**](MoveLearnMethodApi.md#moveLearnMethodRead) | **GET** /api/v2/move-learn-method/{id}/ |  |


<a id="moveLearnMethodList"></a>
# **moveLearnMethodList**
> kotlin.String moveLearnMethodList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveLearnMethodApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveLearnMethodList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveLearnMethodApi#moveLearnMethodList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveLearnMethodApi#moveLearnMethodList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **offset** | **kotlin.Int**|  | [optional] |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a id="moveLearnMethodRead"></a>
# **moveLearnMethodRead**
> kotlin.String moveLearnMethodRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveLearnMethodApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveLearnMethodRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveLearnMethodApi#moveLearnMethodRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveLearnMethodApi#moveLearnMethodRead")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**|  | |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

