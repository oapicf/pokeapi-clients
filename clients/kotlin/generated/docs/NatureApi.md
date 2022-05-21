# NatureApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**natureList**](NatureApi.md#natureList) | **GET** /api/v2/nature/ | 
[**natureRead**](NatureApi.md#natureRead) | **GET** /api/v2/nature/{id}/ | 


<a name="natureList"></a>
# **natureList**
> kotlin.String natureList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NatureApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.natureList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NatureApi#natureList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NatureApi#natureList")
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

<a name="natureRead"></a>
# **natureRead**
> kotlin.String natureRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NatureApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.natureRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NatureApi#natureRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NatureApi#natureRead")
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

