# BerryFlavorApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFlavorList**](BerryFlavorApi.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | 
[**berryFlavorRead**](BerryFlavorApi.md#berryFlavorRead) | **GET** /api/v2/berry-flavor/{id}/ | 


<a name="berryFlavorList"></a>
# **berryFlavorList**
> kotlin.String berryFlavorList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BerryFlavorApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.berryFlavorList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerryFlavorApi#berryFlavorList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerryFlavorApi#berryFlavorList")
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

<a name="berryFlavorRead"></a>
# **berryFlavorRead**
> kotlin.String berryFlavorRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BerryFlavorApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.berryFlavorRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerryFlavorApi#berryFlavorRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerryFlavorApi#berryFlavorRead")
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

