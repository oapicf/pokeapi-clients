# ContestEffectApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestEffectList**](ContestEffectApi.md#contestEffectList) | **GET** /api/v2/contest-effect/ | 
[**contestEffectRead**](ContestEffectApi.md#contestEffectRead) | **GET** /api/v2/contest-effect/{id}/ | 


<a id="contestEffectList"></a>
# **contestEffectList**
> kotlin.String contestEffectList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestEffectApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.contestEffectList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestEffectApi#contestEffectList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestEffectApi#contestEffectList")
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

<a id="contestEffectRead"></a>
# **contestEffectRead**
> kotlin.String contestEffectRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestEffectApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.contestEffectRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestEffectApi#contestEffectRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestEffectApi#contestEffectRead")
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

