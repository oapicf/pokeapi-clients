# MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveBattleStyleList**](MoveBattleStyleApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | 
[**moveBattleStyleRead**](MoveBattleStyleApi.md#moveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 


<a id="moveBattleStyleList"></a>
# **moveBattleStyleList**
> kotlin.String moveBattleStyleList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveBattleStyleApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveBattleStyleList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveBattleStyleApi#moveBattleStyleList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveBattleStyleApi#moveBattleStyleList")
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

<a id="moveBattleStyleRead"></a>
# **moveBattleStyleRead**
> kotlin.String moveBattleStyleRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MoveBattleStyleApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.moveBattleStyleRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MoveBattleStyleApi#moveBattleStyleRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MoveBattleStyleApi#moveBattleStyleRead")
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

