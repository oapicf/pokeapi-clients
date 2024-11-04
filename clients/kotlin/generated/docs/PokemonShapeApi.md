# PokemonShapeApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**pokemonShapeList**](PokemonShapeApi.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ |  |
| [**pokemonShapeRead**](PokemonShapeApi.md#pokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ |  |


<a id="pokemonShapeList"></a>
# **pokemonShapeList**
> kotlin.String pokemonShapeList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonShapeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonShapeList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonShapeApi#pokemonShapeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonShapeApi#pokemonShapeList")
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

<a id="pokemonShapeRead"></a>
# **pokemonShapeRead**
> kotlin.String pokemonShapeRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonShapeApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonShapeRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonShapeApi#pokemonShapeRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonShapeApi#pokemonShapeRead")
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

