# ContestsApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**contestEffectList**](ContestsApi.md#contestEffectList) | **GET** /api/v2/contest-effect/ | List contest effects |
| [**contestEffectRetrieve**](ContestsApi.md#contestEffectRetrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect |
| [**contestTypeList**](ContestsApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | List contest types |
| [**contestTypeRetrieve**](ContestsApi.md#contestTypeRetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type |
| [**superContestEffectList**](ContestsApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | List super contest effects |
| [**superContestEffectRetrieve**](ContestsApi.md#superContestEffectRetrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect |


<a id="contestEffectList"></a>
# **contestEffectList**
> PaginatedContestEffectSummaryList contestEffectList(limit, offset, q)

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestsApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedContestEffectSummaryList = apiInstance.contestEffectList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestsApi#contestEffectList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestsApi#contestEffectList")
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

[**PaginatedContestEffectSummaryList**](PaginatedContestEffectSummaryList.md)

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

<a id="contestEffectRetrieve"></a>
# **contestEffectRetrieve**
> ContestEffectDetail contestEffectRetrieve(id)

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestsApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : ContestEffectDetail = apiInstance.contestEffectRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestsApi#contestEffectRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestsApi#contestEffectRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**ContestEffectDetail**](ContestEffectDetail.md)

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

<a id="contestTypeList"></a>
# **contestTypeList**
> PaginatedContestTypeSummaryList contestTypeList(limit, offset, q)

List contest types

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestsApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedContestTypeSummaryList = apiInstance.contestTypeList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestsApi#contestTypeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestsApi#contestTypeList")
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

[**PaginatedContestTypeSummaryList**](PaginatedContestTypeSummaryList.md)

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

<a id="contestTypeRetrieve"></a>
# **contestTypeRetrieve**
> ContestTypeDetail contestTypeRetrieve(id)

Get contest type

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestsApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : ContestTypeDetail = apiInstance.contestTypeRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestsApi#contestTypeRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestsApi#contestTypeRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**ContestTypeDetail**](ContestTypeDetail.md)

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

<a id="superContestEffectList"></a>
# **superContestEffectList**
> PaginatedSuperContestEffectSummaryList superContestEffectList(limit, offset, q)

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestsApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedSuperContestEffectSummaryList = apiInstance.superContestEffectList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestsApi#superContestEffectList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestsApi#superContestEffectList")
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

[**PaginatedSuperContestEffectSummaryList**](PaginatedSuperContestEffectSummaryList.md)

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

<a id="superContestEffectRetrieve"></a>
# **superContestEffectRetrieve**
> SuperContestEffectDetail superContestEffectRetrieve(id)

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContestsApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : SuperContestEffectDetail = apiInstance.superContestEffectRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContestsApi#superContestEffectRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContestsApi#superContestEffectRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**SuperContestEffectDetail**](SuperContestEffectDetail.md)

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

