# PokemonSpeciesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**pokemonSpeciesList**](PokemonSpeciesApi.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ |  |
| [**pokemonSpeciesRead**](PokemonSpeciesApi.md#pokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ |  |


<a id="pokemonSpeciesList"></a>
# **pokemonSpeciesList**
> kotlin.String pokemonSpeciesList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonSpeciesApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonSpeciesList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonSpeciesApi#pokemonSpeciesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonSpeciesApi#pokemonSpeciesList")
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

<a id="pokemonSpeciesRead"></a>
# **pokemonSpeciesRead**
> kotlin.String pokemonSpeciesRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonSpeciesApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonSpeciesRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonSpeciesApi#pokemonSpeciesRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonSpeciesApi#pokemonSpeciesRead")
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

