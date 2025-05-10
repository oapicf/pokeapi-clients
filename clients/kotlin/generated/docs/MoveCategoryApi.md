# MoveCategoryApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**moveCategoryList**](MoveCategoryApi.md#moveCategoryList) | **GET** /api/v2/move-category/ |  |
| [**moveCategoryRead**](MoveCategoryApi.md#moveCategoryRead) | **GET** /api/v2/move-category/{id}/ |  |


<a id="moveCategoryList"></a>
# **moveCategoryList**
> kotlin.String moveCategoryList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveCategoryApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveCategoryList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveCategoryApi#moveCategoryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveCategoryApi#moveCategoryList")
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

<a id="moveCategoryRead"></a>
# **moveCategoryRead**
> kotlin.String moveCategoryRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveCategoryApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveCategoryRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveCategoryApi#moveCategoryRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveCategoryApi#moveCategoryRead")
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

