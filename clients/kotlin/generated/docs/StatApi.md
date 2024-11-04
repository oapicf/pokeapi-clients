# StatApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**statList**](StatApi.md#statList) | **GET** /api/v2/stat/ |  |
| [**statRead**](StatApi.md#statRead) | **GET** /api/v2/stat/{id}/ |  |


<a id="statList"></a>
# **statList**
> kotlin.String statList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.statList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatApi#statList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatApi#statList")
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

<a id="statRead"></a>
# **statRead**
> kotlin.String statRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.statRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatApi#statRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatApi#statRead")
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

