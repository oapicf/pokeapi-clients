# ItemApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemList**](ItemApi.md#itemList) | **GET** /api/v2/item/ | 
[**itemRead**](ItemApi.md#itemRead) | **GET** /api/v2/item/{id}/ | 


<a name="itemList"></a>
# **itemList**
> kotlin.String itemList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.itemList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#itemList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#itemList")
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

<a name="itemRead"></a>
# **itemRead**
> kotlin.String itemRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.itemRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#itemRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#itemRead")
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

