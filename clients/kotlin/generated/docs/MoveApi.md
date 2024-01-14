# MoveApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveList**](MoveApi.md#moveList) | **GET** /api/v2/move/ | 
[**moveRead**](MoveApi.md#moveRead) | **GET** /api/v2/move/{id}/ | 


<a id="moveList"></a>
# **moveList**
> kotlin.String moveList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveApi#moveList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveApi#moveList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional]
 **offset** | **kotlin.Int**|  | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="moveRead"></a>
# **moveRead**
> kotlin.String moveRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveApi#moveRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveApi#moveRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

