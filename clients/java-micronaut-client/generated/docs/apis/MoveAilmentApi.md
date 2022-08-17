# MoveAilmentApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveAilmentList**](MoveAilmentApi.md#moveAilmentList) | **GET** /api/v2/move-ailment/ |  |
| [**moveAilmentRead**](MoveAilmentApi.md#moveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ |  |


## Creating MoveAilmentApi

To initiate an instance of `MoveAilmentApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.MoveAilmentApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(MoveAilmentApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    MoveAilmentApi moveAilmentApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="moveAilmentList"></a>
# **moveAilmentList**
```java
Mono<String> MoveAilmentApi.moveAilmentList(limitoffset)
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

<a name="moveAilmentRead"></a>
# **moveAilmentRead**
```java
Mono<String> MoveAilmentApi.moveAilmentRead(id)
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

