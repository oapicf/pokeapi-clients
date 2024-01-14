# PokemonFormApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonFormList**](PokemonFormApi.md#pokemonFormList) | **GET** /api/v2/pokemon-form/ | 
[**pokemonFormRead**](PokemonFormApi.md#pokemonFormRead) | **GET** /api/v2/pokemon-form/{id}/ | 


<a id="pokemonFormList"></a>
# **pokemonFormList**
> kotlin.String pokemonFormList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonFormApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonFormList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonFormApi#pokemonFormList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonFormApi#pokemonFormList")
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

<a id="pokemonFormRead"></a>
# **pokemonFormRead**
> kotlin.String pokemonFormRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokemonFormApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokemonFormRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonFormApi#pokemonFormRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonFormApi#pokemonFormRead")
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

