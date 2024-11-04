# ItemFlingEffectApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**itemFlingEffectList**](ItemFlingEffectApi.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ |  |
| [**itemFlingEffectRead**](ItemFlingEffectApi.md#itemFlingEffectRead) | **GET** /api/v2/item-fling-effect/{id}/ |  |


<a id="itemFlingEffectList"></a>
# **itemFlingEffectList**
> kotlin.String itemFlingEffectList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemFlingEffectApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.itemFlingEffectList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemFlingEffectApi#itemFlingEffectList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemFlingEffectApi#itemFlingEffectList")
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

<a id="itemFlingEffectRead"></a>
# **itemFlingEffectRead**
> kotlin.String itemFlingEffectRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemFlingEffectApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.itemFlingEffectRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemFlingEffectApi#itemFlingEffectRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemFlingEffectApi#itemFlingEffectRead")
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

