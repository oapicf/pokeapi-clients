# EvolutionTriggerApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionTriggerList**](EvolutionTriggerApi.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | 
[**evolutionTriggerRead**](EvolutionTriggerApi.md#evolutionTriggerRead) | **GET** /api/v2/evolution-trigger/{id}/ | 


<a name="evolutionTriggerList"></a>
# **evolutionTriggerList**
> kotlin.String evolutionTriggerList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionTriggerApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.evolutionTriggerList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionTriggerApi#evolutionTriggerList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionTriggerApi#evolutionTriggerList")
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

<a name="evolutionTriggerRead"></a>
# **evolutionTriggerRead**
> kotlin.String evolutionTriggerRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionTriggerApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.evolutionTriggerRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionTriggerApi#evolutionTriggerRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionTriggerApi#evolutionTriggerRead")
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

