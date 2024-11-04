# PokemonApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**pokemonList**](PokemonApi.md#pokemonList) | **GET** /api/v2/pokemon/ |  |
| [**pokemonRead**](PokemonApi.md#pokemonRead) | **GET** /api/v2/pokemon/{id}/ |  |


<a id="pokemonList"></a>
# **pokemonList**
> kotlin.String pokemonList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonList")
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

<a id="pokemonRead"></a>
# **pokemonRead**
> kotlin.String pokemonRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonRead")
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

