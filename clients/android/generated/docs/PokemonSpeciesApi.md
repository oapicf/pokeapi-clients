# PokemonSpeciesApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonSpeciesList**](PokemonSpeciesApi.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | 
[**pokemonSpeciesRead**](PokemonSpeciesApi.md#pokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ | 



## pokemonSpeciesList

> String pokemonSpeciesList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonSpeciesApi;

PokemonSpeciesApi apiInstance = new PokemonSpeciesApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.pokemonSpeciesList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonSpeciesApi#pokemonSpeciesList");
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


## pokemonSpeciesRead

> String pokemonSpeciesRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonSpeciesApi;

PokemonSpeciesApi apiInstance = new PokemonSpeciesApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.pokemonSpeciesRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonSpeciesApi#pokemonSpeciesRead");
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

