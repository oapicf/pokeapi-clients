# EncounterConditionValueApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**encounterConditionValueList**](EncounterConditionValueApi.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ |  |
| [**encounterConditionValueRead**](EncounterConditionValueApi.md#encounterConditionValueRead) | **GET** /api/v2/encounter-condition-value/{id}/ |  |


<a id="encounterConditionValueList"></a>
# **encounterConditionValueList**
> kotlin.String encounterConditionValueList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EncounterConditionValueApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.encounterConditionValueList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncounterConditionValueApi#encounterConditionValueList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncounterConditionValueApi#encounterConditionValueList")
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

<a id="encounterConditionValueRead"></a>
# **encounterConditionValueRead**
> kotlin.String encounterConditionValueRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EncounterConditionValueApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.encounterConditionValueRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EncounterConditionValueApi#encounterConditionValueRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EncounterConditionValueApi#encounterConditionValueRead")
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

