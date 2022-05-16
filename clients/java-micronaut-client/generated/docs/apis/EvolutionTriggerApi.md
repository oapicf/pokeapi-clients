# EvolutionTriggerApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionTriggerList**](EvolutionTriggerApi.md#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | 
[**evolutionTriggerRead**](EvolutionTriggerApi.md#evolutionTriggerRead) | **GET** /api/v2/evolution-trigger/{id}/ | 


## Creating EvolutionTriggerApi

To initiate an instance of `EvolutionTriggerApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.EvolutionTriggerApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(EvolutionTriggerApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    EvolutionTriggerApi evolutionTriggerApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="evolutionTriggerList"></a>
# **evolutionTriggerList**
```java
Mono<String> EvolutionTriggerApi.evolutionTriggerList(limitoffset)
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

<a name="evolutionTriggerRead"></a>
# **evolutionTriggerRead**
```java
Mono<String> EvolutionTriggerApi.evolutionTriggerRead(id)
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

