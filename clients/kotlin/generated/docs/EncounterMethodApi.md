# EncounterMethodApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterMethodList**](EncounterMethodApi.md#encounterMethodList) | **GET** /api/v2/encounter-method/ | 
[**encounterMethodRead**](EncounterMethodApi.md#encounterMethodRead) | **GET** /api/v2/encounter-method/{id}/ | 


<a name="encounterMethodList"></a>
# **encounterMethodList**
> kotlin.String encounterMethodList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EncounterMethodApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.encounterMethodList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncounterMethodApi#encounterMethodList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncounterMethodApi#encounterMethodList")
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

<a name="encounterMethodRead"></a>
# **encounterMethodRead**
> kotlin.String encounterMethodRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EncounterMethodApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.encounterMethodRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncounterMethodApi#encounterMethodRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncounterMethodApi#encounterMethodRead")
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

