# PokedexApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**pokedexList**](PokedexApi.md#pokedexList) | **GET** /api/v2/pokedex/ |  |
| [**pokedexRead**](PokedexApi.md#pokedexRead) | **GET** /api/v2/pokedex/{id}/ |  |


<a id="pokedexList"></a>
# **pokedexList**
> kotlin.String pokedexList(limit, offset)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokedexApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokedexList(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokedexApi#pokedexList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokedexApi#pokedexList")
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
 - **Accept**: text/plain

<a id="pokedexRead"></a>
# **pokedexRead**
> kotlin.String pokedexRead(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PokedexApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.pokedexRead(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokedexApi#pokedexRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokedexApi#pokedexRead")
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
 - **Accept**: text/plain

