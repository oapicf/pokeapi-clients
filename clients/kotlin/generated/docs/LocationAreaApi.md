# LocationAreaApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationAreaList**](LocationAreaApi.md#locationAreaList) | **GET** /api/v2/location-area/ | 
[**locationAreaRead**](LocationAreaApi.md#locationAreaRead) | **GET** /api/v2/location-area/{id}/ | 


<a id="locationAreaList"></a>
# **locationAreaList**
> kotlin.String locationAreaList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationAreaApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.locationAreaList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationAreaApi#locationAreaList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationAreaApi#locationAreaList")
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

<a id="locationAreaRead"></a>
# **locationAreaRead**
> kotlin.String locationAreaRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationAreaApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.locationAreaRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationAreaApi#locationAreaRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationAreaApi#locationAreaRead")
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

