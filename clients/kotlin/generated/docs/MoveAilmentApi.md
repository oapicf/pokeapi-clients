# MoveAilmentApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](MoveAilmentApi.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | 
[**moveAilmentRead**](MoveAilmentApi.md#moveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ | 


<a id="moveAilmentList"></a>
# **moveAilmentList**
> kotlin.String moveAilmentList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveAilmentApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveAilmentList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveAilmentApi#moveAilmentList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveAilmentApi#moveAilmentList")
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

<a id="moveAilmentRead"></a>
# **moveAilmentRead**
> kotlin.String moveAilmentRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveAilmentApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveAilmentRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveAilmentApi#moveAilmentRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveAilmentApi#moveAilmentRead")
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

