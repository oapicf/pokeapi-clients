# GamesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generationList**](GamesApi.md#generationList) | **GET** /api/v2/generation/ | List genrations |
| [**generationRetrieve**](GamesApi.md#generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration |
| [**pokedexList**](GamesApi.md#pokedexList) | **GET** /api/v2/pokedex/ | List pokedex |
| [**pokedexRetrieve**](GamesApi.md#pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex |
| [**versionGroupList**](GamesApi.md#versionGroupList) | **GET** /api/v2/version-group/ | List version groups |
| [**versionGroupRetrieve**](GamesApi.md#versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group |
| [**versionList**](GamesApi.md#versionList) | **GET** /api/v2/version/ | List versions |
| [**versionRetrieve**](GamesApi.md#versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version |


## Creating GamesApi

To initiate an instance of `GamesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.GamesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(GamesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    GamesApi gamesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="generationList"></a>
# **generationList**
```java
Mono<PaginatedGenerationSummaryList> GamesApi.generationList(limitoffsetq)
```

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedGenerationSummaryList**](PaginatedGenerationSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="generationRetrieve"></a>
# **generationRetrieve**
```java
Mono<GenerationDetail> GamesApi.generationRetrieve(id)
```

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**GenerationDetail**](GenerationDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokedexList"></a>
# **pokedexList**
```java
Mono<PaginatedPokedexSummaryList> GamesApi.pokedexList(limitoffsetq)
```

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedPokedexSummaryList**](PaginatedPokedexSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokedexRetrieve"></a>
# **pokedexRetrieve**
```java
Mono<PokedexDetail> GamesApi.pokedexRetrieve(id)
```

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**PokedexDetail**](PokedexDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="versionGroupList"></a>
# **versionGroupList**
```java
Mono<PaginatedVersionGroupSummaryList> GamesApi.versionGroupList(limitoffsetq)
```

List version groups

Version groups categorize highly similar versions of the games.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedVersionGroupSummaryList**](PaginatedVersionGroupSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="versionGroupRetrieve"></a>
# **versionGroupRetrieve**
```java
Mono<VersionGroupDetail> GamesApi.versionGroupRetrieve(id)
```

Get version group

Version groups categorize highly similar versions of the games.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**VersionGroupDetail**](VersionGroupDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="versionList"></a>
# **versionList**
```java
Mono<PaginatedVersionSummaryList> GamesApi.versionList(limitoffsetq)
```

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedVersionSummaryList**](PaginatedVersionSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="versionRetrieve"></a>
# **versionRetrieve**
```java
Mono<VersionDetail> GamesApi.versionRetrieve(id)
```

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**VersionDetail**](VersionDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

