# SuperContestEffectApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**superContestEffectList**](SuperContestEffectApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
[**superContestEffectRead**](SuperContestEffectApi.md#superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 


<a name="superContestEffectList"></a>
# **superContestEffectList**
> kotlin.String superContestEffectList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SuperContestEffectApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.superContestEffectList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuperContestEffectApi#superContestEffectList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuperContestEffectApi#superContestEffectList")
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

<a name="superContestEffectRead"></a>
# **superContestEffectRead**
> kotlin.String superContestEffectRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SuperContestEffectApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.superContestEffectRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuperContestEffectApi#superContestEffectRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuperContestEffectApi#superContestEffectRead")
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

