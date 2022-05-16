# PokemonColorController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[PokemonColorController.java](../../src/main/java/org/openapitools/controller/PokemonColorController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonColorList**](#pokemonColorList) | **GET** /api/v2/pokemon-color/ | 
[**pokemonColorRead**](#pokemonColorRead) | **GET** /api/v2/pokemon-color/{id}/ | 

<a name="pokemonColorList"></a>
# **pokemonColorList**
```java
Mono<String> PokemonColorController.pokemonColorList(limitoffset)
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

<a name="pokemonColorRead"></a>
# **pokemonColorRead**
```java
Mono<String> PokemonColorController.pokemonColorRead(id)
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

