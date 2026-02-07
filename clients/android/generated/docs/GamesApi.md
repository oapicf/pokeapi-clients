# GamesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](GamesApi.md#generationList) | **GET** /api/v2/generation/ | List genrations
[**generationRetrieve**](GamesApi.md#generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration
[**pokedexList**](GamesApi.md#pokedexList) | **GET** /api/v2/pokedex/ | List pokedex
[**pokedexRetrieve**](GamesApi.md#pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
[**versionGroupList**](GamesApi.md#versionGroupList) | **GET** /api/v2/version-group/ | List version groups
[**versionGroupRetrieve**](GamesApi.md#versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
[**versionList**](GamesApi.md#versionList) | **GET** /api/v2/version/ | List versions
[**versionRetrieve**](GamesApi.md#versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version



## generationList

> PaginatedGenerationSummaryList generationList(limit, offset, q)

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedGenerationSummaryList result = apiInstance.generationList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#generationList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedGenerationSummaryList**](PaginatedGenerationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## generationRetrieve

> GenerationDetail generationRetrieve(id)

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    GenerationDetail result = apiInstance.generationRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#generationRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**GenerationDetail**](GenerationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokedexList

> PaginatedPokedexSummaryList pokedexList(limit, offset, q)

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedPokedexSummaryList result = apiInstance.pokedexList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#pokedexList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedPokedexSummaryList**](PaginatedPokedexSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokedexRetrieve

> PokedexDetail pokedexRetrieve(id)

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    PokedexDetail result = apiInstance.pokedexRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#pokedexRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**PokedexDetail**](PokedexDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## versionGroupList

> PaginatedVersionGroupSummaryList versionGroupList(limit, offset, q)

List version groups

Version groups categorize highly similar versions of the games.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedVersionGroupSummaryList result = apiInstance.versionGroupList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#versionGroupList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedVersionGroupSummaryList**](PaginatedVersionGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## versionGroupRetrieve

> VersionGroupDetail versionGroupRetrieve(id)

Get version group

Version groups categorize highly similar versions of the games.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    VersionGroupDetail result = apiInstance.versionGroupRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#versionGroupRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**VersionGroupDetail**](VersionGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## versionList

> PaginatedVersionSummaryList versionList(limit, offset, q)

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedVersionSummaryList result = apiInstance.versionList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#versionList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedVersionSummaryList**](PaginatedVersionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## versionRetrieve

> VersionDetail versionRetrieve(id)

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GamesApi;

GamesApi apiInstance = new GamesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    VersionDetail result = apiInstance.versionRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamesApi#versionRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**VersionDetail**](VersionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

