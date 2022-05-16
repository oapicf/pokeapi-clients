# PokemonShapeApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemonShapeList**](PokemonShapeApi.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | 
[**pokemonShapeRead**](PokemonShapeApi.md#pokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ | 


## Creating PokemonShapeApi

To initiate an instance of `PokemonShapeApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.PokemonShapeApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(PokemonShapeApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    PokemonShapeApi pokemonShapeApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="pokemonShapeList"></a>
# **pokemonShapeList**
```java
Mono<String> PokemonShapeApi.pokemonShapeList(limitoffset)
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

<a name="pokemonShapeRead"></a>
# **pokemonShapeRead**
```java
Mono<String> PokemonShapeApi.pokemonShapeRead(id)
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

