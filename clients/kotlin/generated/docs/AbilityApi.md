# AbilityApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**abilityList**](AbilityApi.md#abilityList) | **GET** /api/v2/ability/ |  |
| [**abilityRead**](AbilityApi.md#abilityRead) | **GET** /api/v2/ability/{id}/ |  |


<a id="abilityList"></a>
# **abilityList**
> kotlin.String abilityList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AbilityApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.abilityList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AbilityApi#abilityList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AbilityApi#abilityList")
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

<a id="abilityRead"></a>
# **abilityRead**
> kotlin.String abilityRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AbilityApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.abilityRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AbilityApi#abilityRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AbilityApi#abilityRead")
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

