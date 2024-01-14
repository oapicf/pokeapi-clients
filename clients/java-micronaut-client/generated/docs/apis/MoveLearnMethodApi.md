# MoveLearnMethodApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveLearnMethodList**](MoveLearnMethodApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ |  |
| [**moveLearnMethodRead**](MoveLearnMethodApi.md#moveLearnMethodRead) | **GET** /api/v2/move-learn-method/{id}/ |  |


## Creating MoveLearnMethodApi

To initiate an instance of `MoveLearnMethodApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.MoveLearnMethodApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(MoveLearnMethodApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    MoveLearnMethodApi moveLearnMethodApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="moveLearnMethodList"></a>
# **moveLearnMethodList**
```java
Mono<String> MoveLearnMethodApi.moveLearnMethodList(limitoffset)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`|  | [optional parameter] |
| **offset** | `Integer`|  | [optional parameter] |


### Return type
`String`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/plain`

<a id="moveLearnMethodRead"></a>
# **moveLearnMethodRead**
```java
Mono<String> MoveLearnMethodApi.moveLearnMethodRead(id)
```



### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `Integer`|  | |


### Return type
`String`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/plain`

