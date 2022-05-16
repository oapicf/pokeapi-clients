# PokemonHabitatApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonHabitatList**](PokemonHabitatApi.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | 
[**pokemonHabitatRead**](PokemonHabitatApi.md#pokemonHabitatRead) | **GET** /api/v2/pokemon-habitat/{id}/ | 


## Creating PokemonHabitatApi

To initiate an instance of `PokemonHabitatApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.PokemonHabitatApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(PokemonHabitatApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    PokemonHabitatApi pokemonHabitatApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="pokemonHabitatList"></a>
# **pokemonHabitatList**
```java
Mono<String> PokemonHabitatApi.pokemonHabitatList(limitoffset)
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

<a name="pokemonHabitatRead"></a>
# **pokemonHabitatRead**
```java
Mono<String> PokemonHabitatApi.pokemonHabitatRead(id)
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

