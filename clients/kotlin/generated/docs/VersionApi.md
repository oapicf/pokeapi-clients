# VersionApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionList**](VersionApi.md#versionList) | **GET** /api/v2/version/ | 
[**versionRead**](VersionApi.md#versionRead) | **GET** /api/v2/version/{id}/ | 


<a name="versionList"></a>
# **versionList**
> kotlin.String versionList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VersionApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.versionList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VersionApi#versionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionApi#versionList")
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

<a name="versionRead"></a>
# **versionRead**
> kotlin.String versionRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VersionApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.versionRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VersionApi#versionRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionApi#versionRead")
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

