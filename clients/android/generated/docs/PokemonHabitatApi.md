# PokemonHabitatApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonHabitatList**](PokemonHabitatApi.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | 
[**pokemonHabitatRead**](PokemonHabitatApi.md#pokemonHabitatRead) | **GET** /api/v2/pokemon-habitat/{id}/ | 



## pokemonHabitatList

> String pokemonHabitatList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonHabitatApi;

PokemonHabitatApi apiInstance = new PokemonHabitatApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.pokemonHabitatList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonHabitatApi#pokemonHabitatList");
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


## pokemonHabitatRead

> String pokemonHabitatRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonHabitatApi;

PokemonHabitatApi apiInstance = new PokemonHabitatApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.pokemonHabitatRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonHabitatApi#pokemonHabitatRead");
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

