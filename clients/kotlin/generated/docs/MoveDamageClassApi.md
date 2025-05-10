# MoveDamageClassApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**moveDamageClassList**](MoveDamageClassApi.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ |  |
| [**moveDamageClassRead**](MoveDamageClassApi.md#moveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ |  |


<a id="moveDamageClassList"></a>
# **moveDamageClassList**
> kotlin.String moveDamageClassList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveDamageClassApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveDamageClassList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveDamageClassApi#moveDamageClassList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveDamageClassApi#moveDamageClassList")
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

<a id="moveDamageClassRead"></a>
# **moveDamageClassRead**
> kotlin.String moveDamageClassRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveDamageClassApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveDamageClassRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveDamageClassApi#moveDamageClassRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveDamageClassApi#moveDamageClassRead")
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

