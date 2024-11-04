# MoveTargetApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**moveTargetList**](MoveTargetApi.md#moveTargetList) | **GET** /api/v2/move-target/ |  |
| [**moveTargetRead**](MoveTargetApi.md#moveTargetRead) | **GET** /api/v2/move-target/{id}/ |  |


<a id="moveTargetList"></a>
# **moveTargetList**
> kotlin.String moveTargetList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveTargetApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveTargetList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveTargetApi#moveTargetList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveTargetApi#moveTargetList")
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
 - **Accept**: Not defined

<a id="moveTargetRead"></a>
# **moveTargetRead**
> kotlin.String moveTargetRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveTargetApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveTargetRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveTargetApi#moveTargetRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveTargetApi#moveTargetRead")
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
 - **Accept**: Not defined

