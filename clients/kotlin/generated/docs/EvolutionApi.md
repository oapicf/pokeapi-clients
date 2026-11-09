# EvolutionApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**evolutionChainList**](EvolutionApi.md#evolutionChainList) | **GET** /api/v2/evolution-chain/ | List evolution chains |
| [**evolutionChainRetrieve**](EvolutionApi.md#evolutionChainRetrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain |
| [**evolutionTriggerList**](EvolutionApi.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | List evolution triggers |
| [**evolutionTriggerRetrieve**](EvolutionApi.md#evolutionTriggerRetrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger |
| [**evolutionVariableList**](EvolutionApi.md#evolutionVariableList) | **GET** /api/v2/evolution-variable/ | List evolution variables |
| [**evolutionVariableRetrieve**](EvolutionApi.md#evolutionVariableRetrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable |


<a id="evolutionChainList"></a>
# **evolutionChainList**
> PaginatedEvolutionChainSummaryList evolutionChainList(limit, offset)

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
try {
    val result : PaginatedEvolutionChainSummaryList = apiInstance.evolutionChainList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionApi#evolutionChainList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionApi#evolutionChainList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |

### Return type

[**PaginatedEvolutionChainSummaryList**](PaginatedEvolutionChainSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="evolutionChainRetrieve"></a>
# **evolutionChainRetrieve**
> EvolutionChainDetail evolutionChainRetrieve(id)

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionApi()
val id : kotlin.String = 1 // kotlin.String | This parameter can be a string or an integer.
try {
    val result : EvolutionChainDetail = apiInstance.evolutionChainRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionApi#evolutionChainRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionApi#evolutionChainRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**EvolutionChainDetail**](EvolutionChainDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="evolutionTriggerList"></a>
# **evolutionTriggerList**
> PaginatedEvolutionTriggerSummaryList evolutionTriggerList(limit, offset, q)

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedEvolutionTriggerSummaryList = apiInstance.evolutionTriggerList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionApi#evolutionTriggerList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionApi#evolutionTriggerList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedEvolutionTriggerSummaryList**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="evolutionTriggerRetrieve"></a>
# **evolutionTriggerRetrieve**
> EvolutionTriggerDetail evolutionTriggerRetrieve(id)

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionApi()
val id : kotlin.String = 1 // kotlin.String | This parameter can be a string or an integer.
try {
    val result : EvolutionTriggerDetail = apiInstance.evolutionTriggerRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionApi#evolutionTriggerRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionApi#evolutionTriggerRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**EvolutionTriggerDetail**](EvolutionTriggerDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="evolutionVariableList"></a>
# **evolutionVariableList**
> PaginatedEvolutionVariableSummaryList evolutionVariableList(limit, offset, q)

List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedEvolutionVariableSummaryList = apiInstance.evolutionVariableList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionApi#evolutionVariableList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionApi#evolutionVariableList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedEvolutionVariableSummaryList**](PaginatedEvolutionVariableSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="evolutionVariableRetrieve"></a>
# **evolutionVariableRetrieve**
> EvolutionVariableDetail evolutionVariableRetrieve(id)

Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EvolutionApi()
val id : kotlin.String = 1 // kotlin.String | This parameter can be a string or an integer.
try {
    val result : EvolutionVariableDetail = apiInstance.evolutionVariableRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EvolutionApi#evolutionVariableRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EvolutionApi#evolutionVariableRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**EvolutionVariableDetail**](EvolutionVariableDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

