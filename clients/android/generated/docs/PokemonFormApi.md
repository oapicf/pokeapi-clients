# PokemonFormApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonFormList**](PokemonFormApi.md#pokemonFormList) | **GET** /api/v2/pokemon-form/ | 
[**pokemonFormRead**](PokemonFormApi.md#pokemonFormRead) | **GET** /api/v2/pokemon-form/{id}/ | 



## pokemonFormList

> String pokemonFormList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonFormApi;

PokemonFormApi apiInstance = new PokemonFormApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.pokemonFormList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonFormApi#pokemonFormList");
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


## pokemonFormRead

> String pokemonFormRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokemonFormApi;

PokemonFormApi apiInstance = new PokemonFormApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.pokemonFormRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokemonFormApi#pokemonFormRead");
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

