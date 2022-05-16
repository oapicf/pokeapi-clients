# PokemonColorApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonColorList**](PokemonColorApi.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | 
[**pokemonColorRead**](PokemonColorApi.md#pokemonColorRead) | **GET** /api/v2/pokemon-color/{id}/ | 



## pokemonColorList

> String pokemonColorList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonColorApi;

PokemonColorApi apiInstance = new PokemonColorApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.pokemonColorList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonColorApi#pokemonColorList");
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


## pokemonColorRead

> String pokemonColorRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonColorApi;

PokemonColorApi apiInstance = new PokemonColorApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.pokemonColorRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonColorApi#pokemonColorRead");
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

