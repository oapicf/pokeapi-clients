# MachineApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineList**](MachineApi.md#machineList) | **GET** /api/v2/machine/ | 
[**machineRead**](MachineApi.md#machineRead) | **GET** /api/v2/machine/{id}/ | 


<a name="machineList"></a>
# **machineList**
> kotlin.String machineList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MachineApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.machineList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MachineApi#machineList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MachineApi#machineList")
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

<a name="machineRead"></a>
# **machineRead**
> kotlin.String machineRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MachineApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.machineRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MachineApi#machineRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MachineApi#machineRead")
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

