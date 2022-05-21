# PokemonShapeController

All URIs are relative to `""`

The controller class is defined in **[PokemonShapeController.java](../../src/main/java/org/openapitools/controller/PokemonShapeController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonShapeList**](#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | 
[**pokemonShapeRead**](#pokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ | 

<a name="pokemonShapeList"></a>
# **pokemonShapeList**
```java
Mono<String> PokemonShapeController.pokemonShapeList(limitoffset)
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

<a name="pokemonShapeRead"></a>
# **pokemonShapeRead**
```java
Mono<String> PokemonShapeController.pokemonShapeRead(id)
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

