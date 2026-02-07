# UtilityApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**languageList**](UtilityApi.md#languageList) | **GET** /api/v2/language/ | List languages |
| [**languageRetrieve**](UtilityApi.md#languageRetrieve) | **GET** /api/v2/language/{id}/ | Get language |


## Creating UtilityApi

To initiate an instance of `UtilityApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.UtilityApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(UtilityApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    UtilityApi utilityApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="languageList"></a>
# **languageList**
```java
Mono<PaginatedLanguageSummaryList> UtilityApi.languageList(limitoffsetq)
```

List languages

Languages for translations of API resource information.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedLanguageSummaryList**](PaginatedLanguageSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="languageRetrieve"></a>
# **languageRetrieve**
```java
Mono<LanguageDetail> UtilityApi.languageRetrieve(id)
```

Get language

Languages for translations of API resource information.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**LanguageDetail**](LanguageDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

