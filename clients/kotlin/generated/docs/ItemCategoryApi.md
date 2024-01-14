# ItemCategoryApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemCategoryList**](ItemCategoryApi.md#itemCategoryList) | **GET** /api/v2/item-category/ | 
[**itemCategoryRead**](ItemCategoryApi.md#itemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 


<a id="itemCategoryList"></a>
# **itemCategoryList**
> kotlin.String itemCategoryList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemCategoryApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.itemCategoryList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemCategoryApi#itemCategoryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemCategoryApi#itemCategoryList")
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

<a id="itemCategoryRead"></a>
# **itemCategoryRead**
> kotlin.String itemCategoryRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemCategoryApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.itemCategoryRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemCategoryApi#itemCategoryRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemCategoryApi#itemCategoryRead")
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

