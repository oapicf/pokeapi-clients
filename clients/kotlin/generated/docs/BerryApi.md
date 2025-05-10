# BerryApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**berryList**](BerryApi.md#berryList) | **GET** /api/v2/berry/ |  |
| [**berryRead**](BerryApi.md#berryRead) | **GET** /api/v2/berry/{id}/ |  |


<a id="berryList"></a>
# **berryList**
> kotlin.String berryList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BerryApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.berryList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerryApi#berryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerryApi#berryList")
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

<a id="berryRead"></a>
# **berryRead**
> kotlin.String berryRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BerryApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.berryRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerryApi#berryRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerryApi#berryRead")
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

