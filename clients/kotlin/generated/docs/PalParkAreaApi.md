# PalParkAreaApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**palParkAreaList**](PalParkAreaApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ |  |
| [**palParkAreaRead**](PalParkAreaApi.md#palParkAreaRead) | **GET** /api/v2/pal-park-area/{id}/ |  |


<a id="palParkAreaList"></a>
# **palParkAreaList**
> kotlin.String palParkAreaList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PalParkAreaApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.palParkAreaList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PalParkAreaApi#palParkAreaList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PalParkAreaApi#palParkAreaList")
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

<a id="palParkAreaRead"></a>
# **palParkAreaRead**
> kotlin.String palParkAreaRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PalParkAreaApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.palParkAreaRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PalParkAreaApi#palParkAreaRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PalParkAreaApi#palParkAreaRead")
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

