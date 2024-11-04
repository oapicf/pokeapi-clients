# EvolutionChainApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**evolutionChainList**](EvolutionChainApi.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ |  |
| [**evolutionChainRead**](EvolutionChainApi.md#evolutionChainRead) | **GET** /api/v2/evolution-chain/{id}/ |  |


<a id="evolutionChainList"></a>
# **evolutionChainList**
> kotlin.String evolutionChainList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionChainApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.evolutionChainList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionChainApi#evolutionChainList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionChainApi#evolutionChainList")
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

<a id="evolutionChainRead"></a>
# **evolutionChainRead**
> kotlin.String evolutionChainRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionChainApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.evolutionChainRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionChainApi#evolutionChainRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionChainApi#evolutionChainRead")
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

