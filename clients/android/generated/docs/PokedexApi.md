# PokedexApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokedexList**](PokedexApi.md#pokedexList) | **GET** /api/v2/pokedex/ | 
[**pokedexRead**](PokedexApi.md#pokedexRead) | **GET** /api/v2/pokedex/{id}/ | 



## pokedexList

> String pokedexList(limit, offset)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokedexApi;

PokedexApi apiInstance = new PokedexApi();
Integer limit = null; // Integer | 
Integer offset = null; // Integer | 
try {
    String result = apiInstance.pokedexList(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokedexApi#pokedexList");
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


## pokedexRead

> String pokedexRead(id)



### Example

```java
// Import classes:
//import org.openapitools.client.api.PokedexApi;

PokedexApi apiInstance = new PokedexApi();
Integer id = null; // Integer | 
try {
    String result = apiInstance.pokedexRead(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PokedexApi#pokedexRead");
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

