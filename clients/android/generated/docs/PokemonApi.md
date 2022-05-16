# PokemonApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonList**](PokemonApi.md#pokemonList) | **GET** /api/v2/pokemon/ | 
[**pokemonRead**](PokemonApi.md#pokemonRead) | **GET** /api/v2/pokemon/{id}/ | 



## pokemonList

> String pokemonList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonApi;

PokemonApi apiInstance = new PokemonApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.pokemonList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonApi#pokemonList");
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


## pokemonRead

> String pokemonRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonApi;

PokemonApi apiInstance = new PokemonApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.pokemonRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonApi#pokemonRead");
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

