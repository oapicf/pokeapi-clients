# UtilityApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**languageList**](UtilityApi.md#languageList) | **GET** /api/v2/language/ | List languages |
| [**languageRetrieve**](UtilityApi.md#languageRetrieve) | **GET** /api/v2/language/{id}/ | Get language |


<a id="languageList"></a>
# **languageList**
> PaginatedLanguageSummaryList languageList(limit, offset, q)

List languages

Languages for translations of API resource information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UtilityApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedLanguageSummaryList = apiInstance.languageList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UtilityApi#languageList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilityApi#languageList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedLanguageSummaryList**](PaginatedLanguageSummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="languageRetrieve"></a>
# **languageRetrieve**
> LanguageDetail languageRetrieve(id)

Get language

Languages for translations of API resource information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UtilityApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : LanguageDetail = apiInstance.languageRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UtilityApi#languageRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilityApi#languageRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**LanguageDetail**](LanguageDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

