# PokemonFormController

All URIs are relative to `""`

The controller class is defined in **[PokemonFormController.java](../../src/main/java/org/openapitools/controller/PokemonFormController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonFormList**](#pokemonFormList) | **GET** /api/v2/pokemon-form/ | 
[**pokemonFormRead**](#pokemonFormRead) | **GET** /api/v2/pokemon-form/{id}/ | 

<a name="pokemonFormList"></a>
# **pokemonFormList**
```java
Mono<String> PokemonFormController.pokemonFormList(limitoffset)
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

<a name="pokemonFormRead"></a>
# **pokemonFormRead**
```java
Mono<String> PokemonFormController.pokemonFormRead(id)
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

