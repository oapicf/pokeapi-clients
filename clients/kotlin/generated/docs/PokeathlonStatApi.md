# PokeathlonStatApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**pokeathlonStatList**](PokeathlonStatApi.md#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ |  |
| [**pokeathlonStatRead**](PokeathlonStatApi.md#pokeathlonStatRead) | **GET** /api/v2/pokeathlon-stat/{id}/ |  |


<a id="pokeathlonStatList"></a>
# **pokeathlonStatList**
> kotlin.String pokeathlonStatList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokeathlonStatApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokeathlonStatList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokeathlonStatApi#pokeathlonStatList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokeathlonStatApi#pokeathlonStatList")
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

<a id="pokeathlonStatRead"></a>
# **pokeathlonStatRead**
> kotlin.String pokeathlonStatRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokeathlonStatApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokeathlonStatRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokeathlonStatApi#pokeathlonStatRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokeathlonStatApi#pokeathlonStatRead")
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

