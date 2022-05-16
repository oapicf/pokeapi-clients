# EggGroupApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eggGroupList**](EggGroupApi.md#eggGroupList) | **GET** /api/v2/egg-group/ | 
[**eggGroupRead**](EggGroupApi.md#eggGroupRead) | **GET** /api/v2/egg-group/{id}/ | 


<a name="eggGroupList"></a>
# **eggGroupList**
> kotlin.String eggGroupList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EggGroupApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.eggGroupList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EggGroupApi#eggGroupList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EggGroupApi#eggGroupList")
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

<a name="eggGroupRead"></a>
# **eggGroupRead**
> kotlin.String eggGroupRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EggGroupApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.eggGroupRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EggGroupApi#eggGroupRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EggGroupApi#eggGroupRead")
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

