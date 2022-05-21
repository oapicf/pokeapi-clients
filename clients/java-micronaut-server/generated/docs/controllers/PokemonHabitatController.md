# PokemonHabitatController

All URIs are relative to `""`

The controller class is defined in **[PokemonHabitatController.java](../../src/main/java/org/openapitools/controller/PokemonHabitatController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonHabitatList**](#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | 
[**pokemonHabitatRead**](#pokemonHabitatRead) | **GET** /api/v2/pokemon-habitat/{id}/ | 

<a name="pokemonHabitatList"></a>
# **pokemonHabitatList**
```java
Mono<String> PokemonHabitatController.pokemonHabitatList(limitoffset)
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

<a name="pokemonHabitatRead"></a>
# **pokemonHabitatRead**
```java
Mono<String> PokemonHabitatController.pokemonHabitatRead(id)
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

