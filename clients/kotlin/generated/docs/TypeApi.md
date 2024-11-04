# TypeApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**typeList**](TypeApi.md#typeList) | **GET** /api/v2/type/ |  |
| [**typeRead**](TypeApi.md#typeRead) | **GET** /api/v2/type/{id}/ |  |


<a id="typeList"></a>
# **typeList**
> kotlin.String typeList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TypeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.typeList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TypeApi#typeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TypeApi#typeList")
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

<a id="typeRead"></a>
# **typeRead**
> kotlin.String typeRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TypeApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.typeRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TypeApi#typeRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TypeApi#typeRead")
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

