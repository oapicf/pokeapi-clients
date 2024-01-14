# BerryFirmnessApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](BerryFirmnessApi.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | 
[**berryFirmnessRead**](BerryFirmnessApi.md#berryFirmnessRead) | **GET** /api/v2/berry-firmness/{id}/ | 


<a id="berryFirmnessList"></a>
# **berryFirmnessList**
> kotlin.String berryFirmnessList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BerryFirmnessApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.berryFirmnessList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerryFirmnessApi#berryFirmnessList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerryFirmnessApi#berryFirmnessList")
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

<a id="berryFirmnessRead"></a>
# **berryFirmnessRead**
> kotlin.String berryFirmnessRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BerryFirmnessApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.berryFirmnessRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BerryFirmnessApi#berryFirmnessRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BerryFirmnessApi#berryFirmnessRead")
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

