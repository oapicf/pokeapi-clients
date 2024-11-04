# PokemonHabitatApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**pokemonHabitatList**](PokemonHabitatApi.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ |  |
| [**pokemonHabitatRead**](PokemonHabitatApi.md#pokemonHabitatRead) | **GET** /api/v2/pokemon-habitat/{id}/ |  |


<a id="pokemonHabitatList"></a>
# **pokemonHabitatList**
> kotlin.String pokemonHabitatList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonHabitatApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonHabitatList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonHabitatApi#pokemonHabitatList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonHabitatApi#pokemonHabitatList")
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

<a id="pokemonHabitatRead"></a>
# **pokemonHabitatRead**
> kotlin.String pokemonHabitatRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonHabitatApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonHabitatRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonHabitatApi#pokemonHabitatRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonHabitatApi#pokemonHabitatRead")
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

