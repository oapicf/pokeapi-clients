# ContestTypeApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestTypeList**](ContestTypeApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | 
[**contestTypeRead**](ContestTypeApi.md#contestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 


<a name="contestTypeList"></a>
# **contestTypeList**
> kotlin.String contestTypeList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestTypeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.contestTypeList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestTypeApi#contestTypeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestTypeApi#contestTypeList")
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

<a name="contestTypeRead"></a>
# **contestTypeRead**
> kotlin.String contestTypeRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestTypeApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.contestTypeRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestTypeApi#contestTypeRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestTypeApi#contestTypeRead")
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

