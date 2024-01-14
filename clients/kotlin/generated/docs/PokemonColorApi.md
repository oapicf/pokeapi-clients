# PokemonColorApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonColorList**](PokemonColorApi.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | 
[**pokemonColorRead**](PokemonColorApi.md#pokemonColorRead) | **GET** /api/v2/pokemon-color/{id}/ | 


<a id="pokemonColorList"></a>
# **pokemonColorList**
> kotlin.String pokemonColorList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonColorApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonColorList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonColorApi#pokemonColorList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonColorApi#pokemonColorList")
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

<a id="pokemonColorRead"></a>
# **pokemonColorRead**
> kotlin.String pokemonColorRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonColorApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonColorRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonColorApi#pokemonColorRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonColorApi#pokemonColorRead")
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

