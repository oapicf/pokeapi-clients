# PokemonController

All URIs are relative to `""`

The controller class is defined in **[PokemonController.java](../../src/main/java/org/openapitools/controller/PokemonController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonList**](#pokemonList) | **GET** /api/v2/pokemon/ | 
[**pokemonRead**](#pokemonRead) | **GET** /api/v2/pokemon/{id}/ | 

<a id="pokemonList"></a>
# **pokemonList**
```java
Mono<String> PokemonController.pokemonList(limitoffset)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` |  | [optional parameter]
**offset** | `Integer` |  | [optional parameter]

### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

<a id="pokemonRead"></a>
# **pokemonRead**
```java
Mono<String> PokemonController.pokemonRead(id)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `Integer` |  |

### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

