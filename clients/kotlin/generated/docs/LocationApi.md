# LocationApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationList**](LocationApi.md#locationList) | **GET** /api/v2/location/ | 
[**locationRead**](LocationApi.md#locationRead) | **GET** /api/v2/location/{id}/ | 


<a name="locationList"></a>
# **locationList**
> kotlin.String locationList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.locationList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#locationList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#locationList")
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

<a name="locationRead"></a>
# **locationRead**
> kotlin.String locationRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.locationRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#locationRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#locationRead")
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

