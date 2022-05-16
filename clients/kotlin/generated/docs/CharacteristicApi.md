# CharacteristicApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**characteristicList**](CharacteristicApi.md#characteristicList) | **GET** /api/v2/characteristic/ | 
[**characteristicRead**](CharacteristicApi.md#characteristicRead) | **GET** /api/v2/characteristic/{id}/ | 


<a name="characteristicList"></a>
# **characteristicList**
> kotlin.String characteristicList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CharacteristicApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.characteristicList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacteristicApi#characteristicList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacteristicApi#characteristicList")
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

<a name="characteristicRead"></a>
# **characteristicRead**
> kotlin.String characteristicRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CharacteristicApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.characteristicRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacteristicApi#characteristicRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacteristicApi#characteristicRead")
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

