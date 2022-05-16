# PokedexController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[PokedexController.java](../../src/main/java/org/openapitools/controller/PokedexController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokedexList**](#pokedexList) | **GET** /api/v2/pokedex/ | 
[**pokedexRead**](#pokedexRead) | **GET** /api/v2/pokedex/{id}/ | 

<a name="pokedexList"></a>
# **pokedexList**
```java
Mono<String> PokedexController.pokedexList(limitoffset)
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

<a name="pokedexRead"></a>
# **pokedexRead**
```java
Mono<String> PokedexController.pokedexRead(id)
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

