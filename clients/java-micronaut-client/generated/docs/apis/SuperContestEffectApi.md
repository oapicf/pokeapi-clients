# SuperContestEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**superContestEffectList**](SuperContestEffectApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
[**superContestEffectRead**](SuperContestEffectApi.md#superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 


## Creating SuperContestEffectApi

To initiate an instance of `SuperContestEffectApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.SuperContestEffectApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(SuperContestEffectApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    SuperContestEffectApi superContestEffectApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="superContestEffectList"></a>
# **superContestEffectList**
```java
Mono<String> SuperContestEffectApi.superContestEffectList(limitoffset)
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

<a name="superContestEffectRead"></a>
# **superContestEffectRead**
```java
Mono<String> SuperContestEffectApi.superContestEffectRead(id)
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

