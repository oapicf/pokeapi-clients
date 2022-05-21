# GrowthRateApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**growthRateList**](GrowthRateApi.md#growthRateList) | **GET** /api/v2/growth-rate/ | 
[**growthRateRead**](GrowthRateApi.md#growthRateRead) | **GET** /api/v2/growth-rate/{id}/ | 


<a name="growthRateList"></a>
# **growthRateList**
> kotlin.String growthRateList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GrowthRateApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.growthRateList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrowthRateApi#growthRateList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrowthRateApi#growthRateList")
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

<a name="growthRateRead"></a>
# **growthRateRead**
> kotlin.String growthRateRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GrowthRateApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.growthRateRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrowthRateApi#growthRateRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrowthRateApi#growthRateRead")
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

