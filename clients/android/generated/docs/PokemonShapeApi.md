# PokemonShapeApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonShapeList**](PokemonShapeApi.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | 
[**pokemonShapeRead**](PokemonShapeApi.md#pokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ | 



## pokemonShapeList

> String pokemonShapeList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonShapeApi;

PokemonShapeApi apiInstance = new PokemonShapeApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.pokemonShapeList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonShapeApi#pokemonShapeList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to null]
 **offset** | **Integer**|  | [optional] [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


## pokemonShapeRead

> String pokemonShapeRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonShapeApi;

PokemonShapeApi apiInstance = new PokemonShapeApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.pokemonShapeRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonShapeApi#pokemonShapeRead");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  | [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

