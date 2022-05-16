# LanguageApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageList**](LanguageApi.md#languageList) | **GET** /api/v2/language/ | 
[**languageRead**](LanguageApi.md#languageRead) | **GET** /api/v2/language/{id}/ | 


<a name="languageList"></a>
# **languageList**
> kotlin.String languageList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.languageList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#languageList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#languageList")
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

<a name="languageRead"></a>
# **languageRead**
> kotlin.String languageRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguageApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.languageRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguageApi#languageRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguageApi#languageRead")
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

