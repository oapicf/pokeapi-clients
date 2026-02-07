# ContestsApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contestEffectList**](ContestsApi.md#contestEffectList) | **GET** /api/v2/contest-effect/ | List contest effects |
| [**contestEffectRetrieve**](ContestsApi.md#contestEffectRetrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect |
| [**contestTypeList**](ContestsApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | List contest types |
| [**contestTypeRetrieve**](ContestsApi.md#contestTypeRetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type |
| [**superContestEffectList**](ContestsApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | List super contest effects |
| [**superContestEffectRetrieve**](ContestsApi.md#superContestEffectRetrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect |


## Creating ContestsApi

To initiate an instance of `ContestsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ContestsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ContestsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ContestsApi contestsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="contestEffectList"></a>
# **contestEffectList**
```java
Mono<PaginatedContestEffectSummaryList> ContestsApi.contestEffectList(limitoffsetq)
```

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedContestEffectSummaryList**](PaginatedContestEffectSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="contestEffectRetrieve"></a>
# **contestEffectRetrieve**
```java
Mono<ContestEffectDetail> ContestsApi.contestEffectRetrieve(id)
```

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**ContestEffectDetail**](ContestEffectDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="contestTypeList"></a>
# **contestTypeList**
```java
Mono<PaginatedContestTypeSummaryList> ContestsApi.contestTypeList(limitoffsetq)
```

List contest types

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedContestTypeSummaryList**](PaginatedContestTypeSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="contestTypeRetrieve"></a>
# **contestTypeRetrieve**
```java
Mono<ContestTypeDetail> ContestsApi.contestTypeRetrieve(id)
```

Get contest type

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**ContestTypeDetail**](ContestTypeDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="superContestEffectList"></a>
# **superContestEffectList**
```java
Mono<PaginatedSuperContestEffectSummaryList> ContestsApi.superContestEffectList(limitoffsetq)
```

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedSuperContestEffectSummaryList**](PaginatedSuperContestEffectSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="superContestEffectRetrieve"></a>
# **superContestEffectRetrieve**
```java
Mono<SuperContestEffectDetail> ContestsApi.superContestEffectRetrieve(id)
```

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**SuperContestEffectDetail**](SuperContestEffectDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

