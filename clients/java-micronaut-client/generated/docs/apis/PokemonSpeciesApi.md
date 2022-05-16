# PokemonSpeciesApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonSpeciesList**](PokemonSpeciesApi.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | 
[**pokemonSpeciesRead**](PokemonSpeciesApi.md#pokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ | 


## Creating PokemonSpeciesApi

To initiate an instance of `PokemonSpeciesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.PokemonSpeciesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(PokemonSpeciesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    PokemonSpeciesApi pokemonSpeciesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="pokemonSpeciesList"></a>
# **pokemonSpeciesList**
```java
Mono<String> PokemonSpeciesApi.pokemonSpeciesList(limitoffset)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | `Integer`|  | [optional parameter]
 **offset** | `Integer`|  | [optional parameter]


### Return type
`String`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/plain`

<a name="pokemonSpeciesRead"></a>
# **pokemonSpeciesRead**
```java
Mono<String> PokemonSpeciesApi.pokemonSpeciesRead(id)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | `Integer`|  |


### Return type
`String`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/plain`

