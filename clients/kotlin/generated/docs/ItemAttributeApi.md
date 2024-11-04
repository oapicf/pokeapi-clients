# ItemAttributeApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**itemAttributeList**](ItemAttributeApi.md#itemAttributeList) | **GET** /api/v2/item-attribute/ |  |
| [**itemAttributeRead**](ItemAttributeApi.md#itemAttributeRead) | **GET** /api/v2/item-attribute/{id}/ |  |


<a id="itemAttributeList"></a>
# **itemAttributeList**
> kotlin.String itemAttributeList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.itemAttributeList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributeApi#itemAttributeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributeApi#itemAttributeList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **offset** | **kotlin.Int**|  | [optional] |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="itemAttributeRead"></a>
# **itemAttributeRead**
> kotlin.String itemAttributeRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributeApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.itemAttributeRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributeApi#itemAttributeRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributeApi#itemAttributeRead")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**|  | |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

