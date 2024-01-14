# ItemCategoryApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemCategoryList**](ItemCategoryApi.md#itemCategoryList) | **GET** /api/v2/item-category/ |  |
| [**itemCategoryRead**](ItemCategoryApi.md#itemCategoryRead) | **GET** /api/v2/item-category/{id}/ |  |


## Creating ItemCategoryApi

To initiate an instance of `ItemCategoryApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ItemCategoryApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ItemCategoryApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ItemCategoryApi itemCategoryApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="itemCategoryList"></a>
# **itemCategoryList**
```java
Mono<String> ItemCategoryApi.itemCategoryList(limitoffset)
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

<a id="itemCategoryRead"></a>
# **itemCategoryRead**
```java
Mono<String> ItemCategoryApi.itemCategoryRead(id)
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

