# EncounterConditionValueApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**encounterConditionValueList**](EncounterConditionValueApi.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ |  |
| [**encounterConditionValueRead**](EncounterConditionValueApi.md#encounterConditionValueRead) | **GET** /api/v2/encounter-condition-value/{id}/ |  |


## Creating EncounterConditionValueApi

To initiate an instance of `EncounterConditionValueApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.EncounterConditionValueApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(EncounterConditionValueApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    EncounterConditionValueApi encounterConditionValueApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="encounterConditionValueList"></a>
# **encounterConditionValueList**
```java
Mono<String> EncounterConditionValueApi.encounterConditionValueList(limitoffset)
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

<a id="encounterConditionValueRead"></a>
# **encounterConditionValueRead**
```java
Mono<String> EncounterConditionValueApi.encounterConditionValueRead(id)
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

