# PokemonSpeciesController

All URIs are relative to `""`

The controller class is defined in **[PokemonSpeciesController.java](../../src/main/java/org/openapitools/controller/PokemonSpeciesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonSpeciesList**](#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | 
[**pokemonSpeciesRead**](#pokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ | 

<a name="pokemonSpeciesList"></a>
# **pokemonSpeciesList**
```java
Mono<String> PokemonSpeciesController.pokemonSpeciesList(limitoffset)
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

<a name="pokemonSpeciesRead"></a>
# **pokemonSpeciesRead**
```java
Mono<String> PokemonSpeciesController.pokemonSpeciesRead(id)
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

