# EncounterConditionApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**encounterConditionList**](EncounterConditionApi.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ |  |
| [**encounterConditionRead**](EncounterConditionApi.md#encounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ |  |


<a id="encounterConditionList"></a>
# **encounterConditionList**
> kotlin.String encounterConditionList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EncounterConditionApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.encounterConditionList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncounterConditionApi#encounterConditionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncounterConditionApi#encounterConditionList")
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
 - **Accept**: text/plain

<a id="encounterConditionRead"></a>
# **encounterConditionRead**
> kotlin.String encounterConditionRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EncounterConditionApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.encounterConditionRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncounterConditionApi#encounterConditionRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncounterConditionApi#encounterConditionRead")
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
 - **Accept**: text/plain

