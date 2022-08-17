# PalParkAreaApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**palParkAreaList**](PalParkAreaApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ |  |
| [**palParkAreaRead**](PalParkAreaApi.md#palParkAreaRead) | **GET** /api/v2/pal-park-area/{id}/ |  |


## Creating PalParkAreaApi

To initiate an instance of `PalParkAreaApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.PalParkAreaApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(PalParkAreaApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    PalParkAreaApi palParkAreaApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="palParkAreaList"></a>
# **palParkAreaList**
```java
Mono<String> PalParkAreaApi.palParkAreaList(limitoffset)
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

<a name="palParkAreaRead"></a>
# **palParkAreaRead**
```java
Mono<String> PalParkAreaApi.palParkAreaRead(id)
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

