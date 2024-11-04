# GenerationApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**generationList**](GenerationApi.md#generationList) | **GET** /api/v2/generation/ |  |
| [**generationRead**](GenerationApi.md#generationRead) | **GET** /api/v2/generation/{id}/ |  |


<a id="generationList"></a>
# **generationList**
> kotlin.String generationList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GenerationApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.generationList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GenerationApi#generationList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GenerationApi#generationList")
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

<a id="generationRead"></a>
# **generationRead**
> kotlin.String generationRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GenerationApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.generationRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GenerationApi#generationRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GenerationApi#generationRead")
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

