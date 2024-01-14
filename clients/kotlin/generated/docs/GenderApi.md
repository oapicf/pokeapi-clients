# GenderApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genderList**](GenderApi.md#genderList) | **GET** /api/v2/gender/ | 
[**genderRead**](GenderApi.md#genderRead) | **GET** /api/v2/gender/{id}/ | 


<a id="genderList"></a>
# **genderList**
> kotlin.String genderList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GenderApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.genderList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GenderApi#genderList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GenderApi#genderList")
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

<a id="genderRead"></a>
# **genderRead**
> kotlin.String genderRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GenderApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.genderRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GenderApi#genderRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GenderApi#genderRead")
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

