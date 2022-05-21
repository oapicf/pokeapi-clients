# VersionGroupApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionGroupList**](VersionGroupApi.md#versionGroupList) | **GET** /api/v2/version-group/ | 
[**versionGroupRead**](VersionGroupApi.md#versionGroupRead) | **GET** /api/v2/version-group/{id}/ | 


<a name="versionGroupList"></a>
# **versionGroupList**
> kotlin.String versionGroupList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VersionGroupApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.versionGroupList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VersionGroupApi#versionGroupList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionGroupApi#versionGroupList")
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

<a name="versionGroupRead"></a>
# **versionGroupRead**
> kotlin.String versionGroupRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VersionGroupApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.versionGroupRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VersionGroupApi#versionGroupRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VersionGroupApi#versionGroupRead")
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

